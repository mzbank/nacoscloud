package CloudProvider2.remoteApi;

import CloudProvider2.remoteApi.fullback.RemoteControllerFullBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName RemoteController
 * @Description
 * @Author
 * @Date2019/9/15 23:00
 * @Version V1.0
 */

@FeignClient(value = "consumer",fallback = RemoteControllerFullBack.class,path = "excel")
public interface RemoteController {

    @GetMapping("/somegood")
    String something();
}