package com.genesys.spring.training.GenesysSpringTraining.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.security.web.util.TextEscapeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.genesys.spring.training.GenesysSpringTraining.model.Employee;

@RestController
public class SampleController {

	List<Employee> employeeList = new ArrayList<>();

	@RequestMapping(value = "/greet")
	public String sayHello() {
		return "Hello World";
	}

	// http://localhost:8081/hello?name=Diwahar&id=ID001
	@RequestMapping(value = "/hello")
	public String sayHelloDiwahar(@RequestParam String name, @RequestParam String id) {
		return "Hello " + name + " ID - " + escapeString(id);
	}

	// http://localhost:8081/name/Diwahar/id011/chennai
	@RequestMapping(value = "/name/{name}/{id}/{city}")
	public String sayHelloDiwaharUsingPathVaraibles(@PathVariable String name, @PathVariable String id,
			@PathVariable String city) {
		return "Hello " + name + " (ID - " + id + ") from " + city;
	}

	@RequestMapping(method = RequestMethod.GET, value = "employee")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId("ID001");
		emp.setName("Diwahar");
		emp.setDepartment("MCS");
		emp.setSalary(10.0);
		return emp;
	}

	@RequestMapping(method = RequestMethod.POST, value = "employee/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee onboardEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return employee;
	}

	private String escapeString(String str) {
		return TextEscapeUtils.escapeEntities(str);
	}

}
