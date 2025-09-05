package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {


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

    public void executeCommand(Command command) {
        switch(command){
            case M:{
                switch(location.getDirection()){
                    case E:{location.setLocationX(location.getLocationX()+1);break;}
                    case N:{location.setLocationY(location.getLocationY()+1);break;}
                    case S:{location.setLocationY(location.getLocationY()-1);break;}
                    case W:{location.setLocationX(location.getLocationX()-1);break;}
                }
                break;
            }
            case L:{
                location.setDirection(
                        directions.get(
                                (directions.size()
                                        + directions.indexOf(location.getDirection())
                                        - 1) % directions.size()));

                break;
            }

        }
    }
}
