package com.baidu.www;

import com.baidu.www.mapper.TOrdersMapper;
import com.baidu.www.model.TOrders;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {


    @Autowired
    private TOrdersMapper tOrdersMapper;

    @GetMapping("/ss")
    @ResponseBody
    public TOrders ss(){
        QueryWrapper qw=new QueryWrapper();
        qw.eq("id","1");
        TOrders tOrders=tOrdersMapper.selectOne(qw);
        return tOrders;
    }


        @RequestMapping("/zzw")
        public String a21q2s(int a){
        if(a==952752232){
            //赵琼
            return "login952752232-1";
        }else if(a==106022323){
            //王佳琳
            return "login106022323-2";
        }else if(a==2013213123){
            //万海琳
            return "login2013213123-3";
        }else{
            return "";
        }
    }

    @RequestMapping("/index952752232")
    public String user1(){

        System.out.println(
        "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        return "index952752232-1";

    }
    @RequestMapping("/index106022323")
    public String user2(){

        return "index106022323-2";

    }
    @RequestMapping("/index2013213123")
    public String user3(){

        return "index2013213123-3";

    }
}
