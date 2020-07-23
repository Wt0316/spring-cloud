package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author: ChaiWeitao
 * @Date: 2020/7/23 10:42
 * @Version: 1.0
 */

@EnableFeignClients
@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@RefreshScope   //开启配置更新功能
public class FeignClientApplication {
    public static void main(String[] args) {

        SpringApplication.run(FeignClientApplication.class, args);
    }

}
