import javax.swing.JOptionPane;

public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */

    public static void main(String[] args) {
        String physicalStats;
        int strength;
        int jump;
        int battleStats;

        physicalStats = JOptionPane.showInputDialog("How strong is your character on a scale of 1-100");
        strength = Integer.parseInt(physicalStats);

        physicalStats = JOptionPane.showInputDialog("How high can your character jump on a scale of 1-100");
        jump = Integer.parseInt(physicalStats);

        battleStats = strength * jump;

        JOptionPane.showMessageDialog(null, "Your character cam deal " + battleStats + " points of damage");

        System.exit(0);
    }



}
