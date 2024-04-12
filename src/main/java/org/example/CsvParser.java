package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvParser {

    private final String filename;

    public CsvParser(String filename) {
        this.filename = filename;
    }

    public List<Integer> parse() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        List<Integer> numbers = new ArrayList<>();

        while (scanner.hasNextLine()) {
            numbers.add(Integer.parseInt(scanner.nextLine()));
        }

        scanner.close();

        return numbers;
    }
}
