package video.spring_01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import video.spring_01.dao.PersonDao;
import video.spring_01.dao.PersonDaoSimple;
import video.spring_01.service.PersonService;
import video.spring_01.service.PersonSimpleService;

//@Configuration
//public class ServiceConfig {
////    @Bean
//    public PersonService personService(PersonDao personDao) {
//        return new PersonSimpleService(personDao);
//    }
//}
