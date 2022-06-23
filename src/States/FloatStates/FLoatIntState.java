package States.FloatStates;

import Detectors.Detector;
import States.State;

public class FLoatIntState extends State {
    public FLoatIntState(Detector detector) {
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if(character.equals(".")){
            detector.setState(new FloatPeriodState(detector));
        }
        else if(!"0123456789".contains(character)){
            detector.setState(new FloatInvalidState(detector));
        }
    }
}
