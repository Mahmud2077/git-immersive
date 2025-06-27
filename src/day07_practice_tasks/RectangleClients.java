package day07_practice_tasks;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 3.5;
        rectangle.lenght = 5.6;
        System.out.println(rectangle);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 6.5;
        rectangle2.lenght = 7.6;
        System.out.println(rectangle);

        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());
    }
}
