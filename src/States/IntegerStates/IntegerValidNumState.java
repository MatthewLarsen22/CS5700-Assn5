package States.IntegerStates;

import Detectors.Detector;
import States.State;

public class IntegerValidNumState extends State {

    public IntegerValidNumState(Detector detector){
        isAccepting = true;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if (!"0123456789".contains(character)){
            detector.setState(new IntegerInvalidState(detector));
        }
    }
}
