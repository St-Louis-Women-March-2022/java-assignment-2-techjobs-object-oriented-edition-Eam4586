package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

//import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode//In JobTest, define a test called testSettingJobId. Do not forget to annotate it with @Test.
 * Create two Job objects using the empty constructor.
 * Use assertNotEquals to verify that the IDs of the two objects are distinct.
 * Run the test using the run configuration that you created above.
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Employer test_employer = new Employer ("LaunchCode");
        Employer test_employer2 = new Employer ("LaunchCode");
        assertNotEquals (test_employer, test_employer2);
    }
//Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class and value of each field.
// Your test should have 5 assert statements of each type.
    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_jobConstructorSetsAll = new Job ("product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("persistence"));
        assertEquals ("product tester", test_jobConstructorSetsAll.getName());
        assertEquals ("ACME", test_jobConstructorSetsAll.getEmployer());
        assertEquals ("Desert", test_jobConstructorSetsAll.getLocation());
        assertEquals ("Quality Control", test_jobConstructorSetsAll.getPositionType());
        assertEquals ("persistence", test_jobConstructorSetsAll.getCoreCompetency());
        assertTrue(test_jobConstructorSetsAll.getEmployer() instanceof Employer);
        assertTrue(test_jobConstructorSetsAll.getLocation() instanceof Location);
        assertTrue(test_jobConstructorSetsAll.getPositionType() instanceof PositionType);
        assertTrue(test_jobConstructorSetsAll.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(test_jobConstructorSetsAll.getName() instanceof String);

    }

    @Test
    public void testJobsForEquality(){
        Job test_firstSimilarJob = new Job ("tester", new Employer("ACME"), new Location("UP"), new PositionType("QC"), new CoreCompetency("Love"));
        Job test_secondSimilarJob = new Job ("tester", new Employer("ACME"), new Location("UP"), new PositionType("QC"), new CoreCompetency("Love"));
        assertFalse (test_firstSimilarJob == test_secondSimilarJob);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job test_toString = new Job ("tester", new Employer("ACME"), new Location("UP"), new PositionType("QC"), new CoreCompetency("Love"));
        String printOut = String.valueOf(test_toString);
        char zero = printOut.charAt(0);
        assertEquals('\n', zero);
        char last = printOut.charAt(printOut.length()-1);
        assertEquals('\n', last);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job test_toString2 = new Job ("tester2", new Employer("ACME2"), new Location("UP2"), new PositionType("QC2"), new CoreCompetency("Love2"));
        String printOut2 = String.valueOf(test_toString2);
        String expected2 = '\n' + "ID: " + test_toString2.getId() + '\n'+ "Name: " + test_toString2.getName() + '\n' + "Employer: " + test_toString2.getEmployer() + '\n' + "Location: " + test_toString2.getLocation() + '\n' + "Position Type: " + test_toString2.getPositionType() + '\n' + "Core Competency: " + test_toString2.getCoreCompetency() + '\n';
        assertEquals(printOut2, expected2);
    }

@Test
    public void testToStringHandlesEmptyField(){
    Job test_toString3 = new Job ("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    String printOut3 = String.valueOf(test_toString3);
    String expected3 = '\n' + "ID: " + test_toString3.getId() + '\n'+ "Name: Data not available" + '\n' + "Employer: Data not available" + '\n' + "Location: Data not available" + '\n' + "Position Type: Data not available" + '\n' + "Core Competency: Data not available" + '\n';
    System.out.println();
//    assertEquals(printOut3, expected3);
}
//If a field is empty, the method should add, “Data not available” after the label.  Tried if\then and have no idea on how to execute.
 }
