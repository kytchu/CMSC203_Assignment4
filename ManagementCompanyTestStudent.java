import static org.junit.Assert.*;

import org.junit.Test;

public class ManagementCompanyTestStudent {
	@Test
	public void testAddPropertyStringStringDoubleString() {
		ManagementCompany company = new ManagementCompany("MyCompany", "12345", 10.0);
		 Property prop1 = new Property("Lakeland", "Rockville", 3000.00, "Johnny");
	        Property prop2 = new Property("FieldGates", "Clarksburg", 1000.00, "Janny");
	        Property prop3 = new Property("Test", "City", 1500.0, "Owner");

	        assertEquals(0, company.addProperty(prop1));
	        assertEquals(-1, company.addProperty(prop2));
	        assertEquals(-2, company.addProperty(prop3));

	        // Attempt to add an extra property and check for appropriate failure (-1, -2, or whatever your logic uses)
	        int result = company.addProperty(new Property("Overflow", "City", 999.0, "Owner"));
	        assertTrue(result < 0); // Assuming negative means failure
	}

	@Test
	public void testRemoveLastProperty() {
		ManagementCompany company = new ManagementCompany("MyCompany", "12345", 10.0);
		 Property prop1 = new Property("Lakeland", "Rockville", 3000.00, "Johnny");
	     Property prop2 = new Property("FieldGates", "Clarksburg", 1000.00, "Janny");
	     company.addProperty(prop1);
	     company.addProperty(prop2);
	     company.removeLastProperty();
	     assertEquals(1, company.getProperties());
	     
	     
	}

	@Test
	public void testIsPropertiesFull() {
		// boolean full = false; --> assertFalse(company.isPropertiesFull());
		ManagementCompany company = new ManagementCompany("MyCompany", "12345", 10.0);
		assertFalse(company.isPropertiesFull());
		for(int i = 0; i < ManagementCompany.MAX_PROPERTY; i++) {
			company.addProperty(new Property("Apt" + i, "City" + i, 2000.00, "Landlord" + i));
		}
		assertTrue(company.isPropertiesFull());
	}

	@Test
	public void testGetPropertiesCount() {
		ManagementCompany company = new ManagementCompany("MyCompany", "12345", 10.0);
        assertEquals(0, company.getPropertiesCount());
        
        company.addProperty(new Property("First", "City", 1000.0, "Owner"));
        assertEquals(1, company.getPropertiesCount());
	}

	@Test
	public void testGetTotalRent() {
		ManagementCompany company = new ManagementCompany("MyCompany", "12345", 10.0);
        company.addProperty(new Property("A", "City", 1000.0, "Owner"));
        company.addProperty(new Property("B", "City", 2000.0, "Owner"));
        
        assertEquals(3000.0, company.getTotalRent(), 0.001);
	}

	@Test
	public void testGetHighestRentProperty() {
		 ManagementCompany company = new ManagementCompany("MyCompany", "12345", 10.0);
	        Property prop1 = new Property("Cheap", "City", 1000.0, "Tim");
	        Property prop2 = new Property("Expensive", "City", 2000.0, "Johnny");
	        
	        company.addProperty(prop1);
	        company.addProperty(prop2);
	        
	        assertEquals(prop2, company.getHighestRentProperty());
	}

	@Test
	public void testIsMangementFeeValid() {
		 ManagementCompany validCompany = new ManagementCompany("Valid", "111", 50.0);
	     assertTrue(validCompany.isMangementFeeValid());
	        
	     ManagementCompany highInvalid = new ManagementCompany("High", "333", 101.0);
	     assertFalse(highInvalid.isMangementFeeValid());
	}

	@Test
	public void testGetName() {
		ManagementCompany company = new ManagementCompany("MyCompany", "12345", 10.0);
		assertEquals("MyCompany", company.getName());
	}
	


	@Test
	public void testGetTaxID() {
		ManagementCompany company = new ManagementCompany("MyCompany", "12345", 10.0);
		assertEquals("12345", company.getTaxID());
	}

	@Test
	public void testGetProperties() {
        ManagementCompany company = new ManagementCompany("MyCompany", "12345", 10.0);
		Property p = new Property("Test", "City", 1000.0, "Owner");
        company.addProperty(p);
        assertEquals(p, company.getProperties()[0]);
	}

	@Test
	public void testGetMgmFeePer() {
		  ManagementCompany company = new ManagementCompany("MyCompany", "12345", 10.0);
	        assertEquals(10.0, company.getMgmFeePer(), 0.001);
	}

	@Test
	public void testGetPlot() {
		ManagementCompany company = new ManagementCompany("MyCompany", "12345", 10.0, 1, 2, 3, 4);
        Plot plot = company.getPlot();
        assertNotNull(plot);
        assertEquals(1, plot.getX());
        assertEquals(2, plot.getY());
        assertEquals(3, plot.getWidth());
        assertEquals(4, plot.getDepth());
    }
	
	

}
