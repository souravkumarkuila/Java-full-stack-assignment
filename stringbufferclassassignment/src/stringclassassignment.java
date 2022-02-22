public class stringclassassignment {
    public static void main(String[] args) {
//1.Write an application to determine the length of the String str = “Hello World”
        String q1 = "Hello World";
        System.out.println("the length of the string Hello World is :  "+ q1.length()+"\n");       // prints the length of the string str

// 2) Write an application to join the two Strings “Hello, ” & “How are you?”
        String q21 = "Hello";
        String q22 = "How are you";
        String q23 = q21.concat(q22 );
        System.out.println("the string after joining both strings is :  "+q23+"\n");

        /* 3) Given a String “Java String pool refers to collection of Strings which are stored in heap memory”*/
        String q3 = "Java String pool refers to collection of Strings which are stored in heap memory";

        // a. Print the string to console in lowercase .

        String q3LowCase = q3.toLowerCase();
        System.out.println("Original String : "+q3+"\n"+"Lowercase String : "+q3LowCase+"\n");

        // b. Print the string to console in Uppercase .

        String q3UpCase = q3.toUpperCase();
        System.out.println("Original String : "+q3+"\n"+"Uppercase String : "+q3UpCase+"\n");

        // 	c. Replace all ‘a’ character in the string with $ sign

        String q3replace = q3.replace('a' ,'$');
        System.out.println("Original String : "+q3+"\n"+"Replaced String : "+q3replace+"\n");

        //d. Check if the original String contains the word “collection”

        if(q3.contains("collection")) {System.out.println("the string conatins the word : "+"collection"+"\n");}
        else {System.out.println("doesn't contain the given word"+"\n");}


        //e. Check if the following String “java string pool refers to collection of strings which are stored in heap memory” matches the original

        String q3match = "java string pool refers to collection of strings which are stored in heap memory" ;
        if(q3.matches(q3match)) {System.out.println("both strings are matched"+"\n" );}
        else {System.out.println("both strings doesn't match"+"\n");}


        //f. If the string does not match check if there is another method which can be used to check if the strings are equal

        if (q3match.equalsIgnoreCase(q3)) {System.out.println( "They are Same ignoring their cases" );}
        else {System.out.println( "They are not Same even ignoring their cases" );}
    }

}

