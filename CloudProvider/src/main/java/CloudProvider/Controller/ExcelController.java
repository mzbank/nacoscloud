package CloudProvider.Controller;

import CloudProvider.dao.UserMapper;
import CloudProvider.entity.TUser;
import CloudProvider.util.ExcelUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;

/**
 * @ClassName ExcelController
 * @Description
 * @Author
 * @Date2019/9/7 23:26
 * @Version V1.0
 */
@RestController
@Slf4j
@Api(description = "excel导入导出",value = "倒入")
public class ExcelController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/export")
    @ApiOperation(value = "slj",notes = "sdfe")
    public String ExcelExport(HttpServletResponse response){
        List<TUser> tUsers = userMapper.FindUser();
        log.info("导出文件内容:"+tUsers);
        ExcelUtils.exportExcel(tUsers, "文件标题", "文件头", TUser.class, "Excel文件1.xls", response);
        log.info("文件导出成功");
        return "导出成功文件";
    }

    @GetMapping("/import")
    public void ExcelImport(){
        String filePath = "F:\\海贼王.xls";
        File file = new File("F:\\海贼王.xls");
        System.out.println(file.exists());
        List<TUser> tUsers = ExcelUtils.importExcel(filePath, 0, 1, TUser.class);
        log.info("导入信息"+tUsers);
        log.info("文件导入成功");
    }
}