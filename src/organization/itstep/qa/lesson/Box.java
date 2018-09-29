package organization.itstep.qa.lesson;

public class Box {
    private int width ; // ширина коробки
    private int hieght ; // высота коробки
    private int depth ; // глубина коробки

    public Box(int width, int hieght, int depth) {
        this.width = width;
        this.hieght = hieght;
        this.depth = depth;
    }

    public Box(int i) {
        this(i, i, i  );
    }
    public Box(){

    }

    // вычислить обьем коробки
    public int getVolume(){
        return width * hieght * depth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHieght() {
        return hieght;
    }

    public void setHieght(int hieght) {
        this.hieght = hieght;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
