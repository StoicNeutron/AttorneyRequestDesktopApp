package Java;

/**
 * @author Samnang Thorn
 */
public class Status {
    
    private boolean approved = false;
    private boolean reject = false;
    private boolean processing = false;

    /**
     * Contructor.
     * @param statusCode from StatusCode enum.
     */
    public Status(StatusCode statusCode){
        // check for null input
        if(statusCode == null){
            throw new IllegalArgumentException("Status code can not be NULL.", null);
        }
        switch (statusCode){
            case APPROVED:
                this.approved = true;
                break;
            case REJECT:
                this.reject = true;
                break;
            case PROCESSING:
                this.processing = true;
                break;
        }
    }

    /**
     * Getter method.
     * @return the current status as a String.
     */
    public String getStatus(){
        if(approved){
            return "Approved";
        }else if(reject){
            return "Reject";
        }else if(processing){
            return "Processing";
        }else{
            return "Error!";
        }
    }

    /**
     * Getter method.
     * @return the current StatusCode enum which is true.
     */
    public StatusCode getStatusCode(){
        if(approved){
            return StatusCode.APPROVED;
        }else if(reject){
            return StatusCode.REJECT;
        }else if(processing){
            return StatusCode.PROCESSING;
        }else{
            // all the attribute can not be all false after the construction, thus error.
            throw new RuntimeException();
        }
    }

    /**
     * Setter method.
     * Set the current status base on the input statusCode while make sure only one status is true.
     */
    public void setStatusCode(StatusCode statusCode){
        // check for null input
        if(statusCode == null){
            throw new IllegalArgumentException("Status code can not be NULL.", null);
        }
        // reset everything to false
        this.approved = false;
        this.reject = false;
        this.processing = false;
        // set the status
        switch (statusCode){
            case APPROVED:
                this.approved = true;
                break;
            case REJECT:
                this.reject = true;
                break;
            case PROCESSING:
                this.processing = true;
                break;
        }
    }
}
