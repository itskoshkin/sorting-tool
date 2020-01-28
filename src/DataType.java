import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

abstract class DataType {
    abstract void input();

    abstract void processing();

    abstract void output();
}


// TODO: 28.01.2020  
class DataLong extends DataType {

    private ArrayList<Long> arrayList;
    private int count = 0;
    private long max = 0;

    @Override
    void input() {
        final Scanner scanner = new Scanner(System.in);
        arrayList = new ArrayList<>();
        while (scanner.hasNextLong())
            arrayList.add(scanner.nextLong());
    }

    @Override
    void processing() {
        max = Collections.max(arrayList);
        for (Long number : arrayList) if (number == max) count++;
    }

    @Override
    void output() {
        System.out.printf("Total numbers: %d.", arrayList.size());
        System.out.printf("The greatest number: %d (%d time(s), %d%%).", max, count, count / arrayList.size());
    }
}

class DataLine extends DataType {

    private ArrayList<String> arrayList;
    private StringBuilder longestLine;
    private int count = 0;

    @Override
    void input() {
        final Scanner scanner = new Scanner(System.in);
        arrayList = new ArrayList<>();
        while (scanner.hasNext())
            arrayList.add(scanner.nextLine());
    }

    @Override
    void processing() {
        longestLine = new StringBuilder();

        for (String string : arrayList)
            if (string.length() > longestLine.length())
                longestLine = new StringBuilder(string);

        for (String string : arrayList)
            if (string.contentEquals(longestLine))
                count++;

    }

    @Override
    void output() {
        System.out.printf("Total lines: %d.", arrayList.size());
        System.out.printf("The longest line:\n%s \n(%d time(s), %d%%).", longestLine, count, count / arrayList.size());
    }
}

class DataWord extends DataType {

    private ArrayList<String> arrayList;
    private StringBuilder longestWord;
    private int count = 0;

    @Override
    void input() {
        final Scanner scanner = new Scanner(System.in);
        arrayList = new ArrayList<>();
        while (scanner.hasNext())
            arrayList.add(scanner.next());
    }

    @Override
    void processing() {
        longestWord = new StringBuilder();

        for (String string : arrayList)
            if (string.length() > longestWord.length())
                longestWord = new StringBuilder(string);

        for (String string : arrayList)
            if (string.contentEquals(longestWord))
                count++;

    }

    @Override
    void output() {
        System.out.printf("Total words: %d.", arrayList.size());
        System.out.printf("The greatest number: %s (%d time(s), %d%%).", longestWord, count, count / arrayList.size());
    }
}

class DataTypeFactory {
    public static DataType newInstance(String type) {
        switch (type) {
            case "long":
                return new DataLong();
            case "line":
                return new DataLine();
            case "word":
                return new DataWord();
            default:
                throw new RuntimeException("Invalid data type");
        }
    }
}




