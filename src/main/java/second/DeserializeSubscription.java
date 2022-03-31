package second;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

class DeserializeSubscription {

    private String code;
    private String reason;
    private MessageSubscription message;

    @JsonCreator
    public DeserializeSubscription(
            @JsonProperty("code") String code,
            @JsonProperty("reason") String reason,
            @JsonProperty("message") @JsonDeserialize(using = MessageSubscriptionJsonDeserializer.class) MessageSubscription message) {
        super();
        this.code = code;
        this.reason = reason;
        this.message = message;
    }

    public MessageSubscription getMessage() {
        return message;
    }

    public void setMessage(MessageSubscription message) {
        this.message = message;
    }
}
