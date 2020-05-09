package cn.wangdpwin.spiTest;

import cn.wangdpwin.tspi.Logger;
import cn.wangdpwin.tspi.LoggerFactory;

/**
 * @Author: wangdongpeng
 * @Date: 2019/6/16 下午3:30
 * @Description
 * @Version 1.0
 */
public class AppLogger {
    private static Logger logger = LoggerFactory.getLogger();

    public static void main(String[] args) {

        logger.debug("this is use debug... ");

        logger.info("this is use info... ");

        logger.warn("this is use warn... ");

        logger.error("this is use error... ");

    }
}
