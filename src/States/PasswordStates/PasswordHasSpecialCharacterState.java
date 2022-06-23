package States.PasswordStates;

import Detectors.Detector;
import States.State;

public class PasswordHasSpecialCharacterState extends State {
    public PasswordHasSpecialCharacterState(Detector detector) {
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(character)){
            detector.setState(new PasswordValidComplexPasswordState(detector));
        }
    }
}
