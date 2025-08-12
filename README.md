## Author
- Gustavo Oliveira Rafael 

# What was done

In IntelliJ, I downloaded the ANTLR v4 and ANTLR V4-Tool plugins.

I made sure that Java was installed in the latest version.

In IntelliJ, under Project Structure, I went to Add, From Library, new Library, From Maven, and added antlr.antlr4.

I created the .g4 file to define the structure and, from that file, generated the ANTLR Recognizer.

In the Main class, I read an input .txt file and created an inner class that extends Calc2BaseVisitor to override the methods and add the logic for the calculations.

In the input .txt file, I defined the language.

I compiled and ran the Main class.
