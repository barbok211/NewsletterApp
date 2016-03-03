/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.mtp.i4.c22016.ThemeSwitcher;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
 
@ManagedBean
public class ThemeSwitcherView {
 
    private List<Theme> themes;
    private Theme theme;
    
   public void saveTheme() {
      setTheme(getTheme());
   } 
    
    @ManagedProperty("#{themeService}")
    private ThemeService service;
 
    @PostConstruct
    public void init() {
        themes = service.getThemes();
        theme = new Theme(7, "Bootstrap", "bootstrap");
    }
     
    public List<Theme> getThemes() {
        return themes;
    } 
 
    public void setService(ThemeService service) {
        this.service = service;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}
