package com.toutiao.url;

import core.UrlList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by zhaoht on 2016-03-06.
 */
public class UrlListImpl implements UrlList {
    private List<String> urlList ;

    public UrlListImpl(List<String> urlList){
        this.urlList = urlList;
    }
    public List<String> returnUrlList() {
        urlList.add("http://www.toutiao.io");
        urlList.add("http://www.baidu.com");
        urlList.add("http://www.1688.com");
        urlList.add("http://www.jd.com");
        return urlList;
    }
}
