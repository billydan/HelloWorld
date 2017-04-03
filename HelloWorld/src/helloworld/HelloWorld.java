/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BILLEL.ERRAHMANI
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ( "Hi, type your name:" );
        String s = br.readLine();
        System.out.println ( "Hello "+s );
    }
    
}
