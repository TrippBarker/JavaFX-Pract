package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
	
	@FXML
	private Circle myCir;
	private double x;
	private double y;
	private double speed = 10;
	
	public void up(ActionEvent e) {
		System.out.println("UP");
		myCir.setCenterY(y-=speed);
	}
	
	public void down(ActionEvent e) {
		System.out.println("DOWN");
		myCir.setCenterY(y+=speed);
	}
	
	public void left(ActionEvent e) {
		System.out.println("LEFT");
		myCir.setCenterX(x-=speed);
	}
	
	public void right(ActionEvent e) {
		System.out.println("RIGHT");
		myCir.setCenterX(x+=speed);
	}
}
