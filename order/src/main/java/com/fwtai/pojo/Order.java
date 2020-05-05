package com.fwtai.pojo;

import java.util.Date;
import java.util.List;

/**
 * 订单信息,内含订单详情(一个订单可以有多个订单详情[多个商品])
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-05 14:44
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
 */
public final class Order{

    private String orderId;                  //订单id

    private Long userId;                     //下单的人

    private Date createDate;                 //订单创建时间

    private Date updateDate;                 //订单的更新时间

    /*一个订单可以有多个订单详情(一对多的更新)*/
    private List<OrderDetail> orderDetails; //订单详情

    public String getOrderId(){
        return orderId;
    }

    public void setOrderId(String orderId){
        this.orderId = orderId;
    }

    public Long getUserId(){
        return userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public Date getCreateDate(){
        return createDate;
    }

    public void setCreateDate(Date createDate){
        this.createDate = createDate;
    }

    public Date getUpdateDate(){
        return updateDate;
    }

    public void setUpdateDate(Date updateDate){
        this.updateDate = updateDate;
    }

    public List<OrderDetail> getOrderDetails(){
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails){
        this.orderDetails = orderDetails;
    }

    public Order(){}

    public Order(String orderId,Long userId,Date createDate,Date updateDate,List<OrderDetail> orderDetails){
        this.orderId = orderId;
        this.userId = userId;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString(){
        return "Order{" + "orderId='" + orderId + '\'' + ", userId=" + userId + ", createDate=" + createDate + ", updateDate=" + updateDate + ", orderDetails=" + orderDetails + '}';
    }
}