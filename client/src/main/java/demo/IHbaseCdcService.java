package demo;

import feign.Headers;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @Author: liushoulong
 * @Date: 2019/9/26 18:13
 */
@FeignClient(name="cdcapi",url = "远程ip地址",path = "/cdcapi/hbase")
public interface IHbaseCdcService {
    @RequestMapping(value = "/getObjectByPage",method = RequestMethod.POST,headers = {"ContentType=application/x-www-form-urlencoded","Inner_token=PXH0dP5I8qQ8UbFPpzm67cQkm7j8tWT2Kwn6J6SXYkfp2kMo/lSqHQ=="})
    public Map<String,Object> getObjectByPage(long rowKey ,String tableName,int page,int size);
}