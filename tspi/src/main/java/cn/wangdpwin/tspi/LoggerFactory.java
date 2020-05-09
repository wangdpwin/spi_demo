package cn.wangdpwin.tspi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Author: wangdongpeng
 * @Date: 2019/6/16 下午3:17
 * @Description
 * @Version 1.0
 */
public class LoggerFactory {

    public LoggerFactory() {

    }

    public static Logger getLogger() {

        Logger logger = null;

        ServiceLoader<Logger> serviceLoader = ServiceLoader.load(Logger.class);
        Iterator<Logger> loggers = serviceLoader.iterator();
        if (loggers.hasNext()) {
            logger = loggers.next();
        }

        return logger;
    }
}
