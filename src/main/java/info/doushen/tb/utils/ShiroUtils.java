package info.doushen.tb.utils;

import info.doushen.tb.entity.UserEntity;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * ShiroUtils
 *
 * @author huangdou
 * @date 2019/8/24
 */
public class ShiroUtils {

    public static Subject getSubjct() {
        return SecurityUtils.getSubject();
    }

    public static UserEntity getUser() {
        Object object = getSubjct().getPrincipal();
        return (UserEntity)object;
    }

    public static int getUserId() {
        return getUser().getId();
    }

    public static void logout() {
        getSubjct().logout();
    }

}
