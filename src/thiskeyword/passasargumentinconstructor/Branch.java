package thiskeyword.passasargumentinconstructor;

public class Branch {
    Student s;
    Branch(Student s)
    {
        this.s = s;
    }
    public void displayBranch()
    {
        System.out.println("Branch="+s.branch);
    }
}
