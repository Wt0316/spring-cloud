package sun.client;

/**
 * @Author: ChaiWeitao
 * @Date: 2020/7/23 11:27
 * @Version: 1.0
 */
import common.entity.RestfulResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.entity.ServiceInfo;

@Component
@FeignClient(value = "springbootService", fallback=ServiceFallback.class) //这里的value对应调用服务的spring.applicatoin.name
public interface ServiceFeignClient {

    @RequestMapping(value = "/service/hello")
    RestfulResult hello(ServiceInfo serviceInfo);


}