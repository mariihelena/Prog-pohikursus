import java.io.*;

public interface Massiiv {
    public void readFile();
    public void splitWords();
    public void wordsToLowercase();
    public void countsLetters();
}

class Functions implements Massiiv {
    public void readFile() {

    }

    public void splitWords() {

    }

    public void wordsToLowercase() {

    }

    public void countsLetters() {

    }
}

class MainClass {

    public static void main(String[] args) {
        Functions func = new Functions();
        func.readFile();
        func.splitWords();
        func.wordsToLowercase();
        func.countsLetters();
    }
}