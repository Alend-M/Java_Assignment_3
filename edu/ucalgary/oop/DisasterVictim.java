package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private List<MedicalRecord> medicalRecords;
    private List<FamilyRelation> familyConnections;
    private String ENTRY_DATE;
    private List<Supply> personalBelongings;
    private String gender;
    private int counter;

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
    public List<MedicalRecord> getMedicalRecords() {
        return this.medicalRecords;
    }
    public String getENTRY_DATE() {
        return this.ENTRY_DATE;
    }
    public int getASSIGNED_SOCIAL_ID() {
        return this.ASSIGNED_SOCIAL_ID;
    }
    public List<Supply> getPersonalBelongings() {
        return this.personalBelongings;
    }
    public List<FamilyRelation> getFamilyConnections() {
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
    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }
    public void setPersonalBelongings(List<Supply> supplies) {
        this.personalBelongings = supplies;
    }
    public void setFamilyConnections(List<FamilyRelation> familyConnections) {
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
}
