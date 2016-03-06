package com.toutiao;

import com.toutiao.downloader.DownloaderImpl;
import com.toutiao.processor.ProcessorImpl;
import com.toutiao.saver.SaverImpl;
import com.toutiao.url.UrlListImpl;
import core.Spider;

import java.util.List;
import java.util.Vector;

/**
 * Created by zhaoht on 2016-03-06.
 */
public class SpiderApp {

    private List<String> urlList = new Vector<String>();

    private List<String> pages = new Vector<String>();


    public SpiderApp(){

    }
    public static void main(String[] args){
        SpiderApp spiderApp = new SpiderApp();
        Spider.create()
                .setUrlList(new UrlListImpl(spiderApp.urlList))
                .setDownloader(new DownloaderImpl(spiderApp.pages))
                .setProcessor(new ProcessorImpl())
                .setSaver(new SaverImpl())
                .begin();
        System.out.println("end");
    }
}
