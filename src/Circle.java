

public class Circle implements shape {
    int radius;


    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (this.radius*this.radius*Math.PI);

}}
