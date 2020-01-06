import java.util.Arrays;
import java.util.List;

public class Card {

    //these are "instance variables".  When an object is created
    //these should be given initial, valid values
    private String suit, faceName;
    private int faceValue;

    /**
     * This constructor accepts a Card's suit and face name to configure the card
     * The goal of the constructor is to initialize the Card object with valid values
     * for each of the instance variables
     * @param suit can be hearts, diamonds, spades or clubs
     * @param faceName can be 2,3,4,5,6,7,8,9,10,jack,queen,king or ace
     */
    public Card(String faceName, String suit) {
        setSuit(suit);
        setFaceName(faceName);
//        calculateValue();
    }

    public String getSuit() {
        return suit;
    }

    /**
     * This method will validate that argument is hearts, spades, diamonds or clubs and set
     * the instance variable
     * @param suit hearts, diamonds, spades, clubs
     */
    public void setSuit(String suit) {
        List validSuits = Arrays.asList("hearts","diamonds","spades","clubs");
        suit = suit.toLowerCase();

        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("valid suits are hearts, diamonds,clubs or spades");
    }

    public String getFaceName() {
        return faceName;
    }

    /**
     * This method will validate the faceName and set the instance variable
     * @param faceName 2,3,4,5,6,7,8,9,10,jack,queen,king,ace
     */
    public void setFaceName(String faceName) {
        faceName=faceName.toLowerCase();
        List validFaceNames = Arrays.asList("2","3","4","5","6","7","8","9","10","jack",
                                            "queen","king","ace");
        if (validFaceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException("face name must be 2,3,4,5,6,7,8,9,10,jack,queen,king or ace");
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
}
