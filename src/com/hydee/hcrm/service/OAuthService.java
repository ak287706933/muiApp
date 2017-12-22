package com.hydee.hcrm.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.hydee.hcrm.pojo.AdvancedUtil;
import com.hydee.hcrm.pojo.SNSUserInfo;
import com.hydee.hcrm.pojo.WeixinOauth2Token;


//授权后的回调请求处理
@Service
public class OAuthService{
	private static final long serialVersionUID = -1847238807216447030L;
	
    public void WXinfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        // 用户同意授权后，能获取到code
        String code = request.getParameter("code");
        String state = request.getParameter("state");
        
        // 用户同意授权
        if (!"authdeny".equals(code)) {
            // 获取网页授权access_token
            WeixinOauth2Token weixinOauth2Token = AdvancedUtil.getOauth2AccessToken("wxa2189594b4e11677", "54c8d9881196163ea6a61659c6615293","061QB1KK0DeCD627ghLK07ahKK0QB1Km");
            // 网页授权接口访问凭证
            String accessToken = weixinOauth2Token.getAccessToken();
            // 用户标识
            String openId = weixinOauth2Token.getOpenId();
            // 获取用户信息
            //SNSUserInfo snsUserInfo = AdvancedUtil.getSNSUserInfo(accessToken, openId);

            // 设置要传递的参数
            //request.setAttribute("snsUserInfo", snsUserInfo);
            //request.setAttribute("state", state);
            request.getSession().setAttribute("openId", openId);
        }
    }
    
}
