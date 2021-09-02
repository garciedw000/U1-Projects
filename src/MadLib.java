import java.util.Scanner;

public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
    public static void main(String[] args) {
        String noun;
        String adjective;
        String verb;
        String verb2;

        Scanner read = new Scanner(System.in);

        System.out.println("Noun: ");
        noun = read.nextLine();

        System.out.println("Adjective: ");
        adjective = read.nextLine();

        System.out.println("Verb: ");
        verb = read.nextLine();

        System.out.println("Verb 2: ");
        verb2 = read.nextLine();

        System.out.println("Hello, I am " + noun + " I am very " + adjective + " I like to " + verb + " I also like to " + verb2);
    }
}