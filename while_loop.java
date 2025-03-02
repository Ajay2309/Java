public class while_loop {
    public static void main(String a[]){
        
        // int i = 1 ;
        // while(true)
        // {
        //     System.out.println("Hi " + i);
        //     i++;
        // }

        // int i = 1;
        // while(i<10)
        // {
        //     System.out.println("Hi "+i);
        //     i++;
        // }
        
        // ********Nested Loop**************

        int i = 1;
        while(i<=5)
        {
            System.out.println("Hi " + i);
                int j = 1;
                while(j<=3)
                {
                    System.out.println("  Hello "+j);
                    j++;
                }
            i++;
        }
    
    } 
    
}
