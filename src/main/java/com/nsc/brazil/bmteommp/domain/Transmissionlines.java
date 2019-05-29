package com.nsc.brazil.bmteommp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "transmissionlines")
public class Transmissionlines implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private String ID;

  @Column(name = "Project_ID")
  private String projectID;

  @Column(name = "Name")
  private String Name;

  @Column(name = "Alias")
  private String Alias;

  @Column(name = "Type")
  private String Type;

  @Column(name = "Number")
  private Integer Number;

  @Column(name = "Voltage")
  private String Voltage;

  @Column(name = "Description")
  private String Description;

  @Column(name = "APPProjectID")
  private String APPProjectID;

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public String getProjectID() {
    return projectID;
  }

  public void setProjectID(String projectID) {
    this.projectID = projectID;
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

  public String getVoltage() {
    return Voltage;
  }

  public void setVoltage(String Voltage) {
    this.Voltage = Voltage;
  }

  public String getDescription() {
    return Description;
  }

  public void setDescription(String Description) {
    this.Description = Description;
  }

  public String getAPPProjectID() {
    return APPProjectID;
  }

  public void setAPPProjectID(String APPProjectID) {
    this.APPProjectID = APPProjectID;
  }

  public String toString() {
    return "Transmissionlines{ID=" + ID + 
      ", projectID=" + projectID + 
      ", Name=" + Name + 
      ", Alias=" + Alias + 
      ", Type=" + Type + 
      ", Number=" + Number + 
      ", Voltage=" + Voltage + 
      ", Description=" + Description + 
      ", APPProjectID=" + APPProjectID + 
      "}";
  }
}