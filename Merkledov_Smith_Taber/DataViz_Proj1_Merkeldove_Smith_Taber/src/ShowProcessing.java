import processing.core.*;

public class ShowProcessing extends PApplet {
	
	private String sunrise = "7:23AM";
	private String sunset = "7:43PM";
	
	public ShowProcessing() {
	}

	public void setSunrise(String sunrise){
		this.sunrise = sunrise;
	}

	public void setSunset(String sunset){
		this.sunset = sunset;
	}

	public void show(){
		PApplet.main("ShowProcessing");
	}
	
	public void settings(){
		size(500,300);
	}
	
	public void setup(){
		textSize(32);
		fill(120,50,240);
		text("Sunrise At: ", 10, 130); 
		fill(0, 102, 153);
		text("Sunset At:", 10, 190);
		//fill(0, 102, 153, 51);
		//text("word", 10, 90); 
	}
	
	public void draw(){
		textSize(24);
		fill(120,50,240);
		text(sunrise, 180, 130); 
		fill(0, 102, 153);
		text(sunset, 180, 190); 
	}
}
