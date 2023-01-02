package com.itheima.reggie.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;

import java.util.List;

/**
 * @author zwx
 * @date 2022/10/23 22:21
 */
public interface SetMealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto );


    /**
     * 删除套餐，同时需要删除套餐和菜品关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
