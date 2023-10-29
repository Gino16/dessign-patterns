package org.example.decorator;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		Message htmlMessage = new HtmlEncodedMessage(m);
		System.out.println(htmlMessage.getContent());;

		Message encoded = new Base64EncodedMessage(htmlMessage);
		System.out.println(encoded.getContent());
	}
}
