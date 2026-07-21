//import Foundation; // removed because package not available

// Local substitute for testpackage.Foundation so this file compiles without the external package
class Foundation {
    // mimic only the public member used by this test
    public String var4 = "accessible public value";
}

public class TestAccess {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();

        // System.out.println(foundation.var1); // Compile Error: var1 has private access in Foundation
        // System.out.println(foundation.var2); // Compile Error: var2 is not public, cannot be accessed from outside package
        // System.out.println(foundation.var3); // Compile Error: var3 has protected access (accessible only via inheritance in other packages)
        
        System.out.println("var4 (public): " + foundation.var4); // Accessible
    }
}