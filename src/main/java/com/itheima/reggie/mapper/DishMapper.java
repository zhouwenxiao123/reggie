package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zwx
 * @date 2022/10/23 22:18
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
