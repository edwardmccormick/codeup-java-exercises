package abstract_and_interfaces;

public class Housecat extends Animal {
    String eat(String food) {
        return "nom nom nom";
    }

    String move() {
        return "pounce!";
    }

    String makeNoise() {
        return "Meow, meow, meow";
    }
}
