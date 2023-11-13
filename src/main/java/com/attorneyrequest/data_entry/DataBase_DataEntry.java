package com.attorneyrequest.data_entry;

/**
 * This is where all the data from the UI input is store.
 * Not an actual database but the imitation of one.
 * @author Samnang Thorn
 */
public class DataBase_DataEntry {
    
    public static int idCounter = 0;
    public static String aNumber = null;
    public static String states = null;
    public static String city = null;
    public static String countryOfBirth = null;
    public static String dateOfBirth = null;
    public static String email = null;
    public static String firstName = null;
    public static String lastName = null;
    public static String phoneNUmber = null;
    public static String streetAddress = null;
    public static String zipCode = null;
    
    /**
     * Check all the variable and return the number of null variables.
     * @return number of empty variable.
     */
    public static int getCounter(){
        int count = 0;
        if(aNumber.isBlank()){
            count++;
        }
        if(states.isBlank()){
            count++;
        }
        if(city.isBlank()){
            count++;
        }
        if(countryOfBirth.isBlank()){
            count++;
        }
        if(dateOfBirth.isBlank()){
            count++;
        }
        if(email.isBlank()){
            count++;
        }
        //
        if(firstName.isBlank()){
            count++;
        }
        if(lastName.isBlank()){
            count++;
        }
        if(phoneNUmber.isBlank()){
            count++;
        }
        if(streetAddress.isBlank()){
            count++;
        }
        if(zipCode.isBlank()){
            count++;
        }
        return count;
    }
    
    /**
     * Reset the hold variable to null and counter to 0.
     */
    public static void resetDataBase(){
        aNumber = "";
        states = "";
        city = "";
        countryOfBirth = "";
        dateOfBirth = "";
        email = "";
        firstName = "";
        lastName = "";
        phoneNUmber = "";
        streetAddress = "";
        zipCode = "";
    }
}