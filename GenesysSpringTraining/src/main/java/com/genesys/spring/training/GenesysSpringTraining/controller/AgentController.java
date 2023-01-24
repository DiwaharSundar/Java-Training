package com.genesys.spring.training.GenesysSpringTraining.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genesys.spring.training.GenesysSpringTraining.model.Agent;
import com.genesys.spring.training.GenesysSpringTraining.service.AgentService;


@RestController
@RequestMapping(path = "/agent")
public class AgentController {

	@Autowired
	AgentService agentService;
	
	List<Agent> agentList = new ArrayList<>();
	
	@RequestMapping(method = RequestMethod.POST, value = "/create")
	public String createAgent(@RequestBody Agent agent) {
		String id = agentService.createAgent(agent);
		return id;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Agent> getAllAgents(){
		return this.agentList;
	}
	
	

}
