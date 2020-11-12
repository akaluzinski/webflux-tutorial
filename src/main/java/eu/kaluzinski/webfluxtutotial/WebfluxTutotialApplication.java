package eu.kaluzinski.webfluxtutotial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude={MongoAutoConfiguration.class})
public class WebfluxTutotialApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxTutotialApplication.class, args);
    }

}
