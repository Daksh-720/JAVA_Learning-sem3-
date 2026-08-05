public class String_meth{
    public static void main(String[] args){
        String str = "     Hello Java      ";

        //*1. String length
        System.out.println("1. String length: " + str.length());

        //*2. CharAt : gives the character at the no. you assigned
        System.out.println("2. CharAt: " + str.charAt(6));

        //*3. Substring
        System.out.println("3. Substring: " + str.substring(6));
        System.out.println("3. Substring: " + str.substring(6,  8));

        //*4. toLowerCase() toUpperCase()
        System.out.println("4. toLowerCase: " + str.toLowerCase());
        System.out.println("4. toUpperCase: " + str.toUpperCase());

        //*5. equals()
        String s1 = "Java";
        String s2 = "Java";
        System.out.println("5. equals : " + s1.equals(s2));

        //*6. equalsIgnoreCase()
        String a1 = "Java";
        String a2 = "JAVA";
        System.out.println("6. equalsIgnoreCase : " + a1.equalsIgnoreCase(a2));

        //*7. trim()
        System.out.println("7. trim() : " + str.trim());

        //*8. replace()
        System.out.println("8. replace : " + str.replace("o", "a"));

        //*9. contains()
        System.out.println("9. contains : " + str.contains("Java"));

        //*10. indexOf()
        System.out.println("10. indexOf : " + str.indexOf("Java"));

        //*12. startsWith()  -   13. endsWith()
        String wrd = "Programming";
        System.out.println("12. startsWith : " + wrd.startsWith("Pro"));
        System.out.println("13. endsWith : " + wrd.endsWith("ing"));
    }
}