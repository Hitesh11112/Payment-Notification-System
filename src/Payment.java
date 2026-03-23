public class Payment{
  int amount;

  public void setAmount(int amt){
    this.amount = amt;
  }
  boolean validateAmt(User U){
    if(amount <= 0 || amount > U.balance ) {
      return false;
    }
    return true;
  }
  public void checkUser(User U){
    boolean validated = validateAmt(U);
    if(validated){
      U.deductBalance(amount);
      System.out.println("Payment Successful");
      U.balance -= amount;
    }else {
      System.out.println("Payment Failed");
    }
  }
}