/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeJamQualification;

/**
 *
 * @author antonio
 * Code Jam Qualification Round 2017: codehttps://code.google.com/codejam/contest/3264486/dashboard
 */
public class CodeJamQualification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pancake pancake = new Pancake();
        pancake.countFlip("---+-++-", 3);
        pancake.countFlip("+++++", 4);
        pancake.countFlip("-+-+-", 4);
    }

    
}
