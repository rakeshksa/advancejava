package in.jspider.crud;

import java.util.*;

public class TimeToWords {
    
    // Helper method to convert number to words
    private static String convertToWord(int number) {
        String[] words = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", 
             "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", 
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
            "twenty six", "twenty seven", "twenty eight", "twenty nine"
        };
        if (number < 30) {
            return words[number];
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input time in HH:mm format
        System.out.print("Enter time (HH:mm): ");
        String input = sc.nextLine();
        
        // Split the input into hours and minutes
        String[] timeParts = input.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        
        // Convert hours and minutes to words
        String hourWord = convertToWord(hours % 12); // Handle 24-hour format
        String minuteWord = convertToWord(minutes);
        
        // Special handling for exact hour (like 8:00 -> eight o'clock)
        if (minutes == 0) {
            System.out.println(hourWord + " o'clock");
        } else {
            System.out.println(hourWord + " " + minuteWord);
        }
    }
}

