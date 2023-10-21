package Java;
import java.time.LocalDateTime;

public class Immigrant {
    
    private String name;
    private int aNumber;
    private LocalDateTime dob;
    private String address;
    //Constructors
    public Immigrant() {
        this.name = "John Doe";
        this.aNumber = 12345;
        this.dob = LocalDateTime.of(2023, 04, 24 ,14, 33, 00);
        this.address = "1234 Fillername Street";
    }
    //Getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getANumber() {
        return this.aNumber;
    }

    public void setANumber(int aNumber) {
        this.aNumber = aNumber;
    }

    public LocalDateTime getDOB() {
        return this.dob;
    }

    public void setDOB(LocalDateTime dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
