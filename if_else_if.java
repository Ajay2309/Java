public class if_else_if {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = 9;

        if (a>b && a>c)
            System.out.println(a);
        
        // else if (b>a && b>c)   

        else if (b>c)     // we always try to remove the unnecessary code.
            System.out.println(b);

        else 
            System.out.println(c);
    }
    
}
