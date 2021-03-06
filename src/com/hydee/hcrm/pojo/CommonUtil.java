package com.hydee.hcrm.pojo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.URL;
import java.util.logging.Logger;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import net.sf.json.JSONObject;

public class CommonUtil {
	/**
     * 发送https请求
     * 
     * @param requestUrl 请求地址
     * @param requestMethod 请求方式（GET、POST）
     * @param outputStr 提交的数据
     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
     */
    public static JSONObject httpsRequest(String requestUrl, String requestMethod, String outputStr) {
        JSONObject jsonObject = null;
        Logger log = Logger.getLogger("lavasoft.blog"); 
        log.info("requestUrl222"+requestUrl);
        try {
            // 创建SSLContext对象，并使用我们指定的信任管理器初始化
            TrustManager[] tm = { new MyX509TrustManager() };
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(null, tm, new java.security.SecureRandom());
            // 从上述SSLContext对象中得到SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();
            log.info("commonUtil1================");
            URL url = new URL(requestUrl);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            log.info("conn================"+conn);
            conn.setSSLSocketFactory(ssf);
            log.info("commonUtil2================");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            // 设置请求方式（GET/POST）
            conn.setRequestMethod(requestMethod);
            log.info("commonUtil3================");
            // 当outputStr不为null时向输出流写数据
            if (null != outputStr) {
                OutputStream outputStream = conn.getOutputStream();
                // 注意编码格式
                outputStream.write(outputStr.getBytes("UTF-8"));
                outputStream.close();
            }
            log.info("commonUtil4================");
            // 从输入流读取返回内容
            InputStream inputStream = conn.getInputStream();
            log.info("inputStream================"+inputStream);
            log.info("commonUtil5================");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            log.info("inputStreamReader================"+inputStreamReader);
            log.info("commonUtil6================");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            log.info("bufferedReader================"+bufferedReader);
            log.info("commonUtil7================");
            String str = null;
            StringBuffer buffer = new StringBuffer();
            log.info("commonUtil8================");
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            log.info("buffer"+buffer);
            jsonObject = JSONObject.fromObject(buffer.toString());
            // 释放资源
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            inputStream = null;
            conn.disconnect();
        } catch (ConnectException ce) {
        	log.info("连接超时："+ce);
        } catch (Exception e) {
        	log.info("https请求异常："+e);
        }
        return jsonObject;
    }
    
    /**
     * URL编码（utf-8）
     * 
     * @param source
     * @return
     */
    public static String urlEncodeUTF8(String source) {
        String result = source;
        try {
            result = java.net.URLEncoder.encode(source, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
