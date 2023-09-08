//package com.baidu.www.service;
//
//import com.baidu.www.mapper.TuserMapper;
//import com.baidu.www.model.Tuser;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private TuserMapper tuserMapper;
//
//
//    public void addUser(Tuser tuser){
//        tuserMapper.insert(tuser);
//    }
//
//    public void selectAll(){
//        QueryWrapper qw=new QueryWrapper();
//        List<Tuser> tuserList=tuserMapper.selectList(qw);
//        for(Tuser tuser:tuserList){
//
//            System.out.println(tuser.getName());
//        }
//    }
//
//}
