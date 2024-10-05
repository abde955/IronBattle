# Iron Battle Simulator

## Descripción

Este proyecto es un simulador de batalla RPG básico en Java, donde dos personajes (un Guerrero y un Mago) luchan hasta que uno de ellos quede fuera de combate. Utiliza la programación orientada a objetos para crear clases y una interfaz que define el comportamiento de los personajes en la batalla.

## Clases y Estructura del Proyecto

- **Character**: Clase abstracta que contiene atributos comunes a todos los personajes (nombre, salud, estado de vida).
- **Attacker**: Interfaz que define el método `attack` que debe ser implementado por todas las clases de personajes.
- **Warrior**: Clase que extiende de `Character` y representa un guerrero con atributos de fuerza y resistencia.
- **Wizard**: Clase que extiende de `Character` y representa un mago con atributos de inteligencia y maná.
- **Main**: Clase que contiene el método `main` y controla la simulación de la batalla.

## Requisitos

- Java Development Kit (JDK) 8 o superior.
- IntelliJ IDEA o cualquier otro IDE que soporte Java.
  
## Configuración del Proyecto

1. **Clonar el repositorio**:
   ```bash
   git clone <URL-del-repositorio>
   cd IronBattle


## Ejemplo de combate

Hello and welcome to the battle simulator!
Conan hace un ataque fuerte a Gandalf causando 6 de daño.
Gandalf lanza un Fireball a Conan causando 37 de daño.
Conan HP: 64
Gandalf HP: 43
-------------------------
...
Conan wins!
