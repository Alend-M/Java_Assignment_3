package edu.ucalgary.oop;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReliefService{
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService( Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, 
    String infoProvided, Location lastKnownLocation){
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public void setInquirer( Inquirer inquirer){
        this.inquirer = inquirer;
    }

    public void setMissingPerson( DisasterVictim missingPerson){
        this.missingPerson = missingPerson;
    }

    public void setDateOfInquiry(String dateOfInquiry) throws IllegalArgumentException{
        if (dateOfInquiry.matches("\\d{4}-\\d{2}-\\d{2}")) {
            this.dateOfInquiry = dateOfInquiry;
        }
        else{
            throw new IllegalArgumentException("Invalid date format: " + dateOfInquiry);
        }
    }


    public void setInfoProvided( String infoProvided){
        this.infoProvided = infoProvided;
    }

    public void setLastKnownLocation(Location lastKnownLocation){
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer(){
        return inquirer;
    }

    public DisasterVictim getMissingPerson(){
        return missingPerson;
    }

    public String getDateOfInquiry(){
        return dateOfInquiry;
    }

    public String getInfoProvided(){
        return infoProvided;
    }

    public Location getLastKnownLocation(){
        return lastKnownLocation;
    }

    public String getLogDetails(){
        Inquirer inquirer = getInquirer();
        DisasterVictim missingPerson = getMissingPerson();
        String dateOfInquiry = getDateOfInquiry();
        String infoProvided = getInfoProvided();
        Location lastKnownLocation = getLastKnownLocation();

        return "Inquirer: " + inquirer.getFirstName() +", "+
               "Missing Person: " + missingPerson.getFirstName() + ", "+
               "Date of Inquiry: " + dateOfInquiry +", "+ 
               "Info Provided: " + infoProvided +", "+
               "Last Known Location: " + lastKnownLocation.getName();
    }
}
