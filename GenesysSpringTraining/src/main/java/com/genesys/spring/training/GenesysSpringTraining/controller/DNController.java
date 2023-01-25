package com.genesys.spring.training.GenesysSpringTraining.controller;

import java.net.Authenticator.RequestorType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genesys.spring.training.GenesysSpringTraining.model.DN;

@RestController
public class DNController {

	List<DN> dnList = new ArrayList<>();
	
	@RequestMapping(method = RequestMethod.POST, value = "/create")
	public String saveDN(@RequestBody DN dn) {
		dnList.add(dn);
		return "DN Added Successfully";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getAllDNs")
	public List<DN> getAllDNs() {
		return dnList;
	}
	
	
	
	

}
