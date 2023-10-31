package org.example.a_문자찾기;

import java.util.Scanner;

public class Main {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toLowerCase();
        t = Character.toLowerCase(t);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }


//        return (int) IntStream.range(0, str.length())
//                .mapToObj(str::charAt)
//                .map(Character::toLowerCase)
//                .filter(x -> x == Character.toLowerCase(t))
//                .count();

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
