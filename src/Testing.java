public class Testing {
    public static void main(String[] args)
    {
        //this is using the default (not recommended) constructor
        Card aceOfSpades = new Card("ace","spades");
        System.out.println(aceOfSpades);
        System.out.printf("The suit is '%s'%n", aceOfSpades.getSuit());
        System.out.printf("The face name is '%s'%n", aceOfSpades.getFaceName());

        Card sevenOfDiamonds = new Card("7","diamonds");
        System.out.printf("The suit is '%s'%n", sevenOfDiamonds.getSuit());
        System.out.printf("The face name is '%s'%n", sevenOfDiamonds.getFaceName());

    }
}
