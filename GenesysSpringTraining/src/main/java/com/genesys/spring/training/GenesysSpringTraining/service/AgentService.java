package com.genesys.spring.training.GenesysSpringTraining.service;

import org.springframework.stereotype.Service;

import com.genesys.spring.training.GenesysSpringTraining.model.Agent;

@Service
public class AgentService {

	int counter = 0;
	
	public String createAgent(Agent agent) {
		agent.setId(generateID());
		return agent.getId();
	}
	
	
	private String generateID() {
		return "ID" + (++counter);
	}
	
}
