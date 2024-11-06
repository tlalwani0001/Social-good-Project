public class Chart {
  /*
  *Instance variables
  */
  private String songs;
  private double streams;
  private String artist;

  /*
  *Assigns the value of the parameters to the instance variables of the Chart object
  */
  public Chart(String songs, double streams, String artist) {
    this.songs = songs;
    this.streams = streams;
    this.artist = artist;
  }

  /*
  *Getter method to return the songs
  */
  public String getSongs() {
    return songs;
  }

  /*
  *Getter method to return the streams
  */
  public double getStreams() {
    return streams;
  }

  /*
  *Getter method to return the artist
  */
  public String getArtist() {
    return artist;
  }

  /*
  *To string method to return it as a string, stating the title of the song, number of streams, and the artist name 
  */
  public String toString() {
    return "Song title: " + songs + "\nNumber of Streams: " + streams + " Billion" + "\nArtist Name: " + artist;
  }
  
}