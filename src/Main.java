public class Main{
  public static void main(String[] arg){
    User obj1 = new User();
    obj1.setBalnce(1000);
    obj1.setName("Hitesh Patwal");

    Payment pay = new Payment();
    pay.setAmount(2000);
    obj1.getShow();
    pay.checkUser(obj1);
    obj1.getShow(); 
  }
}