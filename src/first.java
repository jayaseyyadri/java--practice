public class first {
    public static void main (String[]args){
//        String name="Sai";
//        System.out.println(name.charAt(name.length()-1));
//        String name2="sai";
//
//        String j =name.toLowerCase();
//        System.out.println(name.indexOf("s"));
//        String k =j.replace("s","w");
//        System.out.println(k);
//
//        String song="We don't need no education\nWe don't need no thought control";
//        System.out.println(song);

//String sentence="Check \"this\" out!, \"s inside of \"s!";
//        System.out.println(sentence);

//String a="In windows , the main drive is usually C:\\";
//        System.out.println(a);
//        String b="I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslashes \\\\\\!";
//        System.out.println(b);
//        System.out.println(sumOfNumbers(2,3));
        System.out.println(checkEndsWith("Mrina","aa"));
//
    }


//    Create a method that takes two integers as arguments and return their sum.

public static int sumOfNumbers(int num1,int num2){
    return num1+num2;
    }





//    Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.
public static boolean checkEndsWith (String str1, String str2) {

    if (str1.endsWith(str2)) {
        return true;
    }return false;
}

}


//    .charAt-->the char at retrieves the character at the given index
//    .indexOf(String subString) -->the index of the string and -1 if not in the string
//.lastIndexOf()--> same like indexOf but from starts at the end
//.length --> length of the string
//.replace (old char with new character)
//String replace(String pattern, String replacement)
//.endsWith & .startWith() determine if one string starts/ends with an exact copy of the other
