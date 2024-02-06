public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Primera carta:");
        deck.head();

        System.out.println("Carta al azar:");
        deck.pick();

        System.out.println("Mano de 5 cartas:");
        deck.hand();
    }
}
