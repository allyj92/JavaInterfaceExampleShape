public class Rectangle implements  shape{
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
       return this.width * this.height;
    };
}
