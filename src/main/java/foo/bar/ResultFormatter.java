package foo.bar;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


public class ResultFormatter {

    public String formatAsJson(double value) throws JSONException {

        JSONObject format = new JSONObject();
        format.put("result", value);
        return format.toString();
    }
}
