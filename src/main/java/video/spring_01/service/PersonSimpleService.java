package video.spring_01.service;

import video.spring_01.dao.PersonDao;
import video.spring_01.domain.Person;

public class PersonSimpleService implements PersonService{

    private PersonDao dao;

//    public PersonSimpleService(PersonDao dao) {
//        this.dao = dao;
//    }


    public void setDao(PersonDao dao) {
        this.dao = dao;
    }

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
