//package com.baidu.www.service;
//
//import com.baidu.www.mapper.TOrdersMapper;
//import com.baidu.www.mapper.TuserMapper;
//import com.baidu.www.model.TOrders;
//import com.baidu.www.model.Tuser;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class OrdersService {
//
//    @Autowired
//    private TOrdersMapper tOrdersMapper;
//
//
//    public void addUser(TOrders tOrders){
//        tOrdersMapper.insert(tOrders);
//    }
//
//    public void selectAll(){
//        QueryWrapper qw=new QueryWrapper();
//        List<TOrders> tuserList=tOrdersMapper.selectList(qw);
//        for(TOrders tuser:tuserList){
//
//            System.out.println(tuser.getName());
//        }
//    }
//
//}
