package xyz.amazingxu.whattoeat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.amazingxu.whattoeat.Service.Service;
import xyz.amazingxu.whattoeat.utils.WebResults;
import xyz.amazingxu.whattoeat.utils.WebUtils;

/**
 * @author xuwang <121894598@qq.com>
 * @date 2018/8/9 13:53
 */
@RestController
@RequestMapping("what")
public class Controller {

    @Autowired
    private Service service;

    @PostMapping("toEat")
    public WebResults getWhat(){
        return WebUtils.success(service.list());
    }
}
