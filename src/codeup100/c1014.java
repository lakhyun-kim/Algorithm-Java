package src.codeup100;

import java.util.Scanner;

// [기초-입출력] 문자 2개 입력받아 순서 바꿔 출력하기(설명)
public class c1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        System.out.printf("%c %c", b, a);
    }
}
