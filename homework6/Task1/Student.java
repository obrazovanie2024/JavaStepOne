package homework6.Task1;

import java.util.List;

public class Student {
    private final String givenName;
    private final String familyName;
    private final int course;
    private final List<Integer> marksList;

    public Student(String givenName, String familyName, int course, List<Integer> marksList) {

        this.givenName = givenName;
        this.familyName = familyName;
        this.course = course;
        this.marksList = marksList;
    }

    public int getMarksNumber() {
        return this.marksList.size();
    }

    public double getAverageMark() {
        return this.marksList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public StudentShort shortStudent() {
        return new StudentShort(this.givenName, this.familyName);
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getMarksList() {
        return marksList;
    }
}
