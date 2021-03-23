import java.text.NumberFormat;

class Main {
  public static void main(String[] args) {
System.out.println("Hello world!");
NumberFormat currency=	NumberFormat.getCurrencyInstance();
 String result=currency.format(123455643.4543);
 System.out.println(result);

NumberFormat percent=	NumberFormat.getPercentInstance();
String result1=percent.format(0.1);
System.out.println(result1);


String result2=NumberFormat.getPercentInstance.format(0.2);
System.out.println(result2);


  }
}