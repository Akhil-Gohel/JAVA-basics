package objectorientedprogramming.objects.shapes;

public class Rectangle {
    float hieght;
    float width;

    void insert(float w, float h)
    {
        width = w;
        hieght = h;
    }

    void calculateArea()
    {
        System.out.println("Area="+width*hieght);
    }
}
