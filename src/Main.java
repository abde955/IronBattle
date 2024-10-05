import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Crear personajes
        Warrior warrior = new Warrior("Conan");
        Wizard wizard = new Wizard("Gandalf");

        // Simular una batalla
        while (warrior.isAlive() && wizard.isAlive()) {
            // Ambos personajes atacan
            warrior.attack(wizard);
            wizard.attack(warrior);

            // Mostrar el estado de los personajes
            System.out.println(warrior.getName() + " HP: " + warrior.getHp());
            System.out.println(wizard.getName() + " HP: " + wizard.getHp());
            System.out.println("-------------------------");
        }

        // Determinar y mostrar el ganador
        if (warrior.isAlive()) {
            System.out.println(warrior.getName() + " wins!");
        } else if (wizard.isAlive()) {
            System.out.println(wizard.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
