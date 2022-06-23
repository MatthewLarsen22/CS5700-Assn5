package Detectors;

import States.EmailStates.EmailStartState;

public class EmailDetector extends Detector{
    public EmailDetector(){
        restartState();
    }

    @Override
    protected void restartState() {
        setState(new EmailStartState(this));
    }
}
