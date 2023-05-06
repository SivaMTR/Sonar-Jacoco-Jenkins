package TestFeatures;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import AppFeatures.MessageBuilder;

public class TestMessageBuilder {
	
	@Test
	public void testNameMkyong() {
		MessageBuilder obj = new MessageBuilder();
		assertEquals("Hello mkyong",obj.getMessage("mkyong"));
	}

}
