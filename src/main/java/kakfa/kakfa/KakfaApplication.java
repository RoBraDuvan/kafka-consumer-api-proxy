package kakfa.kakfa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KakfaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KakfaApplication.class, args);
	}

}
