package src.codeup100;

import java.util.Scanner;

// [기초-입출력] 주민번호 입력받아 형태 바꿔 출력하기
public class c1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.printf("%s", str.replace("-", ""));
    }
}
