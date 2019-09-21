package CloudConsumer.Controller;

//import CloudConsumer.ConsumerApi".remoteController;
import CloudConsumer.entity.TUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName ConsumerController
 * @Description
 * @Author
 * @Date2019/9/6 9:29
 * @Version V1.0
 */
@Slf4j
@RestController
@Api(description = "服务消费者")
//@RequestMapping("/excel")
public class ConsumerController {

//    @Autowired
//    private remoteController controller;

    @Autowired
    private RestTemplate restTemplate;

    @ApiOperation(value = "消费者接口",notes = "调用服务提供者")
    @GetMapping("/consumer")
    public String consumer(){
//        openfeign声明式服务调用
//        String result = controller.provider();
//        resttemplate
//        ResponseEntity<List> entity = restTemplate.getForEntity("http://localhost:8071/user", List.class);
//        log.info("调用结果:" + entity);
        return "result";
    }

    @GetMapping("/user2")
    public List<TUser> consumer2(){
//        List<TUser> tUsers = controller.UserController();
        return null;
    }

    @GetMapping("/somegood")
    public String something(){
        return "sjfios";
    }
}