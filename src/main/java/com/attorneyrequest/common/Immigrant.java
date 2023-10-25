package com.attorneyrequest.common;

import java.time.LocalDateTime;

/**
 * @author Nash Leaptrot
 */
public class Immigrant {
    
    private String firstName;
    private String lastName;
    private String aNumber;
    private LocalDateTime dob;
    private String countryOfBirth;
    private String address;
    private String phoneNumber;
    private String email;
    
    /**
     * Default constructor with null properties.
     */
    public Immigrant() {
        
    }
    
    /**
     * Constructor with all initialization.
     * @param firstName
     * @param lastName
     * @param aNumber
     * @param dob
     * @param countryOfBirth
     * @param address
     * @param phoneNumber
     * @param email 
     */
    public Immigrant(String firstName, String lastName, String aNumber, LocalDateTime dob, String countryOfBirth, String address, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.aNumber = aNumber;
        this.dob = dob;
        this.countryOfBirth = countryOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // getters and setters
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getaNumber() {
        return aNumber;
    }

    public void setaNumber(String aNumber) {
        this.aNumber = aNumber;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
