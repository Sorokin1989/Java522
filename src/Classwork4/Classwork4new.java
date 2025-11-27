package Classwork4;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Account{
   private String cardNumber;
   private String fullName;
   private double balance;
   int pin;
//   private double money;


    public Account(String cardNumber, String fullName, double balance, int pin) {
        this.cardNumber = cardNumber;
        this.fullName = fullName;
        this.balance = balance;
        this.pin = pin;
    }

//    public double getMoney() {
//        return money;
//    }
//
//    public void setMoney(double money) {
//        this.money = money;
//    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}

class AccountDatabase{
    public static ArrayList<Account> accounts;

    static {
        accounts = new ArrayList<>();
        accounts.add(new Account("11111111","dima",10000,0000));
        accounts.add(new Account("2222211","ira",5000,1234));
    }
}




interface ImoneyOperationHandler{
    void setNext(ImoneyOperationHandler next);
    void handle(String cardNumber,int pin,double money);
}

class VerifyAccountHandler implements ImoneyOperationHandler{
ImoneyOperationHandler next;

    @Override
    public void setNext(ImoneyOperationHandler next) {
this.next = next;
    }

    @Override
    public void handle(String cardNumber, int pin, double money) {
boolean accountExists=AccountDatabase.accounts
        .stream()
        .anyMatch(acc->acc.getCardNumber().equals(cardNumber)
        && acc.getPin()==pin);
if(accountExists){
    if(next!=null){
        next.handle(cardNumber,pin,money);
    }

    }else    System.out.println("Account not found");
}

    }


class CheckAccountHandler implements ImoneyOperationHandler{
    ImoneyOperationHandler next;

    @Override
    public void setNext(ImoneyOperationHandler next) {
this.next = next;
    }

    @Override
    public void handle(String cardNumber, int pin, double money) {
Account account=AccountDatabase.accounts
        .stream().filter(acc->acc.getCardNumber().equals(cardNumber))
        .findFirst().orElse(null);
if(account!=null&&account.getBalance()>=money){
if(next!=null){
    next.handle(cardNumber,pin,money);
}

}else {
    System.out.println("Укща щук");
}
    }
}

class MoneyOperationLogHandler implements ImoneyOperationHandler{
    ImoneyOperationHandler next;

    @Override
    public void setNext(ImoneyOperationHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String cardNumber, int pin, double money) {

        System.out.println(new Date()+" "+cardNumber+" "+pin+" "+money);
    if (next!=null){
        next.handle(cardNumber,pin,money);
    }
    }
}

class RecieveMoneyHandler implements ImoneyOperationHandler{
    ImoneyOperationHandler next;

    @Override
    public void setNext(ImoneyOperationHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String cardNumber, int pin, double money) {
        Account account=AccountDatabase.accounts
                .stream().filter(acc->acc.getCardNumber().equals(cardNumber))

                .findFirst().orElse(null);

if(account!=null){
    account.setBalance(account.getBalance()-money);
    System.out.println("Деньги сняты" + "Баланс " + account.getBalance() );
}
    }
}

public class Classwork4new {
    public static void main(String[] args) {
ImoneyOperationHandler verifyHandler=new VerifyAccountHandler();
ImoneyOperationHandler checkHandler=new CheckAccountHandler();
ImoneyOperationHandler moneyHandler=new MoneyOperationLogHandler();
ImoneyOperationHandler recieveHandler=new RecieveMoneyHandler();

verifyHandler.setNext(checkHandler);
checkHandler.setNext(moneyHandler);
moneyHandler.setNext(recieveHandler);

        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Введите номер карты");
            String cardNumber=scanner.nextLine();
            System.out.println("Введите пин код");
            int pin=scanner.nextInt();

            System.out.println("Сколько надо?");
           double money= scanner.nextDouble();

           verifyHandler.handle(cardNumber,pin,money);

        }while (true);
    }
}
