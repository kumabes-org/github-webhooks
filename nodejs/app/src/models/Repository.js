export default class Repository {
    constructor(id,
        nodeId,
        name,
        fullName,
        private,
        owner,
        htmlUrl,
        description,
        fork,
        url,
        forksUrl,
        keysUrl,
        collaboratorsUrl,
        teamsUrl,
        hooksUrl,
        issueEventsUrl,
        eventsUrl,
        assigneesUrl,
        branchesUrl,
        tagsUrl,
        blobsUrl,
        gitTagsUrl,
        gitRefsUrl,
        treesUrl,
        statusesUrl,
        languagesUrl,
        stargazersUrl,
        contributorsUrl,
        subscribersUrl,
        subscriptionUrl,
        commitsUrl,
        gitCommitsUrl,
        commentsUrl,
        issueCommentUrl,
        contentsUrl,
        compareUrl,
        mergesUrl,
        archiveUrl,
        downloadsUrl,
        issuesUrl,
        pullsUrl,
        milestonesUrl,
        notificationsUrl,
        labelsUrl,
        releasesUrl,
        deploymentsUrl,
        createdAt,
        updatedAt,
        pushedAt,
        gitUrl,
        sshUrl,
        cloneUrl,
        svnUrl,
        homepage,
        size,
        stargazersCount,
        watchersCount,
        language,
        hasIssues,
        hasProjects,
        hasDownloads,
        hasWiki,
        hasPages,
        hasDiscussions,
        forksCount,
        mirrorUrl,
        archived,
        disabled,
        openIssuesCount,
        license,
        allowForking,
        isTemplate,
        webCommitSignoffRequired,
        topics,
        visibility,
        forks,
        openIssues,
        watchers,
        defaultBranch
        ){
            this.id = id;
            this.nodeId = nodeId;
            this.name = name;
            this.fullName = fullName;
            this.private = private;
            this.owner = owner;
            this.htmlUrl = htmlUrl;
            this.description = description;
            this.fork = fork;
            this.url = url;
            this.forksUrl = forksUrl;
            this.keysUrl = keysUrl;
            this.collaboratorsUrl = collaboratorsUrl;
            this.teamsUrl = teamsUrl;
            this.hooksUrl = hooksUrl;
            this.issueEventsUrl = issueEventsUrl;
            this.eventsUrl = eventsUrl;
            this.assigneesUrl = assigneesUrl;
            this.branchesUrl = branchesUrl;
            this.tagsUrl = tagsUrl;
            this.blobsUrl = blobsUrl;
            this.gitTagsUrl = gitTagsUrl;
            this.gitRefsUrl = gitRefsUrl;
            this.treesUrl = treesUrl;
            this.statusesUrl = statusesUrl;
            this.languagesUrl = languagesUrl;
            this.stargazersUrl = stargazersUrl;
            this.contributorsUrl = contributorsUrl;
            this.subscribersUrl = subscribersUrl;
            this.subscriptionUrl = subscriptionUrl;
            this.commitsUrl = commitsUrl;
            this.gitCommitsUrl = gitCommitsUrl;
            this.commentsUrl = commentsUrl;
            this.issueCommentUrl = issueCommentUrl;
            this.contentsUrl = contentsUrl;
            this.compareUrl = compareUrl;
            this.mergesUrl = mergesUrl;
            this.archiveUrl = archiveUrl;
            this.downloadsUrl = downloadsUrl;
            this.issuesUrl = issuesUrl;
            this.pullsUrl = pullsUrl;
            this.milestonesUrl = milestonesUrl;
            this.notificationsUrl = notificationsUrl;
            this.labelsUrl = labelsUrl;
            this.releasesUrl = releasesUrl;
            this.deploymentsUrl = deploymentsUrl;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.pushedAt = pushedAt;
            this.gitUrl = gitUrl;
            this.sshUrl = sshUrl;
            this.cloneUrl = cloneUrl;
            this.svnUrl = svnUrl;
            this.homepage = homepage;
            this.size = size;
            this.stargazersCount = stargazersCount;
            this.watchersCount = watchersCount;
            this.language = language;
            this.hasIssues = hasIssues;
            this.hasProjects = hasProjects;
            this.hasDownloads = hasDownloads;
            this.hasWiki = hasWiki;
            this.hasPages = hasPages;
            this.hasDiscussions = hasDiscussions;
            this.forksCount = forksCount;
            this.mirrorUrl = mirrorUrl;
            this.archived = archived;
            this.disabled = disabled;
            this.openIssuesCount = openIssuesCount;
            this.license = license;
            this.allowForking = allowForking;
            this.isTemplate = isTemplate;
            this.webCommitSignoffRequired = webCommitSignoffRequired;
            this.topics = topics;
            this.visibility = visibility;
            this.forks = forks;
            this.openIssues = openIssues;
            this.watchers = watchers;
            this.defaultBranch = defaultBranch;            
    }
}