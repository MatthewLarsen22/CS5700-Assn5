package States.FloatStates;

import Detectors.Detector;
import States.State;

public class FloatPeriodState extends State {
    public FloatPeriodState(Detector detector) {
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if("0123456789".contains(character)){
            detector.setState(new FloatValidFloatState(detector));
        }
        else{
            detector.setState(new FloatInvalidState(detector));
        }
    }
}
