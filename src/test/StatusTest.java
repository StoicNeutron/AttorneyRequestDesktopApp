package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Java.Status;
import Java.StatusCode;

/**
 * @author Samnang Thorn
 */
class StatusTest {

    @Test
    @DisplayName("null input for constructor should throw an Exception.")
    void testConstructor(){
        assertThrowsExactly(IllegalArgumentException.class, ()->{new Status(null);});
    }

    @Test
    @DisplayName("getStatus() should return \"Processing\"")
    void testGetStatusAndStatusCode(){
        Status myStatusObj = new Status(StatusCode.PROCESSING);
        assertEquals(myStatusObj.getStatus(), "Processing");
        assertEquals(myStatusObj.getStatusCode(), StatusCode.PROCESSING);
    }

    @Test
    @DisplayName("setStatus()always make sure only 1 of it variable is true")
    void testSetStatus(){
        Status myStatusObj = new Status(StatusCode.PROCESSING);
        myStatusObj.setStatusCode(StatusCode.APPROVED);
        assertEquals(myStatusObj.getStatusCode(), StatusCode.APPROVED);
    }
}
