package abstract_and_interfaces;

public class AbstractTest {
    public static void main(String[] args) {
        Animal vishnu = new Housecat();
        System.out.println(vishnu.move());
        System.out.println(vishnu.eat("fish"));
//        System.out.println(vishnu.makeNoise()); <- doesn't work because we instantiated vishnu as an animal, even though we made him a new housecat;

        Playable[] playAllTheThings = {new Bouzouki(), new ball()};
        for (Playable playThings : playAllTheThings) {
            System.out.println(playThings.play());
        }
    }
}
