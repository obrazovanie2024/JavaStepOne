package homework6.Task1;

public class StudentShort {
    private final String givenName;
    private final String familyName;

    public StudentShort(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "StudentShort{" +
                "givenName='" + givenName + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getGivenName() {
        return givenName;
    }
}
