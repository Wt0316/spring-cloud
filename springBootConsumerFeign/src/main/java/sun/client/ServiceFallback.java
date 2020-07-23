package sun.client;

/**
 * @Author: ChaiWeitao
 * @Date: 2020/7/23 11:27
 * @Version: 1.0
 */

import common.entity.RestfulResult;
import org.springframework.stereotype.Component;
import sun.entity.ServiceInfo;

@Component
public class ServiceFallback implements ServiceFeignClient{

    @Override
    public RestfulResult hello(ServiceInfo serviceInfo) {
        RestfulResult result = new RestfulResult();
        result.setData("服务调用失败");
        return result;
    }
}
