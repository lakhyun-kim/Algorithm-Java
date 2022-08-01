package src.codeup100;

import java.util.Scanner;

// [기초-입출력] 실수 1개 입력받아 그대로 출력하기(설명)
public class c1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();

        System.out.printf("%f", f);
    }
}
