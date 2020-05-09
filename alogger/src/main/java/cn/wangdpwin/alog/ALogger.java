package cn.wangdpwin.alog;

import cn.wangdpwin.tspi.Logger;

/**
 * @Author: wangdongpeng
 * @Date: 2019/6/16 下午3:19
 * @Description
 * @Version 1.0
 */
public class ALogger implements Logger {

    public ALogger() {

    }

    public void debug(String logger) {
        System.out.println("ALogger-->debug: " + logger);
    }

    public void info(String logger) {
        System.out.println("ALogger-->info: " + logger);
    }

    public void warn(String logger) {
        System.out.println("ALogger-->warn: " + logger);
    }

    public void error(String logger) {
        System.out.println("ALogger-->error: " + logger);
    }

}
