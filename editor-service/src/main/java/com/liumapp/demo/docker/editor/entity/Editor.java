package com.liumapp.demo.docker.editor.entity;

import org.springframework.stereotype.Component;

/**
 * @author liumapp
 * @file Editor.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/11/18
 */
@Component
public class Editor {

    private String content;

    public Editor() {
    }

    public Editor(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
