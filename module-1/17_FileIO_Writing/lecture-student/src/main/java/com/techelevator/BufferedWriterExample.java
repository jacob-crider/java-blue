package com.techelevator;

import java.io.*;

public class BufferedWriterExample {

    public static void main(String[] args) throws IOException { // throw IOException here because it is the parent of FileNotFound exception needed for PrintWriter and BufferedWriter

        /*
         * Create a file and PrintWriter
         */

        File file = new File("bufferedFile");

        /*
         * To add buffering a Print Writer is still needed and will still do the writing.
         * A BufferedWriter is added and passed the Print Writer.  The Print Writer will still
         * write to the file and the buffered writer will provide buffering.
         */

        // This creates bufferedFile
        // bufferedWriter's write() does not add new line, so must input all formatting manually
        try (PrintWriter printWriter = new PrintWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(printWriter)) {
                bufferedWriter.write("This is line one");
                bufferedWriter.newLine();
                bufferedWriter.write("This is line two");
        }

    }
}
