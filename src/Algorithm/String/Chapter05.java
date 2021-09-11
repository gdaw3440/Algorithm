package Algorithm.String;

import java.util.*;

public class Chapter05 { // Main
    public String solution(String str) {
        String answer = "";
        char[] s= str.toCharArray();
        int lt=0, rt=str.length()-1;
        while(lt<rt) {
            if(!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }
    public static void main(String[] args){
        Chapter05 chapter05 = new Chapter05();
        Scanner scanner = new Scanner(System.in);

        String c  = scanner.next();
        System.out.println(chapter05.solution(c));
    }
}
