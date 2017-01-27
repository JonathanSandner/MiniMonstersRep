package com.sandner.minimonsters;

/**
 * Created by Jonathan on 26.01.2017.
 */

public class Magmaspider extends Monster {


    public static void main(String[] args) {

    }

    public Magmaspider() {
        super();
        setHp(25);
        setRounddmg(1);
        setName("Magmaspider");
        setNameA1("Fire Net");
        setNameA2("Spider Egg");
        setDescriptionA1("If there would be incoming damage this round it will be negated and Magmaspider gets +2 damage for next round.");
        setDescriptionA2("Magmaspiders damage gets a +1 in each round due to a tiny helping Magmaspider. In return, it loses 5 HP.");
    }

    public void a1(){
        fireNet();
    }//Ability 1
    public void a2(){
        spiderEgg();
    }//Ability 2

    private void fireNet() {
        //Next incoming damage is "rehealed" and if there is one, next Attack does +2 damage

    }
    private void spiderEgg() {
        //Sets hp -5 but theoretically spawns a minispider, which deals +1 damage each turn (randomly)
    }

}
