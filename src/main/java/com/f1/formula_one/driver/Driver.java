package com.f1.formula_one.driver;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"driver_stats\"")
public class Driver {

    @Id
    @Column(name = "\"Driver\"", unique = true)
    private String driver;

    @Column(name = "\"Nation\"")
    private String nation;

    @Column(name = "\"No\"")
    private Integer no;

    @Column(name = "\"Age\"")
    private Integer age;

    @Column(name = "\"GP\"")
    private Integer gp;

    @Column(name = "\"Starts\"")
    private Integer starts;

    @Column(name = "\"Laps\"")
    private Integer laps;

    @Column(name = "\"Wins\"")
    private Integer wins;

    @Column(name = "\"Podiums\"")
    private Integer podiums;

    @Column(name = "\"Poles\"")
    private Integer poles;

    @Column(name = "\"Pens\"")
    private Integer pens;

    @Column(name = "\"DNF\"")
    private Integer dnf;

    @Column(name = "\"FL\"")
    private Integer fl;

    @Column(name = "\"Pts\"")
    private Double pts;

    @Column(name = "\"Constructor\"")
    private String constructor;

    public Driver() {
    }

    public Driver(String driver, String nation, Integer no, Integer age,
              Integer gp, Integer starts, Integer laps, Integer wins,
              Integer podiums, Integer poles, Integer pens, Integer dnf,
              Integer fl, Double pts, String constructor) {

        this.driver = driver;
        this.nation = nation;
        this.no = no;
        this.age = age;
        this.gp = gp;
        this.starts = starts;
        this.laps = laps;
        this.wins = wins;
        this.podiums = podiums;
        this.poles = poles;
        this.pens = pens;
        this.dnf = dnf;
        this.fl = fl;
        this.pts = pts;
        this.constructor = constructor;
    }
        
    public String getDriver(){
        return driver;
    }

    public void setDriver(String driver){
        this.driver = driver;
    }

    public String getNation(){
        return nation;
    }

    public void setNation(String nation){
        this.nation = nation;
    }

    public Integer getNo(){
        return no;
    }

    public void setNo(Integer no){
        this.no = no;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public Integer getGp(){
        return gp;
    }

    public void setGp(Integer gp){
        this.gp = gp;
    }

    public Integer getStarts(){
        return starts;
    }

    public void setStarts(Integer starts){
        this.starts = starts;
    }

    public Integer getLaps(){
        return laps;
    }

    public void setLaps(Integer laps){
        this.laps = laps;
    }

    public Integer getWins(){
        return wins;
    }

    public void setWins(Integer wins){
        this.wins = wins;
    }

    public Integer getPodiums(){
        return podiums;
    }

    public void setPodiums(Integer podiums){
        this.podiums = podiums;
    }

    public Integer getPoles(){
        return poles;
    }

    public void setPoles(Integer poles){
        this.poles = poles;
    }

    public Integer getPens(){
        return pens;
    }

    public void setPens(Integer pens){
        this.pens = pens;
    }

    public Integer getDnf(){
        return dnf;
    }

    public void setDnf(Integer dnf){
        this.dnf = dnf;
    }

    public Integer getFl(){
        return fl;
    }

    public void setFl(Integer fl){
        this.fl = fl;
    }

    public Double getPts(){
        return pts;
    }

    public void setPts(Double pts){
        this.pts = pts;
    }

    public String getConstructor(){
        return constructor;
    }

    public void setConstructor(String constructor){
        this.constructor = constructor;
    }
}
