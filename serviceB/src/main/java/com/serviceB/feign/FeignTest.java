package com.serviceB.feign;

import com.serviceB.bean.BodyBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/4/26 2:13 下午
 */
@FeignClient("serviceA")
@Component
public interface FeignTest {


    @PostMapping("responseBody/post")
    BodyBean getTest(@RequestBody BodyBean id);



}
