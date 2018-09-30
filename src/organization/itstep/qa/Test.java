package organization.itstep.qa;

import organization.itstep.qa.lesson.Rectangle;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,2,3,3);
        Rectangle rectangle1 = new Rectangle(4,4);
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle.getX1());
                System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}
