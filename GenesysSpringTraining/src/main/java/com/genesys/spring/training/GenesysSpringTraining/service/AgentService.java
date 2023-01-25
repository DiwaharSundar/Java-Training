package com.genesys.spring.training.GenesysSpringTraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genesys.spring.training.GenesysSpringTraining.model.Agent;
import com.genesys.spring.training.GenesysSpringTraining.repo.AgentRepository;

@Service
public class AgentService {

	@Autowired
	AgentRepository agentRepository;
	
	int counter = 0;
	public String createAgent(Agent agent) {
		agent.setId(generateID());
		return agent.getId();
	}
	
	
	private String generateID() {
		return "ID" + (++counter);
	}
	
	
	public void saveAgent(Agent agent) {
		agentRepository.save(agent);
	}
	
	public List<Agent> getAllAgent() {
		return (List<Agent>) agentRepository.findAll();
	}
	
}
