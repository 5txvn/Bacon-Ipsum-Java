//declare the package
package bacon;

//import the required default packages
import java.net.*;
import java.io.*;

//declare the class
public class ipsum {
    //declare the function
    public static String generate() {
        //try to send a get request to the api
        try {
            URL url = new URL("https://baconipsum.com/api/?type=meat-and-filler&format=text");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                return inputLine;
            in.close();
        }
        //if there is an error, return an error message
        catch (Exception e) {
            return ("Error: " + e.getMessage());
        }
        return "";
    }
}