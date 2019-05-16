package com.tmy;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: ForTestThreadPool
 * @Desc: 线程池工具类
 * @Author: tmy
 * @Date: 2019-05-13 14:45
 * @Version: 1.0
 */
public class ForTestThreadPool {
    //核心线程数量，即初始化线程池的启动线程数量
    private static final int corePoolSize = 5;
    //最大线程数量
    private static final int maximumPoolSize = 15;
    //线程的存活时间，即完成任务后多久可再使用
    private static final int keepAliveTime = 300;
    //等待队列的长度
    private static final int workQueueSize = 10000;



    public static ThreadPoolExecutor getDHThreadPool() {
        return ThreadPoolHolder.INSTANCE;
    }


    private static class ThreadPoolHolder {
        public static final ThreadPoolExecutor INSTANCE;

        static {
            //ThreadPoolExceptionHandler表示当线程池处理不了规定任务时的异常处理方式。
            INSTANCE = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.MILLISECONDS,
                    new LinkedBlockingQueue<Runnable>(workQueueSize), new ThreadPoolExceptionHandler());
        }
    }
}
