package net.upat5.lib.learning;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = null;   // the null literal initializes the s1 String reference to not refer to an object
        String s2 = null;
        System.out.println(s1 == s2);  // refers to the same object in the String pool
        s1 = "abc";                    // reference is pointing to a literal
        s2 = "abc";
        System.out.println(s1 == s2);  // references are the same, since they point to a literal
        s1 = new String("bcd");
        s2 = new String("bcd");
        System.out.println(s1 == s2); // not equal, since objects were not created in the String pool
        System.out.println(s1.equals(s2));  // true since we used the equals method to compare
        s1 = s1.intern();
        s2 = s2.intern();
        System.out.println(s1 == s2); // true, since intern adds to String pool

        // text blocks

        String html = """
                <html>
                  <head>
                    <title>Some Web Page</title>
                  </head>
                  <body>
                    <h1>Interesting Stuff</h1>
                    <p>This is a paragraph about something.</p>
                  </body>
                </html>
                """;
        System.out.println(html);
    }
}
