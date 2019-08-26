package info.doushen.tb.controller;

import info.doushen.tb.entity.UserEntity;
import info.doushen.tb.utils.ShiroUtils;
import org.springframework.stereotype.Controller;

/**
 * BaseController
 *
 * @author huangdou
 * @date 2019/8/24
 */
@Controller
public class BaseController {

    public UserEntity getUser() {
        return ShiroUtils.getUser();
    }

    public int getUserId() {
        return getUser().getId();
    }

    public String getUserName() {
        return getUser().getUserName();
    }

}
