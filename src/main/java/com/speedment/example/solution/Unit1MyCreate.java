package com.speedment.example.solution;

import com.speedment.example.unit.Unit1Create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class Unit1MyCreate implements Unit1Create {

    @Override
    public Stream<String> newStreamOfAToC() {
        return Arrays.asList("A", "B","C").stream();
    }

    @Override
    public IntStream newIntStreamOfOneToSeven() {
        return IntStream.rangeClosed(1,7);
    }

    @Override
    public Stream<String> from(String[] array) {
        return Arrays.stream(array);
    }

    @Override
    public Stream<String> from(Collection<String> collection) {
        return collection.stream();
    }

    @Override
    public IntStream from(String s) {
        return s.chars();
    }

    @Override
    public IntStream infiniteAlternating() {
        return IntStream.iterate(1, i -> -1*i).limit(19);
    }

    @Override
    public IntStream infiniteRandomInts(Random rnd) {
        return new Random(42).ints().limit(19);
    }

    @Override
    public Stream<String> linesFromPoemTxtFile() throws IOException {
        return Files.lines(Paths.get(Unit1Create.FILE_NAME));
    }
}
