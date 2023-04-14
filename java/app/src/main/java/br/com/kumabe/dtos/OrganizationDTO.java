package br.com.kumabe.dtos;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganizationDTO implements Serializable {
	private static final long serialVersionUID = -8779887603459796728L;

	@JsonProperty("login")
	private String login;
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("node_id")
	private String nodeId;
	
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("repos_url")
	private String repositoryUrl;
	
	@JsonProperty("events_url")
	private String eventsUrl;
	
	@JsonProperty("hooks_url")
	private String hooksUrl;
	
	@JsonProperty("issues_url")
	private String issuesUrl;
	
	@JsonProperty("members_url")
	private String membersUrl;
	
	@JsonProperty("public_members_url")
	private String publicMembersUrl;
	
	@JsonProperty("avatar_url")
	private String avatarUrl;
	
	@JsonProperty("description")
	private String description;
	
	public OrganizationDTO() {}

	public OrganizationDTO(String login, Long id, String nodeId, String url, String repositoryUrl, String eventsUrl,
			String hooksUrl, String issuesUrl, String membersUrl, String publicMembersUrl, String avatarUrl,
			String description) {
		super();
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	public String getEventsUrl() {
		return eventsUrl;
	}

	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	public String getHooksUrl() {
		return hooksUrl;
	}

	public void setHooksUrl(String hooksUrl) {
		this.hooksUrl = hooksUrl;
	}

	public String getIssuesUrl() {
		return issuesUrl;
	}

	public void setIssuesUrl(String issuesUrl) {
		this.issuesUrl = issuesUrl;
	}

	public String getMembersUrl() {
		return membersUrl;
	}

	public void setMembersUrl(String membersUrl) {
		this.membersUrl = membersUrl;
	}

	public String getPublicMembersUrl() {
		return publicMembersUrl;
	}

	public void setPublicMembersUrl(String publicMembersUrl) {
		this.publicMembersUrl = publicMembersUrl;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "OrganizationDTO [login=" + login + ", id=" + id + ", nodeId=" + nodeId + ", url=" + url
				+ ", repositoryUrl=" + repositoryUrl + ", eventsUrl=" + eventsUrl + ", hooksUrl=" + hooksUrl
				+ ", issuesUrl=" + issuesUrl + ", membersUrl=" + membersUrl + ", publicMembersUrl=" + publicMembersUrl
				+ ", avatarUrl=" + avatarUrl + ", description=" + description + "]";
	}
	
}
