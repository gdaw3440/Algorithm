package Algorithm.String;
import java.util.Scanner;

public class Chapter10 { // Main
    public int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==t) {
                p=0;
                answer[i]=p;
            } else {
                p++;
                answer[i] = p;
            }

        }
        p = 1000;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i)==t) p=0;

            else {
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Chapter10 chapter10 = new Chapter10();
        Scanner scanner = new Scanner(System.in);
        String str  = scanner.next();
        char c = scanner.next().charAt(0);

        for(int x:chapter10.solution(str,c)) {
            System.out.print(x+" ");
        }
    }
}
