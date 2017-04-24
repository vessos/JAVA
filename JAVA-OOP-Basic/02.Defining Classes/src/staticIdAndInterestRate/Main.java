package staticIdAndInterestRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,BankAccount>accounts = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = reader.readLine();

        while(!command.equals("End")){
            String[] commandArgs = command.split("\\s+");
            String commandType = commandArgs[0];

            switch(commandType){
                case "Create":
                    BankAccount account = new BankAccount();
                    accounts.put(account.getId(),account);
                    System.out.printf("Account %s created%n",account);
                    break;
                case "Deposit":
                    executeDepositCommand(accounts, commandArgs);
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.valueOf(commandArgs[1]));
                    break;
                case "GetInterest":
                    executeGetInterestCommand(accounts,commandArgs);
                    break;

            }
            command = reader.readLine();
        }
    }

    private static void executeDepositCommand(HashMap<Integer, BankAccount> accounts, String[] commandArgs) {
        int id =Integer.valueOf(commandArgs[1]);
        if(!accounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else{
            double amount = Double.valueOf(commandArgs[2]);
            BankAccount account = accounts.get(id);
            accounts.get(id).deposit(amount);
            System.out.printf("Deposited %.0f to %s%n",amount,account);
        }
    }

    private static void executeGetInterestCommand(HashMap<Integer, BankAccount> accounts, String[] commandArgs) {
        int id =Integer.valueOf(commandArgs[1]);
        if(!accounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else{
            int years = Integer.valueOf(commandArgs[2]);
            BankAccount account = accounts.get(id);
            System.out.printf("%.2f%n",account.getInterestRate(years));
        }
    }


}
