package com.interview.demo.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.github.pagehelper.PageInfo;
import com.interview.demo.entity.Order;
import com.interview.demo.service.impl.OrderServiceImpl;
import com.interview.demo.utils.ParamsUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.concurrent.CompletableFuture;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author edward
 * @since
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("get")
    public CompletableFuture<R<Order>> get(Order order) {
        return CompletableFuture.supplyAsync(() -> R.ok(orderService.getById(order.getId())));
    }

    @GetMapping("page")
    public CompletableFuture<R<PageInfo<Order>>> page(HttpServletRequest request, Order order) {
        return CompletableFuture.supplyAsync(() -> R.ok(orderService.page(order, ParamsUtil.getMap(request))));
    }

    @PutMapping("remove")
    public CompletableFuture<R<Boolean>> remove(Order order) {
        return CompletableFuture.supplyAsync(() -> {
            orderService.removeById(order.getId());
            return R.ok(true);
        });
    }

    @PostMapping("save")
    public CompletableFuture<R<Boolean>> save(@RequestBody Order order) {
        return CompletableFuture.supplyAsync(() -> {
            order.setCreateDate(new Date());
            order.setOrderNo(RandomStringUtils.randomAlphanumeric(10));
            orderService.save(order);
            return R.ok(true);
        });
    }

    @PostMapping("update")
    public CompletableFuture<R<Boolean>> update(@RequestBody Order order) {
        return CompletableFuture.supplyAsync(() -> {
            orderService.updateById(order);
            return R.ok(true);
        });
    }
}

