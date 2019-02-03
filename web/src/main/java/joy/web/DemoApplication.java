package joy.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"joy"})
@EntityScan(basePackages = {"joy"})
@ComponentScan(basePackages = {"joy/repository", "joy/domain", "joy/web"})
public class DemoApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoApplication.class);
    }
}
