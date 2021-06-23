package com.saltire;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDate {
    public static void main(String[] args) {
        // 1、日期对象转为字符串
        Date da = new Date();

        SimpleDateFormat sc = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sc.format(da));

        // 2、字符串转日期
        String se = "2021-06-22 22:34:04";

        SimpleDateFormat sc1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            System.out.println(sc1.parse(se));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
