/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_exception;

/**
 *
 * @author jiayuan
 */
public class Account {
    protected double balance;
    public Account(int balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(int amt){
        balance += amt;
    }
    public void withdraw(int amt)throws OverDrawException{
        if(balance < amt){
            throw new OverDrawException("unavailable balance",amt - balance);
        }
        balance -= amt;
    }
    public class OverDrawException extends Exception{
        private double deficit;
        public OverDrawException(){}
        public OverDrawException(String msg, double deficit){
            super(msg);
            this.deficit = deficit;
        }
        public double getDeficit(){
            return deficit;
        }
    }
    
    public static void main(String []args){
        Account a = new Account(500);
        try{
            a.withdraw(600);
        }catch(OverDrawException e){
            e.printStackTrace();
            System.err.println("透支金额："+e.getDeficit());
        }
    }
    
}
