package com.attorneyrequest.common;

import java.time.LocalDateTime;

/**
 * @autor Samnang Thorn
 */
public class Case{
    
    private String caseID = null;
    private LocalDateTime startDate = null;
    private LocalDateTime submitDate = null;
    private LocalDateTime lastEditDate = null;
    //private Immigrant immigrant = null;
    //private Attorney attorney = null;
    private Status status = null;

    /**
     * Constructor.
     */
    public Case(){
        this.caseID = "TO DO"; // to do function generate unique case ID
        this.startDate = LocalDateTime.now();
        this.status = new Status(StatusCode.PROCESSING);
    }

    // setters and getters
    public String getCaseID() {
        return caseID;
    }

    public void setCaseID(String caseID) {
        this.caseID = caseID;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(LocalDateTime submitDate) {
        this.submitDate = submitDate;
    }

    public LocalDateTime getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(LocalDateTime lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
