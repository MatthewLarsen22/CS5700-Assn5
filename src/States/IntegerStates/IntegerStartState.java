package States.IntegerStates;

import Detectors.Detector;
import States.State;

public class IntegerStartState extends State {
    public IntegerStartState(Detector detector){
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if ("123456789".contains(character)){
            detector.setState(new IntegerValidNumState(detector));
        }
        else{
            detector.setState(new IntegerInvalidState(detector));
        }
    }
}
