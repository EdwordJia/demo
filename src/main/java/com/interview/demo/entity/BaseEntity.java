package com.interview.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.google.common.collect.Maps;
import com.interview.demo.utils.ParamsUtil;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField(exist = false)
    private Integer page;
    @TableField(exist = false)
    private Integer limit;
    @TableField(exist = false)
    private String sort;
    // asc || desc
    @TableField(exist = false)
    private String order;
    @TableField(exist = false)
    private String ids;
    @TableField(exist = false)
    private Map<String, Object> map;

    public boolean isAsc() {
        if (order != null && order.equals("asc")) {
            return true;
        }
        return false;
    }

    public Map<String, Object> getMap() {
        if(this.map == null) {
            this.map = new HashMap<>();
        }
        return map;
    }

    public void put(String key, Object value) {
        if (map == null) {
            map = Maps.newHashMap();
        }
        map.put(key, value);
    }

    public Integer getPage() {
        if (page == null) {
            page = 1;
        }
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        if(this.limit == null){
            this.limit = 20;
        }
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getSort() {
        return ParamsUtil.camel_to_underline(sort);
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }
}
