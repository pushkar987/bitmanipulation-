import java.util.*;
/**
 * bitmanipulation
 */
public class bitmanipulation {
public static void main(String[] args) {
    int n = 5;// 0101
    int pos = 2; 
    int pos2 = 1;
    int bitmaks = 1<<pos; 
    int bitmask = 1<< pos2;
    int notbitmask = ~(bitmask);
    // to get the bit in bit maniputation using and and left shift
    if((bitmaks & n) == 0){
        System.out.println(" the bit is zero");
    }
    else{
        System.out.println(" the bit is one");
    }
    // this to set the bit in bit manipulation using bit wise or
    int setbit = bitmaks | n ;
    System.out.println(setbit); 
    // this is to clear the bit changee it to zero
    int clear = notbitmask & n;
    System.out.println("this is used to change the bit from one to zero  " + clear);
   
} }
