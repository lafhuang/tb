package info.doushen.tb.controller;

import info.doushen.tb.common.Result;
import info.doushen.tb.utils.MD5Utils;
import info.doushen.tb.utils.ShiroUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * LoginController
 *
 * @author huangdou
 * @date 2019/8/24
 */
@Controller
public class LoginController extends BaseController {

    @GetMapping("/login")
    String login() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    Result login(String username, String password) {
        password = MD5Utils.encrypt(username, password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return Result.ok();
        } catch (AuthenticationException e) {
            return Result.error("用户或密码错误");
        }
    }

    @GetMapping("/logout")
    String logout() {
        ShiroUtils.logout();
        return "redirect:/login";
    }

}
