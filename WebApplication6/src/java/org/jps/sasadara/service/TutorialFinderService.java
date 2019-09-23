/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jps.sasadara.service;

/**
 *
 * @author HP
 */
public class TutorialFinderService {
    public String getBestTutorialSite(String language){
        if(language.equals("java")){
            return "eVisioncsse";
        }else{
            return "Language is not supported yet";
        }
        
    }
    
}
