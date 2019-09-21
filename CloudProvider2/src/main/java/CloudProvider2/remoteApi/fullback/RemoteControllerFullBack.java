package CloudProvider2.remoteApi.fullback;

import CloudProvider2.remoteApi.RemoteController;

/**
 * @ClassName RemoteControllerFullBack
 * @Description
 * @Author
 * @Date2019/9/15 23:06
 * @Version V1.0
 */
public class RemoteControllerFullBack implements RemoteController {
    @Override
    public String something() {
        return "l'm from provider2 fullback";
    }
}