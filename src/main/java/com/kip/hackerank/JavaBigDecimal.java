/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kip.hackerank;

import java.math.BigDecimal;
import java.util.*;

class JavaBigDecimal {

    public static void main(String[] args) {
        //Input
        //Scanner sc = new Scanner(System.in);

        String[] s = {"9", "-100", "50", "0","M", "56.6", "90", "0.12", ".12", "02.34", "000.000","A","C"};
        int n = s.length;
        //for (int i = 0; i < n; i++) {
        // s[i] = sc.next();
        // }
        // sc.close();

        String[] x = Arrays.copyOf(s, n);
        Arrays.sort(x, Collections.reverseOrder(Comparator.comparing(String::new)));
        s = x;

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
