class calculator
{
    int num = 20;

    public int sum(int n1,int n2)
    {
        // System.out.println(num);
        return n1+n2;
    }
}

public class StackAndHeap {
    public static void main(String a[]){

        int data = 10;

        calculator obj = new calculator();
        calculator obj1 = new calculator();

        int r1 = obj.sum(2,3);
        // System.out.println(r1);

        obj.num = 3;

        System.out.println(obj.num);
        System.out.println(obj1.num);

    }
    
}
