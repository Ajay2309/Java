class calculator
{
    public int add( int n1, int n2)
    {
        return n1+n2;
    }
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
}

public class methods_overloading {
    public static void main(String a[]){

        calculator obj = new calculator();

        int r1 = obj.add(5,4,1);
        System.out.println(r1);

    }
}
