package hk.org.test.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;

import hk.org.test.entity.Person;
import hk.org.test.mapper.PersonMapper;
import hk.org.test.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Resource
	private PersonMapper personMapper;

	public Person getPerson(String id) {
		return personMapper.queryPersonByHKID(id);
	}

	public List<Person> getAllPerson() {
		return personMapper.queryAllPerson();
	}

	@Transactional
	public Person addPerson(Map<String, Object> map) {
		ObjectMapper om = new ObjectMapper();
		Person personToBeAdded = om.convertValue(map, Person.class);
		personMapper.insertPerson(personToBeAdded);
		Person person = personMapper.queryPersonByHKID(personToBeAdded.getHKID());

		return person;
	}
}
