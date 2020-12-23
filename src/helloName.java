public class helloName {

/*    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
helloName("Bob") → "Hello Bob!"
*/
        /*SOLUTIOM*/

//    public String sayName(String name) {
//        return "Hello" + " " + name +"!";
//    }


/*  Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j./*

   /* SOLUTION[DISCUSS UNDERSTANDING]*/

//public String joinStrings(String out, String word){
//        return (out.substring(0,2)+ word + out.substring(5));
//}


/*Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
*/
/*          SOLUTION*/

//    public String firstHalf(String str) {
//        return (str.substring(0,str.length()/2));
//    }


    public static void main(String[] args) {
         helloName name= new helloName();

//        System.out.println(name.joinStrings("<<","saik"));
//        System.out.println(name.sayName);
    }
}