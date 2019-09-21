package CloudProvider2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @ClassName RedisDao
 * @Description
 * @Author
 * @Date2019/9/18 16:37
 * @Version V1.0
 */


public class RedisDao {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void chacheRedis(){
        ValueOperations<String, String> stringStringValueOperations = redisTemplate.opsForValue();
    }
}