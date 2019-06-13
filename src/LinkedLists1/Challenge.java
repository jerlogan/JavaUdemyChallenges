package LinkedLists1;



// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Challenge {


    public static void main(String[] args) {

//        Creating songs

//        THRILLER

        LinkedList<Song> thrillerSongs = new LinkedList<Song>();
        Song thrillerSong1 = new Song("Baby Be Mine", "3:45");
        Song thrillerSong2 = new Song("The Girl Is Mine", "5:24");
        Song thrillerSong3 = new Song("Thriller", "4:45");
        Song thrillerSong4 = new Song("Beat It", "6:11");
        Song thrillerSong5 = new Song("Billie Jean", "4:17");
        thrillerSongs.add(thrillerSong1);
        thrillerSongs.add(thrillerSong2);
        thrillerSongs.add(thrillerSong3);
        thrillerSongs.add(thrillerSong4);
        thrillerSongs.add(thrillerSong5);

//        HOTEL CALIFORNIA

        LinkedList<Song> hotelCaliforniaSongs = new LinkedList<Song>();
        Song hotelCaliSong1 = new Song("Hotel California", "6:31");
        Song hotelCaliSong2 = new Song("New Kid in Town", "5:04");
        Song hotelCaliSong3 = new Song("Life in the Fast Lane", "4:46");
        Song hotelCaliSong4 = new Song("Wasted Time", "4:56");
        Song hotelCaliSong5 = new Song("Victim of Love", "4:10");
        hotelCaliforniaSongs.add(hotelCaliSong1);
        hotelCaliforniaSongs.add(hotelCaliSong2);
        hotelCaliforniaSongs.add(hotelCaliSong3);
        hotelCaliforniaSongs.add(hotelCaliSong4);
        hotelCaliforniaSongs.add(hotelCaliSong5);

//        BACK IN BLACK

        LinkedList<Song> acdcSongs = new LinkedList<Song>();
        Song acdcSong1 = new Song("Hells Bells", "5:12");
        Song acdcSong2 = new Song("Shoot to Thrill", "5:17");
        Song acdcSong3 = new Song("Back in Black", "4:15");
        Song acdcSong4 = new Song("You Shook Me All Night Long", "4:56");
        Song acdcSong5 = new Song("Have a Drink on Me", "3:58");
        acdcSongs.add(acdcSong1);
        acdcSongs.add(acdcSong2);
        acdcSongs.add(acdcSong3);
        acdcSongs.add(acdcSong4);
        acdcSongs.add(acdcSong5);








//        This combines all songs from  each album into one big Linked List named songs
//        -----------------------------------------------------------------------------


        LinkedList<Song> songs = new LinkedList<Song>();
        ListIterator<Song> thrillerIterator = thrillerSongs.listIterator();
        ListIterator<Song> hotelIterator = hotelCaliforniaSongs.listIterator();
        ListIterator<Song> acdcIterator = acdcSongs.listIterator();
        while (thrillerIterator.hasNext()) {
            songs.add(thrillerIterator.next());
        }
        while (hotelIterator.hasNext()) {
            songs.add(hotelIterator.next());
        }
        while (acdcIterator.hasNext()) {
            songs.add(acdcIterator.next());
        }








//        Creating albums

        Album thriller = new Album("Michael Jackson", "Thriller", thrillerSongs);
        Album hotelCalifornia = new Album("The Eagles", "Hotel California", hotelCaliforniaSongs);
        Album backInBlack = new Album("ACDC", "Back in Black", acdcSongs);

//         Add albums to playlist

        ArrayList<Album> allAlbums = new ArrayList<Album>();
        allAlbums.add(thriller);
        allAlbums.add(hotelCalifornia);
        allAlbums.add(backInBlack);


        Playlist myPlaylist = new Playlist(allAlbums);



//        ===========================
//        TIME TO EXECUTE EVERYTHING!
//        ===========================

        songOptions(songs);






    }

    public static void songOptions(LinkedList<Song> songs){
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> songIterator = songs.listIterator();

        if (songs.isEmpty()) {
            System.out.println("Your playlist is currently empty.");
        } else {
            Song thisSong = songIterator.next();

            System.out.println("\n\n\nYou are now listening to:\n " + thisSong.getTitle() + " (" + thisSong.getDuration() + ")" +
                    "\nPress 6 to delete this song.\n");
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int deleteSong = scanner.nextInt();
            scanner.nextLine();
            if (deleteSong == 6) {
                songIterator.remove();
                System.out.println(thisSong.getTitle() + " has been removed from your playlist.");
            }


        }

        while (!quit) {

            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 0:
                    if (!goingForward) {
                        if (songIterator.hasNext()) {
                            songIterator.next();
                        }
                        goingForward = true;
                    }
                    if (songIterator.hasNext()) {
                        Song thisSong  = songIterator.next();
                        System.out.println("You are currently listening to " +
                                thisSong.getTitle() + " (" +
                                thisSong.getDuration() + ")" +
                                "\nPress 6 to delete this song.\n");
                        Scanner scanner2 = new Scanner(System.in);
                        int deleteSong = scanner2.nextInt();
                        scanner2.nextLine();
                        if (deleteSong == 6) {
                            songIterator.remove();
                            System.out.println(thisSong.getTitle() + " has been removed from your playlist.");
                        }
                    } else {
                        System.out.println("This is the end of your playlist.");
                    }
                    break;
                case 1:
                    if (goingForward) {
                        if (songIterator.hasPrevious()) {
                            songIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (songIterator.hasPrevious()) {
                        Song thisSong  = songIterator.previous();
                        System.out.println("You are currently listening to " +
                                thisSong.getTitle() + " (" +
                                thisSong.getDuration() + ")");
                        Scanner scanner2 = new Scanner(System.in);
                        int deleteSong = scanner2.nextInt();
                        scanner2.nextLine();
                        if (deleteSong == 6) {
                            songIterator.remove();
                            System.out.println(thisSong.getTitle() + " has been removed from your playlist.");
                        }
                    } else {
                        System.out.println("This is the beginning of your playlist!");
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (songIterator.hasPrevious()) {
                            Song thisSong = songIterator.previous();
                            System.out.println("You are currently listening to " +
                                    thisSong.getTitle() + " (" +
                                    thisSong.getDuration() + ")" +
                                    "\nPress 6 to delete this song.\n");
                            Scanner scanner2 = new Scanner(System.in);
                            int deleteSong = scanner2.nextInt();
                            scanner2.nextLine();
                            if (deleteSong == 6) {
                                songIterator.remove();
                                System.out.println(thisSong.getTitle() + " has been removed from your playlist.");
                            }

                        }
                        goingForward = false;
                    } else if (!goingForward) {
                        if (songIterator.hasNext()) {
                            Song thisSong  = songIterator.next();
                            System.out.println("You are currently listening to " +
                                    thisSong.getTitle() + " (" +
                                    thisSong.getDuration() + ")" +
                                    "\nPress 6 to delete this song.\n");
                            Scanner scanner2 = new Scanner(System.in);
                            int deleteSong = scanner2.nextInt();
                            scanner2.nextLine();
                            if (deleteSong == 6) {
                                songIterator.remove();
                                System.out.println(thisSong.getTitle() + " has been removed from your playlist.");
                            }
                        }
                        goingForward = true;
                    }
                    break;
                case 3:
                    System.out.println("\n\nView Your Playlist\n\n");
                    for (int i = 0; i < songs.size(); i++) {
                        System.out.println(songs.get(i).getTitle() + " (" +
                                songs.get(i).getDuration() + ")");
                    }
                    System.out.println("===================================\n\n" +
                                    "Press 4 to go back to menu");

                    break;
                case 4:
                    printMenu();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    quit=true;
                    break;
            }
        }

    }

    public static void printMenu(){
        System.out.println("What would you like to do?\n\n" +
                "0: Next Song\n" +
                "1: Previous Song\n" +
                "2: Replay Song\n" +
                "3: View My Playlist\n" +
                "4: Go to Menu\n" +
                "5: Quit\n");
    }

}
