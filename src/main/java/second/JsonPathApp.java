package second;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonPathApp {

    public static void main(String[] args) throws Exception {
  /*      File jsonFile = new File("src/main/resources/test.json").getAbsoluteFile();

        JsonFactory factory = new JsonFactory();

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        mapper.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);

        factory.setCodec(mapper);
        JsonParser parser = factory.createParser(jsonFile);

        JsonToken token = parser.nextToken();
        if (token == null) {
            // return or throw exception
        }

        // the first token is supposed to be the start of array '['
        if (!JsonToken.START_ARRAY.equals(token)) {
            // return or throw exception
        }

        // iterate through the content of the array
        while (true) {

            // parse your objects by means of parser.getXxxValue() and/or other parser's methods

            TreeNode firstJsonNode = parser.readValueAsTree();
            MessageSubscription value = mapper.readValue(parser, MessageSubscription.class);

            System.out.println(value);

            token = parser.nextToken();
            if (!JsonToken.START_OBJECT.equals(token)) {
                break;
            }
            if (token == null) {
                break;
            }
        }*/

        File jsonFile = new File("src/main/resources/test.json").getAbsoluteFile();

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        mapper.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);

        DeserializeSubscription value = mapper.readValue(jsonFile, DeserializeSubscription.class);
        System.out.println(value);
    }
}
