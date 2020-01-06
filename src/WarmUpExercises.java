public class WarmUpExercises {
    public static void main(String[] args)
    {
        for (int counter = 100; counter>=0 ; counter -= 5)
            System.out.printf("%d%s", counter,(counter==0)?"\n":", ");

        for (int counter = 0; counter <= 100; counter += 10)
        {
            System.out.printf("%d%s%s", counter,
                    (counter%20==0)?" Java":"", (counter==100)?"\n":", ");
        }

        System.out.printf("Snow depth of 31 - we can ski: %b%n", timeToSki(31));
        System.out.printf("Snow depth of 30 - we can ski: %b%n", timeToSki(30));

        starDesign(20);

    }//end of main method

    public static boolean timeToSki(int snowDepth)
    {
        return snowDepth>30;
    }

    public static void starDesign(int rows)
    {
        for( ; rows>0 ; rows--)
        {
            for (int col=1; col<= rows; col++)
                System.out.print("*");
            System.out.println();
        }

    }
}
