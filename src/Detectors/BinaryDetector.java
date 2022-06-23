package Detectors;

import States.BinaryStates.BinaryStartState;

public class BinaryDetector extends Detector{
    public BinaryDetector(){
        restartState();
    }

    @Override
    protected void restartState() {
        setState(new BinaryStartState(this));
    }
}
