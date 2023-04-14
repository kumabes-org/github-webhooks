package br.com.kumabe.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositoryDTO implements Serializable {
	private static final long serialVersionUID = 4282607994967816914L;
	@JsonProperty("id")
	private Long id;
	@JsonProperty("node_id")
	private String nodeId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("full_name")
	private String fullName;
	@JsonProperty("private")
	private Boolean repositoryPrivate;
	@JsonProperty("owner")
	private OwnerDTO owner;
	@JsonProperty("html_url")
	private String htmlUrl;
	@JsonProperty("description")
	private String description;
	@JsonProperty("fork")
	private Boolean fork;
	@JsonProperty("url")
	private String url;
	@JsonProperty("archive_url")
	private String archiveUrl;
	@JsonProperty("assignees_url")
	private String assigneesUrl;
	@JsonProperty("blobs_url")
	private String blobsUrl;
	@JsonProperty("branches_url")
	private String branchesUrl;
	@JsonProperty("collaborators_url")
	private String collaboratorsUrl;
	@JsonProperty("comments_url")
	private String commentsUrl;
	@JsonProperty("commits_url")
	private String commitsUrl;
	@JsonProperty("compare_url")
	private String compareUrl;
	@JsonProperty("contents_url")
	private String contentsUrl;
	@JsonProperty("contributors_url")
	private String contributorsUrl;
	@JsonProperty("deployments_url")
	private String deploymentsUrl;
	@JsonProperty("downloads_url")
	private String downloadsUrl;
	@JsonProperty("events_url")
	private String eventsUrl;
	@JsonProperty("forks_url")
	private String forksUrl;
	@JsonProperty("git_commits_url")
	private String gitCommitsUrl;
	@JsonProperty("git_refs_url")
	private String gitRefsUrl;
	@JsonProperty("git_tags_url")
	private String gitTagsUrl;
	@JsonProperty("git_url")
	private String gitUrl;
	@JsonProperty("issue_comment_url")
	private String issueCommentUrl;
	@JsonProperty("issue_events_url")
	private String issueEventsUrl;
	@JsonProperty("issues_url")
	private String issuesUrl;
	@JsonProperty("keys_url")
	private String keysUrl;
	@JsonProperty("labels_url")
	private String labelsUrl;
	@JsonProperty("languages_url")
	private String languagesUrl;
	@JsonProperty("merges_url")
	private String mergesUrl;
	@JsonProperty("milestones_url")
	private String milestonesUrl;
	@JsonProperty("notifications_url")
	private String notificationsUrl;
	@JsonProperty("pulls_url")
	private String pullsUrl;
	@JsonProperty("releases_url")
	private String releasesUrl;
	@JsonProperty("ssh_url")
	private String sshUrl;
	@JsonProperty("stargazers_url")
	private String stargazersUrl;
	@JsonProperty("statuses_url")
	private String statusesUrl;
	@JsonProperty("subscribers_url")
	private String subscribersUrl;
	@JsonProperty("subscription_url")
	private String subscriptionUrl;
	@JsonProperty("tags_url")
	private String tagsUrl;
	@JsonProperty("teams_url")
	private String teamsUrl;
	@JsonProperty("trees_url")
	private String treesUrl;
	@JsonProperty("clone_url")
	private String cloneUrl;
	@JsonProperty("mirror_url")
	private String mirrorUrl;
	@JsonProperty("hooks_url")
	private String hooksUrl;
	@JsonProperty("svn_url")
	private String svnUrl;
	@JsonProperty("homepage")
	private String homepage;
	@JsonProperty("organization")
	private String organization;
	@JsonProperty("language")
	private String language;
	@JsonProperty("forks")
	private Long forks;
	@JsonProperty("forks_count")
	private Long forksCount;
	@JsonProperty("stargazers_count")
	private Long stargazersCount;
	@JsonProperty("watchers_count")
	private Long watchersCount;
	@JsonProperty("watchers")
	private Long watchers;
	@JsonProperty("size")
	private Long size;
	@JsonProperty("default_branch")
	private String defaultBranch;
	@JsonProperty("open_issues")
	private Long openIssues;
	@JsonProperty("open_issues_count")
	private Long openIssuesCount;
	@JsonProperty("is_template")
	private Boolean isTemplate;
	@JsonProperty("has_issues")
	private Boolean hasIssues;
	@JsonProperty("has_projects")
	private Boolean hasProjects;
	@JsonProperty("has_wiki")
	private Boolean hasWiki;
	@JsonProperty("has_pages")
	private Boolean hasPages;
	@JsonProperty("has_downloads")
	private Boolean hasDownloads;
	@JsonProperty("has_discussions")
	private Boolean hasDiscussions;
	@JsonProperty("archived")
	private Boolean archived;
	@JsonProperty("disabled")
	private Boolean disabled;
	@JsonProperty("visibility")
	private String visibility;
	@JsonProperty("pushed_at")
	private LocalDateTime pushedAt;
	@JsonProperty("created_at")
	private LocalDateTime createdAt;
	@JsonProperty("updated_at")
	private LocalDateTime updatedAt;
	@JsonProperty("allow_rebase_merge")
	private String allowRebaseMerge;
	@JsonProperty("template_repository")
	private String templateRepository;
	@JsonProperty("temp_clone_token")
	private String tempCloneToken;
	@JsonProperty("allow_squash_merge")
	private String allowSquashMerge;
	@JsonProperty("allow_auto_merge")
	private String allowAutoMerge;
	@JsonProperty("delete_branch_on_merge")
	private String deleteBranchOnMerge;
	@JsonProperty("allow_merge_commit")
	private String allowMergeCommit;
	@JsonProperty("subscribers_count")
	private String subscribersCount;
	@JsonProperty("network_count")
	private String networkCount;
	@JsonProperty("license")
	private String license;
	@JsonProperty("allow_forking")
	private Boolean allowForking;
	@JsonProperty("web_commit_signoff_required")
	private Boolean webCommitSignoffRequired;
	@JsonProperty("topics")
	private String[] topics;

	public RepositoryDTO() {
	}

	public RepositoryDTO(Long id, String nodeId, String name, String fullName, Boolean repositoryPrivate,
			OwnerDTO owner, String htmlUrl, String description, Boolean fork, String url, String archiveUrl,
			String assigneesUrl, String blobsUrl, String branchesUrl, String collaboratorsUrl, String commentsUrl,
			String commitsUrl, String compareUrl, String contentsUrl, String contributorsUrl, String deploymentsUrl,
			String downloadsUrl, String eventsUrl, String forksUrl, String gitCommitsUrl, String gitRefsUrl,
			String gitTagsUrl, String gitUrl, String issueCommentUrl, String issueEventsUrl, String issuesUrl,
			String keysUrl, String labelsUrl, String languagesUrl, String mergesUrl, String milestonesUrl,
			String notificationsUrl, String pullsUrl, String releasesUrl, String sshUrl, String stargazersUrl,
			String statusesUrl, String subscribersUrl, String subscriptionUrl, String tagsUrl, String teamsUrl,
			String treesUrl, String cloneUrl, String mirrorUrl, String hooksUrl, String svnUrl, String homepage,
			String organization, String language, Long forks, Long forksCount, Long stargazersCount, Long watchersCount,
			Long watchers, Long size, String defaultBranch, Long openIssues, Long openIssuesCount, Boolean isTemplate,
			Boolean hasIssues, Boolean hasProjects, Boolean hasWiki, Boolean hasPages, Boolean hasDownloads,
			Boolean hasDiscussions, Boolean archived, Boolean disabled, String visibility, LocalDateTime pushedAt,
			LocalDateTime createdAt, LocalDateTime updatedAt, String allowRebaseMerge, String templateRepository,
			String tempCloneToken, String allowSquashMerge, String allowAutoMerge, String deleteBranchOnMerge,
			String allowMergeCommit, String subscribersCount, String networkCount, String license, Boolean allowForking,
			Boolean webCommitSignoffRequired, String[] topics) {
		super();
		this.id = id;
		this.nodeId = nodeId;
		this.name = name;
		this.fullName = fullName;
		this.repositoryPrivate = repositoryPrivate;
		this.owner = owner;
		this.htmlUrl = htmlUrl;
		this.description = description;
		this.fork = fork;
		this.url = url;
		this.archiveUrl = archiveUrl;
		this.assigneesUrl = assigneesUrl;
		this.blobsUrl = blobsUrl;
		this.branchesUrl = branchesUrl;
		this.collaboratorsUrl = collaboratorsUrl;
		this.commentsUrl = commentsUrl;
		this.commitsUrl = commitsUrl;
		this.compareUrl = compareUrl;
		this.contentsUrl = contentsUrl;
		this.contributorsUrl = contributorsUrl;
		this.deploymentsUrl = deploymentsUrl;
		this.downloadsUrl = downloadsUrl;
		this.eventsUrl = eventsUrl;
		this.forksUrl = forksUrl;
		this.gitCommitsUrl = gitCommitsUrl;
		this.gitRefsUrl = gitRefsUrl;
		this.gitTagsUrl = gitTagsUrl;
		this.gitUrl = gitUrl;
		this.issueCommentUrl = issueCommentUrl;
		this.issueEventsUrl = issueEventsUrl;
		this.issuesUrl = issuesUrl;
		this.keysUrl = keysUrl;
		this.labelsUrl = labelsUrl;
		this.languagesUrl = languagesUrl;
		this.mergesUrl = mergesUrl;
		this.milestonesUrl = milestonesUrl;
		this.notificationsUrl = notificationsUrl;
		this.pullsUrl = pullsUrl;
		this.releasesUrl = releasesUrl;
		this.sshUrl = sshUrl;
		this.stargazersUrl = stargazersUrl;
		this.statusesUrl = statusesUrl;
		this.subscribersUrl = subscribersUrl;
		this.subscriptionUrl = subscriptionUrl;
		this.tagsUrl = tagsUrl;
		this.teamsUrl = teamsUrl;
		this.treesUrl = treesUrl;
		this.cloneUrl = cloneUrl;
		this.mirrorUrl = mirrorUrl;
		this.hooksUrl = hooksUrl;
		this.svnUrl = svnUrl;
		this.homepage = homepage;
		this.organization = organization;
		this.language = language;
		this.forks = forks;
		this.forksCount = forksCount;
		this.stargazersCount = stargazersCount;
		this.watchersCount = watchersCount;
		this.watchers = watchers;
		this.size = size;
		this.defaultBranch = defaultBranch;
		this.openIssues = openIssues;
		this.openIssuesCount = openIssuesCount;
		this.isTemplate = isTemplate;
		this.hasIssues = hasIssues;
		this.hasProjects = hasProjects;
		this.hasWiki = hasWiki;
		this.hasPages = hasPages;
		this.hasDownloads = hasDownloads;
		this.hasDiscussions = hasDiscussions;
		this.archived = archived;
		this.disabled = disabled;
		this.visibility = visibility;
		this.pushedAt = pushedAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.allowRebaseMerge = allowRebaseMerge;
		this.templateRepository = templateRepository;
		this.tempCloneToken = tempCloneToken;
		this.allowSquashMerge = allowSquashMerge;
		this.allowAutoMerge = allowAutoMerge;
		this.deleteBranchOnMerge = deleteBranchOnMerge;
		this.allowMergeCommit = allowMergeCommit;
		this.subscribersCount = subscribersCount;
		this.networkCount = networkCount;
		this.license = license;
		this.allowForking = allowForking;
		this.webCommitSignoffRequired = webCommitSignoffRequired;
		this.topics = topics;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Boolean getRepositoryPrivate() {
		return repositoryPrivate;
	}

	public void setRepositoryPrivate(Boolean repositoryPrivate) {
		this.repositoryPrivate = repositoryPrivate;
	}

	public OwnerDTO getOwner() {
		return owner;
	}

	public void setOwner(OwnerDTO owner) {
		this.owner = owner;
	}

	public String getHtmlUrl() {
		return htmlUrl;
	}

	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getFork() {
		return fork;
	}

	public void setFork(Boolean fork) {
		this.fork = fork;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getArchiveUrl() {
		return archiveUrl;
	}

	public void setArchiveUrl(String archiveUrl) {
		this.archiveUrl = archiveUrl;
	}

	public String getAssigneesUrl() {
		return assigneesUrl;
	}

	public void setAssigneesUrl(String assigneesUrl) {
		this.assigneesUrl = assigneesUrl;
	}

	public String getBlobsUrl() {
		return blobsUrl;
	}

	public void setBlobsUrl(String blobsUrl) {
		this.blobsUrl = blobsUrl;
	}

	public String getBranchesUrl() {
		return branchesUrl;
	}

	public void setBranchesUrl(String branchesUrl) {
		this.branchesUrl = branchesUrl;
	}

	public String getCollaboratorsUrl() {
		return collaboratorsUrl;
	}

	public void setCollaboratorsUrl(String collaboratorsUrl) {
		this.collaboratorsUrl = collaboratorsUrl;
	}

	public String getCommentsUrl() {
		return commentsUrl;
	}

	public void setCommentsUrl(String commentsUrl) {
		this.commentsUrl = commentsUrl;
	}

	public String getCommitsUrl() {
		return commitsUrl;
	}

	public void setCommitsUrl(String commitsUrl) {
		this.commitsUrl = commitsUrl;
	}

	public String getCompareUrl() {
		return compareUrl;
	}

	public void setCompareUrl(String compareUrl) {
		this.compareUrl = compareUrl;
	}

	public String getContentsUrl() {
		return contentsUrl;
	}

	public void setContentsUrl(String contentsUrl) {
		this.contentsUrl = contentsUrl;
	}

	public String getContributorsUrl() {
		return contributorsUrl;
	}

	public void setContributorsUrl(String contributorsUrl) {
		this.contributorsUrl = contributorsUrl;
	}

	public String getDeploymentsUrl() {
		return deploymentsUrl;
	}

	public void setDeploymentsUrl(String deploymentsUrl) {
		this.deploymentsUrl = deploymentsUrl;
	}

	public String getDownloadsUrl() {
		return downloadsUrl;
	}

	public void setDownloadsUrl(String downloadsUrl) {
		this.downloadsUrl = downloadsUrl;
	}

	public String getEventsUrl() {
		return eventsUrl;
	}

	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	public String getForksUrl() {
		return forksUrl;
	}

	public void setForksUrl(String forksUrl) {
		this.forksUrl = forksUrl;
	}

	public String getGitCommitsUrl() {
		return gitCommitsUrl;
	}

	public void setGitCommitsUrl(String gitCommitsUrl) {
		this.gitCommitsUrl = gitCommitsUrl;
	}

	public String getGitRefsUrl() {
		return gitRefsUrl;
	}

	public void setGitRefsUrl(String gitRefsUrl) {
		this.gitRefsUrl = gitRefsUrl;
	}

	public String getGitTagsUrl() {
		return gitTagsUrl;
	}

	public void setGitTagsUrl(String gitTagsUrl) {
		this.gitTagsUrl = gitTagsUrl;
	}

	public String getGitUrl() {
		return gitUrl;
	}

	public void setGitUrl(String gitUrl) {
		this.gitUrl = gitUrl;
	}

	public String getIssueCommentUrl() {
		return issueCommentUrl;
	}

	public void setIssueCommentUrl(String issueCommentUrl) {
		this.issueCommentUrl = issueCommentUrl;
	}

	public String getIssueEventsUrl() {
		return issueEventsUrl;
	}

	public void setIssueEventsUrl(String issueEventsUrl) {
		this.issueEventsUrl = issueEventsUrl;
	}

	public String getIssuesUrl() {
		return issuesUrl;
	}

	public void setIssuesUrl(String issuesUrl) {
		this.issuesUrl = issuesUrl;
	}

	public String getKeysUrl() {
		return keysUrl;
	}

	public void setKeysUrl(String keysUrl) {
		this.keysUrl = keysUrl;
	}

	public String getLabelsUrl() {
		return labelsUrl;
	}

	public void setLabelsUrl(String labelsUrl) {
		this.labelsUrl = labelsUrl;
	}

	public String getLanguagesUrl() {
		return languagesUrl;
	}

	public void setLanguagesUrl(String languagesUrl) {
		this.languagesUrl = languagesUrl;
	}

	public String getMergesUrl() {
		return mergesUrl;
	}

	public void setMergesUrl(String mergesUrl) {
		this.mergesUrl = mergesUrl;
	}

	public String getMilestonesUrl() {
		return milestonesUrl;
	}

	public void setMilestonesUrl(String milestonesUrl) {
		this.milestonesUrl = milestonesUrl;
	}

	public String getNotificationsUrl() {
		return notificationsUrl;
	}

	public void setNotificationsUrl(String notificationsUrl) {
		this.notificationsUrl = notificationsUrl;
	}

	public String getPullsUrl() {
		return pullsUrl;
	}

	public void setPullsUrl(String pullsUrl) {
		this.pullsUrl = pullsUrl;
	}

	public String getReleasesUrl() {
		return releasesUrl;
	}

	public void setReleasesUrl(String releasesUrl) {
		this.releasesUrl = releasesUrl;
	}

	public String getSshUrl() {
		return sshUrl;
	}

	public void setSshUrl(String sshUrl) {
		this.sshUrl = sshUrl;
	}

	public String getStargazersUrl() {
		return stargazersUrl;
	}

	public void setStargazersUrl(String stargazersUrl) {
		this.stargazersUrl = stargazersUrl;
	}

	public String getStatusesUrl() {
		return statusesUrl;
	}

	public void setStatusesUrl(String statusesUrl) {
		this.statusesUrl = statusesUrl;
	}

	public String getSubscribersUrl() {
		return subscribersUrl;
	}

	public void setSubscribersUrl(String subscribersUrl) {
		this.subscribersUrl = subscribersUrl;
	}

	public String getSubscriptionUrl() {
		return subscriptionUrl;
	}

	public void setSubscriptionUrl(String subscriptionUrl) {
		this.subscriptionUrl = subscriptionUrl;
	}

	public String getTagsUrl() {
		return tagsUrl;
	}

	public void setTagsUrl(String tagsUrl) {
		this.tagsUrl = tagsUrl;
	}

	public String getTeamsUrl() {
		return teamsUrl;
	}

	public void setTeamsUrl(String teamsUrl) {
		this.teamsUrl = teamsUrl;
	}

	public String getTreesUrl() {
		return treesUrl;
	}

	public void setTreesUrl(String treesUrl) {
		this.treesUrl = treesUrl;
	}

	public String getCloneUrl() {
		return cloneUrl;
	}

	public void setCloneUrl(String cloneUrl) {
		this.cloneUrl = cloneUrl;
	}

	public String getMirrorUrl() {
		return mirrorUrl;
	}

	public void setMirrorUrl(String mirrorUrl) {
		this.mirrorUrl = mirrorUrl;
	}

	public String getHooksUrl() {
		return hooksUrl;
	}

	public void setHooksUrl(String hooksUrl) {
		this.hooksUrl = hooksUrl;
	}

	public String getSvnUrl() {
		return svnUrl;
	}

	public void setSvnUrl(String svnUrl) {
		this.svnUrl = svnUrl;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Long getForks() {
		return forks;
	}

	public void setForks(Long forks) {
		this.forks = forks;
	}

	public Long getForksCount() {
		return forksCount;
	}

	public void setForksCount(Long forksCount) {
		this.forksCount = forksCount;
	}

	public Long getStargazersCount() {
		return stargazersCount;
	}

	public void setStargazersCount(Long stargazersCount) {
		this.stargazersCount = stargazersCount;
	}

	public Long getWatchersCount() {
		return watchersCount;
	}

	public void setWatchersCount(Long watchersCount) {
		this.watchersCount = watchersCount;
	}

	public Long getWatchers() {
		return watchers;
	}

	public void setWatchers(Long watchers) {
		this.watchers = watchers;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getDefaultBranch() {
		return defaultBranch;
	}

	public void setDefaultBranch(String defaultBranch) {
		this.defaultBranch = defaultBranch;
	}

	public Long getOpenIssues() {
		return openIssues;
	}

	public void setOpenIssues(Long openIssues) {
		this.openIssues = openIssues;
	}

	public Long getOpenIssuesCount() {
		return openIssuesCount;
	}

	public void setOpenIssuesCount(Long openIssuesCount) {
		this.openIssuesCount = openIssuesCount;
	}

	public Boolean getIsTemplate() {
		return isTemplate;
	}

	public void setIsTemplate(Boolean isTemplate) {
		this.isTemplate = isTemplate;
	}

	public Boolean getHasIssues() {
		return hasIssues;
	}

	public void setHasIssues(Boolean hasIssues) {
		this.hasIssues = hasIssues;
	}

	public Boolean getHasProjects() {
		return hasProjects;
	}

	public void setHasProjects(Boolean hasProjects) {
		this.hasProjects = hasProjects;
	}

	public Boolean getHasWiki() {
		return hasWiki;
	}

	public void setHasWiki(Boolean hasWiki) {
		this.hasWiki = hasWiki;
	}

	public Boolean getHasPages() {
		return hasPages;
	}

	public void setHasPages(Boolean hasPages) {
		this.hasPages = hasPages;
	}

	public Boolean getHasDownloads() {
		return hasDownloads;
	}

	public void setHasDownloads(Boolean hasDownloads) {
		this.hasDownloads = hasDownloads;
	}

	public Boolean getHasDiscussions() {
		return hasDiscussions;
	}

	public void setHasDiscussions(Boolean hasDiscussions) {
		this.hasDiscussions = hasDiscussions;
	}

	public Boolean getArchived() {
		return archived;
	}

	public void setArchived(Boolean archived) {
		this.archived = archived;
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public LocalDateTime getPushedAt() {
		return pushedAt;
	}

	public void setPushedAt(LocalDateTime pushedAt) {
		this.pushedAt = pushedAt;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getAllowRebaseMerge() {
		return allowRebaseMerge;
	}

	public void setAllowRebaseMerge(String allowRebaseMerge) {
		this.allowRebaseMerge = allowRebaseMerge;
	}

	public String getTemplateRepository() {
		return templateRepository;
	}

	public void setTemplateRepository(String templateRepository) {
		this.templateRepository = templateRepository;
	}

	public String getTempCloneToken() {
		return tempCloneToken;
	}

	public void setTempCloneToken(String tempCloneToken) {
		this.tempCloneToken = tempCloneToken;
	}

	public String getAllowSquashMerge() {
		return allowSquashMerge;
	}

	public void setAllowSquashMerge(String allowSquashMerge) {
		this.allowSquashMerge = allowSquashMerge;
	}

	public String getAllowAutoMerge() {
		return allowAutoMerge;
	}

	public void setAllowAutoMerge(String allowAutoMerge) {
		this.allowAutoMerge = allowAutoMerge;
	}

	public String getDeleteBranchOnMerge() {
		return deleteBranchOnMerge;
	}

	public void setDeleteBranchOnMerge(String deleteBranchOnMerge) {
		this.deleteBranchOnMerge = deleteBranchOnMerge;
	}

	public String getAllowMergeCommit() {
		return allowMergeCommit;
	}

	public void setAllowMergeCommit(String allowMergeCommit) {
		this.allowMergeCommit = allowMergeCommit;
	}

	public String getSubscribersCount() {
		return subscribersCount;
	}

	public void setSubscribersCount(String subscribersCount) {
		this.subscribersCount = subscribersCount;
	}

	public String getNetworkCount() {
		return networkCount;
	}

	public void setNetworkCount(String networkCount) {
		this.networkCount = networkCount;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Boolean getAllowForking() {
		return allowForking;
	}

	public void setAllowForking(Boolean allowForking) {
		this.allowForking = allowForking;
	}

	public Boolean getWebCommitSignoffRequired() {
		return webCommitSignoffRequired;
	}

	public void setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) {
		this.webCommitSignoffRequired = webCommitSignoffRequired;
	}

	public String[] getTopics() {
		return topics;
	}

	public void setTopics(String[] topics) {
		this.topics = topics;
	}

	@Override
	public String toString() {
		return "RepositoryDTO [id=" + id + ", nodeId=" + nodeId + ", name=" + name + ", fullName=" + fullName
				+ ", repositoryPrivate=" + repositoryPrivate + ", owner=" + owner + ", htmlUrl=" + htmlUrl
				+ ", description=" + description + ", fork=" + fork + ", url=" + url + ", archiveUrl=" + archiveUrl
				+ ", assigneesUrl=" + assigneesUrl + ", blobsUrl=" + blobsUrl + ", branchesUrl=" + branchesUrl
				+ ", collaboratorsUrl=" + collaboratorsUrl + ", commentsUrl=" + commentsUrl + ", commitsUrl="
				+ commitsUrl + ", compareUrl=" + compareUrl + ", contentsUrl=" + contentsUrl + ", contributorsUrl="
				+ contributorsUrl + ", deploymentsUrl=" + deploymentsUrl + ", downloadsUrl=" + downloadsUrl
				+ ", eventsUrl=" + eventsUrl + ", forksUrl=" + forksUrl + ", gitCommitsUrl=" + gitCommitsUrl
				+ ", gitRefsUrl=" + gitRefsUrl + ", gitTagsUrl=" + gitTagsUrl + ", gitUrl=" + gitUrl
				+ ", issueCommentUrl=" + issueCommentUrl + ", issueEventsUrl=" + issueEventsUrl + ", issuesUrl="
				+ issuesUrl + ", keysUrl=" + keysUrl + ", labelsUrl=" + labelsUrl + ", languagesUrl=" + languagesUrl
				+ ", mergesUrl=" + mergesUrl + ", milestonesUrl=" + milestonesUrl + ", notificationsUrl="
				+ notificationsUrl + ", pullsUrl=" + pullsUrl + ", releasesUrl=" + releasesUrl + ", sshUrl=" + sshUrl
				+ ", stargazersUrl=" + stargazersUrl + ", statusesUrl=" + statusesUrl + ", subscribersUrl="
				+ subscribersUrl + ", subscriptionUrl=" + subscriptionUrl + ", tagsUrl=" + tagsUrl + ", teamsUrl="
				+ teamsUrl + ", treesUrl=" + treesUrl + ", cloneUrl=" + cloneUrl + ", mirrorUrl=" + mirrorUrl
				+ ", hooksUrl=" + hooksUrl + ", svnUrl=" + svnUrl + ", homepage=" + homepage + ", organization="
				+ organization + ", language=" + language + ", forks=" + forks + ", forksCount=" + forksCount
				+ ", stargazersCount=" + stargazersCount + ", watchersCount=" + watchersCount + ", watchers=" + watchers
				+ ", size=" + size + ", defaultBranch=" + defaultBranch + ", openIssues=" + openIssues
				+ ", openIssuesCount=" + openIssuesCount + ", isTemplate=" + isTemplate + ", hasIssues=" + hasIssues
				+ ", hasProjects=" + hasProjects + ", hasWiki=" + hasWiki + ", hasPages=" + hasPages + ", hasDownloads="
				+ hasDownloads + ", hasDiscussions=" + hasDiscussions + ", archived=" + archived + ", disabled="
				+ disabled + ", visibility=" + visibility + ", pushedAt=" + pushedAt + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", allowRebaseMerge=" + allowRebaseMerge + ", templateRepository="
				+ templateRepository + ", tempCloneToken=" + tempCloneToken + ", allowSquashMerge=" + allowSquashMerge
				+ ", allowAutoMerge=" + allowAutoMerge + ", deleteBranchOnMerge=" + deleteBranchOnMerge
				+ ", allowMergeCommit=" + allowMergeCommit + ", subscribersCount=" + subscribersCount
				+ ", networkCount=" + networkCount + ", license=" + license + ", allowForking=" + allowForking
				+ ", webCommitSignoffRequired=" + webCommitSignoffRequired + ", topics=" + Arrays.toString(topics)
				+ "]";
	}

}
