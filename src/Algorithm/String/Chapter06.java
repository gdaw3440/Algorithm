package Algorithm.String;

import java.util.Scanner;

public class Chapter06 { // Main
    public String solution(String str) {
        String answer = "";
        for (int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i))==i) {
                answer+=str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Chapter06 chapter06 = new Chapter06();
        Scanner scanner = new Scanner(System.in);
        String c  = scanner.next();
        System.out.println(chapter06.solution(c));
    }
}
