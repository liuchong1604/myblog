package com.four.myblog.controller;


import com.four.myblog.utils.RestResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/4 20:22
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public RestResult articleUpload(HttpServletRequest request) {
        String str = request.getParameter("content");
        if (str.length() > 0) {
            return new RestResult(RestResult.SUCCESS,"发布成功",str);
        }else{
            return new RestResult(RestResult.FAILED,"请填入内容然后发布");
        }
    }

}
