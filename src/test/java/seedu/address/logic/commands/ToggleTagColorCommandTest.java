package seedu.address.logic.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class ToggleTagColorCommandTest {

    @Test
    public void equals() {
        ToggleTagColorCommand firstCommand =
                new ToggleTagColorCommand(true);
        ToggleTagColorCommand secondCommand=
                new ToggleTagColorCommand(false);

        // same object -> returns true
        assertTrue(firstCommand.equals(firstCommand));

        // same values -> returns true
        ToggleTagColorCommand findFirstCommandCopy =
                new ToggleTagColorCommand (firstCommand.getToSet());
        assertTrue(firstCommand.equals(findFirstCommandCopy));

        // different types -> returns false
        assertFalse(firstCommand.equals(1));
        assertFalse(firstCommand.equals(secondCommand));

        // null -> returns false
        assertNotNull(firstCommand);
    }

    @Test
    public void testGetToSet(){
        ToggleTagColorCommand firstCommand =
                new ToggleTagColorCommand(true);
        ToggleTagColorCommand secondCommand=
                new ToggleTagColorCommand(false);

        assertTrue(firstCommand.getToSet());
        assertFalse(secondCommand.getToSet());
    }


}
