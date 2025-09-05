package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_move_when_executeCommand_given_M() {
        Location location=new Location(0,0,Direction.N);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location currentLocation =new Location(0,1,Direction.N);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());

    }
}
