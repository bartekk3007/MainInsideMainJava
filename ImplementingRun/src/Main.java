public class Main
{
    public static void main(String[] args)
    {
        Main m1 = new Main();
        Main m2 = new Main();
        Main m3 = new Main();
        Main m4 = new Main();
        Main m5 = new Main();
        Main m6 = new Main();
        Main m7 = new Main();
        Main m8 = new Main();
        Main[] ms = {m1, m2, m3, m4, m5, m6, m7, m8};
        for (Main mt : ms)
        {
            mt.run();
        }
    }
    public void run()
    {
        System.out.println("Run is available");
    }
}