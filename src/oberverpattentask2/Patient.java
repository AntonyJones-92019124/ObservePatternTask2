/*
* A hospital waiting room uses a ticketing system to manage patients. It works as follows:
*On arrival, new patients take a numbered ticket from the front desk and then wait. The ticket 
*numbers run incrementally. When a doctor becomes available the current number is called out 
*to all waiting patients. The patient with that number then takes their turn to see the doctor.
 */
package oberverpattentask2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author 92019124 and Computer power plus
 */
public class Patient implements Observer{
    
    // set a backing field
    private final int patientTicketNumber;	

    // public patient to set patientTicketNumber variable to the value of newPatientTicketNumber
    public Patient(int newPatientTicketNumber) {
            patientTicketNumber = newPatientTicketNumber;
    }

    // mandatory method because implements Observer
    public void update(Observable mySubject, Object nextPatientNumber) {
        
        /*if statement if the value of nextPatientNumber is equal to the value of -
        patientTicketNumber variable then print out message with patientTicketNumber*/
        if ( (int) nextPatientNumber == patientTicketNumber) {
            System.out.println("Thanks, here is my card number " + patientTicketNumber + ". I am ready to see the doctor.\n");            
        }
    }
}
