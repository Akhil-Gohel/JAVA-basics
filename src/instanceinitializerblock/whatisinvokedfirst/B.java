package instanceinitializerblock.whatisinvokedfirst;

public class B extends A{
    B()
    {
        super(); //Parent class constructor invoked first
        // compiler copies the Instance Initializer Block here
        // {System.out.println("Instance Initializer Block invoked");}
        System.out.println("Child class constructor invoked"); // invoked last
    }

    {
        System.out.println("Instance Initializer Block invoked");
    }
}
