package codewars.fight;

/*Codewars Task3
        Create a function that returns the name of the winner in a fight between two fighters.
        Each fighter takes turns attacking the other and whoever kills the other first is victorious.
        Death is defined as having health <= 0.
        Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
        Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0.
        You can mutate the Fighter objects.*/

public class Kata {
    private static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";
        var attacker = fighter1;
        var defence = fighter2;


        if (!fighter1.name.equals(firstAttacker)){
            defence = fighter1;
            attacker = fighter2;
        }

        while (defence.health > 0 && attacker.health > 0){
            defence.health = defence.health - attacker.damagePerAttack;
            System.out.printf("%s attacks %s; %s now has %d health. \n", attacker.name, defence.name, defence.name, defence.health);
            if (defence.health <= 0){
                System.out.printf("%s attacks %s; %s now has %d health and is dead. %s wins. \n",
                        attacker.name, defence.name, defence.name, defence.health, attacker.name);
                winner = attacker.name;
                break;
            }
            else {
                attacker.health = attacker.health - defence.damagePerAttack;
                System.out.printf("%s attacks %s; %s now has %d health. \n", defence.name, attacker.name, attacker.name, attacker.health);
                if (attacker.health <= 0){
                    System.out.printf("%s attacks %s; %s now has %d health and is dead. %s wins. \n",
                            defence.name, attacker.name, attacker.name, attacker.health, defence.name);
                    winner = defence.name;
                    break;
                }
            }
        }
      return winner;
    }

    public static void main(String[] args) {
        System.out.println(declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew"));
    }
}

