package com.serviceB.bean;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/26 2:50 下午
 */
public class BodyBean {


    private String a;
    private Integer b;

    private Boolean useLocalCache;

    public Boolean getUseLocalCache() {
        return useLocalCache;
    }

    public void setUseLocalCache(Boolean useLocalCache) {
        this.useLocalCache = useLocalCache;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}
