package CloudProvider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName CloudProvider2
 * @Description
 * @Author
 * @Date2019/9/6 15:39
 * @Version V1.0
 */

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@EnableSwagger2
@EnableFeignClients
public class CloudProvider2 {

    public static void main(String[] args) {

        SpringApplication.run(CloudProvider2.class, args);
    }
}