import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"fancy", "agile", "modern", "cunning", "intrepid", "smarmy", "stupid", "sly", "hidden", "fierce"};

    public static String[] nouns = {"seagull", "fox", "linguist", "marmocet", "lynx", "detective", "coder", "idiot", "keyboard", "computer"};

    public static Random random1 = new Random();
    public static Random random2 = new Random();

    public static String newServerName() {
    return adjectives[random1.nextInt(9)] + "-" + nouns[random2.nextInt(9)];
    }

    public static void main(String[] args) {
        System.out.println(ServerNameGenerator.newServerName());


    }
}
