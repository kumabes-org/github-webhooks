package br.com.kumabe.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueDTO implements Serializable {
	private static final long serialVersionUID = -3306512061328574027L;

	@JsonProperty("url")
	private String url;
	
	@JsonProperty("repository_url")
	private String repositoryUrl;

	@JsonProperty("labels_url")
	private String labelsUrl;
	
	@JsonProperty("comments_url")
	private String commentsUrl;
	
	@JsonProperty("events_url")
	private String eventsUrl;
	
	@JsonProperty("html_url")
	private String htmlUrl;

	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("node_id")
	private String nodeId;
	
	@JsonProperty("number")
	private Long number;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("user")
	private UserDTO user;

	@JsonProperty("labels")
	private String[] labels;
	
	@JsonProperty("state")
	private String state;
	
	@JsonProperty("locked")
	private Boolean locked;
	
	@JsonProperty("assignee")
	private String assignee;
	
	@JsonProperty("assignees")
	private String[] assignees;
	
	@JsonProperty("milestone")
	private String milestone;
	
	@JsonProperty("comments")
	private Long comments;
	
	@JsonProperty("created_at")
	private LocalDateTime createdAt;
	
	@JsonProperty("updated_at")
	private LocalDateTime updatedAt;
	
	@JsonProperty("closed_at")
	private LocalDateTime closedAt;
	
	@JsonProperty("author_association")
	private String authorAssociation;
	
	@JsonProperty("active_lock_reason")
	private String activeLockReason;
	
	@JsonProperty("body")
	private String body;
	
	@JsonProperty("reactions")
	private ReactionsDTO reactions;
	
	@JsonProperty("timeline_url")
	private String timelineUrl;
	
	@JsonProperty("performed_via_github_app")
	private String performedViaGithubApp;
	
	@JsonProperty("state_reason")
	private String stateReason;
	
	public IssueDTO() {}

	public IssueDTO(String url, String repositoryUrl, String labelsUrl, String commentsUrl, String eventsUrl,
			String htmlUrl, Long id, String nodeId, Long number, String title, UserDTO user, String[] labels,
			String state, Boolean locked, String assignee, String[] assignees, String milestone, Long comments,
			LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime closedAt, String authorAssociation,
			String activeLockReason, String body, ReactionsDTO reactions, String timelineUrl,
			String performedViaGithubApp, String stateReason) {
		super();
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRepositoryUrl() {
		return repositoryUrl;
	}

	public void setRepositoryUrl(String repositoryUrl) {
		this.repositoryUrl = repositoryUrl;
	}

	public String getLabelsUrl() {
		return labelsUrl;
	}

	public void setLabelsUrl(String labelsUrl) {
		this.labelsUrl = labelsUrl;
	}

	public String getCommentsUrl() {
		return commentsUrl;
	}

	public void setCommentsUrl(String commentsUrl) {
		this.commentsUrl = commentsUrl;
	}

	public String getEventsUrl() {
		return eventsUrl;
	}

	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	public String getHtmlUrl() {
		return htmlUrl;
	}

	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
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

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public String[] getLabels() {
		return labels;
	}

	public void setLabels(String[] labels) {
		this.labels = labels;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String[] getAssignees() {
		return assignees;
	}

	public void setAssignees(String[] assignees) {
		this.assignees = assignees;
	}

	public String getMilestone() {
		return milestone;
	}

	public void setMilestone(String milestone) {
		this.milestone = milestone;
	}

	public Long getComments() {
		return comments;
	}

	public void setComments(Long comments) {
		this.comments = comments;
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

	public LocalDateTime getClosedAt() {
		return closedAt;
	}

	public void setClosedAt(LocalDateTime closedAt) {
		this.closedAt = closedAt;
	}

	public String getAuthorAssociation() {
		return authorAssociation;
	}

	public void setAuthorAssociation(String authorAssociation) {
		this.authorAssociation = authorAssociation;
	}

	public String getActiveLockReason() {
		return activeLockReason;
	}

	public void setActiveLockReason(String activeLockReason) {
		this.activeLockReason = activeLockReason;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public ReactionsDTO getReactions() {
		return reactions;
	}

	public void setReactions(ReactionsDTO reactions) {
		this.reactions = reactions;
	}

	public String getTimelineUrl() {
		return timelineUrl;
	}

	public void setTimelineUrl(String timelineUrl) {
		this.timelineUrl = timelineUrl;
	}

	public String getPerformedViaGithubApp() {
		return performedViaGithubApp;
	}

	public void setPerformedViaGithubApp(String performedViaGithubApp) {
		this.performedViaGithubApp = performedViaGithubApp;
	}

	public String getStateReason() {
		return stateReason;
	}

	public void setStateReason(String stateReason) {
		this.stateReason = stateReason;
	}

	@Override
	public String toString() {
		return "IssueDTO [url=" + url + ", repositoryUrl=" + repositoryUrl + ", labelsUrl=" + labelsUrl
				+ ", commentsUrl=" + commentsUrl + ", eventsUrl=" + eventsUrl + ", htmlUrl=" + htmlUrl + ", id=" + id
				+ ", nodeId=" + nodeId + ", number=" + number + ", title=" + title + ", user=" + user + ", labels="
				+ Arrays.toString(labels) + ", state=" + state + ", locked=" + locked + ", assignee=" + assignee
				+ ", assignees=" + Arrays.toString(assignees) + ", milestone=" + milestone + ", comments=" + comments
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", closedAt=" + closedAt
				+ ", authorAssociation=" + authorAssociation + ", activeLockReason=" + activeLockReason + ", body="
				+ body + ", reactions=" + reactions + ", timelineUrl=" + timelineUrl + ", performedViaGithubApp="
				+ performedViaGithubApp + ", stateReason=" + stateReason + "]";
	}
			
}