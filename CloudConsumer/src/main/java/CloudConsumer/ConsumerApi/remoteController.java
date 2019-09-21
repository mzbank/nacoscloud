package CloudConsumer.ConsumerApi;

import CloudConsumer.ConsumerApi.impl.remoteControllerImpl;
import CloudConsumer.entity.TUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName remoteController
 * @Description
 * @Author
 * @Date2019/9/6 14:03
 * @Version V1.0
 */

@FeignClient(value = "provider", fallback = remoteControllerImpl.class)
@RestController
public interface remoteController {

    @GetMapping("/provider4")
    String provider();

    @GetMapping("/user")
    List<TUser> UserController();
}
