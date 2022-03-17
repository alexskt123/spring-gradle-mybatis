package hk.org.test.service;

import java.util.List;
import java.util.Map;

import hk.org.test.entity.Person;

public interface PersonService {

	public Person getPerson(String id);

	public List<Person> getAllPerson();

	public Person addPerson(Map<String, Object> map);
}
