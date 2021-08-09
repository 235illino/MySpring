package video.spring_01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import video.spring_01.dao.PersonDao;
import video.spring_01.dao.PersonDaoSimple;

@Configuration
public class DaoConfig {
    @Bean
    public PersonDao personDao(){
        return new PersonDaoSimple();
    }

}
