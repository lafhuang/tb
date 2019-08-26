package info.doushen.tb.mapper;

import info.doushen.tb.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserMapper
 *
 * @author huangdou
 * @date 2019/8/24
 */
@Mapper
public interface UserMapper {

    /**
     * 根据登录账户获取用户
     *
     * @param userName
     * @return
     */
    UserEntity getUserByUserName(String userName);

}
