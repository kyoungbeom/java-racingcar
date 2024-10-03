package racingcar.controller;

import racingcar.service.RacingCarService;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingCarController {
    private static final InputView inputView = new InputView();
    private static final ResultView resultView = new ResultView();
    private static final RacingCarService racingCarService = new RacingCarService();

    public static void main(String[] args) {
        int numberOfCars = inputView.enterNumberOfCars();
        int NumberOfMoves = inputView.enterNumberOfMoves();

        for(int i = 0; i < NumberOfMoves; i++) {
            racingCarService.saveCarMovementStatuses(
                    racingCarService.isMovingForward(
                            racingCarService.generateRandomNumberForMovingCar(numberOfCars)
                    )
            );

            resultView.printCarStatusResult(racingCarService.getCarMoveStatuses());
        }
    }
}
