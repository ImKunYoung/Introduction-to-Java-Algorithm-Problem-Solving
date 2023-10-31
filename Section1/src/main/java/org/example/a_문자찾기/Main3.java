package org.example.a_문자찾기;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main3 {

    public int solution(String str, char t) {
        return (int) IntStream.range(0, str.length())
                .mapToObj(str::charAt)
                .map(Character::toLowerCase)
                .filter(x -> x == Character.toLowerCase(t))
                .count();
    }

    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
