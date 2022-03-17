package hk.org.test.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hk.org.test.entity.Person;
import hk.org.test.service.PersonService;

@RestController
public class TestController {

	@Autowired
	private PersonService personService;

	@GetMapping(value = "/person", produces = APPLICATION_JSON_VALUE)
	public Person getPerson(@RequestParam String id) {
		Person person = personService.getPerson(id);
		return person;
	}

	@PostMapping(value = "/person", produces = APPLICATION_JSON_VALUE)
	public Person addPerson(@RequestBody Map<String, Object> map) {
		Person person = personService.addPerson(map);
		return person;
	}

	@GetMapping(value = "/all-person", produces = APPLICATION_JSON_VALUE)
	public List<Person> getAllPerson() {
		List<Person> personList = personService.getAllPerson();
		return personList;
	}
}
