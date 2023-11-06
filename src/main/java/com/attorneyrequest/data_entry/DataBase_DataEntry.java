package com.attorneyrequest.data_entry;

/**
 * This is where all the data from the UI input is store.
 * Not an actual database but the imitation of one.
 * @author Samnang Thorn
 */
public class DataBase_DataEntry {
    
    // total count of non empty variabe.
    private static int counter = 0;
    
    public static String aNumber = null;
    public static String aptSuit = null;
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
     * Getter for count.
     * @return number of non empty variable.
     */
    public static int getCounter(){
        return counter;
    }
    
    /**
     * Reset the hold variable to null and counter to 0.
     */
    public static void resetDataBase(){
        counter = 0;
        aNumber = null;
        aptSuit = null;
        city = null;
        countryOfBirth = null;
        dateOfBirth = null;
        email = null;
        firstName = null;
        lastName = null;
        phoneNUmber = null;
        streetAddress = null;
        zipCode = null;
    }
}
