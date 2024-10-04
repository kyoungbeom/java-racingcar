package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.service.CarRacing;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarRacingTest {

    @Test
    @DisplayName("자동차 경주 준비 메서드 테스트")
    public void carRaceReadyTest() {
        CarRacing carRacing = new CarRacing(3);
        assertThat(carRacing.getCars()).hasSize(3);
    }

    @Test
    @DisplayName("발생한 랜덤한 값들을 기반으로 자동차들의 전진 여부를 결정하는 메서드 테스트")
    public void isCarMovingForwardTest() {
            CarRacing carRacing = new CarRacing(3);
            assertThat(carRacing.isCarMovingForward()).isIn(true, false);
    }

    @Test
    @DisplayName("각각의 자동차에 대한 전진여부에 따라 실제로 자동차들을 이동시키는 메서드 테스트")
    public void carMoveTest() {
        CarRacing carRacing = new CarRacing(3);
        List<Car> cars= carRacing.getCars();
        int count = 0;

        boolean[] carForwardStatuses1 = {true, false, true};

        for(Car car : cars) {
            car.move(carForwardStatuses1[count++]);
        }

        assertThat(cars.get(0).getMovingDistance()).isEqualTo(1);
        assertThat(cars.get(1).getMovingDistance()).isEqualTo(0);
        assertThat(cars.get(2).getMovingDistance()).isEqualTo(1);

        boolean[] carForwardStatuses2 = {false, true, true};
        count = 0;

        for(Car car : cars) {
            car.move(carForwardStatuses2[count++]);
        }

        assertThat(cars.get(0).getMovingDistance()).isEqualTo(1);
        assertThat(cars.get(1).getMovingDistance()).isEqualTo(1);
        assertThat(cars.get(2).getMovingDistance()).isEqualTo(2);
    }
}
