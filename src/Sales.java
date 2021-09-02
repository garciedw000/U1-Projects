import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */

    public static void main(String[] args){
        String displayPrice;
        double salePrice;
        int quantity;
        int discount;
        int taxAmount;



        displayPrice = JOptionPane.showInputDialog("How much is that item?");
        salePrice = Double.parseDouble(displayPrice);

        displayPrice = JOptionPane.showInputDialog("How many you want?");
        quantity = Integer.parseInt(displayPrice);

        displayPrice = JOptionPane.showInputDialog("What was the discount amount?");
        discount = Integer.parseInt(displayPrice);

        displayPrice = JOptionPane.showInputDialog("What is the sales tax?");
        taxAmount = Integer.parseInt(displayPrice);


        DecimalFormat roundTo2 = new DecimalFormat("0.00");


        final double taxRate = taxAmount/100.0;
        final double discountRate = discount/100.0;



        double subTotal = salePrice * quantity;
        double taxTotal = subTotal * taxRate;
        double totalCost = subTotal * (1 + taxRate) * (1 - discountRate);




        JOptionPane.showMessageDialog(null, "Your subtotal is $" + roundTo2.format(subTotal));
        JOptionPane.showMessageDialog(null, "Your total is $" + roundTo2.format(totalCost));
        JOptionPane.showMessageDialog(null, "Your tax total is $" + roundTo2.format(taxTotal));


    }






}
