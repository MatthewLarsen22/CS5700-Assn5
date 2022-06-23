package States.EmailStates;

import Detectors.Detector;
import States.State;

public class EmailInvalidState extends State {
    public EmailInvalidState(Detector detector) {
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        //noop
    }
}
