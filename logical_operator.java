public class logical_operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int x = 15;
        int y = 19;

        // boolean result = a>b && x<y ;
        // boolean result = a>b || x<y ;
        // boolean result = a<b && x<y ;
        // boolean result = a<b || x<y ;
        boolean result = a<b || x<y ;

        // System.out.println(result);
        System.out.println(!result);
    }
    
}
