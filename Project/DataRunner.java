import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    /*
    *Create a new instance of the UserStory class, which processes the data
    */
    UserStory responses = new UserStory("songs.txt", "streams.txt", "artist.txt");

    /*
    *Print all the information from the responses object (which calls the toString() method of UserStory)
    This will display all the song data, streams, and artist information before asking for user input
    */
    
    System.out.println(responses);

    /*
    *Create a new Scanner object for user input
    */
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an artist's name: ");
    
    String artistName = scanner.nextLine();

    /*
    *Call the countArtist method of the UserStory class to count how many times the artist appears in the dataset
    This method returns the number of occurrences of the artist's name in the data
    */
    int artistCount = responses.countArtist(artistName);

    if (artistCount > 0) {
   
    /*
    *Call the countStreams method of the UserStory class to get the total number of streams for the artist
    */
      double totalStreams = responses.countStreams(artistName);

    /*
    *Print out the number of times the artist appears in the dataset and the total streams for that artist
    This information is based on the artist name entered by the user
    */
      System.out.println("Number of times " + artistName + " popped up: " + artistCount);
      System.out.println("Total streams for " + artistName + ": " + totalStreams + " Billion");
    } else {
      /*
      *gives the user feedback that the entered artist was not found in the dataset
      */
      System.out.println("Sorry, no data found for " + artistName + ".");
    }

    /*
    *Close the scanner object
    */
    scanner.close();    
  }
}