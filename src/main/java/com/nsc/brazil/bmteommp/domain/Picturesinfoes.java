package com.nsc.brazil.bmteommp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "picturesinfoes")
@Entity
public class Picturesinfoes implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private String ID;

  @Column(name = "Name")
  private String Name;

  @Column(name = "suffix")
  private String suffix;

  @Column(name = "itemID")
  private String itemID;

  @Column(name = "WeekNumber", nullable = false)
  private Integer WeekNumber;

  @Column(name = "Size")
  private Double Size;

  @Column(name = "UploadDateTime")
  private String UploadDateTime;

  @Column(name = "Category")
  private String Category;

  @Column(name = "Region")
  private String Region;

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

  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public String getItemID() {
    return itemID;
  }

  public void setItemID(String ItemID) {
    this.itemID = ItemID;
  }

  public Integer getWeekNumber() {
    return WeekNumber;
  }

  public void setWeekNumber(Integer WeekNumber) {
    this.WeekNumber = WeekNumber;
  }

  public Double getSize() {
    return Size;
  }

  public void setSize(Double Size) {
    this.Size = Size;
  }

  public String getUploadDateTime() {
    return UploadDateTime;
  }

  public void setUploadDateTime(String UploadDateTime) {
    this.UploadDateTime = UploadDateTime;
  }

  public String getCategory() {
    return Category;
  }

  public void setCategory(String Category) {
    this.Category = Category;
  }

  public String getRegion() {
    return Region;
  }

  public void setRegion(String Region) {
    this.Region = Region;
  }

  public String toString() {
    return "Picturesinfoes{ID=" + ID + 
      ", Name=" + Name + 
      ", suffix=" + suffix + 
      ", itemID=" + itemID +
      ", WeekNumber=" + WeekNumber + 
      ", Size=" + Size + 
      ", UploadDateTime=" + UploadDateTime + 
      ", Category=" + Category + 
      ", Region=" + Region + 
      "}";
  }
}