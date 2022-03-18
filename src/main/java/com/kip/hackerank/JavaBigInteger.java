/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kip.hackerank;

/**
 *
 * @author zedda
 */
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a=new BigInteger(scanner.next());
        BigInteger b=new BigInteger(scanner.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
