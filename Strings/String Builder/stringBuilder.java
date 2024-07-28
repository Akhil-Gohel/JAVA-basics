
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // print the String
        System.out.println("the string is:"+sb);

        // Get Char from index
        System.out.println("char at index 0:"+sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'B');
        System.out.println("Set char B at index 0:"+sb);

        // insert char at index
        sb.insert(0, 'H');
        System.out.println("insert char H at 0:"+sb);

        // delete char at index
        sb.delete(1, 2);
        System.out.println("delete char B at index 1:"+sb);

        // append world
        sb.append(" World!");
        System.out.println("Append word :"+sb);

        // print length of string
        System.out.println("length of string is:"+sb.length());
        
    }
}
