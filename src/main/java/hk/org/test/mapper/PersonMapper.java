package hk.org.test.mapper;

import java.util.List;

import hk.org.test.entity.Person;

public interface PersonMapper {
	Person queryPersonByHKID(String hkid);

	List<Person> queryAllPerson();

	void insertPerson(Person person);
}
