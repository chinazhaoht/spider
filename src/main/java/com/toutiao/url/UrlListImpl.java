package com.toutiao.url;

import core.UrlList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by zhaoht on 2016-03-06.
 */
public class UrlListImpl implements UrlList {
    private List<String> urlList = new Vector<String>();

    public List<String> returnUrlList() {
        urlList.add("http://www.toutiao.io");
        return urlList;
    }
}
