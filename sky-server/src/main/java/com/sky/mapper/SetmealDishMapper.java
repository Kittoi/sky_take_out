package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品ID查套餐ID
     * @param id
     * @return
     */
    List<Long> getSetmealIdListByDishId(List<Long> id);
}
