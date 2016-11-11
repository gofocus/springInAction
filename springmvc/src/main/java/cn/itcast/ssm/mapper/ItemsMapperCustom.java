package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

import java.util.List;

/**
 * 2016-11-11 0:05
 */
//@Service
public interface ItemsMapperCustom {
    List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}