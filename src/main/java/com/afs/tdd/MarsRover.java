package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


public class MarsRover {
    Logger logger = Logger.getLogger(getClass().getName());

    private Location location;
    private List<Direction> directions= Arrays.asList(Direction.N,Direction.E,Direction.S,Direction.W);

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private void move(){
        switch(location.getDirection()){
            case E:{location.setLocationX(location.getLocationX()+1);break;}
            case N:{location.setLocationY(location.getLocationY()+1);break;}
            case S:{location.setLocationY(location.getLocationY()-1);break;}
            case W:{location.setLocationX(location.getLocationX()-1);break;}
        }
    }
    private void turnLeft(){
        location.setDirection(
                directions.get(
                        (directions.size()
                                + directions.indexOf(location.getDirection())
                                - 1) % directions.size()));
    }
    private void turnRight(){
        location.setDirection(
                directions.get(
                        (directions.size()
                                + directions.indexOf(location.getDirection())
                                + 1) % directions.size()));
    }
    private void backForward(){
        switch(location.getDirection()){
            case E:{location.setLocationX(location.getLocationX()-1);break;}
            case N:{location.setLocationY(location.getLocationY()-1);break;}
            case S:{location.setLocationY(location.getLocationY()+1);break;}
            case W:{location.setLocationX(location.getLocationX()+1);break;}
        }
    }

    public void executeCommand(Command command) {
        switch(command){
            case M:{
                move();
                break;
            }
            case L:{
                turnLeft();
                break;
            }
            case R:{
                turnRight();
                break;
            }
            case B:{
                backForward();
                break;
            }
        }
    }
    public void batchExecuteCommand(String batchCommand){
        if (!isBatchCommandValid(batchCommand)){
            logger.info(String.format("%s is not a set of valid commands",batchCommand));
            return;
        }
        List<Command> commands=extractCommandsFromString(batchCommand);
        commands.forEach(this::executeCommand);
    }
    private boolean isBatchCommandValid(String batchCommand){
        if (batchCommand==null||batchCommand.trim().isEmpty()){
            return false;
        }
        String regex="^[MLRB]+$";
        return batchCommand.matches(regex);
    }
    private List<Command> extractCommandsFromString(String batchCommand){
        List<Command> commands=new ArrayList<>();
        Arrays.stream(batchCommand.split("")).forEach(
                s -> {
                    switch (s){
                        case "M":{
                            commands.add(Command.M);
                            break;
                        }
                        case "L":{
                            commands.add(Command.L);
                            break;
                        }
                        case "R":{
                            commands.add(Command.R);
                            break;
                        }
                        case "B":{
                            commands.add(Command.B);
                            break;
                        }
                    }
                }
        );
        return commands;
    }
}
