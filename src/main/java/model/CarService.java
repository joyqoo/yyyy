package model;

import java.util.List;

public interface CarService {

	public List<Car> findAll();

	public List<Car> search(String keyword);

	public void insert(Car car);

	public void update(Car car);
}
