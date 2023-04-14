package br.com.kumabe.dtos;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IssuesDTO implements Serializable {
	private static final long serialVersionUID = -5570922718290284323L;

	@JsonProperty("action")
	private String action;
	
	@JsonProperty("organization")
	private OrganizationDTO organization;
	
	@JsonProperty("repository")
	private RepositoryDTO repository;
	
	@JsonProperty("sender")
	private SenderDTO sender;
	
	@JsonProperty("issue")
	private IssueDTO issue;
	
	public IssuesDTO() {}

	public IssuesDTO(String action, OrganizationDTO organization, RepositoryDTO repository, SenderDTO sender,
			IssueDTO issue) {
		super();
		this.action = action;
		this.organization = organization;
		this.repository = repository;
		this.sender = sender;
		this.issue = issue;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public OrganizationDTO getOrganization() {
		return organization;
	}

	public void setOrganization(OrganizationDTO organization) {
		this.organization = organization;
	}

	public RepositoryDTO getRepository() {
		return repository;
	}

	public void setRepository(RepositoryDTO repository) {
		this.repository = repository;
	}

	public SenderDTO getSender() {
		return sender;
	}

	public void setSender(SenderDTO sender) {
		this.sender = sender;
	}

	public IssueDTO getIssue() {
		return issue;
	}

	public void setIssue(IssueDTO issue) {
		this.issue = issue;
	}

	@Override
	public String toString() {
		return "IssuesDTO [action=" + action + ", organization=" + organization + ", repository=" + repository
				+ ", sender=" + sender + ", issue=" + issue + "]";
	}
		
}
