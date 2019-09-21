package CloudProvider.service;

import CloudProvider.entity.TUser;

import java.util.List;

/**
 * @ClassName UserService
 * @Description
 * @Author
 * @Date2019/9/6 17:25
 * @Version V1.0
 */
public interface UserService {

    List<TUser> FindUser();
}