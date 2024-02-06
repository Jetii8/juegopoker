import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cartas;

    public Deck() {
        cartas = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] colores = {"Negro", "Rojo"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) {
            for (String color : colores) {
                for (String valor : valores) {
                    cartas.add(new Card(palo, color, valor));
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (!cartas.isEmpty()) {
            Card carta = cartas.remove(0);
            System.out.printf("%s,%s,%s\n", carta.getPalo(), carta.getColor(), carta.getValor());
            System.out.printf("Quedan %d cartas en deck\n", cartas.size());
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    public void pick() {
        if (!cartas.isEmpty()) {
            int index = (int) (Math.random() * cartas.size());
            Card carta = cartas.remove(index);
            System.out.printf("%s,%s,%s\n", carta.getPalo(), carta.getColor(), carta.getValor());
            System.out.printf("Quedan %d cartas en deck\n", cartas.size());
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    public void hand() {
        if (cartas.size() < 5) {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano.");
            return;
        }

        System.out.println("Mano:");

        for (int i = 0; i < 5; i++) {
            Card carta = cartas.remove(0);
            System.out.printf("%s,%s,%s\n", carta.getPalo(), carta.getColor(), carta.getValor());
        }

        System.out.printf("Quedan %d cartas en deck\n", cartas.size());
    }
}
