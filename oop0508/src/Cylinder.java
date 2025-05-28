public class Cylinder {

//  以Circle類別為基礎，並增加一個高度的屬性
    private Circle base;
    private double height;

//  建構方法
    public Cylinder(double radius, double x, double y, double height) {
        this.base = new Circle(radius, x, y);
        this.height = height;
    }
}
