package org.example.facade;


import org.example.facade.email.EmailFacade;

public class Client {

  public static void main(String[] args) {
    Order order = new Order("101", 99.99);

    EmailFacade emailFacade = new EmailFacade();

    System.out.println(
        "Order Email " + (emailFacade.sendOrderEmail(order) ? "sent!" : "NOT sent..."));

  }

}
