package company;

public class cwh_62_63_64_65_InterpreterVsCompiler_and_Packages {

	public static void main(String[] args) {
		
		/* Interpreter translates one statement at a time into machine code.
		   Compiler scans the whole program and translates whole of it into machine code.
		   
		   Q. Is Java compiled or interpreted?
	      --> Java is a hybrid language, both compiled as well as interpreted.
	       
	       JavaFile(name.java)  --(compiled using javac)-->  ClassFile[(name.class),(bytecode)]  -->  csn be used by Java interpreter
	       
	      -A JVM can be used to interprete this bytecode. 
	      -This bytecode can be taken to any platform(Windows/Mac/Linux) for execution.
	      -Hence, Java is platform independent.
	      
	       For executing Java code on Cmd :
	        			javac name.java
	        			java name(class file name)
	        
	        Packages:-
	                 -A Package is used to group related classes.
	                 -Packages help in avoiding name conflicts. (i.e. more than one classes can not have same name)
	                 -There are two types of packages:
	                  ~Built-in packages --> Java API
	                  ~User defined packages --> custom packages
	                  
		    Using Java packages:
		 						- import java.lang.*  --> import everything from java.lang
		 						- import java,lang.String  --> import String from java.lang
		 						- s = new java.lang.String("Parth")  --> use without importing
		 						
		 	Creating a package:
		 					    javac Name.java  --> creates Name.class
		 					    javac -d . Name.java  --> creates a package folder */
	}

}
