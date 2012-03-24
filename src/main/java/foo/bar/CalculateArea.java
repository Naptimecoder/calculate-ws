package foo.bar;

public class CalculateArea {
    
    public double calculateSquare(double side) {
        return calculateRectangle(side, side);
    }
    
    public double calculateRectangle(double width, double height) {
        return width * height;
    }

    public double calculateTriangle(double base, double height) {
        return (base * height) / 2;
    }
}
