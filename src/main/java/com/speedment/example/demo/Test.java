package com.speedment.example.demo;

import static java.util.stream.Collectors.toList;

import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        Stream<Character> chars = Stream.of(
                "Monkey", "Lion", "Giraffe", "Lemur"
        ).flatMap(s -> s.chars().mapToObj(i -> (char) i));
        System.out.println(chars.collect(toList()));
    }
}
