package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Spencer Gibb
 */
@SpringBootApplication
//@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class HelloClientApplication {
	/*@Autowired
	HbaseCdc hbaseCdc;

	@RequestMapping("/")
	public String hello() {
		return hbaseCdc.getObjectByPage();
	}*/

	public static void main(String[] args) {
		SpringApplication.run(HelloClientApplication.class, args);
	}

	/*@FeignClient("HelloServer")
	interface HelloClient {
		@RequestMapping(value = "/", method = GET)
		String hello();
	}*/

}
