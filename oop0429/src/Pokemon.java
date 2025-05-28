public class Pokemon {

    String name;
    int cp;
    int hp;
    int candy;

//    Constructor #1
    Pokemon() {
//        this.name = "Pikachu_default";
//        this.cp = 100;
//        this.hp = 50;
//        this.candy = 0;
    }

//    Constructor #2
    Pokemon(String name, int cp, int hp, int candy) {
        this.name = name;
        this.cp = cp;
        this.hp = hp;
        this.candy = candy;
    }

//    constructor #3
    Pokemon(String name, int candy) {
        this.name = name;
        this.cp = 20;
        this.hp = 100;
        this.candy = candy;
    }

// define a method to print the Pokemon's details
    void printPokemon() {
        System.out.println("Name: " + name);
        System.out.println("CP: " + cp);
        System.out.println("HP: " + hp);
        System.out.println("Candy: " + candy);
    }
}
