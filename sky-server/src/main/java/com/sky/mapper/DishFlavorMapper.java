package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入口味数据
     * @param flavor
     */
    void insertBatch(DishFlavor flavor);

    /**
     * 删除口味
     * @param dishId
     */
    @Delete("delete from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long dishId);
}
