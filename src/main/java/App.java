import java.util.HashMap;

// DecimalFormat("#.##"); import math..?
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get("/", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();

          model.put("template", "templates/home.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());


        get("/shippingResult", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();

          int height = Integer.parseInt(request.queryParams("height"));
          int width = Integer.parseInt(request.queryParams("width"));
          int length = Integer.parseInt(request.queryParams("length"));
          double weight = Double.parseDouble(request.queryParams("weight"));
          int distance = Integer.parseInt(request.queryParams("distance"));
          int speed = Integer.parseInt(request.queryParams("speed"));

          Parcel myParcel = new Parcel(height, width, length, weight, distance, speed);
          model.put("myParcel", myParcel);

          model.put("template", "templates/shippingResult.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

    }
}
