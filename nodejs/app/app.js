import express from "express";
import chalk from "chalk";
import "dotenv/config";
import Issues from "./src/models/Issues.js";

const app = express();
app.use(express.json());

const port = process.env.APPLICATION_PORT || 3000;

app.get("/", (req, res) => {
  var response = {};
  //var param = req.params;
  var body = req.body;
  console.log("Method GET");
  //console.log(`${param}`);
  console.log(`${body}`);
  res.status(200).json(response);
});

app.post("/", (req, res) => {
  var headers = req.headers;
  //var param = req.params;
  var body = req.body;
  console.log("Method POST");
  var gitHubEvent = null;

  // for (var [key, value] of Object.entries(headers)) {
  //   console.log(key + ' ' + value);
  // }

  if(headers){
    gitHubEvent = headers['x-github-event'];
  }

  console.log(`GitHub Event: ${gitHubEvent}`);

  //console.log(`${param}`);
  var object = fillObject(gitHubEvent, body);
  //var map = new Map(Object.entries(object));
  //console.log(map);
  console.log(JSON.stringify(object, null, 2));
  res.status(201).json();
});

app.listen(port, () => {
  console.log(chalk.bgGreen(`Escutando na porta ${port}...`));
});

function fillObject(gitHubEvent, payload){
  var object = null;
  switch (gitHubEvent) {
    case 'issues':
      var action = payload['action'];
      var issue = payload['issue'];
      var organization = payload['organization'];
      var repository = payload['repository'];
      var sender = payload['sender'];    
      object = new Issues(action, organization, repository, sender, issue);
      break;
    case 'workflow_job':
      var action = payload['action'];
      var organization = payload['organization'];
      var repository = payload['repository'];
      var sender = payload['sender'];    
      var workflowJob = payload['workflow_job'];
      object = {
        "action": action,
        "organization": organization,
        "repository": repository,
        "sender": sender,
        "workflow_job": workflowJob
      }     
      break;
    case 'workflow_run':      
      var action = payload['action'];
      var organization = payload['organization'];
      var repository = payload['repository'];
      var sender = payload['sender'];    
      var workflow = payload['workflow'];
      var workflowRun = payload['workflow_run'];
      object = {
        "action": action,
        "organization": organization,
        "repository": repository,
        "sender": sender,
        "workflow": workflow,
        "workflow_run": workflowRun
      }       
      break;
    default:
      console.log(`Sorry, we are out of ${gitHubEvent}.`);
  }
  return object; 
}