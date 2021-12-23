package com.aleph.listprogram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoProgram = new ArrayList<>();
    private ArrayList<String> namaProgram = new ArrayList<>();
    private ArrayList<String> infoProgram = new ArrayList<>();
    private ArrayList<String> link = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();

    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoProgram, namaProgram, infoProgram,link,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namaProgram.add("Java");
        fotoProgram.add("https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/234px-Java_programming_language_logo.svg.png");
        infoProgram.add("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA),[17] meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.[18] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub,[19][20] particularly for client–server web applications, with a reported 9 million developers.[21]");
        link.add("https://en.wikipedia.org/wiki/Java_(programming_language)");

        namaProgram.add("C");
        fotoProgram.add("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/The_C_Programming_Language_logo.svg/564px-The_C_Programming_Language_logo.svg.png");
        infoProgram.add("C (/ˈsiː/, as in the letter c) is a general-purpose, procedural computer programming language supporting structured programming, lexical variable scope, and recursion, with a static type system. By design, C provides constructs that map efficiently to typical machine instructions. It has found lasting use in applications previously coded in assembly language. Such applications include operating systems and various application software for computer architectures that range from supercomputers to PLCs and embedded systems.");
        link.add("https://en.wikipedia.org/wiki/C_(programming_language)");

        namaProgram.add("Java Script");
        fotoProgram.add("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/512px-Unofficial_JavaScript_logo_2.svg.png");
        infoProgram.add("JavaScript (/ˈdʒɑːvəˌskrɪpt/),[10] often abbreviated as JS, is a programming language that conforms to the ECMAScript specification.[11] JavaScript is high-level, often just-in-time compiled and multi-paradigm. It has dynamic typing, prototype-based object-orientation and first-class functions.\\n\\nAlongside HTML and CSS, JavaScript is one of the core technologies of the World Wide Web.[12] Over 97% of websites use it client-side for web page behavior,[13] often incorporating third-party libraries.[14] All major web browsers have a dedicated JavaScript engine to execute the code on the user's device.\\n\\nAs a multi-paradigm language, JavaScript supports event-driven, functional, and imperative programming styles. It has application programming interfaces (APIs) for working with text, dates, regular expressions, standard data structures, and the Document Object Model (DOM).");
        link.add("https://en.wikipedia.org/wiki/JavaScript");

        namaProgram.add("Python");
        fotoProgram.add("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Python-logo-notext.svg/768px-Python-logo-notext.svg.png");
        infoProgram.add("Python is an interpreted high-level general-purpose programming language. Its design philosophy emphasizes code readability with its use of significant indentation. Its language constructs as well as its object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.[31]\\n\\nPython is dynamically-typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. It is often described as a \\\"batteries included\\\" language due to its comprehensive standard library.[32]");
        link.add("https://en.wikipedia.org/wiki/Python_(programming_language)");

        namaProgram.add("Dart");
        fotoProgram.add("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Dart_programming_language_logo.svg/512px-Dart_programming_language_logo.svg.png");
        infoProgram.add("Dart is a programming language designed for client development,[9][10] such as for the web and mobile apps. It is developed by Google and can also be used to build server and desktop applications.\\n\\nDart is an object-oriented, class-based, garbage-collected language with C-style syntax.[11] Dart can compile to either native code or JavaScript. It supports interfaces, mixins, abstract classes, reified generics, and type inference.[12]");
        link.add("https://en.wikipedia.org/wiki/Dart_(programming_language)");

        namaProgram.add("Go");
        fotoProgram.add("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Go_Logo_Blue.svg/512px-Go_Logo_Blue.svg.png");
        infoProgram.add("Go is a statically typed, compiled programming language designed at Google[10] by Robert Griesemer, Rob Pike, and Ken Thompson.[11] Go is syntactically similar to C, but with memory safety, garbage collection, structural typing,[5] and CSP-style concurrency.[12] The language is often referred to as Golang because of its former domain name, golang.org, but the proper name is Go.[13]");
        link.add("https://en.wikipedia.org/wiki/Go_(programming_language)");

        prosesRecyclerViewAdapter();
    }

}