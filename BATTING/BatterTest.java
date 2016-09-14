package BATTING;

//import static org.junit.Assert.*;
//import junit.framework.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
public class BatterTest {

	@Test
	public void whenAtBats0_1() {

		Batter batt = new Batter("Test");
		ArrayList<Integer> listOfAtBats = new ArrayList<>(Arrays.asList(0, 1));
		batt.setBasesEarned(listOfAtBats);
		double average = batt.getBattingAverage();
		Assert.assertEquals("0.500", average);
	}
}
