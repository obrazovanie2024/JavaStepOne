package homework6.Task1;

import java.util.List;

public class ListAndMark {
    private final List<StudentShort> studentShortList;
    private final double averageMark;

    ListAndMark(List<StudentShort> studentShortList, double averageMark) {
        this.studentShortList = studentShortList;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "ListAndMark{" +
                "studentShortList=" + studentShortList +
                ", averageMark=" + averageMark +
                '}';
    }

}
