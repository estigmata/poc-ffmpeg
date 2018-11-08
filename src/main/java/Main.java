import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(final String[] args) {
    try {
      String param[] = {"C:\\FFMpeg\\bin\\ffmpeg", "-loglevel", "repeat+level+verbose", "-i", "C:\\Videos\\ProgressMeeting.mp4", "C:\\Videos\\ProgressMeeting.avi"};
      Process p = Runtime.getRuntime().exec(param);
      BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
      String line = "";
      while ((line = br.readLine()) != null) {
        System.out.println("La linea es " + line);
      }
    } catch(IOException ex) {
      System.out.println(Main.class.getName() + " " + ex);
      //log(Level.SEVERE, null, ex)
    }
  }
}
