package info.doushen.tb.controller;

import info.doushen.tb.biz.MenuService;
import info.doushen.tb.common.Tree;
import info.doushen.tb.entity.MenuEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * MainController
 *
 * @author huangdou
 * @date 2019/8/24
 */
@Controller
public class MainController extends BaseController {

    @Autowired
    private MenuService menuService;

    @GetMapping({ "/", "" })
    String welcome() {
        return "redirect:/index";
    }

    @GetMapping({ "/index" })
    String index(Model model) {
        List<Tree<MenuEntity>> menus = menuService.queryUserMenuTree(getUserId());
        model.addAttribute("menus", menus);
        model.addAttribute("name", getUser().getName());

        model.addAttribute("username", getUser().getUserName());
        return "index";
    }

    @GetMapping("/main")
    String main() {
        return "main";
    }

}
