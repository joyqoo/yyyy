package viewModel;

import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import model.Car;
import model.CarData;
import model.CarService;

public class SearchViewModel {

    private String keyword;
    private List<Car> carList;
    private Car selectedCar;

    private CarService carService = new CarData();

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public List<Car> getCarList() {
        return carList;

    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    @Command("search")
    @NotifyChange("carList")
    public void search() {

        carList = carService.search(keyword);
    }
}
