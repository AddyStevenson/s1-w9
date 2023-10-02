public class CardMain{
    public static void main(String[] args) {
        Card c = new Card(15, 0);
        Card c1 = new Card(1, 0);
        Card c2 = new Card(13, -1);
        Card c3 = new Card(13, 5);

        Card c4 = new Card(13, 0);
        Card c5 = new Card(8, 0);
        Card c6 = new Card(8, 1);

        // boolean outR = c5.outranks(c4);
        // System.out.println(outR); //false

        // outR = c4.outranks(c5);
        // System.out.println(outR); //true
        
        boolean outR = c3.outranks(c2);
        System.out.println(outR); //false
        
        
    }

}