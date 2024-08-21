import SerliazationOrDeselization.POJOClass;

class Message{
        public static void main(String[] args) {
            POJOClass m = new POJOClass();
            m.SetMessage("Hello");
         String msg=   m.getMessage();
            m.SetGreet("Hi");
            String grt =    m.getGreet();
            System.out.println(msg);
            System.out.println(grt);
        }
    }


//    In Rest Assured
/*
Message message =new Message();
message.setMessage('My message');
given().body(
{
"message" : "Hello",
    "greet" : "Hi"
}).
when().post("/message");

{
"message" : "Hello",
    "greet" : "Hi"
}

So we can write a json in java using Object classes, this is known as Serialization
 */


//  ************** DeSerialization***************
//Opposite of Serialization
//We can extract the value from Jason payload using get method. In Serialization set method is very important , here Get method is important.
// Earlier we have Created a OAuth class, in that we extract the Course details using Deserialization.Check there.

