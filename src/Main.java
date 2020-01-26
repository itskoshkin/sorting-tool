import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        ArrayList<Long> arrayList = new ArrayList<>();
        while (scanner.hasNextLong()) arrayList.add(scanner.nextLong());
        System.out.printf("Total numbers: %d.", arrayList.size());
        long max = Collections.max(arrayList);
        int count = 0;
        for (Long number : arrayList) if (number == max) count++;
        System.out.printf("The greatest number: %d (%d time(s)).", max, count);
    }
}
