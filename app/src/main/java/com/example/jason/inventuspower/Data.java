package com.example.jason.inventuspower;

public class Data {
    static int passCount;
    static int failCount;
    static int reworkCount;
    static String status = "Default";
    static String date = "Default Date";
    static int failStatus = 0;



    public static void resetCount() {
        passCount = 0;
        failCount = 0;
        reworkCount = 0;
    }
}