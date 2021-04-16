# baicao

multichoice java

Which of the following option leads to the portability and security of Java?
Bytecode is executed by JVM.
The applet makes the Java code secure and portable.
Use of exception handling.
Dynamic binding between objects.

Answer: (a) Bytecode is executed by the JVM.
Explanation: The output of the Java compiler is bytecode, which leads to the security and portability of the Java code. It is a highly developed set of instructions that are designed to be executed by the Java runtime system known as Java Virtual Machine (JVM). The Java programs executed by the JVM that makes the code portable and secure. Because JVM prevents the code from generating its side effects. The Java code is portable, as the same byte code can run on any platform.
Hence, the correct answer is option (a).

Which of the following is not a Java features?
Dynamic
Architecture Neutral
Use of pointers
Object-oriented


Answer: (c) Use of pointers
Explanation: The Java language does not support pointers; some of the major reasons are listed below:
One of the major factors of not using pointers in Java is security concerns. Due to pointers, most of the users consider C-language very confusing and complex. This is the reason why Green Team (Java Team members) has not introduced pointers in Java.
Java provides an effective layer of abstraction to the developers by not using pointers in Java.
Java is dynamic, architecture-neutral, and object-oriented programming language.
Hence, the correct answer is option (c).

The \u0021 article referred to as a ?
Unicode escape sequence
Octal escape
Hexadecimal
Line feed

Answer: (a) Unicode escape sequence
Explanation: In Java, Unicode characters can be used in string literals, comments, and commands, and are expressed by Unicode Escape Sequences. A Unicode escape sequence is made up of the following articles:
    A backslash '\' (ASCII character 92)
    A 'u' (ASCII 117)
    One or more additional 'u' characters that are optional.
    A four hexadecimal digits (a character from 0 - 9 or a-f or A-F)
Hence, the correct answer is the option (a).


6) _____ is used to find and fix bugs in the Java programs.

    JVM
    JRE
    JDK
    JDB


Answer: (d) JDB

Explanation: The Java Debugger (JDB or jdb) is a command-line java debugger that debugs the java class. It is a part of the Java Platform Debugger Architecture (JPDA) that helps in the inspections and debugging of a local or remote Java Virtual Machine (JVM).

The JVM (Java Virtual Machine) enables a computer to run Java or other language (kotlin, groovy, Scala, etc.) programs that are compiled to the Java bytecode. The JRE (Java Runtime Environment) is a part of JDK that contains the Java class libraries, Java class loader, and the Java Virtual Machine. The JDK (Java Development Kit) is a software development environment used to develop Java applications and applets.

Hence, the correct answer is an option (d).

7) Which of the following is a valid declaration of a char?

    char ch = '\utea';
    char ca = 'tea';
    char cr = \u0223;
    char cc = '\itea';


Answer: (a) char ch = '\utea';

Explanation: A char literal may contain a Unicode character (UTF-16). We can directly use these characters only if our file system allows us, else use a Unicode escape (\u) such as "\u02tee". The char literals are always declared in single quotes (').

The option b, c, and d, are not valid because:

    In the option b), to make a String valid char literal, we should add prefix "\u" in the string.
    In the option c), single quotes are not present.
    In the option d), "\i" is used in place of "\u."

Hence, the correct answer is the option (a).

8) What is the return type of the hashCode() method in the Object class?

    Object
    int
    long
    void


Answer: (b) int

Explanation: In Java, the return type of hashCode() method is an integer, as it returns a hash code value for the object.

Hence, the correct answer is the option (b).


9) Which of the following is a valid long literal?

    ABH8097
    L990023
    904423
    0xnf029L


Answer: (d) 0xnf029L

Explanation: For every long literal to be recognized by Java, we need to add L character at the end of the expression. It can be either uppercase (L) or lowercase (l) character. However, it is recommended to use uppercase character instead of lowercase because the lowercase (l) character is hard to distinguish from the uppercase (i) character.

For example,

    Lowercase l: 0x466rffl
    Uppercase L: 0nhf450L

Hence, the correct answer is an option (d).

10) What does the expression float a = 35 / 0 return?

    0
    Not a Number
    Infinity
    Run time exception


