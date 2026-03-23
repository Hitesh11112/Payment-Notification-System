public class Payment{
  int amount;

  public void setAmount(int amt){
    this.amount = amt;
  }
  boolean validateAmt(User U){
    if(amount <= 0){ 
      return false;
    }
    if(amount > U.balance ) {
      return false;
    }
    return true;
  }
  public void checkUser(User U){
    if(validateAmt(U)){
      U.deductBalance(amount);
      System.out.println("Payment Successful");
    }else {
      System.out.println("Payment Failed");
    }
  }
}