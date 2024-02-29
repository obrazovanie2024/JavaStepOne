package homework5.Task2;

public class Member {
    private final int identifier;
    private final String name;
    private final int age;

    public Member(int identifier, String name, int age) {
        this.identifier = identifier;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "identifier=" + identifier +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void printInfo() {
        System.out.println(name + "(" + age + ")");
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
