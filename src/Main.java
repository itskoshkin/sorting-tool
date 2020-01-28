import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < args.length; i += 2)
            hashMap.put(args[i], args[i + 1]);
        new Main().run(hashMap);
    }

    private void run(HashMap<String, String> hashMap) {
        DataType dataType = DataTypeFactory.newInstance(hashMap.get("-dataType"));
        dataType.input();
        dataType.processing();
        dataType.output();
    }
}
