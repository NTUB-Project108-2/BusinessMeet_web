package tw.com.business_meet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class BusinessMeetApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessMeetApplication.class, args);
    }


}
