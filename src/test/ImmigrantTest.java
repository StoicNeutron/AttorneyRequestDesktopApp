package test;
import static org.junit.Assert.*;

import java.time.LocalDateTime;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import Java.Immigrant;
public class ImmigrantTest {
    @Test
    @SuppressWarnings("deprecation")
   public void test()
   {
      Immigrant alien = new Immigrant();
      assertNotNull(alien);
      assertThat(alien.getName(), is("John Doe"));
      assertThat(alien.getANumber(), is(12345));
      assertThat(alien.getDOB().toString(), is("2023-04-24T14:33"));
      assertThat(alien.getAddress(), is("1234 Fillername Street"));
      //now test setters
      alien.setName("Jane Doe");
      alien.setANumber(98765);
      alien.setDOB(LocalDateTime.of(1984, 03, 12, 04, 03, 00));
      alien.setAddress("Nowhere, Notaplace");
      assertThat(alien.getName(), is("Jane Doe"));
      assertThat(alien.getANumber(), is(98765));
      assertThat(alien.getDOB().toString(), is("1984-03-12T04:03"));
      assertThat(alien.getAddress(), is("Nowhere, Notaplace"));

   }
}
