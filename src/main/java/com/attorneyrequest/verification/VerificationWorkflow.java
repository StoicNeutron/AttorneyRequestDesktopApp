package com.attorneyrequest.verification;
import com.attorneyrequest.validation.ValidationWorkflow;
import com.attorneyrequest.common.Case;
import com.attorneyrequest.common.Status;
import com.attorneyrequest.common.StatusCode;
import java.util.Random;
import com.attorneyrequest.common.Attorney;
/**
 * This is the workflow class of Verification, AKA: business logic of Verification.
 * @author Thierry Manapsal
 */
public class VerificationWorkflow {
    //getCaseFile
    static Random rand = new Random();
    static String output = "";
    static String s = "";

    private static StatusCode accept = StatusCode.APPROVED;
    private static StatusCode deny = StatusCode.REJECT;

    public static String runVerificationWorkFlow(){
        //get the casefile off the validation workflow
        Case c = ValidationWorkflow.getValidation();

        //generates random choice to simulate an attorney's choice
        int p = rand.nextInt(3);
        int n = rand.nextInt(2);

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

        //Simulates setting the attorney to one of the attorneys
        c.setAttorney(attorneys[p]);

        //Randomly set the status to either accept or deny
        c.setStatus(new Status(status[n]));
        if(n == 0){
            s = "ACCEPTED.";
        }else{
            s = "DENIED.";
        }

       output = "CaseID: " + c.getCaseID() + " was verified by " + attorneys[p].getName() + ". The case was: " + s;
       return output;
    }

    public static String outputStatus(){
        return s;
    }

}
