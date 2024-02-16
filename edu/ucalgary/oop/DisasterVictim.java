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
    private static int counter = 0;

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
        this.ASSIGNED_SOCIAL_ID = counter++; 
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    public String getComments() {
        return this.comments;
    }
    public ArrayList<MedicalRecord> getMedicalRecords() {
        return this.medicalRecords;
    }
    public String getEntryDate() {
        return this.ENTRY_DATE;
    }
    
    public int getAssignedSocialID() {
        return this.ASSIGNED_SOCIAL_ID;
    }
    
    public ArrayList<Supply> getPersonalBelongings() {
        return this.personalBelongings;
    }
    public ArrayList<FamilyRelation> getFamilyConnections() {
        return this.familyConnections;
    }
    public String getGender() {
        return this.gender;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException {
        Pattern dateOfBirth_pat = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
        Matcher myMatcher = dateOfBirth_pat.matcher(dateOfBirth);
        if(myMatcher.find()) {
            this.dateOfBirth = dateOfBirth;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public void setMedicalRecords(ArrayList<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }
    public void setPersonalBelongings(ArrayList<Supply> supplies) {
        this.personalBelongings = supplies;
    }
    public void setFamilyConnections(ArrayList<FamilyRelation> familyConnections) {
        this.familyConnections = familyConnections;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void addPersonalBelonging(Supply supply) {
        this.personalBelongings.add(supply);
    }
    public void removePersonalBelonging(Supply supply) {
        this.personalBelongings.remove(supply);
    }
    public void addFamilyConnection(FamilyRelation familyConnection) {
        this.familyConnections.add(familyConnection);
    }
    public void removeFamilyConnection(FamilyRelation familyConnection) {
        this.familyConnections.remove(familyConnection);
    }
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecords.add(medicalRecord);
    }
    public static int getCounter() {
        return counter; 
    }
}
