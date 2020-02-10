package com.company;
import java.util.ArrayList;

public class Elevator {
    private int mCurrentFloor, mPassenger, mDestinationFloor, mNumOfElevator;
    private ArrayList<ArrayList<Integer>> mBuilding;
    private Direction mCurrentDirection;
    private State mCurrentState;

    public Elevator() {
    }

    public enum Direction{
        UP,DOWN, NOT_MOVING, MOVING
    }
    public enum State{
        IDLE_STATE,DOORS_OPENING,UNLOADING_PASSENGERS,LOADING_PASSENGERS,DOORS_CLOSING,ACCELERATING,MOVING,DECELERATING
    }

    // Accessors
    public int getmCurrentFloor() {
        return mCurrentFloor;
    }

    public int getmPassenger() {
        return mPassenger;
    }

    public int getmDestinationFloor() {
        return mDestinationFloor;
    }

    public int getmNumOfElevator() {
        return mNumOfElevator;
    }

    public ArrayList<ArrayList<Integer>> getmBuilding() {
        return mBuilding;
    }

    public Direction getmCurrentDirection() {
        return mCurrentDirection;
    }

    public State getmCurrentState() {
        return mCurrentState;
    }

    public void tick(){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
