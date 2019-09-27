package demo;

import feign.Headers;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @Author: liushoulong
 * @Date: 2019/9/27 9:34
 */
@FeignClient(name="name",url = "127.0.0.1:8090/test",path = "/",configuration = FeignConfig.class)
public interface IUserService {

    @RequestMapping(value = "getUserPage",method = RequestMethod.POST,headers = {"ContentType=application/x-www-form-urlencoded","Inner_token=PXH0dP5I8qQ8UbFPpzm67cQkm7j8tWT2Kwn6J6SXYkfp2kMo/lSqHQ=="})
    public Map<String,Object> getUserPage(User user);
}
