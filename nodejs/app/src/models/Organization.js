export default class Organization {
    constructor(login, id, nodeId, url, repositoryUrl, eventsUrl, hooksUrl, issuesUrl, membersUrl, publicMembersUrl, avatarUrl, description){
            this.login = login;
            this.id = id;
            this.nodeId = nodeId;
            this.url = url;
            this.repositoryUrl = repositoryUrl;
            this.eventsUrl = eventsUrl;
            this.hooksUrl = hooksUrl;
            this.issuesUrl = issuesUrl;
            this.membersUrl = membersUrl;
            this.publicMembersUrl = publicMembersUrl;
            this.avatarUrl = avatarUrl;
            this.description = description;            
    }
}