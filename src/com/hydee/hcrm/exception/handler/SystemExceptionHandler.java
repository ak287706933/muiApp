package com.hydee.hcrm.exception.handler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import com.hydee.hcrm.util.Logger;

/**
 * 统一异常捕获处理
 * 
 * @author LuoFeng
 *
 */
public class SystemExceptionHandler implements HandlerExceptionResolver {
	/**
	 * 处理错误日志的打印
	 * @param error
	 */
	private void error(Throwable error) {
		// 后续追加的业务层错误日志打印在此处处理
		Logger.error("", error);
	}
	
	/**
	 * 全局异常拦截
	 */
	@ResponseBody
	public ModelAndView resolveException(HttpServletRequest req, HttpServletResponse resp, Object obj, Exception ex) {
		ModelAndView modelView = new ModelAndView();
		MappingJacksonJsonView jsonView = new MappingJacksonJsonView();
		Map<String, Object> map = new HashMap<String, Object>();
		// 将错误输出到控制台和日志
		error(ex);
		// 针对异常类别分别处理,后续业务异常的详细处理在此处处理
		if (ex instanceof org.springframework.web.multipart.MaxUploadSizeExceededException) { // 文件过大异常
			map.put("result", false);
			map.put("status", 400);
			map.put("errors", "上传附件超出大小限制!");
		} else if (ex instanceof NullPointerException) {
			map.put("result", false);
			map.put("status", 500);
			map.put("errors", "您请求的数据不存在!");
		} else {
			map.put("result", false);
			map.put("status", 500);
			map.put("errors", "数据请求异常[" + ex.getCause() + "],稍后请重试!");
		}
		jsonView.setAttributesMap(map);
		modelView.setView(jsonView);
		return modelView;
	}

}
