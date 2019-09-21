package CloudProvider.dao;

import CloudProvider.entity.TUser;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description
 * @Author
 * @Date2019/9/6 16:42
 * @Version V1.0
 */
public interface UserMapper {

    List<TUser> FindUser();
}
