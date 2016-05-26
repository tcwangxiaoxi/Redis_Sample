package test.wxx.com.redis_sample.other;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
@ComponentScan("test.wxx.com.redis_sample")
public class TestRedisdemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TestRedisdemoApplication.class);
		app.setWebEnvironment(false);
		app.run(args);
	}

}
