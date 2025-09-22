import java.util.Scanner;

public class FootballPlayer {
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

        // Printing Player details without height and weight conversion
        System.out.println(" ");
        System.out.println("Printing Player details without height and weight conversion... ");
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "m");
        System.out.println("Weight: " + weight + "lbs");
        System.out.println("Jersey Number: " + jerseyNumber);

        // Conversion of weight and height
        final float pounds = 0.45359237f;
        final int meters = 100;

        float new_weight = weight * pounds;
        float new_height = height * meters;
        float rounded_weight = (int) new_weight;
        System.out.println(new_weight);
        System.out.println(rounded_weight);

        // Printing Player details with height and weight conversion
        System.out.println(" ");
        System.out.println("Printing Player details with height and weight conversion... ");
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + new_height + "cm");
        System.out.println("Weight: " + rounded_weight + "kg");
        System.out.println("Jersey Number: " + jerseyNumber);

        // Increment and Decrement of player statistics
        int new_age = age;
        int new_jerseyNumber = jerseyNumber;
        System.out.println(" ");
        System.out.println("Printing player statistics after one season...");
        System.out.println("Age: " + ++new_age);
        System.out.println("Jersey number: " + --new_jerseyNumber);    
        
        // Checking Eligibility
        System.out.println(" ");
        System.out.println("Checking Eligibility... ");
        boolean isOfAge = age >= 18 && age <= 35;
        boolean isOfWeight = rounded_weight < 90;
        boolean isEligible = isOfAge && isOfWeight;
        
        if (isEligible)
            System.out.println("Eligible");
        
        
        boolean isUnderAgeOrOverWeight = age < 18 || rounded_weight >= 90;
        if(isUnderAgeOrOverWeight)
        {
            System.out.println("Player has a problem (either too young or too heavy)");
        }

        if(!isEligible)
            System.out.println("Not Eligible");
        
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

        // Player Allocation absed on jersey number with Switch Cases
        System.out.println(" ");
        System.out.println("Printing player position...");
        switch (jerseyNumber) 
        {
            case 1:
                System.out.println("Player is a Goalkepper");
                break;
            case 2:
                System.out.println("Player is a defender");
                break;
            case 6:
                System.out.println("Player is a midfielder");
                break;
            case 7:
                System.out.println("Player is a winger");
                break;
            case 9:
                System.out.println("Player is a Striker");
                break;
            case 10:
                System.out.println("PLayer is a Playmaker");
                break;
            case 11: 
                System.out.println("Player is a winger");
                break;
            case 5:
                System.out.println("Player is a defender");
                break;
            case 8:
                System.out.println("Player is a midfielder");
                break;
            default:
                System.out.println("Player position not known");
                break;
        }

        // Player Allocation based with unwanted fall-throughs
        System.out.println(" ");
        System.out.println("Printing player position with unwanted Fall-Throughs...");
        switch (jerseyNumber) 
        {
            case 1:
                System.out.println("Player is a Goalkepper");
                break;
            case 2:
                System.out.println("Player is a defender");
            case 6:
                System.out.println("Player is a midfielder");
            case 7:
                System.out.println("Player is a winger");
            case 9:
                System.out.println("Player is a Striker");
                break;
            case 10:
                System.out.println("PLayer is a Playmaker");
                break;
            case 11: 
                System.out.println("Player is a winger");
                break;
            case 5:
                System.out.println("Player is a defender");
                break;
            case 8:
                System.out.println("Player is a midfielder");
                break;
            default:
                System.out.println("Player position not known");
                break;
        }

        // Player Allocation based with useful fall-throughs
        System.out.println(" ");
        System.out.println("Printing player position with useful Fall-Throughs...");
        switch (jerseyNumber) 
        {
            case 1:
                System.out.println("Player is a Goalkepper");
                break;
            case 2:
            case 5:
                System.out.println("Player is a defender");
                break;
            case 6:
            case 8:
                System.out.println("Player is a midfielder");
                break;
            case 7:
            case 11: 
                System.out.println("Player is a winger");
                break;
            case 9:
                System.out.println("Player is a Striker");
                break;
            case 10:
                System.out.println("PLayer is a Playmaker");
                break;
            default:
                System.out.println("Player position not known");
                break;
        }

        // Nested Ifs
        System.out.println(" ");
        System.out.println("Printing player selection... ");

        if(prime)
        {
            if(rounded_weight < 80)
            {
                System.out.println("In starting lineup");
            }
        }
        else
        {
            System.out.println("On the bench");
        }

        // Conditional Expresision
        System.out.println(" ");
        System.out.println("Printing Playing status... ");
        if(isEligible){
            System.out.println("Play");
        }
        else{
            System.out.println("Rest");
        }
    }
}