Answer: (c) Infinity

Explanation: In Java, whenever we divide any number (double, float, and long except integer) by zero, it results in infinity. According to the IEEE Standard for Floating-Point Arithmetic (IEEE 754), if we divide 1/0 will give positive infinity, -1/0 will give negative infinity, and 0/0 will give NaN. But on dividing an integer by zero, it throws a runtime exception, i.e., java.lang.ArithmeticException.

Hence, the correct answer is an option (c).


11) Evaluate the following Java expression, if x=3, y=5, and z=10:

++z + y - y + z + x++

    24
    23
    20
    25


Answer: (a) 24

Explanation: In the above expression, ++z means that the value will first increment by 1, then used. Now, evaluate the statement by putting the values of x, y, and z. On calculating the final answer is 24, as shown below.

++z +y -y +z + x++
11 + 5 - 5 + 10 + 3 = 24

Hence, the correct answer is option (a).


13) Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?

    javap tool
    javaw command
    Javadoc tool
    javah command


Answer: (c) Javadoc tool

Explanation: The Javadoc is a tool that is used to generate API documentation in HTML format from the Java source files. In other words, it is a program (tool) that reads a collection of source files into an internal form.

The Javadoc command line syntax is,
Javadoc [options] [packagenames] [sourcefiles] [@files]

The javap tool is used to get the information of any class or interface. It is also known as a disassembler. The javaw command is identical to java that displays a window with error information, and the javah command is used to generate native method functions.

Hence, the correct answer is option (c).


14) Which of the following creates a List of 3 visible items and multiple selections abled?

    new List(false, 3)
    new List(3, true)
    new List(true, 3)
    new List(3, false)


Answer: (b) new List(3, true)

Explanation: From the above statements, the new List(3, true) is the correct answer; this is because of the constructor type. To create a list of 3 visible items along with the multiple selections abled, we have to use the following constructor of the List class.

List (int rows, boolean multipleMode): It creates a new list initialized to display the described number of rows along with the multiple selection mode.

Therefore, in the statement new List (3, true), three (3) refers to the number of rows and true enables the multiple selections.

Hence, the correct answer is option (b).


15) Which of the following for loop declaration is not valid?

    for ( int i = 99; i >= 0; i / 9 )
    for ( int i = 7; i <= 77; i += 7 )
    for ( int i = 20; i >= 2; - -i )
    for ( int i = 2; i <= 20; i = 2* i )


Answer: (a) for ( int i = 99; i>=0; i / 9)

Explanation: The first option is not a valid declaration as i/9 is not declared correctly. The correct statement will be:
      for ( int i= 99; i>=0; i= i/9)

Then the code would execute. But without assigning the value of i/9 to a variable, it would not execute, and an exception is thrown, as shown below.

Exception in thread "main" java.lang.Error: Unresolved compilation problem:
      Syntax error on token "/", invalid AssignmentOperator

The other three statements are valid and will execute. Hence, the correct answer is the option (a).

16) Which method of the Class.class is used to determine the name of a class represented by the class object as a String?

    getClass()
    intern()
    getName()
    toString()


Answer: (c) getName()

Explanation: The getName() method of the Class class returns the name (as String) of the entity (class, interface) represented by this Class object. It is a non-static method, and available in the java.lang package.

The getClass() method of the Object class returns the runtime class of this object. The intern() and toString() methods are of String class.

Hence, the correct answer is option (c).

17) In which process, a local variable has the same name as one of the instance variables?

    Serialization
    Variable Shadowing
    Abstraction
    Multi-threading


Answer: (b) Variable Shadowing

Explanation: There are following reasons for considering a variable shadowing, they are listed below:

    When we define a variable in a local scope with a variable name same as the name of a variable defined in an instance scope.
    When a subclass declares a variable with the same name as of the parent class variable.
    When a method is overridden in the child class.

Hence, the correct answer is option (b).

18) Which of the following is true about the anonymous inner class?

    It has only methods
    Objects can't be created
    It has a fixed class name
    It has no class name


Answer: (d) It has no class name

