package Algorithm.String;

import java.util.*;

public class Chapter04 { // Main
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }



    public static void main(String[] args){
        Chapter04 chapter04 = new Chapter04();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] c = new String[n];
        for (int i=0; i<n; i++) {
            c[i] = scanner.next();
        }
        for (String x:chapter04.solution(n,c)) {
            System.out.println(x);
        }
    }
}
