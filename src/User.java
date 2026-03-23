public class User{
  String name;
  int balance;

  public void setName(String n) {
    this.name = n;
  }
  public void setBalnce(int bal){
    this.balance = bal;
  }
  public void deductBalance(int amt) {
    this.balance -= amt;
  }
  public void getShow(){
    System.out.println("The name of the User is " + name + " ,current Balance is " + balance);
  }
}