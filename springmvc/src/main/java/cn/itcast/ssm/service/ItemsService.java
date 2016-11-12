package cn.itcast.ssm.service;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

import java.util.List;

/**
 * 2016-11-10 15:00
 */

public interface ItemsService {

     List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

     ItemsCustom findItemsById(Integer id);

     void updateItems(Integer id, ItemsCustom itemsCustom);

     void deleteItems(Integer id);

     void addItems(ItemsCustom itemsCustom);

//     void updateItemsList(ItemsQueryVo itemsQueryVo);
}
