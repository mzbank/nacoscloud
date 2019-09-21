package CloudProvider.dao;

import CloudProvider.CloudProvider;
import CloudProvider.entity.TUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @ClassName UserMapperTest
 * @Description
 * @Author
 * @Date2019/9/6 17:09
 * @Version V1.0
 */

@SpringBootTest(classes = CloudProvider.class)
@RunWith(SpringRunner.class)
@Slf4j
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findUser() {
        List<TUser> tUsers = userMapper.FindUser();
        System.out.println(tUsers);
    }
}