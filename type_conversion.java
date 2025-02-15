public class type_conversion {
    public static void main(String[] args) {
        // **********Type Conversions**************

        int num = 23;
        byte k = (byte)num;

        float f = 24.54f;
        int i = (int)f;

        // ************Type Promotion**************
        byte a1 = 10;
        byte b1 = 30;
        int result = a1 * b1;
        System.out.println(result);
    }
    
}
