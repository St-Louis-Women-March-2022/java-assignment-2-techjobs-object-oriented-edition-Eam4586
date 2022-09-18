package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.swing.text.Position;

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
        assertTrue (test_toString.contains "/n");
    }
}
