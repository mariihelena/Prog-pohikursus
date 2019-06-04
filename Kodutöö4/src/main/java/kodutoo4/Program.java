package kodutoo4;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.lang.*;


public class Program {

    public static void main(String[] args) {
        TextAnalytics text = new TextAnalytics("C:\\Users\\klick\\Desktop\\Kodutöö4\\src\\main\\java\\kodutoo4\\text.txt");
        String array_string = Arrays.toString(text.array_of_words);
        System.out.println(array_string);

    }
}