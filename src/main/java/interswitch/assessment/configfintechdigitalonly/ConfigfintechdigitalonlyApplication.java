package interswitch.assessment.configfintechdigitalonly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//this is an annotation that is use to enable config server
@EnableConfigServer
public class ConfigfintechdigitalonlyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigfintechdigitalonlyApplication.class, args);
    }

}
