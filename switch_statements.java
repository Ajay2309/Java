public class switch_statements {
    public static void main(String a[]) {
        int num = 1;


		// if(num==1)
		// 	System.out.println("Monday");
		// else if(num==2)
		// 	System.out.println("Tuesday");
		// else if(num==3)
		// System.out.println("Wednesday");
		// else if(num==4)
		// System.out.println("Thursday");
		// else if(num==5)
		// System.out.println("Friday");
		// else if(num==6)
		// System.out.println("Saturday");
		// else
		// System.out.println("Sunday");


        switch(num){

            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Enter a valid number");
        }    
        
        //  **************New updates that was made in switch statements*************

        // String day = "Monday";

        // switch (day){
        //     case "Saturday", "Sunday" -> System.out.println("6 am");
        //     case "Monday" -> System.out.println("8 am");
        //     default -> System.out.println("7 am");
        // }

        // *******************OR**********************

        // String result = "";
        // switch(day){
        //     case "Saturday", "Sunday" -> result = "6 am";
        //     case "Monday" -> result = "8 am";
        //     default -> result = "7 am";
        // }

        // ****************OR********************

        // String result = "";
        // result = switch(day){
        //     case "Saturday", "Sunday" -> "6 am";
        //     case "Monday" -> "8 am";
        //     default -> "7 am";
        // };
    }
}

