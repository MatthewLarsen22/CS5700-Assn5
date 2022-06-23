package States.BinaryStates;

import Detectors.Detector;
import States.State;

public class BinaryInvalidState extends State {
    public BinaryInvalidState(Detector detector) {
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        //noop
    }
}
