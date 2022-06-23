package States;

import Detectors.Detector;

public abstract class State {
    protected Boolean isAccepting;
    protected Detector detector;

    public abstract void consumeInput(String character);

    public Boolean isAccepting(){
        return isAccepting;
    }
}
