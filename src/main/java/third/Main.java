package third;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class Main {
    static final String pathToTestFile = "src/main/resources/node_to_json_test.json";

    public static void main(String[] args) {

        // 1 Вариант
        try {
            NodeBean node = new NodeBean(2016, "baeldung.com");
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
            mapper.writeValue(new File(pathToTestFile), node);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
