import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        //How to write a file using Java (4 popular options)

        //FileWriter = good for small performance or medium-sized text files
        //BufferedWriter = better performance for large amounts of text
        //PrintWriter = best for structured data, like reports or logs
        //FileOutputStream = best for binary files (e.g. images, audio files)

        String filePath = "ABSOLUTE PATH";
        String textContent = """
                This is a multiline text
                Using a double set of triple quotes
                Is this working?
                """;


        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}
