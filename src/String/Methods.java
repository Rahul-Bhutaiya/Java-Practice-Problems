package String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        String name="Mayank";
//        System.out.println(name.length()); // 6

//        System.out.println(name.charAt(2)); //y
//        System.out.println(name.charAt(6)); // error --> index out of bound

//        System.out.println(name.substring(1)); //ayank
//        System.out.println(name.substring(1,3)); //ay

//        System.out.println(name.concat(" Yadav")); //Mayank Yadav

//        System.out.println(name.equals("Mayank")); //true --> will make deep comparison
//        System.out.println(name.equals("mayank")); //false --> will make deep comparison

//        System.out.println(name.equalsIgnoreCase("mayank"));//true

//        System.out.println(name.compareTo("Mayank")); //0
//        System.out.println(name.compareTo("mayank")); //-32
//        System.out.println(name.compareTo("Maya")); //2
//        System.out.println("azcdefgx".compareTo("abddefz")); //24
//        System.out.println("a".compareTo("b"));//-1
//        System.out.println("Rahul".compareTo("Rohit")); //-14
//        System.out.println("Rohan".compareTo("Rohit")); //-8


//        System.out.println(name.compareToIgnoreCase("mayank"));//0

//        System.out.println(name.indexOf("M"));//0
//        System.out.println(name.indexOf("a"));//1
//        System.out.println(name.indexOf("k"));//5
//        System.out.println(name.indexOf("z"));//-1

//        System.out.println("Rahul Bhutaiya".indexOf("a",1));//1
//        System.out.println("Rahul Bhutaiya".indexOf("a",2));//10

//        System.out.println("Rahul Bhutaiya".indexOf("a",2,11));//10

//        System.out.println(name.lastIndexOf("a"));//3
//        System.out.println(name.lastIndexOf("a",2));//1

//        System.out.println(name.contains("aya"));//true
//        System.out.println(name.contains("Maja"));//false
//        System.out.println("Add Zero Group".contains("Group"));//true
//        System.out.println("Add Zero Group".contains("group"));//false

//        System.out.println(name.startsWith("Ma"));//true
//        System.out.println(name.startsWith("ayank"));//false
//        System.out.println(name.startsWith("ma"));//false
//        System.out.println(name.startsWith("aya",1));//true
//        System.out.println(name.startsWith("Maya",1));//false
//        System.out.println("Add Zero Group".startsWith("Zero",4));//true

//        System.out.println(name.endsWith("k"));//true
//        System.out.println(name.endsWith("nkl"));//false


//        System.out.println(name.toLowerCase());//mayank
//
//        System.out.println(name.toUpperCase());//MAYANK


//        System.out.println("    Rahul".trim());
//        System.out.println("    Rahul     ".trim());

//        System.out.println(name.replace("a","o"));//Moyonk
//        System.out.println("Add Zero Group".replace(" ","&"));//Add&Zero&Group
//        System.out.println("Add Zero Group".replace("rahul","&"));//Add Zero Group

//        System.out.println(Arrays.toString("Add Zero Group".split(" ")));//[Add, Zero, Group]
//        System.out.println(Arrays.toString("Add Zero Group".split("d")));//[A, ,  Zero Group]
//        System.out.println(Arrays.toString("Add Zero Group".split(" ",2)));//[Add, Zero Group]

//        String[] nameArr={"Add","Zero","Group"};
//        System.out.println(String.join(" ",nameArr));//Add Zero Group
//        System.out.println(String.join(" ","Rahul","Bhutaiya"));//Rahul Bhutaiya

//        char[] charArr;
//        charArr=name.toCharArray();
//        System.out.println(Arrays.toString(charArr));
//        System.out.println(Arrays.toString(name.toCharArray()));//[M, a, y, a, n, k]

//        System.out.println(Arrays.toString(name.getBytes()));//[77, 97, 121, 97, 110, 107]


//        System.out.println(String.valueOf(10));//10

//        String s1 = "d".intern();
//        Following are some important points to remember regarding the intern() method:
//        1) A string literal always invokes the intern() method, whether one mention the intern() method along with the string literal or not. For example,
//        String s1 = "d".intern();
//        String s2 = "d"; // compiler treats it as String p = "d".intern();
//        System.out.println(s1 == s2); // prints true
//        2) Whenever we create a String object using the new keyword, two objects are created. For example,
//        String str = new ("Hello World");
//        Here, one object is created in the heap memory outside of the SCP because of the usage of the new keyword. As we have got the string literal too ("Hello World"); therefore, one object is created inside the SCP, provided the literal "Hello World" is already not present in the SCP.

//        System.out.println("hello".equals(".*e.*")); // false
//        System.out.println("hello".matches(".*e.*")); // true
//        The key difference is that matches matches a regular expressions whereas equals matches a specific String.

//        System.out.println(name.replaceAll("a","o"));//Moyonk

//        System.out.println(name.replaceFirst("a","o"));//Moyank

//        System.out.println(name.isEmpty());//false
//        System.out.println("".isEmpty());//true
//        System.out.println(" ".isEmpty());//false

//        System.out.println("".isBlank());//true
//        System.out.println(" ".isBlank());//true


    }
}
