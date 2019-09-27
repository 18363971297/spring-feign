package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author: liushoulong
 * @Date: 2019/9/27 11:15
 */
@Controller
@RequestMapping("/hbase")
public class HbaseController {

    @Autowired
    private IHbaseCdcService iHbaseCdcService;

    @RequestMapping(value = "/getObjectByPage")
    @ResponseBody
    public Map<String,Object> getObjectByPage(){
        Map<String,Object> result = iHbaseCdcService.getObjectByPage(100001L, "cdc_addr", 1,20 );
        return result;
    }
}
