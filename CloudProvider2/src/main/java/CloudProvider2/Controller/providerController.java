package CloudProvider2.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName providerController
 * @Description
 * @Author
 * @Date2019/9/6 15:40
 * @Version V1.0
 */
@RestController
@Api(description = "服务提供者2")
public class providerController {
    @GetMapping("/provider4")
    @ApiOperation(value = "provider接口",notes = "第二个服务的接口")
    public String provider(){

        return "l'm from provider2 server port 8072";
    }
}