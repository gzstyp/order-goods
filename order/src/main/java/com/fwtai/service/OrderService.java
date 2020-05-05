package com.fwtai.service;

import com.fwtai.pojo.Item;
import com.fwtai.pojo.Order;
import com.fwtai.pojo.OrderDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-05 14:56
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Service
public class OrderService{

    @Resource
    private ItemService itemService;

    private static final Map<String,Order> map = new HashMap<String,Order>();

    static {
        final Order order = new Order();
        order.setOrderId("1024204888");
        final Date date = new Date();
        order.setCreateDate(date);
        order.setUpdateDate(date);
        order.setUserId(1L);

        //订单 OrderDetails 集合对象
        final List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
        //此处没有商品的数据，需要调用商品微服务获取
        final Item item = new Item();
        item.setId(1L);
        orderDetails.add(new OrderDetail(order.getOrderId(),item));

        final Item item2 = new Item();
        item2.setId(2L);
        orderDetails.add(new OrderDetail(order.getOrderId(),item2));

        order.setOrderDetails(orderDetails);

        map.put(order.getOrderId(),order);
    }

    //根据订单id获取订单的所有数据
    public Order getOrderById(final String orderId){
        final Order order = map.get(orderId);
        //获取 Order 对象所有 orderDetails 然后遍历,获取每个OrderDetail 对象，然后从OrderDetail对象中获取商品的id,然后调用商品微服务查询商品信息
        final List<OrderDetail> orderDetails = order.getOrderDetails();
        for(final OrderDetail orderDetail : orderDetails){
            final Long id = orderDetail.getItem().getId();
            final Item item = itemService.getItemById(id);
            orderDetail.setItem(item);
        }
        return order;
    }
}