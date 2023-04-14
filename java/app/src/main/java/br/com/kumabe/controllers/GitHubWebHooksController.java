package br.com.kumabe.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.kumabe.dtos.IssuesDTO;
import br.com.kumabe.services.GitHubWebHooksService;

@RestController
public class GitHubWebHooksController {
	private static final Logger LOGGER = LoggerFactory.getLogger(GitHubWebHooksController.class);
	
	private GitHubWebHooksService gitHubWebHooksService;
	
	@Autowired
	public GitHubWebHooksController(GitHubWebHooksService gitHubWebHooksService) {
		this.gitHubWebHooksService = gitHubWebHooksService;
	}
	
	@PostMapping(path="/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Void> create(@RequestBody  @Valid IssuesDTO issuesDTO, UriComponentsBuilder uriComponentsBuilder){
		LOGGER.info("{}", issuesDTO);
		URI location = uriComponentsBuilder.path("/{id}").buildAndExpand(1L).toUri();
		return ResponseEntity.created(location).build();
	}
}
