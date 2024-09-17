package innerClasses;

class Superhero {
    private String secretIdentity = "Bruce Wayne";

    class Sidekick {
        void revealSecret() {
            System.out.println("The hero's secret identity is: " + secretIdentity);
        }
    }

    void callSidekick() {
        Sidekick robin = new Sidekick();
        robin.revealSecret();
    }
}

public class Main {
    public static void main(String[] args) {
        Superhero batman = new Superhero();
        batman.callSidekick();

        // We can also create a sidekick directly:
        Superhero.Sidekick robin = batman.new Sidekick();
        robin.revealSecret();
    }
}