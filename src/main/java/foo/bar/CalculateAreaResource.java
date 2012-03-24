package foo.bar;

import org.codehaus.jettison.json.JSONException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/area")
public class CalculateAreaResource {

    private CalculateArea calculator;
    private ResultFormatter formatter;

    public CalculateAreaResource() {
        calculator = new CalculateArea();
        formatter = new ResultFormatter();
    }

    @Path("/square/{side}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String calculateSquare(@PathParam("side") double side) throws JSONException {
        double result = calculator.calculateSquare(side);
        return formatter.formatAsJson(result);
    }

    @Path("/rectangle/{width}/{height}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String calculateRectangle(@PathParam("width") double width, @PathParam("height") double height) throws JSONException {
        double result = calculator.calculateRectangle(width, height);
        return formatter.formatAsJson(result);
    }


    @Path("/triangle/{base}/{height}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String calculateTriangle(@PathParam("base") double base, @PathParam("height") double height) throws JSONException {
        double result = calculator.calculateTriangle(base, height);
        return formatter.formatAsJson(result);
    }
}
