import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < args.length; i += 2)
            hashMap.put(args[i], args[i + 1]);

        new Main().run(hashMap);
    }

    private void run(HashMap hashMap) {
        DataType dataType;
        // FIXME: 28.01.2020 
        if (hashMap.containsKey("-dataType") && hashMap.containsValue("long")) {
            dataType = DataTypeFactory.newInstance();
        } else if (hashMap.containsKey("-dataType") && hashMap.containsValue("line")) {
            dataType = DataTypeFactory.newInstance();
        } else if (hashMap.containsKey("-dataType") && hashMap.containsValue("word")) {
            dataType = DataTypeFactory.newInstance();
        }


        // FIXME: 28.01.2020 
        dataType.processing();
        dataType.print();
    }
}
