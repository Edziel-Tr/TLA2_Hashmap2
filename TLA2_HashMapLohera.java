
package com.mycompany.lohera;

import java.util.*;

public class TLA2_HashMapLohera {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Add at least five student names and their corresponding scores
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);
        studentScores.put("Diana", 88);
        studentScores.put("Ethan", 95);

      

        System.out.print("Enter a student's name to retrieve their score: ");
        String name = scan.nextLine();

        // Retrieve and print the student's score
        if (studentScores.containsKey(name)) {
            System.out.println(name + "'s score: " + studentScores.get(name));
        } else {
            System.out.println("Student not found.");
        }

        // Allow the user to update a student's score
        System.out.print("Enter a student's name to update their score: ");
        String updateName = scan.nextLine();
        
        if (studentScores.containsKey(updateName)) {
            System.out.print("Enter the new score for " + updateName + ": ");
            int newScore = scanner.nextInt();
            studentScores.put(updateName, newScore);
            System.out.println(updateName + "'s score has been updated to: " + newScore);
        } else {
            System.out.println("Student not found.");
        }

        // Print out all the student names along with their scores
        System.out.println("\nAll student scores:");
        for (String student : studentScores.keySet()) {
            System.out.println(student + ": " + studentScores.get(student));
        }

       
    }
}
    

