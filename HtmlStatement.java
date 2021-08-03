import java.util.Enumeration;

public class HtmlStatement extends Statement {
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = "Rentals for " + aCustomer.getName() +
      "\n";
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "\n";
      }
      //add footer lines
      result += "You owe" +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
      result += "On this rental you earned " + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
      return result;
   }
}
