package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
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
        Params p = new Params();
        p.setPage(1);
        p.setRowKey(113756510856769536L);
        p.setSize(10);
        List<Object> list = iHbaseCdcService.getObjectByPage(113756510856769536L,"cdc_addr",1,5);
        Map<String,Object> result = new HashMap<>();
        result.put("rows", list);
        return result;
    }
}
