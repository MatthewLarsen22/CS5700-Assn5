package States.BinaryStates;

import Detectors.Detector;
import States.State;

public class BinaryFirstDigitOneState extends State {
    public BinaryFirstDigitOneState(Detector detector) {
        isAccepting = true;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if (character.equals("0")){
            detector.setState(new BinaryEndsWithZeroState(detector));
        }
        else if (character.equals("1")){
            detector.setState(new BinaryEndsWithOneState(detector));
        }
        else{
            detector.setState(new BinaryInvalidState(detector));
        }
    }
}
