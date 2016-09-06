import processing.core.PApplet;

public class SunProject extends PApplet {

	public SunProject(){
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShowProcessing myWindow = new ShowProcessing();
		myWindow.show();
		
		SunData s = new SunData();
		s.callSunriseAPI();
		
		ShowDialog.showMessageSimple();
		ShowDialog.showInputDialog();
	}
}
