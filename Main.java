import java.text.NumberFormat;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
NumberFormat currency=	NumberFormat.getCurrencyInstance();
 String result=currency.format(123455643.4543);
 System.out.println(result);
  }
}