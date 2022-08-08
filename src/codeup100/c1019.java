package src.codeup100;

import java.util.Scanner;
import java.util.StringTokenizer;

// [기초-입출력] 연월일 입력받아 그대로 출력하기
public class c1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ymd = sc.nextLine();
        StringTokenizer st = new StringTokenizer(ymd, ".");
        int[] arr = new int[st.countTokens()];
        for (int i = 0; st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.printf("%04d.%02d.%02d", arr[0], arr[1], arr[2]);
    }
}
