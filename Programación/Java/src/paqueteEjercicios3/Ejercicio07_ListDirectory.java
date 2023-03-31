package paqueteEjercicios3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ejercicio07_ListDirectory {
    
    public static void main(String[] args) {
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader buff=new BufferedReader(input);
        File folder=null;
        ArrayList<String> files=new ArrayList<String>();
        System.out.print("\s>\s");
        try {
            folder=new File(buff.readLine());
            if(folder.isDirectory()) {
                System.out.println("\nDirectories:");
                for(File item:folder.listFiles()) {
                    if(item.isDirectory()) {
                        System.out.println("| "+item.getName());
                    } else {
                        files.add("| "+item.getName());
                    }
                }
                System.out.println("\nFiles:");
                for(String file:files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("\nSelect a folder\n");
            }
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        } catch (SecurityException exc) {
            System.out.println(exc.getMessage());
        }
    }//main

}//class