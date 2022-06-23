package States.BinaryStates;

import Detectors.Detector;
import States.State;

public class BinaryStartState extends State {
    public BinaryStartState(Detector detector){
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if (character.equals("1")){
            detector.setState(new BinaryFirstDigitOneState(detector));
        }
        else{
            detector.setState(new BinaryInvalidState(detector));
        }
    }
}
