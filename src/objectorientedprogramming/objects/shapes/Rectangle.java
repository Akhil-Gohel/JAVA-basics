package objectorientedprogramming.objects.shapes;

public class Rectangle {
    float height;
    float width;

    void insert(float w, float h)
    {
        width = w;
        height = h;
    }

    void calculateArea()
    {
        System.out.println("Area="+width*height);
    }
}
