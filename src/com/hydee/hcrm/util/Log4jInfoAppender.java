package com.hydee.hcrm.util;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Priority;

public class Log4jInfoAppender extends DailyRollingFileAppender {
	
	@Override  
    public boolean isAsSevereAsThreshold(Priority priority) {    
        // info 日志文件将不记录错误日志    
        return !priority.toString().equals("ERROR") && (threshold == null || priority.isGreaterOrEqual(threshold));
    }  
	
}
