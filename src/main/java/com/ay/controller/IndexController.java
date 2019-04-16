package com.ay.controller;

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
 * @Date: Create in 2019\4\4 0004 16:16
 * @Description:
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "需要在 helloapplication.class 添加扫描包  在能使用我";
    }


}
