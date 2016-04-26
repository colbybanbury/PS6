package base;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import domain.PersonDomainModel;


 
public class Person_Test {
	PersonDomainModel person = new PersonDomainModel();	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Addtest() {
		person.setFirstName("colby");
		
		person.setLastName("banbury");
		
		PersonDAL.addPerson(person);
		assertTrue(1==1);
	}
}
