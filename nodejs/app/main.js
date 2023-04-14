import Issues from "./src/models/Issues.js"
import Issue from "./src/models/Issue.js";
import Sender from "./src/models/Sender.js";

const action = "opened";

const organization = null;
const repository = null;
const sender = new Sender("rotoku",
    12417959,
    "MDQ6VXNlcjEyNDE3OTU5",
    "https://avatars.githubusercontent.com/u/12417959?v=4",
    "",
    "https://api.github.com/users/rotoku",
    "https://github.com/rotoku",
    "https://api.github.com/users/rotoku/followers",
    "https://api.github.com/users/rotoku/following{/other_user}",
    "https://api.github.com/users/rotoku/gists{/gist_id}",
    "https://api.github.com/users/rotoku/starred{/owner}{/repo}",
    "https://api.github.com/users/rotoku/subscriptions",
    "https://api.github.com/users/rotoku/orgs",
    "https://api.github.com/users/rotoku/repos",
    "https://api.github.com/users/rotoku/events{/privacy}",
    "https://api.github.com/users/rotoku/received_events",
    "User",
    false);

const issue = new Issue("https://api.github.com/repos/kumabes-org/java-maven-springboot-application/issues/10",
"https://api.github.com/repos/kumabes-org/java-maven-springboot-application",
"https://api.github.com/repos/kumabes-org/java-maven-springboot-application/issues/10/labels{/name}",
"https://api.github.com/repos/kumabes-org/java-maven-springboot-application/issues/10/comments",
"https://api.github.com/repos/kumabes-org/java-maven-springboot-application/issues/10/events",
    "https://github.com/kumabes-org/java-maven-springboot-application/issues/10",
    1665186797,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null);
let issues = new Issues(action, organization, repository, sender, issue);
console.log(`Issues: ${JSON.stringify(issues, null, 2)}`);

