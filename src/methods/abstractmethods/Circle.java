package methods.abstractmethods;

public class Circle extends Shape {
    float r;
    Circle(float r)
    {
        this.r=r;
    }
    public void calculateArea()
    {
        System.out.println("Area="+Math.PI*r*r);
    }
}
