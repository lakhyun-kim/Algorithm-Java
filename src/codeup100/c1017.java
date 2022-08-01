package src.codeup100;

import java.util.Scanner;

// [기초-입출력] 정수 1개 입력받아 3번 출력하기(설명)
public class c1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.printf("%d %d %d", a, a, a);
    }
}
