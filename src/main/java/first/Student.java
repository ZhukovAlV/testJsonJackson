package first;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

    @JsonProperty
    private String name;

    @JsonProperty
    private String id;
    //getters & setters for name & id here
}
