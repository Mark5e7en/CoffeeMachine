package w3resource;

import javax.swing.JOptionPane;

public class MovieTicketSale {

	public static void main(String[] args) {
		String movieName;
		int ticketsSoldAdult, ticketsSoldChild, totalTicketsSold;
		double grossAmount, amountDonated, netSale;
		double priceAdultTicket, priceChildTicket, percentDonation;
		String priceAdultTicketString, priceChildTicketString, ticketsSoldAdultString, ticketsSoldChildString, percentDonationString;
		String title = "Theater Sales Data";
		String message;
		
		movieName = JOptionPane.showInputDialog("Enter the movie name:");
		priceAdultTicketString = JOptionPane.showInputDialog("Enter the price of an adult ticket:");
		priceChildTicketString = JOptionPane.showInputDialog("Enter the price of a child ticket:");
		ticketsSoldAdultString = JOptionPane.showInputDialog("Enter the number of adult tickets sold:");
		ticketsSoldChildString = JOptionPane.showInputDialog("Enter the number of child tickets sold:");
		percentDonationString = JOptionPane.showInputDialog("Enter the percentage of the donation:");
		
		priceAdultTicket = Double.parseDouble(priceAdultTicketString);
		priceChildTicket = Double.parseDouble(priceChildTicketString);
		ticketsSoldAdult = Integer.parseInt(ticketsSoldAdultString);
		ticketsSoldChild = Integer.parseInt(ticketsSoldChildString);
		percentDonation = Double.parseDouble(percentDonationString);
		
		grossAmount = priceAdultTicket * ticketsSoldAdult + priceChildTicket * ticketsSoldChild;
		
		amountDonated = grossAmount * percentDonation / 100;
		
		netSale = grossAmount - amountDonated;
		
		totalTicketsSold = ticketsSoldAdult + ticketsSoldChild;
		
		message = "Movie Name: " + movieName + "\nNumber of Tickets Sold: " + totalTicketsSold + "\nGross Amount: $" + String.format("%.2f", grossAmount) + "\nPercentage of the Gross Amount Donated: " + String.format("%.2f%%", percentDonation) + "\nAmount Donated: $" + String.format("%.2f", amountDonated) + "\nNet Sale: $" + String.format("%.2f", netSale);
		
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
