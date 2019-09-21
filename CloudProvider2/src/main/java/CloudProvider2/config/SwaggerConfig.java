package CloudProvider2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @ClassName SwaggerConfig
 * @Description
 * @Author
 * @Date2019/9/9 9:07
 * @Version V1.0
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket petApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .select()
//                .apis(RequestHandlerSelectors.any())//添加所有Controller
//               添加指定包下的Controller文件
                .apis(RequestHandlerSelectors.basePackage("CloudProvider2.Controller"))
                .paths(PathSelectors.any())
                .build();

//    Api的一些描述信息
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("测试api")
                .description("对Api的描述")
                .contact(new Contact("wkk", "https://blog.yayuanzi.com/author/knight", "test@.com"))
                .version("v1.0")
                .build();
        docket.apiInfo(apiInfo);

        return docket;
    }
}