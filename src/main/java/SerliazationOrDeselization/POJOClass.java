package SerliazationOrDeselization;

public class POJOClass {// plain old Java object
    //    Serialization : in Rest Assured context is a process of converting Java Object into Request Body(Payload)
//    Suppose we have a Json file like below, then how can we write these in Java as below and In rest Assured
/*{
    "message" : "Hello",
    "greet" : "Hi"
}*/
    private String greet;
    private String message;

    //Creating two method for Set and get message or greet.
    public String getMessage() {
        return message;
    }

    public void SetMessage(String message) {
        this.message = message;

    }

    public String getGreet() {
        return greet;
    }

    public void SetGreet(String greet) {
        this.greet = greet;

    }
//         Creating Java Object

}
