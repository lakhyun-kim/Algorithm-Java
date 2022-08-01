package src.codeup100;

import java.util.Scanner;

// [기초-입출력] 문자 1개 입력받아 그대로 출력하기(설명)
public class c1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        System.out.printf("%c", c);
    }
}
