import javax.sound.sampled.*; // javax.sound.sampled.* gives access to audio classes: AudioSystem, Clip, AudioInputStream, etc.
import java.io.File; // java.io.File lets us represent and work with file paths and files on disk
import java.io.FileNotFoundException; // FileNotFoundException is thrown when the file path doesn’t point to a real file
import java.io.IOException; // IOException is thrown when an input/output error occurs while handling files or streams
import java.util.Scanner; // Scanner is used for reading user input from the console

public class Main {
    public static void main(String[] args){
        //File most be on .wav

        //Relative File Path
        String FilePath = "";// src\\NAME OF THE FILE.FORMAT

        //File object
        File file = new File(FilePath);

        // try-with-resources ensures audioStream and scanner will be closed automatically
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); // AudioInputStream: reads audio data from the file
            Scanner scanner = new Scanner(System.in)){

            Clip clip = AudioSystem.getClip(); // Clip: represents a sound clip that can be played, stopped, and rewound
            clip.open(audioStream); // Load the audio data into the Clip
            System.out.println("No problems detected");

            String response = "";

            while (!response.equals("Q")){
                System.out.println("P = play");
                System.out.println("S = Stop");
                System.out.println("R = Replay");
                System.out.println("Q = quit");
                System.out.print("Enter your choice: ");
                response = scanner.nextLine().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate the file");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye");
        }
    }
}
