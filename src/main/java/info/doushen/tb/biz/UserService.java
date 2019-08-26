package info.doushen.tb.biz;

import info.doushen.tb.entity.UserEntity;

/**
 * UserService
 *
 * @author huangdou
 * @date 2019/8/24
 */
public interface UserService {

    /**
     * 根据登录账户查询用户
     *
     * @param userName
     * @return
     */
    UserEntity getUserByUserName(String userName);

}
