package studio.ricardo.project.asyncdemolistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncDemoListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncDemoListenerApplication.class, args);
	}
}