Explanation: Anonymous inner classes are the same as the local classes except that they don't have any name. The main use of it is to override methods of classes or interfaces. And the rest three options are false about the anonymous inner classes as it can have both methods and objects. It does not have any fixed came name.

Hence, the correct answer is option(d).


19) Which package contains the Random class?

    java.util package
    java.lang package
    java.awt package
    java.io package


Answer: (a) java.util package

Explanation: The Random class is available in the java.util package. An object of the Random class is used to generate a series of pseudorandom numbers. And the object of this class is a thread-safe and cryptographically insecure object. The Random class provides a variety of methods that are used to create random numbers of type integers, float, long, double, etc.

Hence, the correct answer is option (a).


20) What do you mean by nameless objects?

    An object created by using the new keyword.
    An object of a superclass created in the subclass.
    An object without having any name but having a reference.
    An object that has no reference.


Answer: (d) An object that has no reference.

Explanation: The nameless objects are basically referred to as anonymous objects. The anonymous objects do not have any names. We can also say that, when an object is initialized but is not assigned to any reference variable, it is called an anonymous object. For example, new Employee();.

If we assign it to a reference variable like,

Employee emp = new Employee();

In the above code, emp is a reference variable. Therefore, the above object is not anonymous, as it is assigned to a reference variable.

Hence, the correct answer is option (d).



21) An interface with no fields or methods is known as a ______.

    Runnable Interface
    Marker Interface
    Abstract Interface
    CharSequence Interface


Answer: (b) Marker Interface

Explanation: An interface with no methods and fields is known as the marker interface. In other words, an empty interface (containing no fields and methods) is called a marker interface. In Java, the most commonly used marker interfaces are Serializable, Cloneable, Remote, and ThreadSafe interfaces. Marker interfaces are also known as the Tag interface. It is used to tell the JVM or compiler that the particular class has special behavior.

Following is the code snippet of a maker interface:

public interface Cloneable 
{
    // empty 
}

Hence, the correct answer is option (b).



22) Which of the following is an immediate subclass of the Panel class?

    Applet class
    Window class
    Frame class
    Dialog class


Answer: (a) Applet class

Explanation: According to the class hierarchy of Java Swing, the Applet class is the direct subclass of the Panel class. You can go through the link, (https://www.javatpoint.com/java-swing) to deeply understand the class hierarchy diagram. The Panel class and Window class are the child classes of the Container class, and Frame and Dialog classes are the subclasses of the Window class.

Hence, the correct answer is option (a).




23) Which option is false about the final keyword?

    A final method cannot be overridden in its subclasses.
    A final class cannot be extended.
    A final class cannot extend other classes.
    A final method can be inherited.


Answer: (c) A final class cannot extend other classes.

Explanation: The final is a reserved keyword in Java that is used to make a variable, method, and class immutable. The important features of the final keyword are:

    Using the final keyword with a variable makes it constant or immutable. We can't reassign the values of it.
    A final variable must be a local variable and cannot be used in other classes.
    Using the final keyword with a method makes it constant, and we can't override it in the subclass.
    Using final with a class makes the class constant, and we cannot extend a final class. But a final class can extend other classes.

Hence, the correct answer is option (c).




25) What do you mean by chained exceptions in Java?

    Exceptions occurred by the VirtualMachineError
    An exception caused by other exceptions
    Exceptions occur in chains with discarding the debugging information
    None of the above


Answer: (b) An exception caused by other exceptions.

Explanation: In Java, an exception caused by other exceptions is known as a chained exception. Generally, the first exception causes the second exception. It helps in identifying the cause of the exception. In chained exceptions, the debugging information is not discarded.

Hence, the correct answer is option (b).


26) In which memory a String is stored, when we create a string using new operator?

    Stack
    String memory
    Heap memory
    Random storage space


Answer: (c) Heap memory

Explanation: When a String is created using a new operator, it always created in the heap memory. Whereas when we create a string using double quotes, it will check for the same value as of the string in the string constant pool. If it is found, returns a reference of it else create a new string in the string constant pool.

Hence, the correct answer is option (c).



