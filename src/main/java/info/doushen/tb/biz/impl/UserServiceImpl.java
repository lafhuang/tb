package info.doushen.tb.biz.impl;

import info.doushen.tb.biz.UserService;
import info.doushen.tb.entity.UserEntity;
import info.doushen.tb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author huangdou
 * @date 2019/8/24
 */
@Service
class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }

}
