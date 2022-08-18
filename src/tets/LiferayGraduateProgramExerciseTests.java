package tets;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import main.LiferayGraduateProgramExercise;

class LiferayGraduateProgramExerciseTests {

	@Test
	void testCheckYesNoInputYesCase() throws Exception {
		assertTrue(LiferayGraduateProgramExercise.checkYesNoInput("y"));
	}
	
	@Test
	void testCheckYesNoInputNoCase() throws Exception {
		assertFalse(LiferayGraduateProgramExercise.checkYesNoInput("n"));
	}
	
	@Test
	void testCheckYesNoInputWrongInputCase() throws Exception {
		assertThrows(Exception.class, ()->LiferayGraduateProgramExercise.checkYesNoInput("invalid input"));
	}
	
	
}
