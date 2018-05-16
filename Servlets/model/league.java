/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

public class league
{
    int year;
    String season;
    String title;
    public league (int year,String season,String title)
    {
        this.year = year;
        this.season = season;
        this.title = title;
    }
    public int getyear()
    {
        return year;
    }
    public String getseason()
    {
        return season;
    }
    public String gettitle()
    {
        return title;
    }
    public String toString()
    {
        return title;
    }
}