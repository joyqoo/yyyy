package model;

import java.util.ArrayList;
import java.util.List;


public class CarData implements CarService{

	private List<Car> carList= new ArrayList<>();
	private int id = 1;
	public CarData() {
		carList.add(
				new Car(id++,
						"LEXUS",
						"LS460L",
						"LS 460L及LS 460搭載4.6升V8引擎，結合高科技VVT-iE電子式進氣閥門正時控制系統、Dual VVT-i進排氣可變汽門正時控制系統以及ACIS可變進氣歧管系統，達到高動力及平順操控性的最佳表現，擁有387 PS剽悍馬力，實踐駕馭科技的最高理想。",
						"/img/LS460L.jpg",
						536363));
		carList.add(
				new Car(id++,
						"LEXUS",
						"LS600hL",
						"全新LS 600hL及LS 600h搭載5.0升V8 Atkinson循環引擎，擁有絕佳引擎燃燒效能，同時採用D-4S燃油多重噴射系統，擁有強大引擎動力輸出394.4 PS，結合Full Hybrid技術，綜效馬力更高達445 PS，精湛演繹傲人的動力表現。",
						"/img/LS600hL.jpg",
						944555));
		carList.add(
				new Car(id++,
						"Camry",
						"Toyota",
						"The Toyota Camry is a midsize car manufactured by Toyota in Georgetown, Kentucky, USA; as well as Australia; and Japan. Since 2001 it has been the top selling car in the United States.The Holden equivalents were not successful even though they came from the same factory as the Camry. Since 2000 Daihatsu has sold a Camry twin named the Daihatsu Altis. The name comes from the English phonetic of the Japanese word \"kan-muri,\" which means \"crown.\"",
						"/widgets/getting_started/img/car3.png",
						24170));
		carList.add(
				new Car(id++,
						"Century",
						"Toyota",
						"The Toyota Century is a large four-door limousine produced by Toyota mainly for the Japanese market. Production of the Century began in 1967 and the model received " +
						"only minor changes until redesign in 1997. This second-generation Century is still sold in Japan. The Century is produced in limited numbers and is built " +
						"in a \"nearly hand-made\" fashion. It is often used by royalty, government leaders, and executive businessmen. Although the Century is not exported outside Japan in large numbers, it is used frequently by officials stationed in overseas Japanese offices. In contrast to other luxurious cars (such as the Maybach or a Rolls Royce), the Century has not been positioned and marketed as a sign of wealth or excess. Instead, the Century projects an image of conservative achievement.",
						"/widgets/getting_started/img/car4.png",
						288730));
		carList.add(
				new Car(id++,
						"Sigma",
						"Mitsubishi",
						"The third-generation of Japanese car Mitsubishi Galant, dating from 1976, was divided into two models: the Galant Sigma (for the sedan and wagon) and the Galant Lambda (the coupe). The former was sold in many markets as the Mitsubishi Galant (without the word 'Sigma') and in Australia as the Chrysler Sigma (until 1980, after which it became the Mitsubishi Sigma). Strangely, in New Zealand it was badged as 'Galant Sigma' but colloquially referred to as the 'Sigma', a name it formally adopted after 1980.",
						"/widgets/getting_started/img/car5.png",
						54120));
		carList.add(
				new Car(id++,
						"Challenger",
						"Mitsubishi",
						"The Mitsubishi Challenger, called Mitsubishi Pajero Sport in most export markets, Mitsubishi Montero Sport in Spanish-speaking countries (including North America), Mitsubishi Shogun Sport in the UK and Mitsubishi Nativa in Central and South Americas (the Challenger name was also used in Australia), is a medium sized SUV built by the Mitsubishi Motors Corporation. It was released in 1997, and is still built as of 2006, although it's no longer available in its native Japan since the end of 2003.",
						"/widgets/getting_started/img/car6.png",
						58750));
		carList.add(
				new Car(id++,
						"Civic",
						"Honda",
						"The eighth generation Honda Civic is produced since 2006. It is available as a coupe, hatchback and sedan. Models produced for the North American market have a different styling."+
						" At the moment there are four petrol engines and one diesel developed for this car. The 1.4-liter petrol is more suitable for the settled driving around town. The 1.8-liter petrol, developing 140 hp is a willing performer. The 2.2-liter diesel is similar to the Accord's unit. It accelerates rapidly and is economical as well. The Honda Civic is also available with a hybrid engine. In this case engine is coupled with an automatic transmission only. The 2.0-liter model is available with the paddle shift gearbox.",
						"/widgets/getting_started/img/car1.png",
						17479));
		carList.add(
				new Car(id++,
						"New Beetle",
						"Volkswagen",
						" The Volkswagen Beetle is produced since 1998. It is available as a coupe or convertible."+
						" The VW Beetle is powered by a wide range of engines, including two 1.9-liter turbodiesels, and turbocharged 1.8-liter petrol. There is also a 3.2-liter RSI available for the range topper."+
						" The new Beetle has nothing in common with the rear-engined original, except the 'retro' design. It is based on the VW Golf and has the same solid build quality.",
						"/widgets/getting_started/img/car2.png",
						67540));
		carList.add(
				new Car(id++,
						"Golf V",
						"Volkswagen",
						"The Volkswagen Golf V is produced since 2003. There is a wide range of fine and reliable engines. The best choice would be 1.6-liter FSI direct injection petrol with 115 hp or 2.0-liter turbodiesel with 150 hp. The last mentioned features an outstanding fuel economy for it's capacity and acceleration speed, although is a bit noisy. The strongest performer is a 2.0-liter GTI, delivering 200 hp, which continues the Golf's hot hatch traditions."+
						" Steering is sharp. The car is stable at speed and easily controlled as the power steering gets weightier with speed, unfortunately it does not give enough feedback to the driver. The ride is a bit firm in town, as the reliability of suspension was preferred to the comfort. It is a common feature of all VW Golf's.",
						"/widgets/getting_started/img/car3.png",
						78200));
		carList.add(
				new Car(id++,
						"Neon",
						"Chrysler",
						" This car is sold as the Dodge Neon in the United States and as Chrysler Neon for export only. It is a second generation Neon produced since 2000."+
						" There is a choice of three petrol engines. The basic 1.6-liter petrol is the same unit found on the MINI. The top of the range is a 2.0-liter engine, providing 133 hp, besides acceleration is a weak point of all Neons.",
						"/widgets/getting_started/img/car4.png",
						85400));
	}


	@Override
    public List<Car> findAll(){
		return carList;
	}

	@Override
    public List<Car> search(String keyword){
		List<Car> result = new ArrayList<>();
		if (keyword==null || keyword.equals("")){
			result = carList;
		}else{
			for (Car car: carList){
				if (car.getModel().toLowerCase().contains(keyword.toLowerCase())
					||car.getMake().toLowerCase().contains(keyword.toLowerCase())){
					result.add(car);
				}
			}
		}
		return result;
	}

    @Override
    public void insert(Car car) {
        car.setId(id++);
        carList.add(car);
    }
}
