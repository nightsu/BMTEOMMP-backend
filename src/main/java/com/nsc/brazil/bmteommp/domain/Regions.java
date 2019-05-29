package com.nsc.brazil.bmteommp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
public class Regions implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private String ID;

  @Column(name = "Substation_ID")
  private String substationID;

  @Column(name = "Name")
  private String Name;

  @Column(name = "Alias")
  private String Alias;

  @Column(name = "Type")
  private String Type;

  @Column(name = "Number")
  private Integer Number;

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public String getSubstationID() {
    return substationID;
  }

  public void setSubstationID(String substationID) {
    this.substationID = substationID;
  }

  public String getName() {
    return Name;
  }

  public void setName(String Name) {
    this.Name = Name;
  }

  public String getAlias() {
    return Alias;
  }

  public void setAlias(String Alias) {
    this.Alias = Alias;
  }

  public String getType() {
    return Type;
  }

  public void setType(String Type) {
    this.Type = Type;
  }

  public Integer getNumber() {
    return Number;
  }

  public void setNumber(Integer Number) {
    this.Number = Number;
  }

  public String toString() {
    return "Regions{ID=" + ID + 
      ", substationID=" + substationID + 
      ", Name=" + Name + 
      ", Alias=" + Alias + 
      ", Type=" + Type + 
      ", Number=" + Number + 
      "}";
  }
}