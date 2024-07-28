package arrays;

public class create_arrays {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 92;
        marks[1] = 95;
        marks[2] = 97;
    
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]); 

        int age[] = {10,20,30};
        for(int i=0; i<3; i++){
            System.out.println(age[i]);
        }
    }
}
