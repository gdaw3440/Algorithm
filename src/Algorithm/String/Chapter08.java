package Algorithm.String;
import java.util.Scanner;

public class Chapter08 { // Main
    public String solution(String str) {
        //String answer = "YES";
        //str = str.toUpperCase();
        //int len = str.length();
        //for(int i=0; i<len/2; i++) {
        //  if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        //}
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) answer = "YES";
        return answer;
    }
    public static void main(String[] args){
        Chapter08 chapter08 = new Chapter08();
        Scanner scanner = new Scanner(System.in);
        String c  = scanner.next();
        System.out.println(chapter08.solution(c));
    }
}
