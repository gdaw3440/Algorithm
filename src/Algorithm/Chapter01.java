package Algorithm;

import java.util.Scanner;

public class Chapter01 { // Main
    public int solution(String str, char t) {
        int answer=0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i) == t) answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        Chapter01 chapter01 = new Chapter01();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(chapter01.solution(str,c));
    }
}
