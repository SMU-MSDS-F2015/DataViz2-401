//import processing.data.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
 

public class SunData {
	
	double latitude = 36.7201600;
	double longitude = -4.4203400;
	
	public SunData(float latitude, float longitude){
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	//public getSunrise 
	//http://api.sunrise-sunset.org/json?lat=36.7201600&lng=-4.4203400
	//https://www.usgeocoder.com/api_sample_output
	
	public SunData() {
		// TODO Auto-generated constructor stub
	}

	public void callSunriseAPI(){
		
		//JSONObject sunriseJson = new JSONObject();
		//http://crunchify.com/how-to-send-http-request-and-capture-response-in-java/
		try {
			URL url = new URL("http://api.sunrise-sunset.org/json?lat=36.7201600&lng=-4.4203400");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuilder sb = new StringBuilder();
			String line;
			while (null != (line = br.readLine())) {
				sb.append(line);
			}
			
			//sunriseJson = new JSONObject(sb.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
}
