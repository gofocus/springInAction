package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 2016-11-10 15:41
 */

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/queryItems")
    public String queryItems(Model model) throws Exception {
        List<ItemsCustom> itemsList = itemsService.findItemsList(null);

        model.addAttribute("itemsList", itemsList);
        return "items/itemsList";
    }

    @RequestMapping("/editItems")
    public String editItems(Model model, @RequestParam(value="id") Integer items_id){
        ItemsCustom itemsCustom = itemsService.findItemsById(items_id);

        model.addAttribute("itemsCustom", itemsCustom);
        return "items/editItems";
    }

    @RequestMapping("/editItemsSubmit")
    public String editItemsSubmit(HttpServletRequest request, Integer id, ItemsCustom itemsCustom){

        itemsService.updateItems(id, itemsCustom);

//        return "forward:queryItems.action";
        return "success";
    }


}
