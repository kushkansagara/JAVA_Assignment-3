/*
    Name : Kansagara Kush;
    ID : 21CE051
*/
interface A
{
    public void Details();
    default void Address()
    {
        System.out.println("Address :-\n'Haridarshan App.', Block No.- 604,\nHari Om Nagar,\nZanzarda Road,\nJunagadh - 362001.");
    }
}

public class Practical3_7 implements A
{
    public void Details()
    {
        System.out.println("Details:-");
        System.out.println("Name : Kansagara Kush");
        System.out.println("ID No. : 21CE051");
        System.out.println("Collage name : CSPIT");
        System.out.println("Branch : Computer Engineering");
        System.out.println("Current Sem. : 3");
    }
    public static void main(String []args)
    {
        Practical3_7 p1=new Practical3_7();
        p1.Details();
        p1.Address();
    }
}
