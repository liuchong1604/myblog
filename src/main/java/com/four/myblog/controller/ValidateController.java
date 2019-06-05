package com.four.myblog.controller;

import javafx.scene.image.Image;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/5 11:09
 */
@RestController

public class ValidateController {

    @RequestMapping("/validate")
    public String validate(){
        char []arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                '1','2','3','4','5','6','7','8','9','0'};
        return null;
    }
}
