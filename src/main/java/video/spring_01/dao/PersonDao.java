package video.spring_01.dao;

import video.spring_01.domain.Person;

public interface PersonDao {
    Person findByName(String name);
 //   void setAge(int defaultAge);
}
