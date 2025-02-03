package javaclass;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person person1 = new Person("Juan", "Pérez", "12345678", 1990);

        person1.displayInformation();    }
}
