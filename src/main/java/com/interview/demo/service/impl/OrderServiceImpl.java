package com.interview.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.interview.demo.entity.Order;
import com.interview.demo.mapper.OrderMapper;
import com.interview.demo.service.IOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author edward
 * @since
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

    @Resource
    private OrderMapper orderMapper;

    @Transactional(readOnly = true)
    public PageInfo<Order> page(Order order, Map<String, Object> map) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.allEq(map);
        PageHelper.startPage(order.getPage(), order.getLimit());
        List<Order> orderList = orderMapper.selectList(queryWrapper);
        return new PageInfo<>(orderList);
    }

}
