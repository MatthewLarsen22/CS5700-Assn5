package States.PasswordStates;

import Detectors.Detector;
import States.State;

public class PasswordHasCapitalLetterState extends State {
    public PasswordHasCapitalLetterState(Detector detector) {
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if ("!@#$%&*".contains(character)){
            detector.setState(new PasswordEndsWithSpecialCharacterState(detector));
        }
    }
}
