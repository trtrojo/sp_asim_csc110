import java.util.Scanner;

 /* WeatherForecast.java -- Return weather forecast
  *
  *  Nightmare Moon <luna@canterlot.eq> (CHANGE THIS!!!!!)
  *
  *  Return (3) different objects containing weather forecasts in new york...?
  *   Format of object: SEP17_10_30_AM
  *   Then, Initalize each object with the actual reading of the weather.
  *
  *  USAGE: Compile, then run.
  */

public class WeatherForecast {

	public static void main(String[] args) {
		Weather NOV22_03_30_AM = new Weather("NOV22", "3:30AM", "40.0 F", "W 11 mph", "60.0", "27.0", "29.97", "10.0 mi");
		Weather NOV22_04_00_AM = new Weather("NOV22", "4:00AM", "40.0 F", "W 10 mph", "60.0", "27.0", "30.00", "10.0 mi");

		System.out.println(NOV22_03_30_AM.getWeather());
		System.out.println(NOV22_04_00_AM.getWeather());
	}


	/* The weather class as defined by the assignment
	 * Usage, initalize with various details, then use printWeather to return a string of the
	 *  current weather.
	 */
	static class Weather {
		//Constructor function:
		// Usage: new Weather SEP17_10_30AM = Weather("SEP17", "10:30AM", "99", etc...)

		String date;
		String time;
		String wind;
		String temperature;
		String humidity;
		String dewPoint;
		String pressure;
		String visibility;

		public Weather(String date, String time, String temperature, String wind, 
				String humidity, String dewPoint, String pressure, 
				String visibility) {

			//Defining internal class functions so we can use them later in
			// another function. We need this otherwise the variables in main
			// will not be available to other functions here.
			this.date = date;
			this.time = time;
			this.wind = wind;
			this.humidity = humidity;
			this.dewPoint = dewPoint;
			this.pressure = pressure;
			this.visibility = visibility;
			this.temperature = temperature;

		}

		//Using '(String) variable' as a cheap way to convert a number into a string so java
		// wont throw a hissyfit.
		//
		// Returns "The temperature for new york for today 11/10@12:13AM is....."

		public String getWeather() {
			return "The temperature in New York for today, " + date + "@" + time + " is " +
				 temperature + ". The wind speed is " + wind + ". The humidity is " + 
				 humidity + "%. The dew point is " + dewPoint +
				". The pressure is " +  pressure + "in. The visibility is " + visibility
				+ ".";
		}

	}



}
