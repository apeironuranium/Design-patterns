package proxy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.awt.SystemColor.text;

public class Majior extends General {
    @Override
    public void read(){
        System.out.println("I've already read this");
    }
    public void flush() {
        try {
            super.flush("/tmp/foo","Nothing here" );
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("I don't think so");



    }
}
