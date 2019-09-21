package CloudProvider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName CloudProvider
 * @Description
 * @Author
 * @Date2019/9/6 9:04
 * @Version V1.0
 */

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("CloudProvider/dao")
@EnableSwagger2
public class CloudProvider {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider.class, args);
    }
}