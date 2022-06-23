package States.FloatStates;

import Detectors.Detector;
import States.State;

public class FloatInvalidState extends State {
    public FloatInvalidState(Detector detector){
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        //noop
    }
}
