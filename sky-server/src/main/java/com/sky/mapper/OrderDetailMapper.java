package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    void insertGroup(List<OrderDetail> orderDetails);

    @Select("select * from order_detail where order_id=#{id}")
    List<OrderDetail> selectByOrderId(Long id);

}
