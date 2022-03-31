package first;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) {
        String jsonStr = "{" + "\"" + "wrapper" + "\"" + ":[{" + "\""
                + "id" + "\"" + ":" + "\"" + "13" + "\"" + ","+ "\"" + "name"+ "\"" + ":"
                + "\"" + "Fred" + "\"" +"}]}";
        System.out.println(jsonStr);
        ObjectMapper mapper = new ObjectMapper();
       // mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Wrapper wrapper = null;
        try {
            wrapper = mapper.readValue(jsonStr , Wrapper.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("wrapper = " + wrapper);
    }
}
