package info.doushen.tb.mapper;

import info.doushen.tb.entity.MenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * MenuMapper
 *
 * @author huangdou
 * @date 2019/8/24
 */
@Mapper
public interface MenuMapper {

    /**
     * 获取用户权限列表
     *
     * @param userId
     * @return
     */
    List<String> queryUserPerms(int userId);

    /**
     * 获取用户菜单列表
     *
     * @param userId
     * @return
     */
    List<MenuEntity> queryMenuByUser(int userId);

}
