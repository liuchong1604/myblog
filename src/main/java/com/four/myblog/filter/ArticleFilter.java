package com.four.myblog.filter;

import com.four.myblog.utils.WordUtil;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.util.List;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/4 20:36
 */
@WebFilter(urlPatterns = "/article/*",filterName = "articleFilter")
public class ArticleFilter implements Filter{
   @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        MyRequest req = new MyRequest(request);
        filterChain.doFilter(req, servletResponse);
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void destroy() {
    }
}
class MyRequest extends HttpServletRequestWrapper {
    public MyRequest(HttpServletRequest request) {
        super(request);
    }
    @Override
    public String getParameter(String name) {
        String str = super.getParameter(name);
        List<String> list = WordUtil.getList();
        for(String word : list){
            str = str.replaceAll(word, "*");
        }
        return str;
    }
}
