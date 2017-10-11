package seedu.address.commons.core;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MessageTest {

    @Test
    public void testMessageClass(){
        Messages messageClass = new Messages();

        assertTrue(messageClass.MESSAGE_UNKNOWN_COMMAND.equals("Unknown command"));
        assertTrue(messageClass.MESSAGE_INVALID_COMMAND_FORMAT.equals("Invalid command format! \n%1$s"));
        assertTrue(messageClass.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX.equals("The person index provided is invalid"));
        assertTrue(messageClass.MESSAGE_PERSONS_LISTED_OVERVIEW.equals("%1$d persons listed!"));
    }
}
