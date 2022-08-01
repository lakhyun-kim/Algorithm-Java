package src.codeup100;

import java.util.Scanner;

// [기초-입출력] 실수 입력받아 둘째 자리까지 출력하기(설명)
public class c1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();

        System.out.printf("%.2f", a);
    }
}
