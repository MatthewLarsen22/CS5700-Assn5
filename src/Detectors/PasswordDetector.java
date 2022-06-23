package Detectors;

import States.PasswordStates.PasswordStartState;

public class PasswordDetector extends Detector{
    public PasswordDetector(){
        minLength = 8;
        restartState();
    }

    @Override
    protected void restartState() {
        setState(new PasswordStartState(this));
    }
}
