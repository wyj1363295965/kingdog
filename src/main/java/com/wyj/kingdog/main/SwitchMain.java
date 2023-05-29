package com.wyj.kingdog.main;

import java.util.Calendar;

public class SwitchMain {

    public static void main(String[] args) {
        test("2");

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getWeekYear());
        System.out.println(calendar.get(Calendar.YEAR));
    }

    private static void test(String key) {
        switch (key) {
            case "4":
            case "1":
                System.out.println(1);
                break;
            case "2":
                System.out.println(2);
                break;
            case "3":
                System.out.println(3);
                break;
            default:
                break;
        }

    }
}
