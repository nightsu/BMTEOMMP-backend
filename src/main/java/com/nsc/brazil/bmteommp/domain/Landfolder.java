package com.nsc.brazil.bmteommp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "landfolder")
public class Landfolder implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "nodeId")
  private Integer nodeId;

  @Column(name = "pathName")
  private String pathName;

  @Column(name = "parentNodeId")
  private Integer parentNodeId;

  @Column(name = "folderType")
  private String folderType;

  @Column(name = "project")
  private String project;

  @Column(name = "lot")
  private String lot;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getNodeId() {
    return nodeId;
  }

  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }

  public String getPathName() {
    return pathName;
  }

  public void setPathName(String pathName) {
    this.pathName = pathName;
  }

  public Integer getParentNodeId() {
    return parentNodeId;
  }

  public void setParentNodeId(Integer parentNodeId) {
    this.parentNodeId = parentNodeId;
  }

  public String getFolderType() {
    return folderType;
  }

  public void setFolderType(String folderType) {
    this.folderType = folderType;
  }

  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public String getLot() {
    return lot;
  }

  public void setLot(String lot) {
    this.lot = lot;
  }

  public String toString() {
    return "Landfolder{id=" + id + 
      ", nodeId=" + nodeId + 
      ", pathName=" + pathName + 
      ", parentNodeId=" + parentNodeId + 
      ", folderType=" + folderType + 
      ", project=" + project + 
      ", lot=" + lot + 
      "}";
  }
}