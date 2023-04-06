public class speedingticket {
    public static void main(String[] args)
    {

        int speed = Integer.parseInt(args[0]);

        int fine = 0;

        if(speed <= 60)
        {
            fine = 0; 
        }
        if(speed>60 && speed<=70)
        {
            fine = 100;
        }
        if(speed>70 && speed<=90)
        {
            fine = 200;
        }
        if(speed>90)
        {
            fine = 500;
        }

        System.out.print("$"+fine);
    }
}
