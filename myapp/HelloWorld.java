package myapp;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        // System.out.println("Hello World...");

        // if (args.length > 0) {

        // String[] names = new String[5];

        // int x = 0;

        // while (x < args.length) {
        // names[x] = args[x];

        // x++;

        // if (x > 4) {
        // break;
        // }
        // }

        // for (int y = 0; y < names.length; y++) {
        // System.out.printf(" Name[%d]:%s", y, names[y]);
        // }
        // } else {
        // System.out.println("No argument passed");
        // }

        Console console = System.console();
        // String name = console.readLine("What is your name?");

        // if (name.length() > 0) {

        // System.out.println("your name is " + name);

        // }

        // else {
        // System.err.println("You did not tell me your name!");
        // }

        // String sport = console.readLine("What is the sport that you like to do?");

        // if (sport.toUpperCase().equals("SWIMMING")) {
        // System.out.println("That is a nice water sport");
        // }

        // else if (sport.toUpperCase().equals("SOCCER")) {
        // System.out.println("That is a worldly accepted sports");
        // } else {
        // System.out.println("I am not sure about the sport you mentioned");
        // }

        // String replaceName = name.replace('a', 'e');
        // System.out.println("Your name is %s \n" + replaceName);

        // String valueString = console.readLine("Enter your score between 0 to 100: ");
        // Integer score = Integer.parseInt(valueString);

        // switch (score) {

        // case 100:
        // System.out.println("Perfect score!");
        // break;

        // case 49:
        // System.out.println("You failed!");
        // break;

        // default:
        // System.out.println("invalid value");

        // }

        // int i = 0;

        // while (i < score) { // print only if condition in while loop is satisfied
        // System.out.print(i + ",");
        // i++;
        // }

        // do {
        // System.out.print(i + ","); // print first before while loop
        // i++;
        // } while (i < score);

        // Integer[] numbers = new Integer[5];

        // for (int j = 0; j < numbers.length; j++) {
        // Integer inputNumber = Integer.parseInt(console.readLine("Enter your %d
        // number:", j));
        // numbers[j] = inputNumber;
        // }

        // for (Integer pI : numbers) {
        // System.out.println(pI);
        // }

        // ArrayList<String> nameList = new ArrayList<>();
        // String input = "";

        // do {
        // input = console.readLine("Enter your name");
        // if (!input.equals("quit")) {
        // nameList.add(input);
        // }

        // } while (!input.equals("quit"));

        // for (String name : nameList) {
        // System.out.println(name);
        // }

        ArrayList<String> words = new ArrayList<>();

        String keyboardInput = "";
        keyboardInput = console.readLine("Enter a sentence: ");
        Scanner scan = new Scanner(keyboardInput);

        while (scan.hasNext()) {
            words.add(scan.next());
        }

        scan.close();

        for (String word : words) {
        System.out.printf("%s\n", word);
        }

        // for (int z = 0; z < words.size(); z++) {
        //     System.out.printf("%d : %s \r\n", z + 1, words.get(z));
       // }

    }

}
