package com.attorneyrequest.verification;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.attorneyrequest.common.Attorney;
import com.attorneyrequest.common.Case;
import com.attorneyrequest.common.Immigrant;

/**
 * @author Thierry Manapsal
 */

public class VerificationWorkflowTest {
   
    @Test
    void testVerificationWorkflow(){
        assertNotNull(VerificationWorkflow.runVerificationWorkFlow());
    }

    @Test
    void testoutputStatus(){
        if(VerificationWorkflow.outputStatus().equals("ACCEPTED.")){
            System.out.println("Case accepted");
        }else if(VerificationWorkflow.outputStatus().equals("DENIED.")){
            System.out.println("Case was denied.");
        }else{
            System.out.println("Case not valid.");
        }
    }
    /*    @Test
    void testValidationWorkflow(){
      
    }
    */
}
