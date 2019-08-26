package info.doushen.tb.biz;

import info.doushen.tb.common.Tree;
import info.doushen.tb.entity.MenuEntity;

import java.util.List;
import java.util.Set;

/**
 * MenuService
 *
 * @author huangdou
 * @date 2019/8/24
 */
public interface MenuService {

    /**
     * 获取用户权限集合
     *
     * @param userId
     * @return
     */
    Set<String> queryUserPerms(int userId);

    /**
     * 获取用户权限树集合
     *
     * @param userId
     * @return
     */
    List<Tree<MenuEntity>> queryUserMenuTree(int userId);

}
