package Detectors;

import States.State;

import java.util.Objects;

public abstract class Detector {
    protected State state;

    public Boolean detect(String input){
        String[] characters = input.trim().split("");

        for (String character : characters){
            if(!Objects.equals(character, "")){
                state.consumeInput(character);
            }
        }

        Boolean isAccepting = state.isAccepting();
        restartState();
        return isAccepting;
    }

    public void setState(State state){
        this.state = state;
    }

    protected abstract void restartState();
}
