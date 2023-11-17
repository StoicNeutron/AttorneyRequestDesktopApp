package com.attorneyrequest.verification;
import com.attorneyrequest.common.Case;
import com.attorneyrequest.common.Status;
import com.attorneyrequest.common.StatusCode;
import java.util.Random;
import com.attorneyrequest.common.Attorney;
/**
 * This is the workflow class of Verification, AKA: business logic of Verification.
 * @author Thierry
 */
public class VerificationWorkflow {
    //getCaseFile
    static Random rand = new Random();
    static String output = "";
    static String s = "";

    private static Case caseFile = null;
    private static Status status = null;
    private static StatusCode accept = StatusCode.APPROVED;
    private static StatusCode deny = StatusCode.REJECT;


    public static String runVerificationWorkFlow(){
        Case c = new Case();
        c.setCaseID("123");

        //generates random choice
        int p = rand.nextInt(3);
        int n = rand.nextInt(2);
        int caseNum = rand.nextInt(99);

        //all attorneys to choose from
        Attorney[] attorneys = new Attorney[4];
        attorneys[0] = new Attorney();
        attorneys[1] = new Attorney();
        attorneys[2] = new Attorney();
        attorneys[3] = new Attorney();


        attorneys[0].setName("Jill Lanes"); 
        attorneys[1].setName("Richard Chan"); 
        attorneys[2].setName("Nina Davis"); 
        attorneys[3].setName("Dave Lopez");

        //options to either accept or deny cases
        StatusCode[] status = {accept, deny};

        //get the casefile off the workflow
        //caseFile = DataEntryWorkflow.getCaseFile();
        
        caseFile = c;

        //Randomly set the attorney to one of the attorneys
        //System.out.print("p: " + p);
        caseFile.setAttorney(attorneys[p]);

        //Randomly set the status to either accept or deny
        caseFile.setStatus(new Status(status[n]));
        if(n == 0){
            s = "ACCEPTED.";
        }else{
            s = "DENIED.";
        }

       output = "CaseID: " + caseFile.getCaseID() + " was verified by " + attorneys[p].getName() + ". The case was: " + s;
       output = "CaseID: " + caseNum + " was verified by " + attorneys[p].getName() + ". The case was: " + s;
       return output;
    }

    public static String outputString(){
        return output;
    }


    

    
    



}
