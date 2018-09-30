package organization.itstep.qa.lesson;

public class Rectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // конструктор принимает 4 параметра целого типа и присваивает их значения полям (x1,y1, x2,y2)

    public Rectangle(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
         }

    public Rectangle(int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
        this.y1 = 0;
        this.x1 = 0;
    }

    // конструктор не принимает никаких параметров - создает вырожденный прямоугольник
    // с координатами углов (0.0) и (0.0)
    public Rectangle () {
        this.x2 = 0;
        this.y2 = 0;
        this.y1 = 0;
        this.x1 = 0;
    }

    public void move(int dx, int dy){
        x1 += dx;
        y1 += dy;
        x2 += dx;
        y2 += dy;
    }

    public void printRect() {
        System.out.println("x1 = " + x1);
        System.out.println("y1 = " + y1);
        System.out.println("x2 = " + x2);
        System.out.println("y2 = " + y2);
    }


    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
