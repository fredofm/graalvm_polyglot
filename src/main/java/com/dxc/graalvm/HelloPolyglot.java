package com.dxc.graalvm;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

/**
 * Hello world!
 *
 */
public class HelloPolyglot {
    public static void main(String[] args) {
        System.out.println("JAVA: Hello from Java!");

        try (Context context = Context.create()) {
            Value result = context.eval("python",
                    "print('Python: Hello from Python code!')\n" +
                    "type('obj', (object,), {" +
                            "'id'  : 42, " +
                            "'text': '42', " +
                            "'arr' : [1,42,3]" +
                            "})()");
            
            System.out.println("JAVA: Printing the \"id\" property of the object returned by the python code. ID="+ result.getMember("id").asInt());            
        }
    }
}
