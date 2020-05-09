package cn.wangdpwin.tspi;

/**
 * @Author: wangdongpeng
 * @Date: 2019/6/16 下午3:17
 * @Description
 * @Version 1.0
 */
public interface Logger {
    public void debug(String logger);

    public void info(String logger);

    public void warn(String logger);

    public void error(String logger);
}
