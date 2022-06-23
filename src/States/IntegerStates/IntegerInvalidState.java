package States.IntegerStates;

import Detectors.Detector;
import States.State;

public class IntegerInvalidState extends State {

    public IntegerInvalidState(Detector detector){
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        //noop
    }
}
