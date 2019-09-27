package demo;

import feign.Headers;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @Author: liushoulong
 * @Date: 2019/9/26 18:13
 */
@FeignClient(name="cdcapi",url = "远程地址",path = "/cdcapi/hbase")
public interface IHbaseCdcService {
	// 多参数传入的时候，在使用@RequestParam的时候，一定要加上value=""属性值
    @RequestMapping(value = "/getObjectByPage",method = RequestMethod.POST,headers = {"ContentType=application/x-www-form-urlencoded","Inner_token=PXH0dP5I8qQ8UbFPpzm67cQkm7j8tWT2Kwn6J6SXYkfp2kMo/lSqHQ=="})
    public List<Object> getObjectByPage(@RequestParam(value = "rowKey") long rowKey, @RequestParam(value = "tableName") String tableName, @RequestParam(value = "page") int  page, @RequestParam(value = "rows") int rows);
}