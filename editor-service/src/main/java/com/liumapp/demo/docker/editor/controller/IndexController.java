package com.liumapp.demo.docker.editor.controller;

import com.alibaba.fastjson.JSON;
import com.liumapp.convert.html.Html2PDF;
import com.liumapp.demo.docker.editor.entity.Editor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file IndexController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/11/18
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping("")
    public String getContent (@RequestBody Editor editor) {
        Html2PDF html2PDF = new Html2PDF();
        html2PDF.html2pdf("./test.pdf", editor.getContent());
        return JSON.toJSONString("success");
    }

}
