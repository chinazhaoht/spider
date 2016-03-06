package com.toutiao.downloader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by zhaoht on 2016-03-06.
 */
public class DownloaderPool {

    final static int DOWNLOADER_POOL_SIZE = 100;

    static  ExecutorService downloader_pool;

    static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private DownloaderPool(){}

    static ExecutorService getDownloaderPool(){
        if(downloader_pool != null){
            return  downloader_pool;
        }else{
            try{
                lock.writeLock().lock();
                downloader_pool = Executors.newFixedThreadPool(DOWNLOADER_POOL_SIZE);
            }catch(Exception e){

            }finally {
                lock.writeLock().unlock();
            }

        }
        return downloader_pool;
    }

}
