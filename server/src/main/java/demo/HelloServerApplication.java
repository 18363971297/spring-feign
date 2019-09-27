package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Spencer Gibb
 */
@SpringBootApplication
//@EnableDiscoveryClient
@RestController
public class HelloServerApplication {

	private AtomicLong atomicLong = new AtomicLong(10000);

	@RequestMapping(value = "/getUserPage",method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> getUserPage(User user, HttpServletRequest request) {

		System.out.println("----接收到数据："+user.toString());

		String contentType = request.getContentType();
		System.out.println("contentType : "+contentType);

		String token = request.getHeader("Inner_token");
		System.out.println("token:"+token);

		List<User> users = new ArrayList<>();
		for(int i = 0 ; i< 10 ; i++){
			User nuser = new User();
			nuser.setId(atomicLong.incrementAndGet());
			nuser.setPage(1);
			nuser.setSize(20);
			nuser.setTableName("hbaseTable");
			users.add(nuser);
		}

		Map<String,Object> result = new HashMap<>();
		result.put("rows", users);
		result.put("success", true);
		return result;
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloServerApplication.class, args);
	}
}
