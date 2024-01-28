package dmdev.homeworks.homework1;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 *.
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */

public class Task3 {
    public static void main(String[] args) {
        int firstCathetusOfFirstTriangle = 11;
        int secondCathetusOfFirstTriangle = 15;
        int firstCathetusOfSecondTriangle = 12;
        int secondCathetusOfSecondTriangle = 15;
        double areaOfFirstTriangle = calculateAreaOfTriangle(firstCathetusOfFirstTriangle, secondCathetusOfFirstTriangle);
        double areaOfSecondTriangle = calculateAreaOfTriangle(firstCathetusOfSecondTriangle, secondCathetusOfSecondTriangle);
        System.out.println("Площадь первого треугольника: " + areaOfFirstTriangle);
        System.out.println("Площадь второго треугольника: " + areaOfSecondTriangle);
        printResultOfComparing(areaOfFirstTriangle, areaOfSecondTriangle);
    }

    static double calculateAreaOfTriangle(int cathetusA, int cathetusB) {
        return (cathetusA * cathetusB) / 2.0;
    }

    static void printResultOfComparing(double areaOfFirstTriangle, double areaOfSecondTriangle) {
        int comparingResult = Double.compare(areaOfFirstTriangle, areaOfSecondTriangle);
        switch (comparingResult) {
            case -1 -> System.out.println("Площадь первого треугольника меньше площади второго");
            case 0 -> System.out.println("Площадь первого треугольника равна площади второго");
            case 1 -> System.out.println("Площадь первого треугольника больше площади второго");
        }
    }
}
