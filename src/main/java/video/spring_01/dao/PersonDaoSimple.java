package video.spring_01.dao;

import video.spring_01.domain.Person;

public class PersonDaoSimple implements PersonDao {
    @Override
    public Person findByName(String name) {
        return new Person(name, 10);
    }
}
