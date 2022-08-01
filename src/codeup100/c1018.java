package src.codeup100;

import java.util.Scanner;

// [기초-입출력] 시간 입력받아 그대로 출력하기(설명)
public class c1018 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(sc1.next()).useDelimiter(":");
        int a = sc2.nextInt();
        int b = sc2.nextInt();

        System.out.printf("%d:%d", a, b);
        sc2.close();

        /* 이것도 정답
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.printf("%s", s);
        */
    }
}
