import static org.junit.Assert.*;
import java.awt.List;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
public class InserterTest {
 Inserter inserter;
 @Before
 public void setUp() throws Exception {
	 inserter =new Inserter();
 }
 @Test
 // Add 3 elements to the list of Integers
 public void testListAdder() {
  ArrayList<Integer> l = (ArrayList<Integer>) inserter.listAdder();
  int expected = 3;
  int actual = l.size();
  assertEquals(actual, expected);
 }
 @Test
 // get a list of letters from the alp..
 // these letters should be small
 public void testCreateAlpha() {
  ArrayList<String> alpha = inserter.createAlpha();
  String a = alpha.get(0);
  String expected = "a";
  
  assertEquals(a, expected);
  
 }

 
}