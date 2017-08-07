package viewModel;


import org.zkoss.bind.annotation.Command;

import model.Car;
import model.CarData;
import model.CarService;

public class AddViewModel {

    private Car car = new Car();

    private CarService carService = new CarData();


    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    @Command("insert")
    public void insert() {
        carService.insert(car);
    }

}
