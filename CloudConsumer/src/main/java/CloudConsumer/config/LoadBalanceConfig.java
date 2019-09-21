package CloudConsumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName LoadBalanceConfig
 * @Description
 * @Author
 * @Date2019/9/9 16:24
 * @Version V1.0
 */

@Configuration
public class LoadBalanceConfig {

    @Bean
    public IRule iRule(){
//        负载均衡随机策略
        return new RandomRule();

//        负载均衡轮询策略
//        return new RoundRobinRule();

//
//        return new RetryRule();

//        负载均衡配置权重
//        return new WeightedResponseTimeRule("");
    }
}