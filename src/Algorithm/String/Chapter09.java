package Algorithm.String;
import java.util.Scanner;

public class Chapter09 { // Main
    public String solution(String str) {
        //String answer = "YES";
        //str = str.toUpperCase();
        //int len = str.length();
        //for(int i=0; i<len/2; i++) {
        //  if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        //}
        String answer = "";
        answer = str.toUpperCase().replaceAll("[^0-9]", "");
        return answer;
    }
    public static void main(String[] args){
        Chapter09 chapter09 = new Chapter09();
        Scanner scanner = new Scanner(System.in);
        String c  = scanner.next();
        System.out.println(chapter09.solution(c));
    }
}
