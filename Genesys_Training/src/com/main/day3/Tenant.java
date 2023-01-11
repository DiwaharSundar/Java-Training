package com.main.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.main.day2.DN;


public class Tenant {
	
	List<Agent> agentList = new ArrayList<>();
	Set<DN> dnSet = new HashSet<>();
	HashMap<Agent, DN> agentDNMapping = new HashMap<>(); 
	
	//Data Structure that contains unique values of DNs
	//One more DS which contains the mapping between Agent and DN

	public Tenant() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void onboardAgent(Agent agent) {
		this.agentList.add(agent);
	}
	
	public DN findAssociatedDN(Agent agent) {
		if(!this.agentDNMapping.containsKey(agent)) {
			throw new AgentNotFoundException("Agent Not Available");
		}
		
		for(Map.Entry<Agent, DN> entry: this.agentDNMapping.entrySet()) {
			if(entry.getKey().getId().equals(agent.getId())) {
				return entry.getValue();
			}
		}
		
		return null;
	}
	

}
