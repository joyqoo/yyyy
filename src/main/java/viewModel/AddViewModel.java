package viewModel;

import java.util.Map;

import org.zkoss.bind.Property;
import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.validator.AbstractValidator;

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

    public Validator getModelValidator() {
        System.out.println("ModelValidator有跑進來");
        return new AbstractValidator() {
            @Override
            public void validate(ValidationContext ctx) {
                Map<String,Property> beanProps = ctx.getProperties(ctx.getProperty().getBase());
                String model = (String)beanProps.get("model").getValue();
                if(model==null) {
                    this.addInvalidMessage(ctx, "model", "請盡量描述車款詳情");
                }
            }
        };
    }
    public Validator getMakeValidator() {
        System.out.println("MakeValidator有跑進來");
        return new AbstractValidator() {
            @Override
            public void validate(ValidationContext ctx) {
                Map<String,Property> beanProps = ctx.getProperties(ctx.getProperty().getBase());
                String make = (String)beanProps.get("make").getValue();
                if(make==null) {
                    this.addInvalidMessage(ctx, "make", "請盡量描述車款詳情");
                }
            }
        };
    }
    public Validator getDespValidator() {
        System.out.println("DespValidator有跑進來");
        return new AbstractValidator() {
            @Override
            public void validate(ValidationContext ctx) {
                Map<String,Property> beanProps = ctx.getProperties(ctx.getProperty().getBase());
                String desp = (String)beanProps.get("desp").getValue();
                if(desp==null) {
                    this.addInvalidMessage(ctx, "desp", "請盡量描述車款詳情");
                }
            }
        };
    }
    public Validator getPriceValidator() {
        System.out.println("PriceValidator有跑進來");
        return new AbstractValidator() {
            @Override
            public void validate(ValidationContext ctx) {
                Map<String,Property> beanProps = ctx.getProperties(ctx.getProperty().getBase());
                Integer price = (Integer)beanProps.get("price").getValue();
                if(price <= 0||price==null) {
                    this.addInvalidMessage(ctx, "price", "請輸入大於0的有效數字");
                }
            }
        };
    }
}
