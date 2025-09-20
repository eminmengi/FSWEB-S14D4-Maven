package org.example.rpg;

public class RpgMain {

    public static void main(String[] args) {
        Monster troll = new Troll("troll", 100, 20);
        Monster wolf = new Werewolf("wolf", 120, 40);

        printAttackResult(troll);
        printAttackResult(wolf);
    }

    private static void printAttackResult(Monster monster) {
        System.out.println("attack result of: " + monster.getName() + ": " + monster.attack());
    }
}
