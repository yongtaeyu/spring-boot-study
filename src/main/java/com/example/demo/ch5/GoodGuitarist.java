package com.example.demo.ch5;

import com.example.demo.ch4.Singer;

public class GoodGuitarist implements Singer {

    @Override
    public void sing() {
        System.out.println("Who says I can't be free \n" +
                "From all of the things that I used to be");
    }
}
