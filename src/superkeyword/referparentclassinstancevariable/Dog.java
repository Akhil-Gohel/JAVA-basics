package superkeyword.referparentclassinstancevariable;

public class Dog extends Animal{
    String color = "black";

    void printColor()
    {
        System.out.println(color); // print color of Dog class
        System.out.println(super.color); // print color of Animal class
    }
}
