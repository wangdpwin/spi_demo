package cn.wangdpwin.blog;

import cn.wangdpwin.tspi.Logger;

/**
 * @Author: wangdongpeng
 * @Date: 2019/6/16 下午3:26
 * @Description
 * @Version 1.0
 */
public class BMulLogger implements Logger {

	public BMulLogger() {

    }

    public void debug(String logger) {
        System.out.println("BLogger multy-->debug: " + logger);
    }

    public void info(String logger) {
        System.out.println("BLogger multy -->info: " + logger);
    }

    public void warn(String logger) {
        System.out.println("BLogger multy -->warn: " + logger);
    }

    public void error(String logger) {
        System.out.println("BLogger multy -->error: " + logger);
    }


    }
