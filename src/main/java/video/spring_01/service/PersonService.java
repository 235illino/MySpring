package video.spring_01.service;

import video.spring_01.domain.Person;

public interface PersonService {
    Person getByName(String name);
}
