package com.gosuncn.imagedemo.config;

/**
 * Created by Michael on 2017/6/20.
 * 描    述：
 * 修订历史：
 */

public class Constants {
    public static String ip = "192.168.39.115";//Rescuer ip
    public static String port = "8801";
    public static String imgRepo = "/images/package_our_miss.jpg";

    public static String getUrl() {
        return "http://" + ip + ":" + port + imgRepo;
    }
}
