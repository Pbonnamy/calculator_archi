package org.example;

import java.io.FileNotFoundException;
import java.util.List;

public interface ParserInterface {
    List<Integer> parse() throws FileNotFoundException;
}
