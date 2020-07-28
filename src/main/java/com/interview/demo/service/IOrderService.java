package com.interview.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.interview.demo.entity.Order;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author edward
 */
public interface IOrderService extends IService<Order> {

    PageInfo<Order> page(Order order, Map<String, Object> map);
}
