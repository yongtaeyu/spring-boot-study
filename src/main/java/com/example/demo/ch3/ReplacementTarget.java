package com.example.demo.ch3;

public class ReplacementTarget {

    public String formatMessage(String msg) {
        return "<h1> 변경 스트링 " + msg + "</h1>";
    }

    public String formatMessage(Object msg) {
        return "<h1> 변경 오브젝트" + msg + "</h1>";
    }
}
