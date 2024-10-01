public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        System.out.println(f.getCurrentFood());
        f.simulateOneDay(12);
        System.out.println(f.toString());






        Feeder g = new Feeder(1000);
        System.out.println(g.getCurrentFood());
        g.simulateOneDay(22);
        System.out.println(g.toString());


        Feeder h = new Feeder(100);
        System.out.println(h.getCurrentFood());
        h.simulateOneDay(5);
        System.out.println(h.toString());


        Feeder i = new Feeder(250);
        System.out.println(i.getCurrentFood());
        System.out.println(i.simulateManyDays(10, 5));


        Feeder j = new Feeder(2400);
        System.out.println(j.getCurrentFood());
        System.out.println(j.simulateManyDays(10, 4));




        Feeder k = new Feeder(0);
        System.out.println(k.simulateManyDays(5, 10));



























   
   
  
   
    }
}
