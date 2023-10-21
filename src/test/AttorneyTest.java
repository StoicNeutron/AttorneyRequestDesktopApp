package test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import Java.Attorney;
import Java.Immigrant;
/**
 * @author Nash Leaptrot
 */
public class AttorneyTest {
    @Test
    @SuppressWarnings("deprecation")
   public void attorneyTest() {
        Attorney general = new Attorney();
        assertNotNull(general);
        assertThat(general.getName(), is("Mr. Law"));
        assertThat(general.getContactInfo(), is("(703) 123-1234"));
        assertNotNull(general.getClients());
        //now test setters
        general.setName("Ms. Judge");
        general.setContactInfo("goodlawyer@gmail.com");
        general.addClient(new Immigrant());
        assertThat(general.getName(), is("Ms. Judge"));
        assertThat(general.getContactInfo(), is("goodlawyer@gmail.com"));
        assertThat(general.getClients().getFirst().getName(), is("John Doe"));
   }
}
