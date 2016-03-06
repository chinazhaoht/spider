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
import java.util.Vector;
import java.util.concurrent.*;

/**
 * Created by zhaoht on 2016-03-06.
 */
public class DownloaderImpl implements Downloader{


    private List<String> pages ;

    private HttpClient client = new DefaultHttpClient();

    private RestTemplate template = new RestTemplate();

    public DownloaderImpl(List<String> pages){
        this.pages = pages;
    }

    public List<String> download(List<String> list) {

        for(String url : list){
            System.out.println(url);
            Future<String> future =  DownloaderPool.getDownloaderPool().submit(new DownloadTask(url));
            String page = null;
            try {
                page = future.get();
                System.out.println(page);
                pages.add(page);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return pages;
    }
}
