package braxxi.kursach;

import braxxi.kursach.server.BusinessServerApplication;
import org.springframework.boot.SpringApplication;

public class TestBusinessServerApplication extends BusinessServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestBusinessServerApplication.class, args);
	}
}
