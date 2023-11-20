package com.attorneyrequest.common;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.*;

/**
 * @author Samnang Thorn
 */
class CaseTest {
    
    @Test
    @DisplayName("Test getters and setters")
    void testGetterSetter(){
        // given
        Case myCase = new Case();
        myCase.setCaseID("777");
        myCase.setStatus(new Status(StatusCode.PROCESSING));
        LocalDateTime time = LocalDateTime.now();
        Immigrant mockImmigrant = new Immigrant("Milk", "Reap", "A12345", time, "Jupiter", "GMU 321", "000111222", "meh@gmu.edu");
        myCase.setImmigrant(mockImmigrant);
        myCase.setSubmitDate(time);
        myCase.setLastEditDate(time);
        myCase.setStartDate(time);
        Attorney mockAttorney = new Attorney();
        myCase.setAttorney(mockAttorney);
        // then
        // testing getters
        assertEquals("777", myCase.getCaseID());
        assertEquals(StatusCode.PROCESSING, myCase.getStatus().getStatusCode());
        assertEquals(mockImmigrant, myCase.getImmigrant());
        assertEquals(time, myCase.getSubmitDate());
        assertEquals(time, myCase.getLastEditDate());
        assertEquals(time, myCase.getStartDate());
        assertEquals(mockAttorney, myCase.getAttorney());
        // testing setters
        // when
        myCase.setCaseID("888");
        myCase.setStatus(new Status(StatusCode.APPROVED));
        myCase.setImmigrant(null);
        LocalDateTime time2 = LocalDateTime.of(2020, 12, 1, 6, 6, 6);
        myCase.setSubmitDate(time2);
        myCase.setLastEditDate(time2);
        myCase.setStartDate(time2);
        myCase.setAttorney(null);
        // then
        assertEquals("888", myCase.getCaseID());
        assertEquals(StatusCode.APPROVED, myCase.getStatus().getStatusCode());
        assertEquals(null, myCase.getImmigrant());
        assertEquals(time2, myCase.getSubmitDate());
        assertEquals(time2, myCase.getLastEditDate());
        assertEquals(time2, myCase.getStartDate());
        assertEquals(null, myCase.getAttorney());
    }
}
