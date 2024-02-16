package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private static int counter;

    public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException{
        this.firstName = firstName;
        this.ASSIGNED_SOCIAL_ID = counter;
        counter++;
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
    public MedicalRecord[] getMedicalRecords() {
        return this.medicalRecords;
    }
    public String getEntryDate() {
        return this.ENTRY_DATE;
    }
    public int getAssignedSocialID() {
        return this.ASSIGNED_SOCIAL_ID;
    }
    public Supply[] getPersonalBelongings() {
        return this.personalBelongings;
    }
    public FamilyRelation[] getFamilyConnections() {
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
    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }
    public void setPersonalBelongings(Supply[] supplies) {
        this.personalBelongings = supplies;
    }
    public void setFamilyConnections(FamilyRelation[] familyConnections) {
        this.familyConnections = familyConnections;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void addPersonalBelonging(Supply supply) {
        if (this.personalBelongings == null) {
            this.personalBelongings = new Supply[]{supply};
        } else {
            Supply[] newArr = Arrays.copyOf(this.getPersonalBelongings(), this.getPersonalBelongings().length+1);
            newArr[newArr.length-1] = supply;
            this.personalBelongings = newArr;
        }
    }
    public void removePersonalBelonging(Supply supply) {
        int indexToRemove = -1;
        for (int i = 0; i < this.getPersonalBelongings().length; i++) {
            if (this.getPersonalBelongings()[i].equals(supply)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            Supply[] newArray = new Supply[this.getPersonalBelongings().length - 1];
            System.arraycopy(this.getPersonalBelongings(), 0, newArray, 0, indexToRemove);
            System.arraycopy(this.getPersonalBelongings(), indexToRemove + 1, newArray, indexToRemove, newArray.length - indexToRemove);
            this.personalBelongings = newArray;
        } 
    }
    public void addFamilyConnection(FamilyRelation familyConnection) {
        if (this.familyConnections == null) {
            this.familyConnections = new FamilyRelation[]{familyConnection};
        }
        else {
            FamilyRelation[] newArr = Arrays.copyOf(this.getFamilyConnections(), this.getFamilyConnections().length+1);
            newArr[newArr.length-1] = familyConnection;
            this.familyConnections = newArr;
        }
    }
    public void removeFamilyConnection(FamilyRelation familyConnection) {
        int indexToRemove = -1;
        for (int i = 0; i < this.getFamilyConnections().length; i++) {
            if (this.getFamilyConnections()[i].equals(familyConnection)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            FamilyRelation[] newArray = new FamilyRelation[this.getFamilyConnections().length - 1];
            System.arraycopy(this.getFamilyConnections(), 0, newArray, 0, indexToRemove);
            System.arraycopy(this.getFamilyConnections(), indexToRemove + 1, newArray, indexToRemove, newArray.length - indexToRemove);
            this.familyConnections = newArray;
        } 
    }
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        if (this.medicalRecords == null) {
            this.medicalRecords = new MedicalRecord[]{medicalRecord};
        }
        else {
            MedicalRecord[] newArr = Arrays.copyOf(this.getMedicalRecords(), this.getMedicalRecords().length+1);
            newArr[newArr.length-1] = medicalRecord;
            this.medicalRecords = newArr;
        }
    }
}
