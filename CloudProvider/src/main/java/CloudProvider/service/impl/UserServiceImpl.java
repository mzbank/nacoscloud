package CloudProvider.service.impl;

import CloudProvider.dao.UserMapper;
import CloudProvider.entity.TUser;
import CloudProvider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author
 * @Date2019/9/6 17:26
 * @Version V1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<TUser> FindUser() {

        List<TUser> users = userMapper.FindUser();
        return users;
    }
}