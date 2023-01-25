package com.genesys.spring.training.GenesysSpringTraining.repo;

import org.springframework.data.repository.CrudRepository;

import com.genesys.spring.training.GenesysSpringTraining.model.Agent;

public interface AgentRepository extends CrudRepository<Agent, String> {

}
