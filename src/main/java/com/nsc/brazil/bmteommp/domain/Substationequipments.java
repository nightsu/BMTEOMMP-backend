package com.nsc.brazil.bmteommp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "substationequipments")
@Entity
public class Substationequipments implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 序号
   */
  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private String ID;

  /**
   * 项目名称-大类
   */
  @Column(name = "Name")
  private String Name;

  /**
   * 项目名称-详细
   */
  @Column(name = "DetailName")
  private String DetailName;

  /**
   * 型号及规格
   */
  @Column(name = "Specification")
  private String Specification;

  /**
   * 单位
   */
  @Column(name = "Unit")
  private String Unit;

  /**
   * 数量
   */
  @Column(name = "Quantity")
  private String Quantity;

  /**
   * 规范书负责单位
   */
  @Column(name = "Principan_for_specification_book")
  private String principanForSpecificationBook;

  /**
   * 备注
   */
  @Column(name = "Remark")
  private String Remark;

  /**
   * 设备分区
   */
  @Column(name = "Equipment_Division")
  private String equipmentDivision;

  /**
   * 设备采购地
   */
  @Column(name = "Place_of_Purchase")
  private String placeOfPurchase;

  /**
   * 包号
   */
  @Column(name = "Bale_Number")
  private String baleNumber;

  /**
   * 规范书是否完成
   */
  @Column(name = "Specification_Finished")
  private String specificationFinished;

  /**
   * 是否招标
   */
  @Column(name = "Call_for_bids")
  private String callForBids;

  @Column(name = "Region_ID")
  private String regionID;

  /**
   * 父序号
   */
  @Column(name = "ParentID")
  private String ParentID;

  /**
   * 变电站
   */
  @Column(name = "Substation_ID", nullable = false)
  private String substationID;

  /**
   * 序号
   */
  public String getID() {
    return ID;
  }

  /**
   * 序号
   */
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   * 项目名称-大类
   */
  public String getName() {
    return Name;
  }

  /**
   * 项目名称-大类
   */
  public void setName(String Name) {
    this.Name = Name;
  }

  /**
   * 项目名称-详细
   */
  public String getDetailName() {
    return DetailName;
  }

  /**
   * 项目名称-详细
   */
  public void setDetailName(String DetailName) {
    this.DetailName = DetailName;
  }

  /**
   * 型号及规格
   */
  public String getSpecification() {
    return Specification;
  }

  /**
   * 型号及规格
   */
  public void setSpecification(String Specification) {
    this.Specification = Specification;
  }

  /**
   * 单位
   */
  public String getUnit() {
    return Unit;
  }

  /**
   * 单位
   */
  public void setUnit(String Unit) {
    this.Unit = Unit;
  }

  /**
   * 数量
   */
  public String getQuantity() {
    return Quantity;
  }

  /**
   * 数量
   */
  public void setQuantity(String Quantity) {
    this.Quantity = Quantity;
  }

  /**
   * 规范书负责单位
   */
  public String getPrincipanForSpecificationBook() {
    return principanForSpecificationBook;
  }

  /**
   * 规范书负责单位
   */
  public void setPrincipanForSpecificationBook(String principanForSpecificationBook) {
    this.principanForSpecificationBook = principanForSpecificationBook;
  }

  /**
   * 备注
   */
  public String getRemark() {
    return Remark;
  }

  /**
   * 备注
   */
  public void setRemark(String Remark) {
    this.Remark = Remark;
  }

  /**
   * 设备分区
   */
  public String getEquipmentDivision() {
    return equipmentDivision;
  }

  /**
   * 设备分区
   */
  public void setEquipmentDivision(String equipmentDivision) {
    this.equipmentDivision = equipmentDivision;
  }

  /**
   * 设备采购地
   */
  public String getPlaceOfPurchase() {
    return placeOfPurchase;
  }

  /**
   * 设备采购地
   */
  public void setPlaceOfPurchase(String placeOfPurchase) {
    this.placeOfPurchase = placeOfPurchase;
  }

  /**
   * 包号
   */
  public String getBaleNumber() {
    return baleNumber;
  }

  /**
   * 包号
   */
  public void setBaleNumber(String baleNumber) {
    this.baleNumber = baleNumber;
  }

  /**
   * 规范书是否完成
   */
  public String getSpecificationFinished() {
    return specificationFinished;
  }

  /**
   * 规范书是否完成
   */
  public void setSpecificationFinished(String specificationFinished) {
    this.specificationFinished = specificationFinished;
  }

  /**
   * 是否招标
   */
  public String getCallForBids() {
    return callForBids;
  }

  /**
   * 是否招标
   */
  public void setCallForBids(String callForBids) {
    this.callForBids = callForBids;
  }

  public String getRegionID() {
    return regionID;
  }

  public void setRegionID(String regionID) {
    this.regionID = regionID;
  }

  /**
   * 父序号
   */
  public String getParentID() {
    return ParentID;
  }

  /**
   * 父序号
   */
  public void setParentID(String ParentID) {
    this.ParentID = ParentID;
  }

  /**
   * 变电站
   */
  public String getSubstationID() {
    return substationID;
  }

  /**
   * 变电站
   */
  public void setSubstationID(String substationID) {
    this.substationID = substationID;
  }

  public String toString() {
    return "Substationequipments{ID=" + ID + 
      ", Name=" + Name + 
      ", DetailName=" + DetailName + 
      ", Specification=" + Specification + 
      ", Unit=" + Unit + 
      ", Quantity=" + Quantity + 
      ", principanForSpecificationBook=" + principanForSpecificationBook + 
      ", Remark=" + Remark + 
      ", equipmentDivision=" + equipmentDivision + 
      ", placeOfPurchase=" + placeOfPurchase + 
      ", baleNumber=" + baleNumber + 
      ", specificationFinished=" + specificationFinished + 
      ", callForBids=" + callForBids + 
      ", regionID=" + regionID + 
      ", ParentID=" + ParentID + 
      ", substationID=" + substationID + 
      "}";
  }
}