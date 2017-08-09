package model;

import java.util.ArrayList;
import java.util.List;


public class CarData implements CarService{

	private static List<Car> carList= new ArrayList<>();
	private static int id = 1;
	static {
	    carList.add(
                new Car(id++,
                        "LEXUS",
                        "LS460L",
                        "LS 460L及LS 460搭載4.6升V8引擎，結合高科技VVT-iE電子式進氣閥門正時控制系統、Dual VVT-i進排氣可變汽門正時控制系統以及ACIS可變進氣歧管系統，達到高動力及平順操控性的最佳表現，擁有387 PS剽悍馬力，實踐駕馭科技的最高理想。",
                        "/img/LS460L.jpg",
                        4590000));
        carList.add(
                new Car(id++,
                        "LEXUS",
                        "LS600hL",
                        "全新LS 600hL及LS 600h搭載5.0升V8 Atkinson循環引擎，擁有絕佳引擎燃燒效能，同時採用D-4S燃油多重噴射系統，擁有強大引擎動力輸出394.4 PS，結合Full Hybrid技術，綜效馬力更高達445 PS，精湛演繹傲人的動力表現。",
                        "/img/LS600hL.jpg",
                        6430000));
        carList.add(
                new Car(id++,
                        "Toyota",
                        "ALTIS",
                        "主動保持車子行進的穩定與安全，在感知器偵測到車輛轉向過度或不足時，能適時降低引擎的動力輸出並輔助煞車作動，讓車子過彎更順暢。",
                        "/img/ALTIS.jpg",
                        699000));
        carList.add(
                new Car(id++,
                        "Toyota",
                        "Vios",
                        "引擎蓋、前保桿防護鋼樑等處採用輕量化鋁合金材質，底盤、車身結構大量採用1500Mpa高剛性鋼材，並採用衝擊分散結構，降低撞擊時對車內乘員的傷害。\r\n" +
                        "另採用最新雷射強化焊接技術，藉由降低焊接點距離，大幅增加焊點數量，使車身抗扭剛性更為提升，強化行車穩定性。",
                        "/img/VIOS.jpg",
                        589000));
        carList.add(
                new Car(id++,
                        "Mazda",
                        "Mazda3",
                        "Mazda3 以新世代造車理念打造，融合了SKYACTIV全新動能科技、KODO魂動設計及人馬一体。顛覆傳統中型房車格局，尤以SKYACTIV全新動能科技，追求「極致輕量化」與「最適化懸吊」，突破傳統格局，Mazda3在一體感、安全感、舒適感中找到了「三感和諧」的黃金交集。 \r\n" +
                        "\r\n" +
                        "在車子配備上，Mazda3 也是首款提供 MZD Connect 行動網路連線的 Mazda 車款，讓駕駛者在駕駛過程中也能享受行車及各種娛樂資訊。",
                        "/img/Mazda3.png",
                        739000));
        carList.add(
                new Car(id++,
                        "Mazda",
                        "MAZDA MX-5",
                        "MAZDA MX-5 繼榮獲日本年度風雲車(JCOTY) 及德國紅點設計大獎最高殊榮Best of the Best 等多國獎項肯定後，更獲頒2016世界年度風雲車(WCOTY) 以及年度最佳汽車設計(WCDOTY) 雙料大獎。\r\n" +
                        "而甫推出的MAZDA MX-5 RF車款，延續魂動美學，加上專屬的 Fastback斜背式設計，以剛柔並濟的迷人線條，與性感不失優雅的硬頂外型，一舉榮膺2017德國紅點設計大獎Best of the Best，為敞篷跑車做了全新演繹，也讓原本熠熠不俗的MAZDA MX-5車系再添榮耀。以SKYACTIV TECHNOLOGY 全新動能科技所打造而生的新一代MAZDA MX-5，極致輕量化造就更勝前代的1,088kg 輕巧重量，並達到眾多經典跑車夢寐以求的前後車重50：50完美比例，讓駕駛者可以輕易透過身體與方向盤掌握車身動態，靈活完成敏銳操控，達到和諧的「人馬一体」境界，釋放前所未有的駕馭快感。",
                        "/img/MAZDA MX-5.png",
                        1320000));
        carList.add(
                new Car(id++,
                        "Honda",
                        "Civic",
                        "The eighth generation Honda Civic is produced since 2006. It is available as a coupe, hatchback and sedan. Models produced for the North American market have a different styling."+
                        " At the moment there are four petrol engines and one diesel developed for this car. The 1.4-liter petrol is more suitable for the settled driving around town. The 1.8-liter petrol, developing 140 hp is a willing performer. The 2.2-liter diesel is similar to the Accord's unit. It accelerates rapidly and is economical as well. The Honda Civic is also available with a hybrid engine. In this case engine is coupled with an automatic transmission only. The 2.0-liter model is available with the paddle shift gearbox.",
                        "/widgets/getting_started/img/car1.png",
                        17479));
        carList.add(
                new Car(id++,
                        "Volkswagen",
                        "New Beetle",
                        " The Volkswagen Beetle is produced since 1998. It is available as a coupe or convertible."+
                        " The VW Beetle is powered by a wide range of engines, including two 1.9-liter turbodiesels, and turbocharged 1.8-liter petrol. There is also a 3.2-liter RSI available for the range topper."+
                        " The new Beetle has nothing in common with the rear-engined original, except the 'retro' design. It is based on the VW Golf and has the same solid build quality.",
                        "/widgets/getting_started/img/car2.png",
                        67540));
        carList.add(
                new Car(id++,
                        "Volkswagen",
                        "Golf V",
                        "The Volkswagen Golf V is produced since 2003. There is a wide range of fine and reliable engines. The best choice would be 1.6-liter FSI direct injection petrol with 115 hp or 2.0-liter turbodiesel with 150 hp. The last mentioned features an outstanding fuel economy for it's capacity and acceleration speed, although is a bit noisy. The strongest performer is a 2.0-liter GTI, delivering 200 hp, which continues the Golf's hot hatch traditions."+
                        " Steering is sharp. The car is stable at speed and easily controlled as the power steering gets weightier with speed, unfortunately it does not give enough feedback to the driver. The ride is a bit firm in town, as the reliability of suspension was preferred to the comfort. It is a common feature of all VW Golf's.",
                        "/widgets/getting_started/img/car3.png",
                        78200));
        carList.add(
                new Car(id++,
                        "Chrysler",
                        "Neon",
                        " This car is sold as the Dodge Neon in the United States and as Chrysler Neon for export only. It is a second generation Neon produced since 2000."+
                        " There is a choice of three petrol engines. The basic 1.6-liter petrol is the same unit found on the MINI. The top of the range is a 2.0-liter engine, providing 133 hp, besides acceleration is a weak point of all Neons.",
                        "/widgets/getting_started/img/car4.png",
                        85400));
	}

	public CarData() {

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

    @Override
    public void delete(Car car) {
        carList.remove(car);
        System.out.println("carList delete 成功");
    }

    @Override
    public void update(Integer carNum, Car car) {
        carList.set(carNum, car);
        System.out.println("update car : "+ car );
        System.out.println("update : "+ carNum );
    }


}
