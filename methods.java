class computer
{
    public void playMusic()
    {
        System.out.println("Playing Music.....");
    }

    public String getMePen(int cost)
    {
        return "Pen";
    }
}

public class methods {
    public static void main(String a[]){
        computer obj = new computer();
        obj.playMusic();
        // obj.getMePen(10);   // this wiss not work

        String str = obj.getMePen(2);
        System.out.println(str);

    }
}