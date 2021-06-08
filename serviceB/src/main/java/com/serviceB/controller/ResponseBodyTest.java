package com.serviceB.controller;


import com.serviceB.bean.BodyBean;
import com.serviceB.feign.FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/6/5 7:02 下午
 */
@RestController
@RequestMapping("responseBody")
public class ResponseBodyTest {

    @Autowired
    private FeignTest feignTest;

    @GetMapping("post")
    public BodyBean getTest() {
        final BodyBean bodyBean = new BodyBean();
        bodyBean.setA("1");
        final BodyBean test = feignTest.getTest(bodyBean);
        return test;
    }
}
