package com.sandner.minimonsters; /**
 * Created by Jonathan on 26.01.2017.
 */
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//nextInt is normally exclusive of the top value,
//so add 1 to make it inclusive


public class Main  {

        public static Scanner scanner = new Scanner(System.in);
        public static Monster m1a;
        public static Monster m1b;
        public static int playerHealth;
        public static Monster m2a;
        public static Monster m2b;
        public static int kiHealth;
        public static int turnNumber = 0;
        // the following booleans are important for abilities that have to be executed at the end of the round... maybe use list instead?
        // for Player
        public static boolean m1aA1LateExecute = false;
        public static boolean m1aA2LateExecute = false;
        public static boolean m1bA1LateExecute = false;
        public static boolean m1bA2LateExecute = false;
        // for KI
        public static boolean m2aA1LateExecute = false;
        public static boolean m2aA2LateExecute = false;
        public static boolean m2bA1LateExecute = false;
        public static boolean m2bA2LateExecute = false;

        // ------------------------------------------------------------------

        public static void main(String[] args) {


            gameStartDialogue();
            if (m1a.name.equals(m1b.name)){
                System.out.println("You cannot choose the same monster two times! Please choose again.");
                gameStartDialogue();
            }
            battleStart();
            while (playerHealth != 0 && kiHealth != 0){
                doATurn();
                turnNumber++;
            }
            gameEnd();
        }


        //-------------------------------------------------------------------


        private static void gameEnd() {
            if (playerHealth > kiHealth){
                System.out.println("YOU WIN");
                System.out.println();
                printOverview();
                return;
            }
            else {
                System.out.println("You are unworthy!");
                System.out.println();
                printOverview();
                return;
            }
        }

        private static void printOverview() {
            System.out.println("YOU:");
            System.out.println("Monster 1:" + m1a.name + m1a.hp + "HP");
            System.out.println("Monster 2:" + m1b.name + m1b.hp + "HP");
            System.out.println();
            System.out.println("YOUR OPPONENT:");
            System.out.println("Monster 1:" + m2a.name + m2a.hp + "HP");
            System.out.println("Monster 2:" + m2b.name + m2b.hp + "HP");

        }

        private static void battleStart() {
            playerHealth = m1a.hp + m1b.hp;
            kiHealth = m2a.hp + m2b.hp;
        }

        private static void gameStartDialogue() {
            System.out.println("Welcome to Mate Monsters");
            System.out.println("Pick the 2 Monsters of your Choice:");
            System.out.println("0: End Game");
            System.out.println("1: Magmaspider");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
            System.out.println("8");
            System.out.println("9");
            System.out.println("10");
            System.out.println();
            spawnPlayerMonsters();
            spawnKIMonsters();
        }

        private static void spawnKIMonsters() {
            int randint = ThreadLocalRandom.current().nextInt(1, 11);
            for (int i=0; i<1; i++){
                switch (randint) {
                    case 1: m1a = new Magmaspider();
                        break;
                    case 2: break;
                    case 4: break;
                    case 5: break;
                    case 6: break;
                    case 7: break;
                    case 8: break;
                    case 9: break;
                    case 10: break;

                }
            }
            for (int i=0; i<1; i++){
                switch (randint) {
                    case 1: m1b = new Magmaspider();
                        break;
                    case 2: break;
                    case 4: break;
                    case 5: break;
                    case 6: break;
                    case 7: break;
                    case 8: break;
                    case 9: break;
                    case 10: break;

                }
            }
            if (m2a.name.equals(m2b.name)){spawnKIMonsters();}
        }

        private static void spawnPlayerMonsters() {
            int ma = scanner.nextInt();
            if (ma == 0){System.out.println("End of Game"); System.exit(0);}
            else {
                for (int i=0; i<=1; i++){
                    switch (ma) {
                        case 1: m1a = new Magmaspider();
                            break;
                        case 2: break;
                        case 4: break;
                        case 5: break;
                        case 6: break;
                        case 7: break;
                        case 8: break;
                        case 9: break;
                        case 10: break;
                    }
                }
                for (int i=0; i<=1; i++){
                    switch (ma) {
                        case 1: m1b = new Magmaspider();
                            break;
                        case 2: break;
                        case 4: break;
                        case 5: break;
                        case 6: break;
                        case 7: break;
                        case 8: break;
                        case 9: break;
                        case 10: break;
                    }
                }
            }
        }
        private static void doATurn(){
            askPlayer();
            askKI();
            execute();
            printChoices();
            printOverview();
        }


        private static void printChoices() {

        }


        private static void execute() {

        }


        private static void askKI() {

        }


        private static void askPlayer() {
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println(m1a.name);
            System.out.println("1: " +m1a.nameA1 + " (" + m1a.descriptionA1 + ")");
            System.out.println("2: " +m1a.nameA2 + " (" + m1a.descriptionA2 + ")");
            System.out.println(m1b.name);
            System.out.println("3: " +m1b.nameA1 + " (" + m1b.descriptionA1 + ")");
            System.out.println("4: " +m1b.nameA2 + " (" + m1b.descriptionA2 + ")");
            System.out.println();

        }
    }

