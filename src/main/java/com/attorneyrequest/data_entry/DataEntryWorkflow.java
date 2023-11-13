package com.attorneyrequest.data_entry;

import com.attorneyrequest.common.Immigrant;
import com.attorneyrequest.common.Status;
import com.attorneyrequest.common.StatusCode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.attorneyrequest.common.Attorney;
import com.attorneyrequest.common.Case;

/**
 * This is the workflow class of Data Entry, AKA: business logic of DataEntry.
 * @author Samnang Thorn
 */
public class DataEntryWorkflow {

    private static Case caseFile = null;

    /**
     * Workflow function of the Data Entry, generate the case file from the user input.
     */
    public static void runDataEntryWorkFlow(){
        DataBase_DataEntry.idCounter++; // update DataBase_DataEntry idCounter
        caseFile = new Case();
        caseFile.setCaseID(genID());
        caseFile.setStartDate(LocalDateTime.now());
        caseFile.setSubmitDate(LocalDateTime.now());
        caseFile.setLastEditDate(LocalDateTime.now());
        caseFile.setImmigrant(genImmigrant());
        caseFile.setAttorney(new Attorney());
        caseFile.setStatus(new Status(StatusCode.PROCESSING));
    }

    /**
     * Helper function, Generate ID for the case object.
     * @return String ID.
     */
    private static String genID(){
        return "A" + (DataBase_DataEntry.idCounter+1) + "" + (DataBase_DataEntry.idCounter+1)*7;
    }

    /**
     * Helper function, Generate immigrant for the case object.
     * @return
     */
    private static Immigrant genImmigrant(){
        LocalDateTime dateOfBirth = null;
        try{
            dateOfBirth = LocalDateTime.parse(DataBase_DataEntry.dateOfBirth, DateTimeFormatter.ISO_DATE);
        }catch(Exception e){
            //
        }
        String address = DataBase_DataEntry.streetAddress + " " + DataBase_DataEntry.city + " " + DataBase_DataEntry.states + " " + DataBase_DataEntry.zipCode;
        return new Immigrant(
            DataBase_DataEntry.firstName,
            DataBase_DataEntry.lastName,
            DataBase_DataEntry.aNumber,
            dateOfBirth,
            DataBase_DataEntry.countryOfBirth,
            address,
            DataBase_DataEntry.phoneNUmber,
            DataBase_DataEntry.email
        );
    }

    /**
     * Getter function for caseFile.
     * @return Case object.
     */
    public static Case getCaseFile() {
        return caseFile;
    }

    /**
     * Setter function for caseFile.
     * @param caseFile
     */
    public static void setCaseFile(Case caseFile) {
        DataEntryWorkflow.caseFile = caseFile;
    }
}