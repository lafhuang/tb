package info.doushen.tb.biz.impl;

import info.doushen.tb.biz.MenuService;
import info.doushen.tb.common.Tree;
import info.doushen.tb.entity.MenuEntity;
import info.doushen.tb.mapper.MenuMapper;
import info.doushen.tb.utils.TreeUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * MenuServiceImpl
 *
 * @author huangdou
 * @date 2019/8/24
 */
@Service
class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public Set<String> queryUserPerms(int userId) {
        List<String> perms = menuMapper.queryUserPerms(userId);
        Set<String> permsSet = new HashSet<>();
        for (String perm : perms) {
            if (StringUtils.isNotBlank(perm)) {
                permsSet.addAll(Arrays.asList(perm.trim().split(",")));
            }
        }
        return permsSet;
    }

    @Override
    public List<Tree<MenuEntity>> queryUserMenuTree(int userId) {
        List<Tree<MenuEntity>> menuList = new ArrayList<>();
        List<MenuEntity> menuEntityList = menuMapper.queryMenuByUser(userId);
        if (CollectionUtils.isNotEmpty(menuEntityList)) {
            for (MenuEntity menuEntity : menuEntityList) {
                Tree<MenuEntity> tree = new Tree<>();
                tree.setId(String.valueOf(menuEntity.getId()));
                tree.setParentId(String.valueOf(menuEntity.getParentId()));
                tree.setText(menuEntity.getMenuName());
                Map<String, Object> attributes = new HashMap<>(16);
                attributes.put("url", menuEntity.getUrl());
                attributes.put("icon", menuEntity.getIcon());
                tree.setAttributes(attributes);
                menuList.add(tree);
            }
        }
        List<Tree<MenuEntity>> tree = TreeUtils.buildList(menuList, "0");
        return tree;
    }

}
