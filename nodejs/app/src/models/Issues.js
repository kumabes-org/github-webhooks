import WebHookBase from "./WebHookBase.js";

export default class Issues extends WebHookBase {
    constructor(action, organization, repository, sender, issue){
        super(action, organization, repository, sender);
        this.issue = issue;
    }  
}