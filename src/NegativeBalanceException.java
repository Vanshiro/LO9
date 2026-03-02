import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NegativeBalanceException extends Exception {
    double negativeBalance;
    //Default negativebalanceexception with no param
    public NegativeBalanceException() {
        super("Error: Negative Balance");
        double negativeBalance = 0.0;

    }
    //Exception with indicated negativebalance
    public NegativeBalanceException(double negativeBalance) {
        super("Amount exceeds balance by " + negativeBalance);
        this.negativeBalance = negativeBalance;
        //create string and output file to write error
        String fileName = "output.txt";
        String contentToAppend = "Amount exceeds balance by " + negativeBalance + System.lineSeparator();

        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
             bw.write(contentToAppend);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
    //to string method
    @Override
    public String toString() {
        return "Balance of " + negativeBalance + " not allowed";
    }
}
