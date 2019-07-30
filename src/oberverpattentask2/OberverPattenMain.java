/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oberverpattentask2;


/**
 *
 * @author 92019124
 */
public class OberverPattenMain {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
               
        TicketSystem ticketSystem = new TicketSystem();
        
        // register the observers allocate patient ticket number values to new patients 
        ticketSystem.registerObserver(new Patient(231));
        ticketSystem.registerObserver(new Patient(232));
        ticketSystem.registerObserver(new Patient(233));
        ticketSystem.registerObserver(new Patient(234));
        ticketSystem.registerObserver(new Patient(235));
        
        // register priority case
        PriorityCase priorityCase = new PriorityCase();
        ticketSystem.registerObserver(priorityCase);
        
        //alertNextPatient() should issue notification to all patients.
        ticketSystem.alertNextPatient();
        
        //call method removeObserver from ticketingSystem for priority case
        ticketSystem.removeObserver(priorityCase);
        
        //alertNextPatient() should issue a notification to all patients
        ticketSystem.alertNextPatient();
        //alertNextPatient() should issue a notification to all patients
        ticketSystem.alertNextPatient(); 
        //alertNextPatient() should issue a notification to all patients
        ticketSystem.alertNextPatient();
        //alertNextPatient() should issue a notification to all patients
        ticketSystem.alertNextPatient();
        
    }
}


