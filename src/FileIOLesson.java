import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.io.File;
import java.util.List;

public class FileIOLesson {
    //    1. create a class named 'FileIOLesson'
//    2. do your work inside a main method
//    3. create a file named 'languages.txt' speciy languages.txt as a relative path.
//    4. run your code that creates the languages.txt file again, what happens when you try to create a file that laready exists
//    5. Update your code to check for the presences of languages.txt
    public static void main(String[] args) throws IOException {
        try {
            File myObj = new File("languages.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        }
    catch(IOException exception){
                System.err.println("An error occured.");
            }

        Path filepath = Paths.get("languages2.txt");
        if(! Files.exists(filepath)) {Files.createFile(filepath);
            System.out.println("File was created.");}
        else {
            System.out.println("File already exists.");
        }

//        1. Create a variable named languages that is a list of strings. Each string should be one programming language that you know.
//        1. Write the code to add the programming languages you know, each on a seperate line, to languages.txt.

//        List<String> languageList = Arrays.asList("HTML", "Javascript", "Java"); //List is an interface, <String> is a type, Arrays is a 'utility class' which means all static methods, but we don't instantiate it. asList is one of those static methods
//        Path filepath2 = Paths.get("languages.txt");
//        Files.write(filepath2,languageList, StandardOpenOption.APPEND);//Every time it runs, it appends to the end of the file.


//        1. Run your code and open the languages.txt file. What do you notice?
//        1. Re-run your code that adds the languages. Open the languages.txt file again. What do you notice?
//        1. Modify your languages variable and remove one of the languages. Re-run your code and inspect the languages.txt file. What do you notice?

        Path filepath3 = Paths.get("languages.txt");
        List<String> lines = Files.readAllLines(filepath);
        System.out.println(lines);

        for (String line : lines) {
            System.out.println("Here is a language I like: " + line);
        }


    }

    }
