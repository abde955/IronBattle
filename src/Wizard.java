import java.util.Random;

public class Wizard extends Character implements Attacker { // Implementa Attacker
    private int mana;
    private int intelligence;

    public Wizard(String name) {
        super(name, getRandomNumber(50, 100)); // HP entre 50 y 100
        this.mana = getRandomNumber(10, 50);   // Mana entre 10 y 50
        this.intelligence = getRandomNumber(1, 50); // Intelligence entre 1 y 50
    }

    @Override
    public void attack(Character target) { // Asegúrate de que la firma sea correcta
        Random random = new Random();
        boolean fireball = random.nextBoolean();

        if (mana >= 5 && fireball) {
            target.takeDamage(intelligence);
            mana -= 5;
            System.out.println(getName() + " casts a fireball on " + target.getName() + " dealing " + intelligence + " damage.");
        } else if (mana > 0) {
            target.takeDamage(2); // Daño fijo por golpe con bastón
            mana += 1; // Recupera mana
            System.out.println(getName() + " uses a staff hit on " + target.getName() + " dealing 2 damage.");
        } else {
            mana += 2; // Recupera mana
            System.out.println(getName() + " has no mana and recovers 2 mana.");
        }
    }

    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}

