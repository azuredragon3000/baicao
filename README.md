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







