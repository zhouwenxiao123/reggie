package com.itheima.reggie.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/**
 * @author zwx
 * @date 2022/10/7 12:15
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
