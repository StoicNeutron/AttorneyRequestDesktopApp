package com.attorneyrequest.common;

import java.time.LocalDateTime;

/**
 * @autor Samnang Thorn
 */
public class Case{
    
    private String caseID;
    private LocalDateTime startDate;
    private LocalDateTime submitDate;
    private LocalDateTime lastEditDate;
    private Immigrant immigrant;
    private Attorney attorney;
    private Status status;

    /**
     * Constructor.
     */
    public Case(){
        this.caseID = null;
        this.startDate = null;
        this.submitDate = null;
        this.lastEditDate = null;
        this.immigrant = null;
        this.attorney = null;
        this.status = null;
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

    public Immigrant getImmigrant() {
        return immigrant;
    }

    public void setImmigrant(Immigrant immigrant) {
        this.immigrant = immigrant;
    }
    
    public Attorney getAttorney() {
        return attorney;
    }

    public void setAttorney(Attorney attorney) {
        this.attorney = attorney;
    }
}
