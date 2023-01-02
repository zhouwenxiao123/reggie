package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zwx
 * @date 2022/9/22 20:42
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
