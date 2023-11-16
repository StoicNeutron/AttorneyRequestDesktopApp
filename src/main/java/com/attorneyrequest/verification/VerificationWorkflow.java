package com.attorneyrequest.verification;
import com.attorneyrequest.data_entry.DataEntryWorkflow;
import com.attorneyrequest.common.Case;
import com.attorneyrequest.common.Status;
import com.attorneyrequest.common.StatusCode;
import java.util.Random;
import com.attorneyrequest.common.Attorney;

public class VerificationWorkflow {
    //getCaseFile
    static Random rand = new Random();
   

    private static Case caseFile = null;
    private static Status status = null;
    private static StatusCode accept = StatusCode.APPROVED;
    private static StatusCode deny = StatusCode.REJECT;


    public static void runVerificationWorkFlow(){
        //generates random choice
        int p = rand.nextInt(3);
        int n = rand.nextInt(1);

        //all attorneys to choose from
        Attorney[] attorneys = new Attorney[4];
        attorneys[1].setName("Jill Lanes"); 
        attorneys[2].setName("Richard Chan"); 
        attorneys[3].setName("Nina Davis"); 
        attorneys[4].setName("Dave Lopez");

        //options to either accept or deny cases
        StatusCode[] status = {accept, deny};

        //get the casefile off the workflow
        caseFile = DataEntryWorkflow.getCaseFile();

        //Randomly set the attorney to one of the attorneys
        caseFile.setAttorney(attorneys[p]);

        //Randomly set the status to either accept or deny
        caseFile.setStatus(new Status(status[n]));

       // System.out.println("CaseID: " + caseFile.getCaseID() + " was verified by " + attorneys[p].getName() + "\nThe case was: " + caseFile.getStatus()) ;
    }

    

    
    



}
