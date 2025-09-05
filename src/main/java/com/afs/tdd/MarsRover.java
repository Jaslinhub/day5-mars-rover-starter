package com.afs.tdd;

public class MarsRover {


    private Location location;

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
        if (command.equals(Command.M)){
            switch(location.getDirection()){
                case E:{location.setLocationX(location.getLocationX()+1);break;}
                case N:{location.setLocationY(location.getLocationY()+1);break;}
                case S:{location.setLocationY(location.getLocationY()-1);break;}
                case W:{location.setLocationX(location.getLocationX()-1);break;}
            }
        }
    }
}
