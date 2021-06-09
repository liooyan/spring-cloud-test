package com.serviceA.controller;


import com.serviceA.bean.BodyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/6/5 7:02 下午
 */
@RestController
@RequestMapping("responseBody")
public class ResponseBodyTest {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @Autowired
    private Environment environment;
    @PostMapping("post")
    private BodyBean getTest(@RequestBody BodyBean bodyBean) {
        bodyBean.setUseLocalCache(useLocalCache);
        return bodyBean;
    }
}
