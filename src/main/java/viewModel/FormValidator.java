package viewModel;

import java.util.Map;

import org.zkoss.bind.Property;
import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.validator.AbstractValidator;

public class FormValidator extends AbstractValidator{

    @Override
    public void validate(ValidationContext ctx) {
        System.out.println("Valid");
        try {
        Map<String,Property> beanProps = ctx.getProperties(ctx.getProperty().getBase());

        String model = (String)beanProps.get("model").getValue();
        String make = (String)beanProps.get("make").getValue();
        String description = (String)beanProps.get("description").getValue();
        Integer price = (Integer)beanProps.get("price").getValue();

        System.out.println("Model :" + model);
        System.out.println("Make :" + make);
        System.out.println("Description : " + description);
        System.out.println("Price : " + price);

        validateModel(ctx,model);
        validateMake(ctx, make);
        validateDescription(ctx, description);
        validatePrice(ctx, price);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void validateModel(ValidationContext ctx, String model) {
      if( model == null || model.trim().length() == 0){
          this.addInvalidMessage(ctx, "model", "**請輸入車款品牌");
      }
    }

    private void validateMake(ValidationContext ctx, String make) {
        if(make == null || make.trim().length() == 0) {
            this.addInvalidMessage(ctx, "make", "**請輸入車款型號");
        }
    }

    private void validateDescription(ValidationContext ctx, String description) {
        if(description == null || description.trim().length() == 0) {
            this.addInvalidMessage(ctx, "description", "**請盡量描述車款詳情");
        }
    }

    private void validatePrice(ValidationContext ctx, Integer price) {
        if( price == null || price <= 0) {
            this.addInvalidMessage(ctx, "price", "**請輸入大於0的有效數字");
        }
    }
}
