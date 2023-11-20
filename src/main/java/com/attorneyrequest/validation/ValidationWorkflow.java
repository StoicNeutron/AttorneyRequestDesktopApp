package com.attorneyrequest.validation;

import com.attorneyrequest.common.Case;
import com.attorneyrequest.data_entry.DataEntryWorkflow;

public class ValidationWorkflow {
    private static Case caseFile = null;
    private static DataEntryWorkflow dataFlow = new DataEntryWorkflow();

    public ValidationWorkflow()
    {
        caseFile = new Case();
    }

    public static Case getValidation()
    {
        return dataFlow.getCaseFile();
    }

    public void setCaseFile(Case caseFile)
    {
        this.caseFile = caseFile;
    }
}
