package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;
import cn.itcast.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String queryItems(Model model, ItemsQueryVo itemsQueryVo) throws Exception {
        List<ItemsCustom> itemsList = itemsService.findItemsList(itemsQueryVo);

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
    public String editItemsSubmit(Integer id, ItemsCustom itemsCustom){

        itemsService.updateItems(id, itemsCustom);
        return "success";
    }

    @RequestMapping("/deleteItems")
    public String deleteItems(int[] items_id){

        for (Integer id:items_id
             ) {
            itemsService.deleteItems(id);
        }

        return "success";
    }


    @RequestMapping(value = "/editItemsQuery")
    public String editItemsQueryGet(Model model, ItemsQueryVo itemsQueryVo) throws Exception {
        List<ItemsCustom> itemsList = itemsService.findItemsList(itemsQueryVo);

        model.addAttribute("itemsList", itemsList);

        return "items/editItemsQuery";
    }

//    @RequestMapping(value="/editItemsQuery", method = RequestMethod.POST)
//    public String editItemsQueryPost(ItemsQueryVo itemsQueryVo){{
//
//        List<ItemsCustom> list = itemsQueryVo.getItemsList();
//        for (ItemsCustom items:list
//                ){
//        itemsService.updateItems(items.getId(),items);
//
//        }
//        return "success";
//    }

    @RequestMapping("/editItemsAllSubmit")
    public String editItemsAllSubmit(ItemsQueryVo itemsQueryVo) {

        List<ItemsCustom> list = itemsQueryVo.getItemsList();
        for (ItemsCustom items:list
                ){
        itemsService.updateItems(items.getId(),items);

        }
        return "success";
    }

    @RequestMapping(value="/addItems", method = RequestMethod.GET)
    public String addItemsGet() {
        return "items/addItems";
    }

    @RequestMapping(value="/addItems", method = RequestMethod.POST)
    public String addItemsPost(ItemsCustom itemsCustom) {
        itemsService.addItems(itemsCustom);

        return  "success";
    }

}
