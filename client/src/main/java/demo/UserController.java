package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author: liushoulong
 * @Date: 2019/9/27 9:37
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getUser(){
         User user = new User();
         user.setTableName("feignTable");
         user.setSize(10);
         user.setPage(10);
         Map<String,Object> result = iUserService.getUserPage(user);
         return result;
    }
}