27) What is the use of the intern() method?

    It returns the existing string from memory
    It creates a new string in the database
    It modifies the existing string in the database
    None of the above


Answer: (a) It returns the existing string from the memory

Explanation: The intern() method is used to return the existing strings from the database. In other words, the intern() method returns a reference of the string. For example, if the string constant pool already has a string object with the same value, the intern() method will return a reference of the string from the pool.

Hence, the correct answer is option (a).


28) Which of the following is a marker interface?

    Runnable interface
    Remote interface
    Readable interface
    Result interface


Answer: (b) Remote interface

Explanation: A marker interface is an interface with no fields and methods. In other words, an empty interface (contains nothing) is known as the marker interface. Examples of marker interfaces are Cloneable, Serializable, ThreadSafe, and Remote interface.

The Runnable, Readable, and Result interface are not marker interface as they contain some methods or fields.

Hence, the correct answer is option (b).


29) Which of the following is a reserved keyword in Java?

    object
    strictfp
    main
    system


Answer: (b) strictfp

Explanation: In the above options, strictfp is the only reserved keyword of Java. The strictfp keyword is a modifier that restricts the floating-point calculations to assure portability and it was added in Java version 1.2. The objects are referring to those variables that are created using the new operator. In Java, main is the method that is the entry point of any program, and the System is a class.

Hence, the correct answer is option (b).



30) Which keyword is used for accessing the features of a package?

    package
    import
    extends
    export


Answer: (b) import

Explanation: The import keyword is used to access the classes and interfaces of a particular package to the current file. In other words, it is used to import the user-defined and built-in classes and interfaces into the source file of java so that the current file can easily access the other packages by directly using its name. For example,

   import java.awt.*; 
   import java.lang.Object;

The first import statement imports all the classes and interfaces of java.awt package. Whereas, the second import statement only imports the Object class of the java.lang package.

The package keyword is used to create a new package. The extends keyword indicates that the new class is derived from the base or parent class using inheritance, and export is not a keyword in Java.

Hence, the correct answer is option (b).


31) In java, jar stands for_____.

    Java Archive Runner
    Java Application Resource
    Java Application Runner
    None of the above


Answer: (d) None of the above

Explanation: A Java ARchive (JAR) is a package file format used to combine all the metadata and resources into a single file. In other words, it is a file that contains several components, which make up a self-contained, executable, and deployable jar used to execute Java applications and deploy Java applets.

Hence, the correct answer is option (d).




33) Which of the following is false?

    The rt.jar stands for the runtime jar
    It is an optional jar file
    It contains all the compiled class files
    All the classes available in rt.jar is known to the JVM


Answer: (b) It is an optional jar file.

Explanation: The rt.jar stands for the runtime jar that comprises of all the compiled core class files for the Java Runtime Environment. It generally consists of classes like java.lang.String, java.lang.Object, java.io.Exception, etc., and all packages and classes available in the rt.jar are known to the JVM. The rt.jar is the mandatory jar file for every core java application as it contains all the core classes.

Hence, the correct answer is option (b).




34) What is the use of \w in regex?

    Used for a whitespace character
    Used for a non-whitespace character
    Used for a word character
    Used for a non-word character


Answer: (c) Used for a word character

Explanation: In java, the "\w" regex is used to match with a word character consists of [a-zA-Z_0-9]. For example, \w+ matches one or more word character that is same as ([a-zA-Z_0-9] +).

The regex \W, \s, and \S are used for a non-word character, a whitespace character, and a non-whitespace character, respectively. Hence, the \w regex is used for a word character.

Hence, the correct answer is option (c).



35) Which of the given methods are of Object class?

    notify(), wait( long msecs ), and synchronized()
    wait( long msecs ), interrupt(), and notifyAll()
    notify(), notifyAll(), and wait()
    sleep( long msecs ), wait(), and notify()


Answer: (c) notify(), notifyAll(), and wait()

Explanation: The notify(), notifyAll(), and wait() are the methods of the Object class. The notify() method is used to raise a single thread that is waiting on the object's monitor. The notifyAll() method is similar to the notify() method, except that it wakes up all the threads that are waiting on the object's monitor. The wait() method is used to make a thread to wait until another thread invokes the notify() or notifyAll() methods for an object.

