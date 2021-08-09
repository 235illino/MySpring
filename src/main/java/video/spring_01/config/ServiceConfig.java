package video.spring_01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import video.spring_01.dao.PersonDao;
import video.spring_01.dao.PersonDaoSimple;
import video.spring_01.service.PersonService;
import video.spring_01.service.PersonSimpleService;

@Configuration
public class ServiceConfig {
    @Bean
    public PersonService personService(PersonDao dao) {
        return new PersonSimpleService(dao);
    }
}
