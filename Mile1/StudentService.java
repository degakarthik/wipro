package Mile1;

public class StudentService {

    public int findNumberOfNullMarks(Student[] data) {
        int count = 0;
        if (data != null) {
            for (Student s : data) {
                if (s != null && s.getMarks() == null) {
                    count++;
                }
            }
        }
        return count;
    }

    public int findNumberOfNullNames(Student[] data) {
        int count = 0;
        if (data != null) {
            for (Student s : data) {
                if (s != null && s.getMarks() != null && s.getName() == null) {
                    count++;
                }
            }
        }
        return count;
    }

    public int findNumberOfNullObjects(Student[] data) {
        int count = 0;
        if (data != null) {
            for (Student s : data) {
                if (s == null) {
                    count++;
                }
            }
        }
        return count;
    }
}