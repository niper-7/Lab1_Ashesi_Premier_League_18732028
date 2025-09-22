import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        String name;
        int age;
        float height;
        float weight;
        int jerseyNumber;

        // Receiving player details
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player name: ");
        name = sc.nextLine();

        System.out.println("Enter age: ");
        age = sc.nextInt();

        System.out.println("Enter height(meters): ");
        height = sc.nextFloat();

        System.out.println("Enter weight(pounds): ");
        weight = sc.nextFloat();

        System.out.println("Enter Jersey Number: ");
        jerseyNumber = sc.nextInt();

        // Player Categorization
        System.out.println(" ");
        System.out.println("Printing Player Category...");

        boolean rising = age < 20;
        boolean prime = age >= 20 && age <= 30;
        if(rising)
        {
            System.out.println("Player is a Rising star");
        }
        else if(prime)
        {
            System.out.println("Player is a Prime player");
        }
        else
        {
            System.out.println("Player is a Veteran"); 
        }

        // Conversion of weight and height
        final float pounds = 0.45359237f;
        final int meters = 100;

        float new_weight = weight * pounds;
        float new_height = height * meters;
        float rounded_weight = (int) new_weight;

        // Printing Player details with height and weight conversion
        System.out.println(" ");
        System.out.println("Printing Player Report... ");
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + new_height + "cm");
        System.out.println("Weight: " + rounded_weight + "kg");
        System.out.println("Jersey Number: " + jerseyNumber);

        // Player Position
        switch (jerseyNumber) 
        {
            case 1:
                System.out.println("Position: Goalkepper");
                break;
            case 2:
            case 5:
                System.out.println("Position: Defender");
                break;
            case 6:
            case 8:
                System.out.println("Positon: Midfielder");
                break;
            case 7:
            case 11: 
                System.out.println("Position: Winger");
                break;
            case 9:
                System.out.println("Position: Striker");
                break;
            case 10:
                System.out.println("Position: Playmaker");
                break;
            default:
                System.out.println("Position: Player position not known");
                break;
        }

        // Attacker Jersey
        switch (jerseyNumber) 
        {
            case 1:
                System.out.println("Attacker Jersey: No");
                break;
            case 2:
            case 5:
                System.out.println("Attacker Jersey: No");
                break;
            case 6:
            case 8:
                System.out.println("Attacker Jersey: No");
                break;
            case 7:
            case 11: 
                System.out.println("Attacker Jersey: Yes");
                break;
            case 9:
                System.out.println("Attacker Jersey: Yes");
                break;
            case 10:
                System.out.println("Attacker Jersey: Yes");
                break;
            default:
                System.out.println("Attacker Jersey: Not known");
                break;
        }
   
        
        // Checking Eligibility
        boolean isOfAge = age >= 18 && age <= 35;
        boolean isOfWeight = rounded_weight < 90;
        boolean isEligible = isOfAge && isOfWeight;
        
        if (isEligible)
        {
            System.out.println("Eligibilty: Eligible");
        }
        else{
            System.out.println("Eligibility: Not Eligible");
        }

        //Lineup Decision
        if(prime)
        {
            if(rounded_weight < 80)
            {
                System.out.println("Lineup Decision: In starting lineup");
            }
            else
            {
                System.out.println("Lineup Decision: On the bench");
            }
        }
        else
        {
            System.out.println("Lineup Decision: On the bench");
        }

        // Final Decision
        if(isEligible){
            System.out.println("Final Decision: Play");
        }
        else{
            System.out.println("Final Decision: Rest");
        }   
    }
}
