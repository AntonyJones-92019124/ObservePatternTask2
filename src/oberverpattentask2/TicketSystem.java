/*
* A hospital waiting room uses a ticketing system to manage patients. It works as follows:
*On arrival, new patients take a numbered ticket from the front desk and then wait. The ticket 
*numbers run incrementally. When a doctor becomes available the current number is called out 
*to all waiting patients. The patient with that number then takes their turn to see the doctor.
 */
package oberverpattentask2;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author 92019124 and Computer power plus
 */
public class TicketSystem extends Observable{
 
    // set some backing fields
    private ArrayList<Observer> observers;
    private int currentTicketNumber;
    
    // ctor
    public TicketSystem() {
            super();
            // set some defaults
            currentTicketNumber = 231;//First patient ticket number set to the value of 231
            observers = new ArrayList<Observer>(){};//Create arrayList for observers/Patients
    }

    public void alertNextPatient() {

        setChanged();
        notifyObservers(this, currentTicketNumber);
        currentTicketNumber ++;//increment currentTicketNumber 231 by 1
    }
    
    public void decrementTicketNumber(){
        currentTicketNumber--;//decrement the currentTicketNumber value by 1 for priority patients
    }
    
    //NotfiyObserver/Patients next to be seen ticket number value
    public void notifyObservers(Observable observable, Object patientToBeSeenNumber) {
            System.out.println("Notifying all waiting patients. Calling patient number " + (int) patientToBeSeenNumber + "?");
             for (Observer ob : observers) {
                 ob.update(observable, patientToBeSeenNumber);
             }
    }
    
    //registerObservers method to add Obeservers/Patients to the ArrayList
    public void registerObserver(Observer observer) {
             observers.add(observer);
    }
    
    //removeObservers/Patients from arrayList method
    public void removeObserver(Observer observer) {
             observers.remove(observer);
    }
}