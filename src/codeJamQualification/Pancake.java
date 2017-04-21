/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeJamQualification;

/**
 *
 * @author antonio
 */
public class Pancake {
    
    private int numbers = 0;
    
    public int countFlip(String pancake, Integer k) {
        
        int cnt = 0;
        char[] pancakes = pancake.toCharArray();
        
        for(int i = 0; i <= pancakes.length - k; i++) {
            if(pancakes[i] == '+') continue;
            for(int j = 0; j < k; j++) {
                pancakes[i + j] = pancakes[i + j] == '-' ? '+' : '-';
            }
            cnt++;
        }  
        for(int i = (int) pancakes.length - k + 1; i < pancakes.length; i++) {
            if(pancakes[i] == '-') { cnt = -1; break; }
        }
        System.out.print("pankake: " + pancake + " k: " + k);
        System.out.print("\nCase #" + ++this.numbers + " ");
        if(cnt >= 0) System.out.print(cnt + "\n");
        else System.out.print("IMPOSSIBLE\n");
        
        return cnt;
    }
}
