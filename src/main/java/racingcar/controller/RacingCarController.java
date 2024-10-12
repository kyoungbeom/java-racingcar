package racingcar.controller;

import racingcar.model.number.RandomNumber;
import racingcar.model.race.Car;
import racingcar.model.race.RaceWinner;
import racingcar.service.CarRacing;
import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.List;

public class RacingCarController {
    private static final InputView inputView = new InputView();

    public static void main(String[] args) {
        List<String> carNames = inputView.enterCarNames();
        int totalNumberOfRace = inputView.enterNumberOfRace();

        CarRacing carRacing = new CarRacing(carNames);
        ResultView resultView = new ResultView();

        for (int raceCount = 1; raceCount <= totalNumberOfRace; raceCount++) {
            List<Car> records = carRacing.carRaceStart(new RandomNumber());
            resultView.printRacingResult(records);
        }

        RaceWinner winner = new RaceWinner(carRacing.getCars());
        resultView.printRaceWinner(winner.getWinners());
    }
}
