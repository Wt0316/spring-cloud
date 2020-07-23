package sun.controller;

/**
 * @Author: ChaiWeitao
 * @Date: 2020/7/23 10:40
 * @Version: 1.0
 */
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.entity.ServiceInfo;

@RestController
public class ServiceController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${server.port}")
    String port;

    // 调用：localhost:6007/consumerServiceRibbon?token=1
    @RequestMapping("/consumerServiceRibbon")
    @HystrixCommand(fallbackMethod="consumerServiceRibbonFallback")
    public String consumerServiceRibbon(ServiceInfo serviceInfo){
        String result = this.restTemplate.postForObject("http://springbootService/service/rest?token=1", serviceInfo, String.class);
        return result;
    }

    public String consumerServiceRibbonFallback(ServiceInfo serviceInfo){
        return "consumerServiceRibbon异常，端口：" + port + "，Name=" + serviceInfo.getName();
    }
}
