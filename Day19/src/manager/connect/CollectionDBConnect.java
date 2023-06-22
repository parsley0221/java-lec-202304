package manager.connect;

import manager.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class CollectionDBConnect {
    private static final List<Student> students = new ArrayList<Student>();

    public static List<Student> getConnection() {
        return students;
    }

    public void closeConnection() {};
}


// 필요에 따라 갈아끼울 수 있도록 코넥트는 두 개를 만들었다.