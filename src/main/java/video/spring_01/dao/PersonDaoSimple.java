package video.spring_01.dao;

import org.springframework.stereotype.Service;
import video.spring_01.domain.Person;
@Service
public class PersonDaoSimple implements PersonDao {

    @Override
    public Person findByName(String name) {
        return new Person(name, 18);
    }

}
