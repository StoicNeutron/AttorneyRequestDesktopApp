package com.attorneyrequest.data_entry;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.attorneyrequest.common.Case;
import com.attorneyrequest.common.Immigrant;

/**
 * @author Samnang Thorn
 */
class DataEntryWorkflowTest {

    @Test
    void testGetCaseFile() {
        // given
        Case mockCase = new Case();
        mockCase.setImmigrant(new Immigrant());
        mockCase.setCaseID("777");
        DataEntryWorkflow.setCaseFile(mockCase);
        // then
        assertEquals(mockCase, DataEntryWorkflow.getCaseFile());
    }

    @Test
    void testRunDataEntryWorkFlow() {
        // when
        DataEntryWorkflow.runDataEntryWorkFlow();
        // then
        assertNotNull(DataEntryWorkflow.getCaseFile());
    }

    @Test
    void testSetCaseFile() {
        // given
        Case mockCase = new Case();
        mockCase.setImmigrant(new Immigrant());
        mockCase.setCaseID("777");
        // when
        DataEntryWorkflow.setCaseFile(mockCase);
        // then
        assertNotNull(DataEntryWorkflow.getCaseFile());
    }
}
