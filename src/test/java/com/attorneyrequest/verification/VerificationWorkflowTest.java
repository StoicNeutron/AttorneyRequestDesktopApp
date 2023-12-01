package com.attorneyrequest.verification;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


import com.attorneyrequest.validation.ValidationWorkflow;

/**
 * @author Thierry Manapsal
 */

class VerificationWorkflowTest {
   
    @Test
    void testVerificationWorkflow(){
        if(ValidationWorkflow.getValidation() != null)
            assertNotNull(VerificationWorkflow.runVerificationWorkFlow());
    }

    @Test
    void testoutputStatus(){
        //check if output is accepted or not
        if(VerificationWorkflow.outputStatus().equals("ACCEPTED.")){
            System.out.println("Case accepted");
        }else if(VerificationWorkflow.outputStatus().equals("DENIED.")){
            System.out.println("Case was denied.");
        }else{
            System.out.println("Case not valid.");
        }
    }

    @Test
    void testAttorney() {
        //run the verification workflow and check if case object is there or not
        if(ValidationWorkflow.getValidation() != null){
            String output = VerificationWorkflow.runVerificationWorkFlow();

            //look at attorney's name from the result
            String[] outputParts = output.split(" ");
            String attorneyName = outputParts[outputParts.length - 6] + " " + outputParts[outputParts.length - 5];

            //Expected names
            String[] expectedAttorneys = {"Jill Lanes", "Richard Chan", "Nina Davis", "Dave Lopez"};

            //checks if the assigned attorney's name is in the list of names
            boolean nameMatch = false;
            /*
            for (String name : expectedAttorneys) {
                if (attorneyName.equals(name)) {
                    nameMatch = true;
                    break;
                }
            }*/
            for(int i = 0; i < expectedAttorneys.length; i++){
                System.out.println(expectedAttorneys[i].toString());
                System.out.println(attorneyName.toString());

                if(attorneyName.equals(expectedAttorneys[i])){
                    nameMatch = true;
                    //Asserts that attorney's name is one of the expected names
                    assertTrue(nameMatch,"Assigned attorney's name should be one of the predefined attorneys");
                    break;
                }
            }
        }
    }
}
