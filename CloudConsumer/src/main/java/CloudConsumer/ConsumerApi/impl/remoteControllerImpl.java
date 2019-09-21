package CloudConsumer.ConsumerApi.impl;

import CloudConsumer.ConsumerApi.remoteController;
import CloudConsumer.entity.TUser;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName remoteControllerImpl
 * @Description
 * @Author
 * @Date2019/9/6 15:20
 * @Version V1.0
 */
@Component
public class remoteControllerImpl implements remoteController {
    @Override
    public String provider() {
        return "l'm fallback";
    }

    @Override
    public List<TUser> UserController() {
        List<TUser> users = new ArrayList<>();
        return users;
    }
}