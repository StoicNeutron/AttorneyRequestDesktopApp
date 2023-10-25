package com.attorneyrequest.common;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.attorneyrequest.common.Case;
import com.attorneyrequest.common.StatusCode;
import java.time.LocalDateTime;

import org.junit.jupiter.api.*;

/**
 * @author Samnang Thorn
 */
class CaseTest {
    
    @Test
    @DisplayName("Test getters and setters")
    void testGetterSetter(){
        Case myCase = new Case();
        // testing getters
        assertEquals(myCase.getCaseID(), "TO DO");
        assertNotNull(myCase.getStartDate());
        assertEquals(myCase.getStatus().getStatusCode(), StatusCode.PROCESSING);
        // testing setters
        myCase.setCaseID("I changed it!");
        myCase.setLastEditDate(LocalDateTime.now());
        myCase.getStatus().setStatusCode(StatusCode.APPROVED);
        assertEquals(myCase.getCaseID(), "I changed it!");
        assertNotNull(myCase.getLastEditDate());
        assertEquals(myCase.getStatus().getStatusCode(), StatusCode.APPROVED);
    }
}
