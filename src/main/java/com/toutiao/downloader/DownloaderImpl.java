package com.toutiao.downloader;

import com.toutiao.url.UrlListImpl;
import core.Downloader;
import core.UrlList;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoht on 2016-03-06.
 */
public class DownloaderImpl implements Downloader {

    private List<String> pages = new ArrayList<String>();

    private HttpClient client = new DefaultHttpClient();

    private RestTemplate template = new RestTemplate();

    public List<String> download(List<String> list) {

        for(String url : list){
            System.out.println(url);
            String page = template.getForObject(url,String.class);
            System.out.println(page);
            pages.add(page);
        }
        return pages;
    }
}
