import java.io.IOException;
import org.json.*;
    public class Principal {
        public static void main(String[] args) throws IOException, JSONException{
            String jsonStr = "{student : { age:30, name : Kumar, technology : Java } }";
            JSONObject json = new JSONObject(jsonStr);
            String xml = XML.toString(json);
            System.out.println(xml);
        }
    }

