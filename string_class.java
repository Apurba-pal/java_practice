public class string_class {
 public static void main(String[] args) {
        // String fname = "Apurba";
        // String lname = "Pal";
        // String combined = fname + " " + lname;
        // System.out.println(combined.toLowerCase());
        // System.out.println(combined.toUpperCase());
        // System.out.println(combined.trim());
        // System.out.println(combined.stripLeading());
        // System.out.println(combined.stripTrailing());
        // System.out.println(fname.substring(fname.length() - 1));
        // System.out.println(fname.replace("Apu", "Lol"));
        StringBuffer myString = new StringBuffer("Welcome");
        myString.append(" to Bangalore");
        System.out.println("After append: " + myString);
        myString.insert(8, "Hariharan ");
        System.out.println("After insert: " + myString);
        myString.replace(8, 16, "Hariiiiii");
        System.out.println("After replace: " + myString);
        myString.delete(myString.length() - 5, myString.length());
        System.out.println("After delete: " + myString);
    }
}