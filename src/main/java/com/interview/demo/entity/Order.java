package com.interview.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.interview.demo.plugin.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author edward
 * @since
 */
@TableName("t_order")
public class Order extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "order_no")
    private String orderNo;

    @TableField(value = "user_id")
    private Long userId;

    @TableField(value = "merchant_id")
    private Long merchantId;

    private BigDecimal amount;

    @TableField(value = "create_date")
    private Date createDate;
    @TableField(value = "update_date")
    private Date updateDate;

    /**
     * 0：未付款，1：已付款，2：已发货，3：已收货，4：已评价，-1：已撤销，-2：已退款
     */
    private Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public static final String ID = "id";

    public static final String ORDER_NO = "order_no";

    public static final String USER_ID = "user_id";

    public static final String MERCHANT_ID = "merchant_id";

    public static final String AMOUNT = "amount";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_DATE = "update_date";

    public static final String STATUS = "status";

    @Override
    public String toString() {
        return "Order{" +
        "id=" + id +
        ", orderNo=" + orderNo +
        ", user_id=" + userId +
        ", merchant_id=" + merchantId +
        ", amount=" + amount +
        ", create_date=" + createDate +
        ", update_date=" + updateDate +
        ", status=" + status +
        "}";
    }
}
