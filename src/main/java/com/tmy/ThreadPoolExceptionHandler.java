package com.tmy;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/**
 * @ClassName: ThreadPoolExceptionHandler
 * @Desc: 异常类
 * @Author: tmy
 * @Date: 2019-05-13 14:46
 * @Version: 1.0
 */
public class ThreadPoolExceptionHandler implements RejectedExecutionHandler {
//    private final Logger logger = LoggerFactory
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

    }
}
