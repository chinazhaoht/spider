package com.toutiao.downloader;

import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Callable;

public class DownloadTask implements Callable {

    private String url;

    public DownloadTask(String url) {
        this.url = url;
    }

    public Object call() throws Exception {

        RestTemplate template = new RestTemplate();
        String page = template.getForObject(url, String.class);
        System.out.println("ssssssssss"+Thread.currentThread());
        return page;
    }
}
