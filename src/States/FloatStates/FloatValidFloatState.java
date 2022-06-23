package States.FloatStates;

import Detectors.Detector;
import States.State;

public class FloatValidFloatState extends State {
    public FloatValidFloatState(Detector detector) {
        isAccepting = true;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if (!"0123456789".contains(character)){
            detector.setState(new FloatInvalidState(detector));
        }
    }
}
