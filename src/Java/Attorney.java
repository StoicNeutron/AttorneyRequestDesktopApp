package Java;

import java.util.LinkedList;

/**
 * @author Nash Leaptrot
 */
public class Attorney {
    private String name;
    private String contactInfo;
    private LinkedList<Immigrant> clients;

    public Attorney() {
        this.name = "Mr. Law";
        this.contactInfo = "(703) 123-1234";
        this.clients = new LinkedList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public LinkedList<Immigrant> getClients() {
        return this.clients;
    }

    public void addClient(Immigrant immigrant) {
        clients.add(immigrant);
    }
}
