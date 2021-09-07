package Algorithm;

import java.util.Scanner;

public class Chapter02 {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                answer+= Character.toUpperCase(x);
            } else {
                answer+= Character.toLowerCase(x);
            }
            // if(x>=97 && x<=122)
            // if(x<=65 && x<=90)
        }
        return answer;
    }
    public static void main(String[] args){
        Chapter02 chapter02 = new Chapter02();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(chapter02.solution(str));
    }
}
