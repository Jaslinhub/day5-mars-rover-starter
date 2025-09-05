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
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_left_when_executeCommand_given_L(){
        Location location=new Location(0,0,Direction.N);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.L);

        Location currentLocation =new Location(0,0,Direction.W);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
}
