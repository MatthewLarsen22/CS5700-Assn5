package Detectors;

import States.IntegerStates.IntegerStartState;

public class IntegerDetector extends Detector{
    public IntegerDetector(){
        restartState();
    }

    @Override
    public void restartState() {
        state = new IntegerStartState(this);
    }
}
