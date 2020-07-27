package com.interview.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.interview.demo.entity.Order;
import com.interview.demo.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.interview.demo.mapper")
public class DaoTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void order_Dao_Test() {
        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        PageHelper.startPage(1, 100);
        List<Order> list = orderMapper.selectList(null);
        System.out.println(list.size()>0?list.get(0).toString():null);
    }
}
