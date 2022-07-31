package JavaCompilerDemo;

import javax.print.DocFlavor;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class CompileDemo {

    public static int compileFile(String sourceFile){
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        // 把sourceFile.java编译为class文件
        int result = compiler.run(null,null,null,sourceFile);
        System.out.println(result == 0?"success":"failed");
        return result;
    }

    public void runTime() throws IOException {
        Runtime run = Runtime.getRuntime();
        Process process = run.exec("java -cp d:/myjava HelloWorld");
        InputStream in = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String info = "";
        while ((info = reader.readLine())!=null){
            System.out.println(info);
        }
    }

    public void reflectCompile() throws NoSuchMethodException, MalformedURLException, ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        URL[] urls = new URL[]{new URL("file:/"+ "D:/myjava/")};
        URLClassLoader loader = new URLClassLoader(urls);
        Class c = loader.loadClass("HelloWorld");
        c.getMethod("main",String[].class).invoke(null,(Object) new String[]{"aa","bb"});
    }
}
