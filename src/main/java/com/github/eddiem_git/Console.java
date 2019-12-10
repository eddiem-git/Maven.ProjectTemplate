package com.github.eddiem_git;

import java.util.Scanner;

public class Console {
    public static String getStringInput(String enter_your_name) {
        System.out.println(enter_your_name);
        return new Scanner(System.in).nextLine();
    }
}
