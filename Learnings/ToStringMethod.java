/*
 * toString() -> special method that all object inherit, that returns
 * a string that "textually reperesents " an object
 * can be used both implicitly and explixitly
 */
import java.math.*;
 class Car{
    int[] test = {1,2,3,4,5};
    
    @Override
    public String toString(){

        //we are making an array into a string number 
        StringBuilder sb = new StringBuilder();
        for(int x : test){
            sb.append(x);
        }

        //convert this String object to BigInteger object so that we can add one to the String

        BigInteger b = new BigInteger(sb.toString());

        //now we can add 1 to 12345

        BigInteger result = b.add(BigInteger.ONE);

        //return the String 

        return "Original String" +sb+ "After adding 1 " +result;
    }

    
 }

 public class ToStringMethod{
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
    }
 }

/*
 * so if you want to return an int array as a number you will have to use StringBuilder cause
 * you can not change a array once its created but using StringBuilder() class and its methid
 * append we can easily achieve what you want 
 * 
 * "if you dont sacrifice for what you want, what you want becomes the Sacrifice"
 * 
 * 
 * 
 */