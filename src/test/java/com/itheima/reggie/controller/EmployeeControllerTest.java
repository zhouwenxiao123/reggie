package com.itheima.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itheima.reggie.Service.EmployeeService;
import com.itheima.reggie.entity.Employee;
import com.itheima.reggie.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zwx
 * @date 2022/11/1 0:43
 */
class EmployeeControllerTest {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    Employee employee1;

    @Test
    public int login(Employee employee){
        if(employee==null){
            return -1; //do not register
        }else{
            if(employee1.getName().equals(employee.getName())&&employee1.getPassword().equals(employee.getPassword())){
                return 1; // successful login;
            }else{
                return -2; // error on username or password
            }
        }

   }
}