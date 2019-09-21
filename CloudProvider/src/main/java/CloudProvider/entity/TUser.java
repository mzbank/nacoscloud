package CloudProvider.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
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

    @Excel(name = "id", orderNum = "0")
    private String id;

    @Excel(name = "姓名", orderNum = "1")
    private String userName;

    @Excel(name = "邮箱", orderNum = "2")
    private String userEmail;
}