package Algorithm.String;

import java.util.Scanner;

public class Chapter07 { // Main
    public String solution(String str) {
        String answer = "YES";
        int len = str.length();
        for(int i=0; i<len/2; i++) {
            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }
    public static void main(String[] args){
        Chapter07 chapter06 = new Chapter07();
        Scanner scanner = new Scanner(System.in);
        String c  = scanner.next();
        System.out.println(chapter06.solution(c));
    }
}
