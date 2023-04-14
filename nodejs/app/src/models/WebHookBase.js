export default class WebHookBase {
    constructor(action, organization, repository, sender){
        this.action = action;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
    }    
}