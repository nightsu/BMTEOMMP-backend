package com.nsc.brazil.bmteommp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "substations")
public class Substations implements Serializable {
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

  @Column(name = "Longitude")
  private Double Longitude;

  @Column(name = "Latitude")
  private Double Latitude;

  @Column(name = "Altitude")
  private Double Altitude;

  @Column(name = "Scale")
  private Double Scale;

  @Column(name = "Rotation")
  private Double Rotation;

  @Column(name = "APPProjectID")
  private String APPProjectID;

  @Column(name = "APPStationName")
  private String APPStationName;

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

  public Double getLongitude() {
    return Longitude;
  }

  public void setLongitude(Double Longitude) {
    this.Longitude = Longitude;
  }

  public Double getLatitude() {
    return Latitude;
  }

  public void setLatitude(Double Latitude) {
    this.Latitude = Latitude;
  }

  public Double getAltitude() {
    return Altitude;
  }

  public void setAltitude(Double Altitude) {
    this.Altitude = Altitude;
  }

  public Double getScale() {
    return Scale;
  }

  public void setScale(Double Scale) {
    this.Scale = Scale;
  }

  public Double getRotation() {
    return Rotation;
  }

  public void setRotation(Double Rotation) {
    this.Rotation = Rotation;
  }

  public String getAPPProjectID() {
    return APPProjectID;
  }

  public void setAPPProjectID(String APPProjectID) {
    this.APPProjectID = APPProjectID;
  }

  public String getAPPStationName() {
    return APPStationName;
  }

  public void setAPPStationName(String APPStationName) {
    this.APPStationName = APPStationName;
  }

  public String toString() {
    return "Substations{ID=" + ID + 
      ", projectID=" + projectID + 
      ", Name=" + Name + 
      ", Alias=" + Alias + 
      ", Type=" + Type + 
      ", Number=" + Number + 
      ", Longitude=" + Longitude + 
      ", Latitude=" + Latitude + 
      ", Altitude=" + Altitude + 
      ", Scale=" + Scale + 
      ", Rotation=" + Rotation + 
      ", APPProjectID=" + APPProjectID + 
      ", APPStationName=" + APPStationName + 
      "}";
  }
}