package CloudConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName CloudConsumer
 * @Description
 * @Author
 * @Date2019/9/6 9:13
 * @Version V1.0
 */

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
@EnableDiscoveryClient
public class CloudConsumer {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


    public static void main(String[] args) {
        SpringApplication.run(CloudConsumer.class, args);
    }
}