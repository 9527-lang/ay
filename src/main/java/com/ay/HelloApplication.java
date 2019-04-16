package com.ay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ==========================
 * =============┏┓　　　┏┓
 * ==========┏┛┻━━━┛┻┓
 * =========┃　　　　　　　┃
 * ========┃　　　━　　　┃
 * =======┃　┳┛　┗┳　┃
 * ======┃　　　　　　　┃
 * =====┃　　　┻　　　┃
 * ====┃　　　　　　　┃
 * ===┗━┓　　　┏━┛
 * ======┃　　　┃
 * =====┃　　　┃
 * ====┃　　　┗━━━┓
 * ===┃　　　　　　　┣┓
 * ==┃　　　　　　　┏┛
 * =┗┓┓┏━┳┓┏┛
 * ==┃┫┫　┃┫┫
 * =┗┻┛　┗┻┛
 * =========神兽保佑 =========
 * =========代码无BUG! =======
 * ==========================
 *
 * @Auther: ayJun
 * @Date: Create in 2019\4\4 0004 15:52
 * @Description:  启动类
 */
// spring boot restfult 提供风格
    // @RestContrller == @Controller + @ResponseBody(返回json格式)
@RestController
@ComponentScan(basePackages = "com.ay.controller")   // 控制器 扫描包范围
@EnableAutoConfiguration        // 启动注解     spring boot 默认端口8080
public class HelloApplication {

    @RequestMapping("/hello")
    public String hello() {
        return "hello, spring boot 2.1.4";
    }

    public static void main(String[] args) {
        // 运行
        SpringApplication.run(HelloApplication.class, args);
    }

    /**
     *  默认配置
     * Spring Boot默认提供静态资源目录位置需置于classpath下，目录名需符合如下规则：
     * /static
     * /public
     * /resources
     * /META-INF/resources
     * 举例：我们可以在src/main/resources/目录下创建static，在该imgs文件位置放置一个图片文件。
     * 启动程序后，尝试访问http://localhost:8080/imgs/D.jpg。如能显示图片，配置成功。
     *
     */

}
