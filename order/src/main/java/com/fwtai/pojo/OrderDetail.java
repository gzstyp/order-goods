package com.fwtai.pojo;

/**
 * 订单详情,一个订单有多个商品
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-05 14:47
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
public final class OrderDetail{

    private String orderId;  //订单id

    private Item item;       //商品详情信息

    public String getOrderId(){
        return orderId;
    }

    public void setOrderId(String orderId){
        this.orderId = orderId;
    }

    public Item getItem(){
        return item;
    }

    public void setItem(Item item){
        this.item = item;
    }

    public OrderDetail(){}

    public OrderDetail(String orderId,Item item){
        this.orderId = orderId;
        this.item = item;
    }

    @Override
    public String toString(){
        return "OrderDetails{" + "orderId='" + orderId + '\'' + ", item=" + item + '}';
    }
}