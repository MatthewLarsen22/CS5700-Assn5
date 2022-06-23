package Detectors;

import States.FloatStates.FloatStartState;

public class FloatDetector extends Detector{
    public FloatDetector(){
        restartState();
    }

    @Override
    public void restartState() {
        state = new FloatStartState(this);
    }
}
