export default class Issue {

    constructor(url,
        repositoryUrl,
        labelsUrl,
        commentsUrl,
        eventsUrl,
        htmlUrl,
        id,
        nodeId,
        number,
        title,
        user,
        labels,
        state,
        locked,
        assignee,
        assignees,
        milestone,
        comments,
        createdAt,
        updatedAt,
        closedAt,
        authorAssociation,
        activeLockReason,
        body,
        reactions,
        timelineUrl,
        performedViaGithubApp,
        stateReason
        ){
            this.url = url;
            this.repositoryUrl = repositoryUrl;
            this.labelsUrl = labelsUrl;
            this.commentsUrl = commentsUrl;
            this.eventsUrl = eventsUrl;
            this.htmlUrl = htmlUrl;
            this.id = id;
            this.nodeId = nodeId;
            this.number = number;
            this.title = title;
            this.user = user;
            this.labels = labels;
            this.state = state;
            this.locked = locked;
            this.assignee = assignee;
            this.assignees = assignees;
            this.milestone = milestone;
            this.comments = comments;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.closedAt = closedAt;
            this.authorAssociation = authorAssociation;
            this.activeLockReason = activeLockReason;
            this.body = body;
            this.reactions = reactions;
            this.timelineUrl = timelineUrl;
            this.performedViaGithubApp = performedViaGithubApp;
            this.stateReason = stateReason;            
    }

    
}