package com.nsc.brazil.bmteommp.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "towertypelist")
@Entity
public class Towertypelist implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "towerType")
  private String towerType;

  @Column(name = "Name")
  private String Name;

  @Column(name = "Size")
  private String Size;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTowerType() {
    return towerType;
  }

  public void setTowerType(String TowerType) {
    this.towerType = TowerType;
  }

  public String getName() {
    return Name;
  }

  public void setName(String Name) {
    this.Name = Name;
  }

  public String getSize() {
    return Size;
  }

  public void setSize(String Size) {
    this.Size = Size;
  }

  public String toString() {
    return "Towertypelist{id=" + id + 
      ", towerType=" + towerType +
      ", Name=" + Name + 
      ", Size=" + Size + 
      "}";
  }
}