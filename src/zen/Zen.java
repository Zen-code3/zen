package zen;

import java.util.Scanner;

public class Zen {

    public static void main(String[] args) {
        Scanner ly = new Scanner(System.in);
        
        String name;
        int byear;
        
        System.out.print("Enter name: ");
        name = ly.nextLine();
        
        System.out.print("Enter Birth Year: ");
        byear = ly.nextInt();
        
        System.out.println("Hello "+name+"\nyour age is "+(2025-byear));
    }
    
}

        