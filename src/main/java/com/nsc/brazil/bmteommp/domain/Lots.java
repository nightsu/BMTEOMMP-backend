package com.nsc.brazil.bmteommp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "lots")
public class Lots implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private String ID;

  @Column(name = "Name")
  private String Name;

  @Column(name = "Alias")
  private String Alias;

  @Column(name = "Type")
  private String Type;

  @Column(name = "Number")
  private Integer Number;

  @Column(name = "EPC")
  private String EPC;

  @Column(name = "State")
  private String State;

  @Column(name = "StraightLineTowerCount")
  private Integer StraightLineTowerCount;

  @Column(name = "AngleTowerCount")
  private Integer AngleTowerCount;

  @Column(name = "Length")
  private Double Length;

  @Column(name = "CrossNumber")
  private Integer CrossNumber;

  @Column(name = "Color", nullable = false)
  private Integer Color;

  @Column(name = "TransmissionLine_ID")
  private String transmissionLineID;

  @Column
  private String APPLotName;

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
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

  public String getEPC() {
    return EPC;
  }

  public void setEPC(String EPC) {
    this.EPC = EPC;
  }

  public String getState() {
    return State;
  }

  public void setState(String State) {
    this.State = State;
  }

  public Integer getStraightLineTowerCount() {
    return StraightLineTowerCount;
  }

  public void setStraightLineTowerCount(Integer StraightLineTowerCount) {
    this.StraightLineTowerCount = StraightLineTowerCount;
  }

  public Integer getAngleTowerCount() {
    return AngleTowerCount;
  }

  public void setAngleTowerCount(Integer AngleTowerCount) {
    this.AngleTowerCount = AngleTowerCount;
  }

  public Double getLength() {
    return Length;
  }

  public void setLength(Double Length) {
    this.Length = Length;
  }

  public Integer getCrossNumber() {
    return CrossNumber;
  }

  public void setCrossNumber(Integer CrossNumber) {
    this.CrossNumber = CrossNumber;
  }

  public Integer getColor() {
    return Color;
  }

  public void setColor(Integer Color) {
    this.Color = Color;
  }

  public String getTransmissionLineID() {
    return transmissionLineID;
  }

  public void setTransmissionLineID(String transmissionLineID) {
    this.transmissionLineID = transmissionLineID;
  }

  public String getAPPLotName() {
    return APPLotName;
  }

  public void setAPPLotName(String APPLotName) {
    this.APPLotName = APPLotName;
  }

  public String toString() {
    return "Lots{ID=" + ID + 
      ", Name=" + Name + 
      ", Alias=" + Alias + 
      ", Type=" + Type + 
      ", Number=" + Number + 
      ", EPC=" + EPC + 
      ", State=" + State + 
      ", StraightLineTowerCount=" + StraightLineTowerCount + 
      ", AngleTowerCount=" + AngleTowerCount + 
      ", Length=" + Length + 
      ", CrossNumber=" + CrossNumber + 
      ", Color=" + Color + 
      ", transmissionLineID=" + transmissionLineID + 
      ", APPLotName=" + APPLotName + 
      "}";
  }
}