Hence, the correct answer is option (c).



37) Which of the following is a valid syntax to synchronize the HashMap?

    Map m = hashMap.synchronizeMap();
    HashMap map =hashMap.synchronizeMap();
    Map m1 = Collections.synchronizedMap(hashMap);
    Map m2 = Collection.synchronizeMap(hashMap);


Answer: (c) Map m1 = Collections.synchronizedMap(hashMap);

Explanation: By default, the HashMap class is a non-synchronized collection class. The need for synchronization is to perform thread-safe operations on the class. To synchronize the HashMap class explicitly, we should use the Collections.synchronizedMap(hashMap) method that returns a thread-safe map object.

Hence, the correct answer is option (c).



39) Which of the following is a mutable class in java?

    java.lang.String
    java.lang.Byte
    java.lang.Short
    java.lang.StringBuilder


Answer: (d) java.lang.StringBuilder

Explanation: A mutable class is a class in which changes can be made after its creation. We can modify the internal state and fields of a mutable class. The StringBuilder class is a mutable class, as it can be altered after it is created.

The String, Byte, and Short are immutable classes as they cannot be altered once they are created.

Hence, the correct answer is option (d).




41) What is meant by the classes and objects that dependents on each other?

    Tight Coupling
    Cohesion
    Loose Coupling
    None of the above


Answer: (a) Tight Coupling

Explanation: In tight coupling, a group of classes and objects are highly dependent on each other. Tight coupling is also used in some cases, like when an object creates some other objects that are going to be used by them.

Tight coupling is the correct answer as it is used when the logic of one class is called by the logic of another class.

Hence, the correct option is (a).




44) How many threads can be executed at a time?

    Only one thread
    Multiple threads
    Only main (main() method) thread
    Two threads


Answer: (b) Multiple threads

Explanation: In Java, multiple threads can be executed at the same time. A Java standalone application always starts with a single thread known as the main thread that is associated with the main() method.

In the operating system, only one thread is executed at a time.

Hence, the correct answer is option (b).



45) If three threads trying to share a single object at the same time, which condition will arise in this scenario?

    Time-Lapse
    Critical situation
    Race condition
    Recursion


Answer: (c) Race condition

Explanation: If two or more threads are trying to access a common resource at the same time. This situation is known as race condition. It generally occurs during the execution of multi-threaded application. It also refers to a programming bug or issue that occurs when the thread scheduler swaps the threads at any time between the process.

Hence, the correct answer is option (c).


46) If a thread goes to sleep

    It releases all the locks it has.
    It does not release any locks.
    It releases half of its locks.
    It releases all of its lock except one.



Answer: (b) It does not release any locks.

Explanation: The sleep() method does not release any locks of an object for a specific time or until an interrupt occurs. It leads to the poor performance or deadlock of threads. Whereas, the wait() method does not release the locks of an object.

Therefore, when a thread goes to sleep, it does not release any locks.

Hence, the correct answer is the option (b).


49) In character stream I/O, a single read/write operation performs _____.

    Two bytes read/write at a time.
    Eight bytes read/write at a time.
    One byte read/write at a time.
    Five bytes read/ write at a time.


Answer: (a) Two bytes read/write at a time.

Explanation: There are two types of I/O stream. One is a byte stream, and the other is the character stream. The Byte stream is used to perform input or output 8-bit (equals to 1 byte) Unicode bytes whereas, the Character stream is used to read or write a 16-bit (equals to 2 bytes) Unicode character.

Therefore, a single operation of character stream performs two bytes read/ write at a time.

Hence, the correct answer is option (a).


50) What is the default encoding for an OutputStreamWriter?

    UTF-8
    Default encoding of the host platform
    UTF-12
    None of the above


Answer: (b) Default encoding of the host platform

Explanation: The OutputStreamWriter class translates Unicode character into bytes by using the character encoding. The character encoding can be either a default encoding dependent on the system or encoding that is explicitly defined. If no external encoding is specified, it will use the default encoding of the host platform.

Hence, the correct answer is option (b).



















