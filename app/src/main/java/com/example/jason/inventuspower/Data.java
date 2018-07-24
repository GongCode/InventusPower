package com.example.jason.inventuspower;

public class Data {
    static int passCount;
    static int failCount;
    static int reworkCount;
    static String status = "Default";
    static String date = "Default Date";
    static int failStatus = 0;
    static int selected_option = 0;
    static String current_error = "";
    static String current_line = "";





    public static void resetCount() {
        passCount = 0;
        failCount = 0;
        reworkCount = 0;
        selected_option = 0;
        failStatus = 0;
    }
}