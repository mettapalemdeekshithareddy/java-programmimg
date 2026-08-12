package day10;
import java.util.Scanner;
public class Retrieve{
  Loan[] hdfc = new Loan[5];
public Retrieve(){
   hdfc[0] = new Loan(9876543312L,267000,19.5f);
   hdfc[1] = new Loan(3456789874L,456678,12.4f);
   hdfc[2] = new Loan(0987623457L,456799,15.4f);
   hdfc[3] = new Loan(1230987634L,987645,11.2f);
   hdfc[4] = new Loan(8765120978L,345667,8.7f);
  }
  public void read(float user){
  System.out.println(user+"roi matches records");
  Arrays.stream(hdfc).filter(each->each.getRoi()>=user).forEach(obj->System.out.println(obj));
  }
public void read(long number){
System.out.println(number+" loan records");
Arrays.stream(hdfc).filter(each->
each.getLoanNo()==number).forEach(obj->System.out.println(obj));
}
 public void read(int amount){
  System.out.println("loan records less than "+amount");
  Arrays.stream(hdfc).filter(each->each.getPrinciple()
<=amount).forEach(obj->System.out.println(obj));
}
public static void main(String[] arr){
   Retrieve ret = new Retrieve();
   ret.read(15.Of);
   ret.read(09876567876L);
   ret.read(400000);
 }
  }