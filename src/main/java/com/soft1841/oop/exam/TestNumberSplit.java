package com.soft1841.oop.exam;

import java.util.Scanner;

//分割数组
//88888-88，888

public class TestNumberSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一串数字：");
        String nums = scanner.nextLine();
        StringBuffer str = new StringBuffer(nums);
        //StringBuffer可变字符串
        for (int i = nums.length(); i > 0; i = i - 3) {
            if (i > 3) {
                str.insert(i-3, ",");
            }
        }
        System.out.print(str);
    }
}