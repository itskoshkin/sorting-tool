abstract class DataType {
    abstract void input();

    abstract void processing();

    abstract void output();
}


// TODO: 28.01.2020  
class DataLong extends DataType {

    @Override
    void input() {

    }

    @Override
    void processing() {

    }

    @Override
    void output() {

    }
}

class DataLine extends DataType {

    @Override
    void input() {

    }

    @Override
    void processing() {

    }

    @Override
    void output() {

    }
}

class DataWord extends DataType {

    @Override
    void input() {

    }

    @Override
    void processing() {

    }

    @Override
    void output() {

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




