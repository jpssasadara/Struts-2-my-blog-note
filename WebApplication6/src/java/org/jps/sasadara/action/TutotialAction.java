/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jps.sasadara.action;

import org.jps.sasadara.service.TutorialFinderService;

/**
 *
 * @author HP
 */
public class TutotialAction {

    private String bestTutorialSite;
    private String language;
    
    public String execute(){
        System.out.println("Hello from execute");
        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        System.out.println(getLanguage());
        setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
        return "success";
    }
    public String addTutorial(){
        return "success";
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
     public String getBestTutorialSite() {
        return bestTutorialSite;
    }

    public void setBestTutorialSite(String bestTutorialSite) {
        this.bestTutorialSite = bestTutorialSite;
    }

    
    
    
}
