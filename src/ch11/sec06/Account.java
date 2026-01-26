package ch11.sec06;

public class Account {
    private long balance;

    public long getBalance() {
        return balance;
    }

    // 입금
    public void deposit(int money){
        balance += money;
    }

    // 출금
    // 예외 객체를 던진다면 메소드에 throws로 어떤 예외를 던지는지 명시해줘야 한다.
    public void withdraw(int money) throws InsufficientException {
        if (balance < money){
            throw new InsufficientException("잔고 부족: " + (money-balance) + "원이 부족함" );
        }
        balance -= money;
    }

    public void checkBalance(){
        System.out.printf("예금금액: %,d원\n" , balance);
    }
}
