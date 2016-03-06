package com.toutiao;

import com.toutiao.downloader.DownloaderImpl;
import com.toutiao.processor.ProcessorImpl;
import com.toutiao.saver.SaverImpl;
import com.toutiao.url.UrlListImpl;
import core.Spider;

/**
 * Created by zhaoht on 2016-03-06.
 */
public class SpiderApp {
    public static void main(String[] args){

        Spider.create()
                .setUrlList(new UrlListImpl())
                .setDownloader(new DownloaderImpl())
                .setProcessor(new ProcessorImpl())
                .setSaver(new SaverImpl())
                .begin();
        System.out.println("end");

    }
}
