package com.nsc.brazil.bmteommp.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "report")
@Entity
public class Report implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "longitude")
  private Double longitude;

  @Column(name = "latitude")
  private Double latitude;

  @Column(name = "altitude")
  private Double altitude;

  @Column(name = "file")
  private String file;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public String toString() {
    return "Report{id=" + id + 
      ", name=" + name + 
      ", description=" + description + 
      ", longitude=" + longitude + 
      ", latitude=" + latitude + 
      ", altitude=" + altitude + 
      ", file=" + file + 
      "}";
  }
}