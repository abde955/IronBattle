import java.util.Random;

public class Warrior extends Character implements Attacker {
    private int stamina;
    private int strength;

    public Warrior(String name) {
        super(name, getRandomNumber(100, 200)); // HP entre 100 y 200
        this.stamina = getRandomNumber(10, 50);  // Stamina entre 10 y 50
        this.strength = getRandomNumber(1, 10);   // Strength entre 1 y 10
    }

    @Override
    public void attack(Character target) {
        Random random = new Random();
        boolean heavyAttack = random.nextBoolean(); // Decide aleatoriamente si hacer un ataque pesado

        if (stamina >= 5 && heavyAttack) {
            target.takeDamage(strength); // Daño por ataque fuerte
            stamina -= 5; // Reduce la stamina
            System.out.println(getName() + " performs a heavy attack on " + target.getName() + " dealing " + strength + " damage.");
        } else if (stamina > 0) {
            int damage = strength / 2; // Daño por ataque débil
            target.takeDamage(damage);
            stamina += 1; // Recupera stamina
            System.out.println(getName() + " performs a weak attack on " + target.getName() + " dealing " + damage + " damage.");
        } else {
            stamina += 2; // Recupera stamina
            System.out.println(getName() + " has no stamina and recovers 2 stamina.");
        }
    }

    // Método para generar números aleatorios
    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}

