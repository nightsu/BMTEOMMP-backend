package com.nsc.brazil.bmteommp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "towerlands")
public class Towerlands implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private String id;

  @Column(name = "City")
  private String City;

  @Column(name = "CadastralCode")
  private String CadastralCode;

  @Column(name = "OwnerName")
  private String OwnerName;

  @Column(name = "Status")
  private String Status;

  @Column(name = "PropertyName")
  private String PropertyName;

  public String getID() {
    return id;
  }

  public void setID(String ID) {
    this.id = ID;
  }

  public String getCity() {
    return City;
  }

  public void setCity(String City) {
    this.City = City;
  }

  public String getCadastralCode() {
    return CadastralCode;
  }

  public void setCadastralCode(String CadastralCode) {
    this.CadastralCode = CadastralCode;
  }

  public String getOwnerName() {
    return OwnerName;
  }

  public void setOwnerName(String OwnerName) {
    this.OwnerName = OwnerName;
  }

  public String getStatus() {
    return Status;
  }

  public void setStatus(String Status) {
    this.Status = Status;
  }

  public String getPropertyName() {
    return PropertyName;
  }

  public void setPropertyName(String PropertyName) {
    this.PropertyName = PropertyName;
  }

  public String toString() {
    return "Towerlands{ID=" + id +
      ", City=" + City + 
      ", CadastralCode=" + CadastralCode + 
      ", OwnerName=" + OwnerName + 
      ", Status=" + Status + 
      ", PropertyName=" + PropertyName + 
      "}";
  }
}