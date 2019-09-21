package CloudConsumer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName TUser
 * @Description
 * @Author
 * @Date2019/9/6 16:18
 * @Version V1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUser {

    private String id;

    private String UserName;

    private String UserEmail;
}