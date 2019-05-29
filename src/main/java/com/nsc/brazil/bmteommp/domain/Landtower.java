package com.nsc.brazil.bmteommp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "landtower")
@Entity
public class Landtower implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "towername")
  private String towername;

  @Column(name = "lotname")
  private String lotname;

  @Column(name = "landname")
  private String landname;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTowername() {
    return towername;
  }

  public void setTowername(String towername) {
    this.towername = towername;
  }

  public String getLotname() {
    return lotname;
  }

  public void setLotname(String lotname) {
    this.lotname = lotname;
  }

  public String getLandname() {
    return landname;
  }

  public void setLandname(String landname) {
    this.landname = landname;
  }

  public String toString() {
    return "Landtower{id=" + id + 
      ", towername=" + towername + 
      ", lotname=" + lotname + 
      ", landname=" + landname + 
      "}";
  }
}