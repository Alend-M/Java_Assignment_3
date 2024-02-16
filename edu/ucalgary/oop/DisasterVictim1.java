package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private ArrayList<MedicalRecord> medicalRecords = new ArrayList<>();
    private ArrayList<FamilyRelation> familyConnections = new ArrayList<>();
    private String ENTRY_DATE;
    private ArrayList<Supply> personalBelongings = new ArrayList<>();
    private String gender;
    private static int counter = 0; // Make counter stastic

    public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException{
        this.firstName = firstName;
        Pattern entry_date_pat = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
        Matcher myMatcher = entry_date_pat.matcher(ENTRY_DATE);
        if(myMatcher.find()) {
            this.ENTRY_DATE = ENTRY_DATE;
        }
        else {
            throw new IllegalArgumentException();
        }
        this.ASSIGNED_SOCIAL_ID = counter++; // Assign and increment counter
    }

    // All other existing methods remain unchanged

    // Added missing getter for counter
    public static int getCounter() { // Make getter static
        return counter; 
    }

    // Removed setter for ASSIGNED_SOCIAL_ID as it's not in the UML diagram
}
