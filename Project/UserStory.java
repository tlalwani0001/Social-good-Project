import java.util.Scanner;

public class UserStory {

  /*
  *This is the 1D array of Chart objects
  */
  private Chart[] data;    

  /*
  *No-Argument Constructor
  */
  public UserStory() {
      this.data = new Chart[0]; 
    }

  /*
  *takes three file names (songsFile, streamsFile, artistFile) 
   and processes the data from those files to create Chart objects
  */
  public UserStory(String songsFile, String streamsFile, String artistFile) {
    data = createInfo(songsFile, streamsFile, artistFile);
  }

  /*
  *Each Chart object is initialized with a song name, stream count, and artist name
  */
  public Chart[] createInfo(String songsFile, String streamsFile, String artistFile) {
    /*
    *Read data from the provided files using the FileReader class methods
    */
    String[] songsData = FileReader.toStringArray(songsFile);
    double[] streamsData = FileReader.toDoubleArray(streamsFile); 
    String[] artistData = FileReader.toStringArray(artistFile);
    Chart[] tempAnswers = new Chart[songsData.length];

    /*
    *Loops through the data and create a new Chart object for each set of song, stream, and artist
    */
    for (int index = 0; index < tempAnswers.length; index++) {
      tempAnswers[index] = new Chart(songsData[index], streamsData[index], artistData[index]);
    }

    return tempAnswers;
  }

  /*
  * Returns the Chart object at the specific position in the array
  */
  public Chart getData(int position) {
    return data[position];
  }

  /*
   * Method that counts the stream based on the target artist with an integer value
   */
  public int countArtist(String targetArtist) {
    int count = 0;

    for (Chart artist : data) {
      if (artist.getArtist().equals(targetArtist)) {
        count++;
      }
    }

    return count;
  }

 /*
 * Method that counts the stream based on the target artist with a double value
 */
  public double countStreams(String targetArtist) {
    double count = 0.0;
   for(Chart streams : data) {
     if(streams.getArtist().equals(targetArtist)){
        count+=streams.getStreams();
     }
   }
    return count;
 }
  
  /*
   * Returns a String containing the information about the data
   */
  public String toString() {
    String result = "";

    for (Chart response : data) {
      result += response + "\n----------\n";
    }

    return result;
  }
}