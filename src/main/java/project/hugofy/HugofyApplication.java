package project.hugofy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HugofyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HugofyApplication.class, args);
	}

}
