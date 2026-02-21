package interview;

public class StringProgram {
    public static void main(String[] args) {
      /*

      String s1 = "ravi";
String s2 = "ravi";
String s3 = new String("ravi");
String s4 = ("ra" + "vi");      // compile-time, pooled
String a = "ra", b = "vi";
String s5 = a + b;              // run-time, new object

System.out.println(s1 == s2);           // true
System.out.println(s1 == s3);           // false
System.out.println(s1.equals(s3));      // true
System.out.println(s1 == s4);           // true
System.out.println(s1 == s5);           // false
System.out.println(s1 == s5.intern());   Eplain
ChatGPT said:

Perfect example 👌 — let’s carefully unpack each comparison in your snippet and why the outputs are what they are.

Code Recap
String s1 = "ravi";              // pooled literal
String s2 = "ravi";              // pooled literal (same object as s1)
String s3 = new String("ravi");  // new object on heap (different from pool)
String s4 = ("ra" + "vi");       // compile-time constant, pooled
String a = "ra", b = "vi";
String s5 = a + b;               // run-time concat, new object (not pooled)

System.out.println(s1 == s2);           // ?
System.out.println(s1 == s3);           // ?
System.out.println(s1.equals(s3));      // ?
System.out.println(s1 == s4);           // ?
System.out.println(s1 == s5);           // ?
System.out.println(s1 == s5.intern());  // ?

🔎 Line by line explanation
System.out.println(s1 == s2); // true

Both s1 and s2 point to the same pooled literal "ravi".

== checks reference equality, so it’s true.

System.out.println(s1 == s3); // false

s3 was created with new String("ravi").

That forces a new object on the heap outside the pool.

s1 (pooled) and s3 (new object) are different references.

Hence, false.

System.out.println(s1.equals(s3)); // true

.equals() checks content, not reference.

Both contain "ravi".

Hence, true.

System.out.println(s1 == s4); // true

"ra" + "vi" is compile-time concatenation.

The compiler optimizes it into "ravi" directly, and it goes into the pool.

So s4 points to the same pooled object as s1.

Hence, true.

System.out.println(s1 == s5); // false

Here, a and b are variables, even though they hold "ra" and "vi".

When concatenated (a + b), the compiler cannot fold it at compile-time, so it performs run-time concatenation using StringBuilder.

That produces a new String object on the heap, not pooled automatically.

s1 is pooled, s5 is a fresh object.

Hence, false.

System.out.println(s1 == s5.intern()); // true

s5.intern() checks the String Pool:

If "ravi" exists in the pool, return that pooled reference.

Otherwise, add it and return.

"ravi" already exists (from s1).

So s5.intern() returns the same reference as s1.

Hence, true.

📊 Visual Diagram of References
String Pool (inside Heap):
   "ravi"  ◀── s1, s2, s4, s5.intern()

Heap:
   new String("ravi")  ◀── s3
   run-time concat "ravi" ◀── s5


✅ So the final output is:

true
false
true
true
false
true


Would you like me to also print the identity hash codes of each string in this program (like memory IDs) so you can see which objects are distinct?

Is this conversation helpful so far?

\

ChatGPT can make mistakes. Check important info. See



       */

    }
}
