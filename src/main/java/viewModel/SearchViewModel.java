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
     /*BUG!確認刪除按鈕後,List不會馬上刪除*/
//    @Command("delete")
//    @NotifyChange("carList")
//    public void delete() {
//        Messagebox.show("是否確認刪除?",
//                "確認刪除", Messagebox.OK | Messagebox.CANCEL,
//                Messagebox.QUESTION,
//                new org.zkoss.zk.ui.event.EventListener() {
//                    @Override
//                    public void onEvent(Event e)throws Exception  {
//                        if (Messagebox.ON_OK.equals(e.getName())) {
//                            carService.delete(selectedCar);
//                        }
//                    }
//                });
//
//    }
    /*會直接刪除List的資料*/
    @Command("delete")
    @NotifyChange("carList")
    public void delete() {
      carService.delete(selectedCar);
    }

    @Command("update")
    public void update() {
        Integer carid = carList.indexOf(selectedCar);
        carService.update(carid, selectedCar);
    }

}
