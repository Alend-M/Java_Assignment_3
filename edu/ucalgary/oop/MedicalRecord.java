package edu.ucalgary.oop;
//*javac -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" eduucalgary\oop\MedicalRecordTest.java*/
//java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore edu.ucalgary.oop.MedicalRecordTest
public class MedicalRecord {
    private Location location; 
    private String treatmentDetails;
    private String dateOfTreatment; 

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) throws IllegalArgumentException{
        String regex = "\\d{4}-\\d{2}-\\d{2}";
        if (!dateOfTreatment.matches(regex)) {
            throw new IllegalArgumentException("Invalid date format. Expected format is YYYY-MM-DD.");
        }
        this.location = location;
        this.treatmentDetails = new String(treatmentDetails);
        this.dateOfTreatment = new String(dateOfTreatment);
    }

     
    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    
    public String getTreatmentDetails() {
        return this.treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = new String(treatmentDetails);
    }

   
    public String getDateOfTreatment() {
        return this.dateOfTreatment;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        String regex = "\\d{4}-\\d{2}-\\d{2}";
    if (!dateOfTreatment.matches(regex)) {
        throw new IllegalArgumentException("Invalid date format. Expected format is YYYY-MM-DD.");
    }
        this.dateOfTreatment = new String(dateOfTreatment);
    }
}
