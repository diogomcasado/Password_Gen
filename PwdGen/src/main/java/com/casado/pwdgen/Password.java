/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casado.pwdgen;

import java.security.SecureRandom;

/**
 *
 * @author podiaserpior
 */
public class Password {
    public static String generateRandomPassword(int len, boolean special)
    {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        final String charsSpecial = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&*+-/:;<>=?@";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
  
        for (int i = 0; i < len; i++)
        {
            if(special){
            int randomIndex = random.nextInt(charsSpecial.length());
            sb.append(charsSpecial.charAt(randomIndex));
            } else {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
            }
        }
 
        return sb.toString();
    }
 
    
}
