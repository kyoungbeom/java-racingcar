package racingcar.model.maker;

public class FixedNumberMaker implements NumberMaker {
    private final int fixedNumber;

    public FixedNumberMaker(int fixedNumber) {
       this.fixedNumber = fixedNumber;
    }
    @Override
    public int make() {
        return fixedNumber;
    }
}
