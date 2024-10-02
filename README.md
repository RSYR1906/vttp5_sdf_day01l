# Compile instructions for Java :smile:

**javac --source-path myapp -d bin myapp/\*** (Compiling anything in myapp folder and place inside the bin folder as .class) :rocket:

**java -cp bin myapp.HelloWorld** (-cp means classpath pointing at the bin folder and running the executable)

**jar -c -v -f hworld.jar -e myapp.HelloWorld .** (creating a jar file from a class file)

**java -jar hworld.jar myapp.HelloWorld** (Running the jar file to get an output)

**java -jar hworld.jar** (This command tells the JVM to run the Main-Class defined in the JAR’s manifest, which is myapp.HelloWorld in this example.)

A JAR file is essentially a package containing compiled Java .class files and other resources.

The JAR is created after you compile your Java source code into .class files.

The JAR file allows you to distribute your Java application as a single package that can be easily executed using the JVM.
