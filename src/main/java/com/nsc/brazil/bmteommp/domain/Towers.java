package com.nsc.brazil.bmteommp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "towers")
public class Towers implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private String ID;

  @Column(name = "TowerLand_ID")
  private String towerLandID;

  @Column(name = "Name")
  private String Name;

  @Column(name = "Alias")
  private String Alias;

  @Column(name = "Type")
  private String Type;

  @Column(name = "Number")
  private Integer Number;

  @Column(name = "TowerType")
  private String TowerType;

  @Column(name = "Longitude")
  private Double Longitude;

  @Column(name = "Latitude")
  private Double Latitude;

  @Column(name = "Altitude")
  private Double Altitude;

  @Column(name = "IsCornerTower")
  private Integer IsCornerTower;

  @Column(name = "CumulativeDistance")
  private Double CumulativeDistance;

  @Column(name = "SpanDistance")
  private Double SpanDistance;

  @Column(name = "Lot_ID")
  private String lotID;

  @Column(name = "TransmissionLine_ID")
  private String transmissionLineID;

  @Column(name = "FoundationA")
  private String FoundationA;

  @Column(name = "FoundationB")
  private String FoundationB;

  @Column(name = "FoundationC")
  private String FoundationC;

  @Column(name = "FoundationD")
  private String FoundationD;

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public String getTowerLandID() {
    return towerLandID;
  }

  public void setTowerLandID(String towerLandID) {
    this.towerLandID = towerLandID;
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

  public String getTowerType() {
    return TowerType;
  }

  public void setTowerType(String TowerType) {
    this.TowerType = TowerType;
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

  public Integer getIsCornerTower() {
    return IsCornerTower;
  }

  public void setIsCornerTower(Integer IsCornerTower) {
    this.IsCornerTower = IsCornerTower;
  }

  public Double getCumulativeDistance() {
    return CumulativeDistance;
  }

  public void setCumulativeDistance(Double CumulativeDistance) {
    this.CumulativeDistance = CumulativeDistance;
  }

  public Double getSpanDistance() {
    return SpanDistance;
  }

  public void setSpanDistance(Double SpanDistance) {
    this.SpanDistance = SpanDistance;
  }

  public String getLotID() {
    return lotID;
  }

  public void setLotID(String lotID) {
    this.lotID = lotID;
  }

  public String getTransmissionLineID() {
    return transmissionLineID;
  }

  public void setTransmissionLineID(String transmissionLineID) {
    this.transmissionLineID = transmissionLineID;
  }

  public String getFoundationA() {
    return FoundationA;
  }

  public void setFoundationA(String FoundationA) {
    this.FoundationA = FoundationA;
  }

  public String getFoundationB() {
    return FoundationB;
  }

  public void setFoundationB(String FoundationB) {
    this.FoundationB = FoundationB;
  }

  public String getFoundationC() {
    return FoundationC;
  }

  public void setFoundationC(String FoundationC) {
    this.FoundationC = FoundationC;
  }

  public String getFoundationD() {
    return FoundationD;
  }

  public void setFoundationD(String FoundationD) {
    this.FoundationD = FoundationD;
  }

  public String toString() {
    return "Towers{ID=" + ID + 
      ", towerLandID=" + towerLandID + 
      ", Name=" + Name + 
      ", Alias=" + Alias + 
      ", Type=" + Type + 
      ", Number=" + Number + 
      ", TowerType=" + TowerType + 
      ", Longitude=" + Longitude + 
      ", Latitude=" + Latitude + 
      ", Altitude=" + Altitude + 
      ", IsCornerTower=" + IsCornerTower + 
      ", CumulativeDistance=" + CumulativeDistance + 
      ", SpanDistance=" + SpanDistance + 
      ", lotID=" + lotID + 
      ", transmissionLineID=" + transmissionLineID + 
      ", FoundationA=" + FoundationA + 
      ", FoundationB=" + FoundationB + 
      ", FoundationC=" + FoundationC + 
      ", FoundationD=" + FoundationD + 
      "}";
  }
}