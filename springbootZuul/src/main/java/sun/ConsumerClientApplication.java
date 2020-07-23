package sun;

/**
 * @Author: ChaiWeitao
 * @Date: 2020/7/23 11:41
 * @Version: 1.0
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@RefreshScope
@EnableHystrix
public class ConsumerClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerClientApplication.class, args);
    }

}
