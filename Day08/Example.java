import Decorator.*;
import Factory.Factory;
import Factory.NoSuchToyException;
import Factory.Toy;
import Observer.*;

public class Example {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Toy teddy;
        try {
            teddy = factory.create("teddy");
            Toy gameboy = factory.create("gameboy");
            System.out.println(gameboy.getTitle());
            System.out.println(teddy.getTitle());
        } catch (NoSuchToyException e) {
            System.out.println(e.getMessage());
        }
    }
}