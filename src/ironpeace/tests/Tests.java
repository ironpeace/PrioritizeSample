package ironpeace.tests;

import ironpeace.DoubleGetterImpl;
import ironpeace.Model;
import ironpeace.StringGetterImpl;
import ironpeace.common.Prioritize;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class Tests extends TestCase {

	private List<Model> models1 = new ArrayList<Model>();
	
	protected void setUp(){
		models1.add(new Model("20130601", 20));
		models1.add(new Model("20130701", 20));
		models1.add(new Model("20130701", 10));
	}
	
	public void testPrioritizeByString_Size(){
		List<Model> prioritized = Prioritize.byString(models1, new StringGetterImpl());
		assertEquals(2, prioritized.size());
	}

	public void testPrioritizeByString_Val(){
		List<Model> prioritized = Prioritize.byString(models1, new StringGetterImpl());
		assertEquals("20130701", prioritized.get(0).getText());
	}
	
	public void testPrioritizeByNumber_Size(){
		List<Model> prioritized = Prioritize.byDouble(models1, new DoubleGetterImpl());
		assertEquals(2, prioritized.size());
	}

	public void testPrioritizeByNumber_Val(){
		List<Model> prioritized = Prioritize.byDouble(models1, new DoubleGetterImpl());
		assertEquals(20.0, prioritized.get(0).getNumber());
	}

}
