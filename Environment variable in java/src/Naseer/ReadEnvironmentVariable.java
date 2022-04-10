package Naseer;

import java.util.Map;

public class ReadEnvironmentVariable {
    public static void main(String[] args) {
 
        System.out.println("Read Specific Enviornment Variable");
        System.out.println("JAVA_HOME Value:- " + System.getenv("JAVA_HOME"));
 
        System.out.println("\nRead All Variables:-\n");
 
        Map <String, String> map = System.getenv();
        for (Map.Entry <String, String> entry: map.entrySet()) {
            System.out.println("Variable Name:- " + entry.getKey() + " Value:- " + entry.getValue());
        }
 
    }
}