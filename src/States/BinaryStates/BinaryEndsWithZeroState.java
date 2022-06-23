package States.BinaryStates;

import Detectors.Detector;
import States.State;

public class BinaryEndsWithZeroState extends State {
    public BinaryEndsWithZeroState(Detector detector) {
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if (character.equals("1")){
            detector.setState(new BinaryEndsWithOneState(detector));
        }
        else if (!character.equals("0")){
            detector.setState(new BinaryInvalidState(detector));
        }
    }
}
