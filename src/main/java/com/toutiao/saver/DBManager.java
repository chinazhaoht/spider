package com.toutiao.saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;

/**
 * Created by zhaoht on 2016-03-07.
 */
public class DBManager {

    String host = "localhost:3306/test";
    String username = "test";
    String password = "test";

    public DBManager(){

    }
}
