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
    private boolean updateBox = false;
    private boolean fileBox = true;
    private boolean updateTab = false;
    private CarService carService = new CarData();

    public boolean isUpdateTab() {
        return updateTab;
    }

    public void setUpdateTab(boolean updateTab) {
        this.updateTab = updateTab;
    }

    public boolean isFileBox() {
        return fileBox;
    }

    public void setFileBox(boolean fileBox) {
        this.fileBox = fileBox;
    }

    public boolean isUpdateBox() {
        return updateBox;
    }

    public void setUpdateBox(boolean updateBox) {
        this.updateBox = updateBox;
    }

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

    /*會直接刪除List的資料*/
    @Command("delete")
    @NotifyChange("carList")
    public void delete() {
      carService.delete(selectedCar);
    }

    @Command
    @NotifyChange({"updateBox", "fileBox"})
    public void update() {
        int carid = carList.indexOf(selectedCar);
        carService.update(carid, selectedCar);
        System.out.println("carid : "+carid);
        updateBox = false;
        fileBox = true;
    }

    /*顯示修改畫面*/
    @Command("showUpdateBox")
    @NotifyChange({"updateBox", "fileBox","updateTab"})
    public void showUpdateBox() {
        updateBox = true;
        fileBox = false;
        updateTab = true;
    }

    @Command("cancelUpdate")
    @NotifyChange({"updateBox", "fileBox"})
    public void cancelUpdateBox() {
        updateBox= false;
        fileBox = true;
    }




}
