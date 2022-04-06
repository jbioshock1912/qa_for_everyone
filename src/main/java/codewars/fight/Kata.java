package codewars.fight;

public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String attackText = "%s attacks %s; %s now has %d health. \n";
        String finishText = "%s attacks %s; %s now has %d health and is dead. %s wins. \n";
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
                return attacker.name;
            }
            else {
                attacker.health = attacker.health - defence.damagePerAttack;
                System.out.printf("%s attacks %s; %s now has %d health. \n", defence.name, attacker.name, attacker.name, attacker.health);
                if (attacker.health <= 0){
                    System.out.printf("%s attacks %s; %s now has %d health and is dead. %s wins. \n",
                            defence.name, attacker.name, attacker.name, attacker.health, defence.name);
                    return defence.name;
                }
            }
        }
      return null;
    }


    public static void main(String[] args) {
        declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew");
        int a = 4;
        int b = 3;
        String result = "test";
        System.out.println(a + b + result);
        System.out.println(result + a + b);
    }
}

