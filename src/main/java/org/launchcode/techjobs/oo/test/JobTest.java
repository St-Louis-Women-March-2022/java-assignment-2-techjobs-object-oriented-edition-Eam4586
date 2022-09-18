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
        //id check, check classes, I get the problem. I am saying that the word will equal the place.  It doesn't.
        assertNotEquals(Job.nextId, test_jobConstructorSetsAll.getId());
        assertEquals ("product tester", test_jobConstructorSetsAll.getName());
        assertEquals ("ACME", test_jobConstructorSetsAll.getEmployer());
        assertEquals ("Desert", test_jobConstructorSetsAll.getLocation());
        assertEquals ("Quality Control", test_jobConstructorSetsAll.getPositionType());
        assertEquals ("persistence", test_jobConstructorSetsAll.getCoreCompetency());
        assertTrue(test_jobConstructorSetsAll.employer instanceof Employer);
        assertTrue(test_jobConstructorSetsAll.location instanceof Location);
        assertTrue(test_jobConstructorSetsAll.positionType instanceof PositionType);
        assertTrue(test_jobConstructorSetsAll.coreCompetency instanceof CoreCompetency);
        assertTrue(test_jobConstructorSetsAll instanceof Job);
    }

    @Test
    public void testJobsForEquality(){
        Job test_firstSimilarJob = new Job ("tester", new Employer("ACME"), new Location("UP"), new PositionType("QC"), new CoreCompetency("Love"));
        Job test_secondSimilarJob = new Job ("tester", new Employer("ACME"), new Location("UP"), new PositionType("QC"), new CoreCompetency("Love"));
        assertNotEquals (test_firstSimilarJob, test_secondSimilarJob);
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
        Job test_toString = new Job ("tester", new Employer("ACME"), new Location("UP"), new PositionType("QC"), new CoreCompetency("Love"));
        String printOut = String.valueOf(test_toString);
        String expected = '\n' + "ID: " + test_toString.getId() + '\n'+ "Name: " + test_toString.getName() + '\n' + "Employer: " + test_toString.getEmployer() + '\n' + "Location: " + test_toString.getLocation() + '\n' + "Position Type: " + test_toString.getPositionType() + '\n' + "Core Competency: " + test_toString.getCoreCompetency() + '\n';
        assertEquals(printOut, expected);

    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job test_toString = new Job ("tester", new Employer("ACME"), new Location("UP"), new PositionType("QC"), new CoreCompetency("Love"));
        String printOut = String.valueOf(test_toString);
        System.out.println(printOut);
//
// If a field is empty, the method should add, “Data not available” after the label.
 }
}
