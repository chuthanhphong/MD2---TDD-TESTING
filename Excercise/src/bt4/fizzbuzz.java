package bt4;

public class fizzbuzz {

   public  static String  check(int num){
       boolean Fizz = num%3==0;
       boolean Buzz = num%5==0;
       boolean FizzBuzz = num%3==0&&num%5==0;
       if(FizzBuzz){
           return "FizzBuzz";
       }else if(Fizz){
           return "Fizz";
       }else if(Buzz){
           return "Buzz";
       }else {
           return "None";
       }
   }
}
