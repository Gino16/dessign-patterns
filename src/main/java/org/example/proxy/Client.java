package org.example.proxy;

public class Client {

	public static void main(String[] args) {
		Image img = ImageFactory.getImage("Image.bmp");

		img.setLocation(new Point2D(10, 10));
		System.out.println(img.getLocation());
		img.render();
	}

}
