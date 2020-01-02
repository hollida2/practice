package Chapter6;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        setWidth(width);
    }

    double getLength(){
        return length;
    }

    void setLength(double length) {
        this.length = length;
    }
    double getWidth(){
        return width;
    }

    void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);

    }

    public double calculateArea(){
        return length * width;

    }
}
