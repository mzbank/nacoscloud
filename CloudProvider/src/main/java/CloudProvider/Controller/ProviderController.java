package CloudProvider.Controller;

import CloudProvider.entity.TUser;
import CloudProvider.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ProviderController
 * @Description
 * @Author
 * @Date2019/9/6 9:45
 * @Version V1.0
 */

@RestController
@Slf4j
public class ProviderController {

    @Autowired
    private UserService userService;

    @GetMapping("/provider")
    public String provider(){
        return "l'm from provider server port 8071";
    }

    @GetMapping("/user")
    public List<TUser> UserController(){
        List<TUser> tUsers = userService.FindUser();
        return tUsers;
    }
}