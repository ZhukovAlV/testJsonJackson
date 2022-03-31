package first;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Wrapper {

    @JsonProperty("wrapper")
    private List<Student> students;
    //getters & setters here
}
