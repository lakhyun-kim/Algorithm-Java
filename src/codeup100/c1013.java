package src.codeup100;

import java.util.Scanner;

// [기초-입출력] 정수 2개 입력받아 그대로 출력하기(설명)
public class c1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d %d", a, b);
    }
}
