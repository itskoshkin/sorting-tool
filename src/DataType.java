abstract class DataType {
    abstract void processing();

    abstract void print();
}


// TODO: 28.01.2020  
class DataLong extends DataType {

    public DataLong(long[] longs) {
        super();
    }

    @Override
    void processing() {

    }

    @Override
    void print() {

    }
}

class DataLine extends DataType {

    public DataLine(int string, String[] strings) {
        super();
    }

    @Override
    void processing() {

    }

    @Override
    void print() {

    }
}

class DataWord extends DataType {

    public DataWord(String[] strings) {
        super();
    }

    @Override
    void processing() {

    }

    @Override
    void print() {

    }
}

class DataTypeFactory {
    public static DataType newInstance(long... longs) {
        return new DataLong(longs);
    }

    public static DataType newInstance(int string, String... strings) {
        return new DataLine(string, strings);
    }

    public static DataType newInstance(String... strings) {
        return new DataWord(strings);
    }
}




