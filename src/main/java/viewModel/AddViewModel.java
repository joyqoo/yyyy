package viewModel;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;

import model.Car;
import model.CarData;
import model.CarService;

public class AddViewModel {

    private Car car = new Car();
    private List<Car> carList;
    private CarService carService = new CarData();

    @Init
    public void init() {
        carList = new ArrayList<>();
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    @Command("insert")

    public void insert() {
        System.out.println("insert進來囉");
        System.out.println("CAR:" + car);
        carService.insert(car);
    }

}
