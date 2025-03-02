class calculator
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

public class Class_Object {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;

        // int result = num1 + num2 ;
        // System.out.println(result);

        calculator calc = new calculator();

        // int result = calc.add(5,8);
        int result = calc.add(num1 , num2);

        System.out.println(result);
    }
    
}
