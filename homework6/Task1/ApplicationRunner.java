package homework6.Task1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу

 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:

 *     Средняя оценка студентов этого курса, количество оценок у которых больше 3-х

 *     Список студентов данного курса, но только с полями Имя и Фамилия.
 *     Список должен быть отсортированы по этим двум полям

 *     Объект с двумя полями:
 *     - Отсортированный список студентов из пункта 2
 *     - Средняя оценка этих студентов

 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */

public class ApplicationRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Terminator", "Good", 3, List.of(5,5,5,4,4)),
                new Student("Sarah", "Connor", 3, List.of(4,4,4,4,4,5,5,3)),
                new Student("John", "Connor", 3, List.of(4,3,4,4,4,3,2)),
                new Student("Terminator", "Bad", 3, List.of(5,5,5,4,4))
        );

        // средняя оценка студентов по курсам
        students.stream()
                .filter(student -> student.getMarksNumber() > 3)
                .collect(Collectors.groupingBy(Student::getCourse, Collectors.averagingDouble(Student::getAverageMark)))
                .entrySet()
                .forEach(System.out::println);

        // студенты с полями имя и фамилия (список отсортирован сначала по имени, потом по фамилии), сгруппированные по курсам
        students.stream()
                .sorted(Comparator.comparing(Student::getGivenName).thenComparing(Student::getFamilyName))
                .collect(Collectors.groupingBy(Student::getCourse, Collectors.mapping(Student::shortStudent, Collectors.toList())))
                .entrySet()
                .forEach(System.out::println);

        var sortedListOfStudentsFromSecondTask = students.stream()
                .sorted(Comparator.comparing(Student::getGivenName).thenComparing(Student::getFamilyName))
                .map(Student::shortStudent)
                .toList();

        // сборная солянка aka третье задание
        // не разобрался как сделать
//        var mapThird = new HashMap<Integer, ListAndMark>();
//        students.stream()
//                .sorted(Comparator.comparing(Student::getGivenName).thenComparing(Student::getFamilyName))
//                .map(student -> mapThird.)
//                .collect(Collectors.groupingBy(Student::getCourse, Collectors.averagingDouble(Student::getAverageMark)));


        // практика
//        students.stream()
//                .map(student -> new StudentShort(student.getGivenName(), student.getFamilyName()))
//                .sorted(Comparator.comparing(StudentShort::getGivenName).thenComparing(StudentShort::getFamilyName))
//                .forEach(System.out::println);



    }

}
