package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_move_when_executeCommand_given_M_in_north() {
        Location location=new Location(0,0,Direction.N);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location currentLocation =new Location(0,1,Direction.N);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_move_when_executeCommand_given_M_in_south(){
        Location location=new Location(0,0,Direction.S);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location currentLocation =new Location(0,-1,Direction.S);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_move_when_executeCommand_given_M_in_west(){
        Location location=new Location(0,0,Direction.W);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location currentLocation =new Location(-1,0,Direction.W);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_move_when_executeCommand_given_M_in_east(){
        Location location=new Location(0,0,Direction.E);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location currentLocation =new Location(1,0,Direction.E);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_left_when_executeCommand_given_L_in_north(){
        Location location=new Location(0,0,Direction.N);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.L);

        Location currentLocation =new Location(0,0,Direction.W);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_left_when_executeCommand_given_L_in_south(){
        Location location=new Location(0,0,Direction.S);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.L);

        Location currentLocation =new Location(0,0,Direction.E);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_left_when_executeCommand_given_L_in_west(){
        Location location=new Location(0,0,Direction.W);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.L);

        Location currentLocation =new Location(0,0,Direction.S);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_left_when_executeCommand_given_L_in_east(){
        Location location=new Location(0,0,Direction.E);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.L);

        Location currentLocation =new Location(0,0,Direction.N);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_right_when_executeCommand_given_R_in_north(){
        Location location=new Location(0,0,Direction.N);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.R);

        Location currentLocation =new Location(0,0,Direction.E);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_right_when_executeCommand_given_R_in_south(){
        Location location=new Location(0,0,Direction.S);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.R);

        Location currentLocation =new Location(0,0,Direction.W);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_right_when_executeCommand_given_R_in_west(){
        Location location=new Location(0,0,Direction.W);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.R);

        Location currentLocation =new Location(0,0,Direction.N);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_right_when_executeCommand_given_R_in_east(){
        Location location=new Location(0,0,Direction.E);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.R);

        Location currentLocation =new Location(0,0,Direction.S);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_step_back_when_executeCommand_given_B_in_north(){
        Location location=new Location(0,0,Direction.N);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.B);

        Location currentLocation =new Location(0,-1,Direction.N);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_step_back_when_executeCommand_given_B_in_south(){
        Location location=new Location(0,0,Direction.S);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.B);

        Location currentLocation =new Location(0,1,Direction.S);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_step_back_when_executeCommand_given_B_in_west(){
        Location location=new Location(0,0,Direction.W);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.B);

        Location currentLocation =new Location(1,0,Direction.W);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
    @Test
    void should_step_back_when_executeCommand_given_B_in_east(){
        Location location=new Location(0,0,Direction.E);
        MarsRover marsRover=new MarsRover(location);

        marsRover.executeCommand(Command.B);

        Location currentLocation =new Location(-1,0,Direction.E);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }


    @Test
    void should_executeCommand_when_given_batches_command(){
        Location location=new Location(0,0,Direction.N);
        MarsRover marsRover=new MarsRover(location);
        String earthCommand="MMLRRM";

        marsRover.batchExecuteCommand(earthCommand);

        Location currentLocation =new Location(1,2,Direction.E);
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }

}
