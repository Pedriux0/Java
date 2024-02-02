package account;

import java.util.WeakHashMap;

public class Account1 {
    public static final int Checking = 1;
    public static final int Saving = 2;
    private static final double annualInterest = 0.5;

    private static int nextId = 1000;

    private int Id = nextId;

    private int type ;

    private double balance;

    public Account1(int type){
        this(type, 0);
        nextId++;
    }
    public Account1(int type, double balance){
        this.type= type;
        this.balance = balance;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Account1.nextId = nextId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterest(){
        return annualInterest;
    } public void withdraw(double amount){balance -= amount;}
    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "Id=" + Id +
                ", type=" + type +
                ", balance=" + balance +
                '}';
    }
}