package Detectors;

import States.FloatStates.FloatStartState;

public class FloatDetector extends Detector{
    public FloatDetector(){
        restartState();
    }

    @Override
    public void restartState() {
        setState(new FloatStartState(this));
    }
}
