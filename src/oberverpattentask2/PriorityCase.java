/*
* A hospital waiting room uses a ticketing system to manage patients. It works as follows:
*On arrival, new patients take a numbered ticket from the front desk and then wait. The ticket 
*numbers run incrementally. When a doctor becomes available the current number is called out 
*to all waiting patients. The patient with that number then takes their turn to see the doctor.
 */
package oberverpattentask2;

/**
 *
 * @author 92019124 and Computer power plus
 */
import java.util.Observable;
import java.util.Observer;

public class PriorityCase implements Observer{
    
    // mandatory method because implements Observer
    public void update(Observable mySubject, Object calledNumber) {

        System.out.println("Hi, i am a priority case. I will see the doctor first instead.\n");
        
        // now decrement the Subject's number counter, so the waiting patient gets called next
        TicketSystem subjectTicketSys = (TicketSystem) mySubject;
        subjectTicketSys.decrementTicketNumber();
    }
}