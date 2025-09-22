import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args) {
        String name;
        int age;
        float height;
        float weight;
        int jerseyNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player name:");
        name = input.nextLine();
        System.out.println("Enter player age:");
        age = input.nextInt();
        System.out.println("Enter player height in meters:");
        height = input.nextFloat();
        System.out.println("Enter player weight in pounds:");
        weight = input.nextFloat();
        System.out.println("Enter player jersey number:");
        jerseyNumber = input.nextInt();
        System.out.println("Player Name - "+name +"\nAge - "+age+"\nHeight - "+height+"m"+ "\nWeight - "+weight +"lbs"+ "\nJersey - "+jerseyNumber);

        final double POUND = 0.45359237;
        final int METER = 100;

        double weightInkg = (weight*POUND);
        float heightIncm= (height*METER);
        int wholeWeight = (int)weightInkg;
        System.out.println("Player Name - "+name +"\nAge - "+age+"\nHeight - "+heightIncm+"cm"+ "\nWeight in kg - "+wholeWeight +"kg"+ "\nJersey - "+jerseyNumber);

        System.out.println("Player's age now:"+ age);

        age++;

        jerseyNumber--;

        System.out.println("Player's age now:"+ age);
        System.out.println("Jersey's number now(after penalty):"+ jerseyNumber);

        boolean eligibility = (age >= 18 && age <= 35 && wholeWeight < 90);

        if (eligibility)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");

        if (age < 18 || wholeWeight >= 90)
            System.out.println("Player has a problem(either too young or too heavy");

        if (!eligibility) {
            System.out.println("Not Eligible");
        }

        String category;
        if (age <20){
            category ="Rising star";
        }
        else if (age > 20 && age < 30){
            category="Prime Player";
        }
        else {
            category="Veteran";
        }
        System.out.println("Category: " + category);

        int jersey_numberRequest;
        System.out.println("Enter player jersey number:");
        jersey_numberRequest = input.nextInt();

        String position;

        switch (jersey_numberRequest) {
            case 1: position = "Goalkeeper"; break;
            case 2: case 5: position = "Defender"; break;
            case 6: case 8: position = "Midfielder"; break;
            case 7: case 11: position = "Winger"; break;
            case 9: position = "Striker"; break;
            case 10: position = "Playmaker"; break;
            default: position = "Player position not known";
        }

        System.out.println("Position: " + position);

        if (category.equals("Prime Player")) {
            if (wholeWeight < 80) {
                System.out.println("Starting lineup");
            }
            else {
                System.out.println("Bench");
            }
        }
        String finalStatus = eligibility ? "Play" : "Rest";

        System.out.println("Final Status: " + finalStatus);




















           }
}
