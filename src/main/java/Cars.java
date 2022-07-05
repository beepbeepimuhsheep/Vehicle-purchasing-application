/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melam
 */
public abstract class Cars {
    double installment_amount;
    double selling_price;
    double interest_rate;
    double deposit;
    double balloon_payment;
    int installment_num;
    double total;
    
    public double getInstallAmt(){
        return installment_amount;
    }
    public double getSellPrice(){
        return selling_price;
    }
    public double getIntRate(){
        return interest_rate;
    }
    public double getDeposit(){
        return deposit;
    }
    public double getBaloon(){
        return balloon_payment;
    }
    public int getInstallNum(){
        return installment_num;
    }

   public double Calculate() {
          //  A = P(1 + {r}/{n})^{nt}
          total = (selling_price - (selling_price * deposit / 100)) * ( Math.pow( 1 +  ((interest_rate / 100) / 12), (12 * (installment_num / 12))));
          return total;
    }
}
