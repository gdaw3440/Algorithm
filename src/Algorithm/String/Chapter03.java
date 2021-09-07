package Algorithm.String;

import java.util.Scanner;

public class Chapter03 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length();
            if (len> m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Chapter03 chapter03 = new Chapter03();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(chapter03.solution(str));
    }
}
