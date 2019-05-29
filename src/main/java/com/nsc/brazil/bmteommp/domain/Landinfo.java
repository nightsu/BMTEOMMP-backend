package com.nsc.brazil.bmteommp.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "landinfo")
public class Landinfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "Lot")
  private String Lot;

  @Column(name = "TRECHO")
  private String TRECHO;

  @Column(name = "CROSSING")
  private String CROSSING;

  @Column(name = "PROCESS_NUMBER")
  private String pROCESSNUMBER;

  @Column(name = "OWNER_NAME")
  private String oWNERNAME;

  @Column(name = "NAME_OF_PROPERTY")
  private String nAMEOFPROPERTY;

  @Column(name = "COUNTY")
  private String COUNTY;

  @Column(name = "DATE_PHYSICAL_REGISTRATION")
  private String dATEPHYSICALREGISTRATION;

  @Column(name = "N_WEEK_REGISTRATION")
  private String nWEEKREGISTRATION;

  @Column(name = "STATUS_PHYSICAL_REGISTRATION")
  private String sTATUSPHYSICALREGISTRATION;

  @Column(name = "STATUS_DOCUMENTARY_REGISTRATION")
  private String sTATUSDOCUMENTARYREGISTRATION;

  @Column(name = "DOCUMENTARY_PENDENCY")
  private String dOCUMENTARYPENDENCY;

  @Column(name = "CPF")
  private String CPF;

  @Column(name = "ADDRESS")
  private String ADDRESS;

  @Column(name = "Zip_code")
  private String zipCode;

  @Column(name = "TELEPHONE")
  private String TELEPHONE;

  @Column(name = "REGISTRATION")
  private String REGISTRATION;

  @Column(name = "DATE_UPDATE_ENROLLMENT")
  private String dATEUPDATEENROLLMENT;

  @Column(name = "REFERENCE_TOPOGRAPHY")
  private String rEFERENCETOPOGRAPHY;

  @Column(name = "DATE_RECEIPT_PLANT")
  private String dATERECEIPTPLANT;

  @Column(name = "AREA_MD_MAP")
  private String aREAMDMAP;

  @Column(name = "AXIS")
  private String AXIS;

  @Column(name = "STATUS_PLANTA")
  private String sTATUSPLANTA;

  @Column(name = "REVIEW_MAP")
  private String rEVIEWMAP;

  @Column(name = "DATE_SEND_REVIEW")
  private String dATESENDREVIEW;

  @Column(name = "DATE_RETURN_REVIEW")
  private String dATERETURNREVIEW;

  @Column(name = "Towers")
  private String Towers;

  @Column(name = "QTDE_TORRES")
  private String qTDETORRES;

  @Column(name = "AREA_Vertice")
  private String aREAVertice;

  @Column(name = "LEGAL_RESERVE_REGISTRATION")
  private String lEGALRESERVEREGISTRATION;

  @Column(name = "POSSIBLE_PROTOCOLIZED_CAR")
  private String pOSSIBLEPROTOCOLIZEDCAR;

  @Column(name = "LEGAL_RESERVE_GEORREFERENCIADA")
  private String lEGALRESERVEGEORREFERENCIADA;

  @Column(name = "INTERCEPTED_LEGAL_RESERVATION")
  private String iNTERCEPTEDLEGALRESERVATION;

  @Column(name = "DATE_AWARD")
  private String dATEAWARD;

  @Column(name = "COMPLETE_REPORT")
  private String cOMPLETEREPORT;

  @Column(name = "VALUE_SERVIDAO")
  private String vALUESERVIDAO;

  @Column(name = "NON_REPRODUCTIVE_BENEFIT_VALUE")
  private String nONREPRODUCTIVEBENEFITVALUE;

  @Column(name = "REPRODUCTIVE_BENEFIT_VALUE")
  private String rEPRODUCTIVEBENEFITVALUE;

  @Column(name = "VALUE_AWARD")
  private String vALUEAWARD;

  @Column(name = "DATE_APPROVAL")
  private String dATEAPPROVAL;

  @Column(name = "APPROVED_APPEAL")
  private String aPPROVEDAPPEAL;

  @Column(name = "VALUE")
  private String VALUE;

  @Column(name = "VALUE_OFFERED")
  private String vALUEOFFERED;

  @Column(name = "NEGOTIATED_VALUE")
  private String nEGOTIATEDVALUE;

  @Column(name = "RESPONSIBLE_NEGOTIATOR")
  private String rESPONSIBLENEGOTIATOR;

  @Column(name = "PASSAGE_AUTHORIZATION")
  private String pASSAGEAUTHORIZATION;

  @Column(name = "STATUS_NEGOTIATION")
  private String sTATUSNEGOTIATION;

  @Column(name = "VALUE_AGAINST_PROPOSAL")
  private String vALUEAGAINSTPROPOSAL;

  @Column(name = "N_WEEK_HOME")
  private String nWEEKHOME;

  @Column(name = "DATE_OFFER")
  private String dATEOFFER;

  @Column(name = "OFFER_WEEK_NUMBER")
  private String oFFERWEEKNUMBER;

  @Column(name = "DATE_AGREEMENT")
  private String dATEAGREEMENT;

  @Column(name = "Mumber")
  private String Mumber;

  @Column(name = "N_AGREEMENT_WEEK")
  private String nAGREEMENTWEEK;

  @Column(name = "STATUS_CHECK_PGTO")
  private String sTATUSCHECKPGTO;

  @Column(name = "DATE_REQUEST_CHECK")
  private String dATEREQUESTCHECK;

  @Column(name = "No_SOLITATION_RESOURCE")
  private String noSOLITATIONRESOURCE;

  @Column(name = "DATE_OF_CHECK")
  private String dATEOFCHECK;

  @Column(name = "No_CHECK")
  private String noCHECK;

  @Column(name = "DATE_PAYMENT")
  private String dATEPAYMENT;

  @Column(name = "No_WEEK_PGTO")
  private String noWEEKPGTO;

  @Column(name = "PAYMENT_FORM")
  private String pAYMENTFORM;

  @Column(name = "N_JUDICIAL_PROCESS")
  private String nJUDICIALPROCESS;

  @Column(name = "DATE_OF_EMPLOYMENT")
  private String dATEOFEMPLOYMENT;

  @Column(name = "DATE_APPLICATION_FOR_APPEAL")
  private String dATEAPPLICATIONFORAPPEAL;

  @Column(name = "DATE_DISTRIBUTION_ACTION")
  private String dATEDISTRIBUTIONACTION;

  @Column(name = "DATE_LIMITED")
  private String dATELIMITED;

  @Column(name = "DATE_IMPOSED_ON_POSSESSION")
  private String dATEIMPOSEDONPOSSESSION;

  @Column(name = "JUDICIAL_DEPOSIT_VALUE")
  private String jUDICIALDEPOSITVALUE;

  @Column(name = "DUE_JUDICIAL_DEPOSIT")
  private String dUEJUDICIALDEPOSIT;

  @Column(name = "AGREEMENTS_JUDICIAL_DEPOSIT_VALUE")
  private String aGREEMENTSJUDICIALDEPOSITVALUE;

  @Column(name = "AGREEMENTS_DATE_JUDICIAL_DEPOSIT")
  private String aGREEMENTSDATEJUDICIALDEPOSIT;

  @Column(name = "N_WEEK_IMPOSED_IN_POSSE")
  private String nWEEKIMPOSEDINPOSSE;

  public Integer getID() {
    return id;
  }

  public void setID(Integer ID) {
    this.id = ID;
  }

  public String getLot() {
    return Lot;
  }

  public void setLot(String Lot) {
    this.Lot = Lot;
  }

  public String getTRECHO() {
    return TRECHO;
  }

  public void setTRECHO(String TRECHO) {
    this.TRECHO = TRECHO;
  }

  public String getCROSSING() {
    return CROSSING;
  }

  public void setCROSSING(String CROSSING) {
    this.CROSSING = CROSSING;
  }

  public String getPROCESSNUMBER() {
    return pROCESSNUMBER;
  }

  public void setPROCESSNUMBER(String pROCESSNUMBER) {
    this.pROCESSNUMBER = pROCESSNUMBER;
  }

  public String getOWNERNAME() {
    return oWNERNAME;
  }

  public void setOWNERNAME(String oWNERNAME) {
    this.oWNERNAME = oWNERNAME;
  }

  public String getNAMEOFPROPERTY() {
    return nAMEOFPROPERTY;
  }

  public void setNAMEOFPROPERTY(String nAMEOFPROPERTY) {
    this.nAMEOFPROPERTY = nAMEOFPROPERTY;
  }

  public String getCOUNTY() {
    return COUNTY;
  }

  public void setCOUNTY(String COUNTY) {
    this.COUNTY = COUNTY;
  }

  public String getDATEPHYSICALREGISTRATION() {
    return dATEPHYSICALREGISTRATION;
  }

  public void setDATEPHYSICALREGISTRATION(String dATEPHYSICALREGISTRATION) {
    this.dATEPHYSICALREGISTRATION = dATEPHYSICALREGISTRATION;
  }

  public String getNWEEKREGISTRATION() {
    return nWEEKREGISTRATION;
  }

  public void setNWEEKREGISTRATION(String nWEEKREGISTRATION) {
    this.nWEEKREGISTRATION = nWEEKREGISTRATION;
  }

  public String getSTATUSPHYSICALREGISTRATION() {
    return sTATUSPHYSICALREGISTRATION;
  }

  public void setSTATUSPHYSICALREGISTRATION(String sTATUSPHYSICALREGISTRATION) {
    this.sTATUSPHYSICALREGISTRATION = sTATUSPHYSICALREGISTRATION;
  }

  public String getSTATUSDOCUMENTARYREGISTRATION() {
    return sTATUSDOCUMENTARYREGISTRATION;
  }

  public void setSTATUSDOCUMENTARYREGISTRATION(String sTATUSDOCUMENTARYREGISTRATION) {
    this.sTATUSDOCUMENTARYREGISTRATION = sTATUSDOCUMENTARYREGISTRATION;
  }

  public String getDOCUMENTARYPENDENCY() {
    return dOCUMENTARYPENDENCY;
  }

  public void setDOCUMENTARYPENDENCY(String dOCUMENTARYPENDENCY) {
    this.dOCUMENTARYPENDENCY = dOCUMENTARYPENDENCY;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String CPF) {
    this.CPF = CPF;
  }

  public String getADDRESS() {
    return ADDRESS;
  }

  public void setADDRESS(String ADDRESS) {
    this.ADDRESS = ADDRESS;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getTELEPHONE() {
    return TELEPHONE;
  }

  public void setTELEPHONE(String TELEPHONE) {
    this.TELEPHONE = TELEPHONE;
  }

  public String getREGISTRATION() {
    return REGISTRATION;
  }

  public void setREGISTRATION(String REGISTRATION) {
    this.REGISTRATION = REGISTRATION;
  }

  public String getDATEUPDATEENROLLMENT() {
    return dATEUPDATEENROLLMENT;
  }

  public void setDATEUPDATEENROLLMENT(String dATEUPDATEENROLLMENT) {
    this.dATEUPDATEENROLLMENT = dATEUPDATEENROLLMENT;
  }

  public String getREFERENCETOPOGRAPHY() {
    return rEFERENCETOPOGRAPHY;
  }

  public void setREFERENCETOPOGRAPHY(String rEFERENCETOPOGRAPHY) {
    this.rEFERENCETOPOGRAPHY = rEFERENCETOPOGRAPHY;
  }

  public String getDATERECEIPTPLANT() {
    return dATERECEIPTPLANT;
  }

  public void setDATERECEIPTPLANT(String dATERECEIPTPLANT) {
    this.dATERECEIPTPLANT = dATERECEIPTPLANT;
  }

  public String getAREAMDMAP() {
    return aREAMDMAP;
  }

  public void setAREAMDMAP(String aREAMDMAP) {
    this.aREAMDMAP = aREAMDMAP;
  }

  public String getAXIS() {
    return AXIS;
  }

  public void setAXIS(String AXIS) {
    this.AXIS = AXIS;
  }

  public String getSTATUSPLANTA() {
    return sTATUSPLANTA;
  }

  public void setSTATUSPLANTA(String sTATUSPLANTA) {
    this.sTATUSPLANTA = sTATUSPLANTA;
  }

  public String getREVIEWMAP() {
    return rEVIEWMAP;
  }

  public void setREVIEWMAP(String rEVIEWMAP) {
    this.rEVIEWMAP = rEVIEWMAP;
  }

  public String getDATESENDREVIEW() {
    return dATESENDREVIEW;
  }

  public void setDATESENDREVIEW(String dATESENDREVIEW) {
    this.dATESENDREVIEW = dATESENDREVIEW;
  }

  public String getDATERETURNREVIEW() {
    return dATERETURNREVIEW;
  }

  public void setDATERETURNREVIEW(String dATERETURNREVIEW) {
    this.dATERETURNREVIEW = dATERETURNREVIEW;
  }

  public String getTowers() {
    return Towers;
  }

  public void setTowers(String Towers) {
    this.Towers = Towers;
  }

  public String getQTDETORRES() {
    return qTDETORRES;
  }

  public void setQTDETORRES(String qTDETORRES) {
    this.qTDETORRES = qTDETORRES;
  }

  public String getAREAVertice() {
    return aREAVertice;
  }

  public void setAREAVertice(String aREAVertice) {
    this.aREAVertice = aREAVertice;
  }

  public String getLEGALRESERVEREGISTRATION() {
    return lEGALRESERVEREGISTRATION;
  }

  public void setLEGALRESERVEREGISTRATION(String lEGALRESERVEREGISTRATION) {
    this.lEGALRESERVEREGISTRATION = lEGALRESERVEREGISTRATION;
  }

  public String getPOSSIBLEPROTOCOLIZEDCAR() {
    return pOSSIBLEPROTOCOLIZEDCAR;
  }

  public void setPOSSIBLEPROTOCOLIZEDCAR(String pOSSIBLEPROTOCOLIZEDCAR) {
    this.pOSSIBLEPROTOCOLIZEDCAR = pOSSIBLEPROTOCOLIZEDCAR;
  }

  public String getLEGALRESERVEGEORREFERENCIADA() {
    return lEGALRESERVEGEORREFERENCIADA;
  }

  public void setLEGALRESERVEGEORREFERENCIADA(String lEGALRESERVEGEORREFERENCIADA) {
    this.lEGALRESERVEGEORREFERENCIADA = lEGALRESERVEGEORREFERENCIADA;
  }

  public String getINTERCEPTEDLEGALRESERVATION() {
    return iNTERCEPTEDLEGALRESERVATION;
  }

  public void setINTERCEPTEDLEGALRESERVATION(String iNTERCEPTEDLEGALRESERVATION) {
    this.iNTERCEPTEDLEGALRESERVATION = iNTERCEPTEDLEGALRESERVATION;
  }

  public String getDATEAWARD() {
    return dATEAWARD;
  }

  public void setDATEAWARD(String dATEAWARD) {
    this.dATEAWARD = dATEAWARD;
  }

  public String getCOMPLETEREPORT() {
    return cOMPLETEREPORT;
  }

  public void setCOMPLETEREPORT(String cOMPLETEREPORT) {
    this.cOMPLETEREPORT = cOMPLETEREPORT;
  }

  public String getVALUESERVIDAO() {
    return vALUESERVIDAO;
  }

  public void setVALUESERVIDAO(String vALUESERVIDAO) {
    this.vALUESERVIDAO = vALUESERVIDAO;
  }

  public String getNONREPRODUCTIVEBENEFITVALUE() {
    return nONREPRODUCTIVEBENEFITVALUE;
  }

  public void setNONREPRODUCTIVEBENEFITVALUE(String nONREPRODUCTIVEBENEFITVALUE) {
    this.nONREPRODUCTIVEBENEFITVALUE = nONREPRODUCTIVEBENEFITVALUE;
  }

  public String getREPRODUCTIVEBENEFITVALUE() {
    return rEPRODUCTIVEBENEFITVALUE;
  }

  public void setREPRODUCTIVEBENEFITVALUE(String rEPRODUCTIVEBENEFITVALUE) {
    this.rEPRODUCTIVEBENEFITVALUE = rEPRODUCTIVEBENEFITVALUE;
  }

  public String getVALUEAWARD() {
    return vALUEAWARD;
  }

  public void setVALUEAWARD(String vALUEAWARD) {
    this.vALUEAWARD = vALUEAWARD;
  }

  public String getDATEAPPROVAL() {
    return dATEAPPROVAL;
  }

  public void setDATEAPPROVAL(String dATEAPPROVAL) {
    this.dATEAPPROVAL = dATEAPPROVAL;
  }

  public String getAPPROVEDAPPEAL() {
    return aPPROVEDAPPEAL;
  }

  public void setAPPROVEDAPPEAL(String aPPROVEDAPPEAL) {
    this.aPPROVEDAPPEAL = aPPROVEDAPPEAL;
  }

  public String getVALUE() {
    return VALUE;
  }

  public void setVALUE(String VALUE) {
    this.VALUE = VALUE;
  }

  public String getVALUEOFFERED() {
    return vALUEOFFERED;
  }

  public void setVALUEOFFERED(String vALUEOFFERED) {
    this.vALUEOFFERED = vALUEOFFERED;
  }

  public String getNEGOTIATEDVALUE() {
    return nEGOTIATEDVALUE;
  }

  public void setNEGOTIATEDVALUE(String nEGOTIATEDVALUE) {
    this.nEGOTIATEDVALUE = nEGOTIATEDVALUE;
  }

  public String getRESPONSIBLENEGOTIATOR() {
    return rESPONSIBLENEGOTIATOR;
  }

  public void setRESPONSIBLENEGOTIATOR(String rESPONSIBLENEGOTIATOR) {
    this.rESPONSIBLENEGOTIATOR = rESPONSIBLENEGOTIATOR;
  }

  public String getPASSAGEAUTHORIZATION() {
    return pASSAGEAUTHORIZATION;
  }

  public void setPASSAGEAUTHORIZATION(String pASSAGEAUTHORIZATION) {
    this.pASSAGEAUTHORIZATION = pASSAGEAUTHORIZATION;
  }

  public String getSTATUSNEGOTIATION() {
    return sTATUSNEGOTIATION;
  }

  public void setSTATUSNEGOTIATION(String sTATUSNEGOTIATION) {
    this.sTATUSNEGOTIATION = sTATUSNEGOTIATION;
  }

  public String getVALUEAGAINSTPROPOSAL() {
    return vALUEAGAINSTPROPOSAL;
  }

  public void setVALUEAGAINSTPROPOSAL(String vALUEAGAINSTPROPOSAL) {
    this.vALUEAGAINSTPROPOSAL = vALUEAGAINSTPROPOSAL;
  }

  public String getNWEEKHOME() {
    return nWEEKHOME;
  }

  public void setNWEEKHOME(String nWEEKHOME) {
    this.nWEEKHOME = nWEEKHOME;
  }

  public String getDATEOFFER() {
    return dATEOFFER;
  }

  public void setDATEOFFER(String dATEOFFER) {
    this.dATEOFFER = dATEOFFER;
  }

  public String getOFFERWEEKNUMBER() {
    return oFFERWEEKNUMBER;
  }

  public void setOFFERWEEKNUMBER(String oFFERWEEKNUMBER) {
    this.oFFERWEEKNUMBER = oFFERWEEKNUMBER;
  }

  public String getDATEAGREEMENT() {
    return dATEAGREEMENT;
  }

  public void setDATEAGREEMENT(String dATEAGREEMENT) {
    this.dATEAGREEMENT = dATEAGREEMENT;
  }

  public String getMumber() {
    return Mumber;
  }

  public void setMumber(String Mumber) {
    this.Mumber = Mumber;
  }

  public String getNAGREEMENTWEEK() {
    return nAGREEMENTWEEK;
  }

  public void setNAGREEMENTWEEK(String nAGREEMENTWEEK) {
    this.nAGREEMENTWEEK = nAGREEMENTWEEK;
  }

  public String getSTATUSCHECKPGTO() {
    return sTATUSCHECKPGTO;
  }

  public void setSTATUSCHECKPGTO(String sTATUSCHECKPGTO) {
    this.sTATUSCHECKPGTO = sTATUSCHECKPGTO;
  }

  public String getDATEREQUESTCHECK() {
    return dATEREQUESTCHECK;
  }

  public void setDATEREQUESTCHECK(String dATEREQUESTCHECK) {
    this.dATEREQUESTCHECK = dATEREQUESTCHECK;
  }

  public String getNoSOLITATIONRESOURCE() {
    return noSOLITATIONRESOURCE;
  }

  public void setNoSOLITATIONRESOURCE(String noSOLITATIONRESOURCE) {
    this.noSOLITATIONRESOURCE = noSOLITATIONRESOURCE;
  }

  public String getDATEOFCHECK() {
    return dATEOFCHECK;
  }

  public void setDATEOFCHECK(String dATEOFCHECK) {
    this.dATEOFCHECK = dATEOFCHECK;
  }

  public String getNoCHECK() {
    return noCHECK;
  }

  public void setNoCHECK(String noCHECK) {
    this.noCHECK = noCHECK;
  }

  public String getDATEPAYMENT() {
    return dATEPAYMENT;
  }

  public void setDATEPAYMENT(String dATEPAYMENT) {
    this.dATEPAYMENT = dATEPAYMENT;
  }

  public String getNoWEEKPGTO() {
    return noWEEKPGTO;
  }

  public void setNoWEEKPGTO(String noWEEKPGTO) {
    this.noWEEKPGTO = noWEEKPGTO;
  }

  public String getPAYMENTFORM() {
    return pAYMENTFORM;
  }

  public void setPAYMENTFORM(String pAYMENTFORM) {
    this.pAYMENTFORM = pAYMENTFORM;
  }

  public String getNJUDICIALPROCESS() {
    return nJUDICIALPROCESS;
  }

  public void setNJUDICIALPROCESS(String nJUDICIALPROCESS) {
    this.nJUDICIALPROCESS = nJUDICIALPROCESS;
  }

  public String getDATEOFEMPLOYMENT() {
    return dATEOFEMPLOYMENT;
  }

  public void setDATEOFEMPLOYMENT(String dATEOFEMPLOYMENT) {
    this.dATEOFEMPLOYMENT = dATEOFEMPLOYMENT;
  }

  public String getDATEAPPLICATIONFORAPPEAL() {
    return dATEAPPLICATIONFORAPPEAL;
  }

  public void setDATEAPPLICATIONFORAPPEAL(String dATEAPPLICATIONFORAPPEAL) {
    this.dATEAPPLICATIONFORAPPEAL = dATEAPPLICATIONFORAPPEAL;
  }

  public String getDATEDISTRIBUTIONACTION() {
    return dATEDISTRIBUTIONACTION;
  }

  public void setDATEDISTRIBUTIONACTION(String dATEDISTRIBUTIONACTION) {
    this.dATEDISTRIBUTIONACTION = dATEDISTRIBUTIONACTION;
  }

  public String getDATELIMITED() {
    return dATELIMITED;
  }

  public void setDATELIMITED(String dATELIMITED) {
    this.dATELIMITED = dATELIMITED;
  }

  public String getDATEIMPOSEDONPOSSESSION() {
    return dATEIMPOSEDONPOSSESSION;
  }

  public void setDATEIMPOSEDONPOSSESSION(String dATEIMPOSEDONPOSSESSION) {
    this.dATEIMPOSEDONPOSSESSION = dATEIMPOSEDONPOSSESSION;
  }

  public String getJUDICIALDEPOSITVALUE() {
    return jUDICIALDEPOSITVALUE;
  }

  public void setJUDICIALDEPOSITVALUE(String jUDICIALDEPOSITVALUE) {
    this.jUDICIALDEPOSITVALUE = jUDICIALDEPOSITVALUE;
  }

  public String getDUEJUDICIALDEPOSIT() {
    return dUEJUDICIALDEPOSIT;
  }

  public void setDUEJUDICIALDEPOSIT(String dUEJUDICIALDEPOSIT) {
    this.dUEJUDICIALDEPOSIT = dUEJUDICIALDEPOSIT;
  }

  public String getAGREEMENTSJUDICIALDEPOSITVALUE() {
    return aGREEMENTSJUDICIALDEPOSITVALUE;
  }

  public void setAGREEMENTSJUDICIALDEPOSITVALUE(String aGREEMENTSJUDICIALDEPOSITVALUE) {
    this.aGREEMENTSJUDICIALDEPOSITVALUE = aGREEMENTSJUDICIALDEPOSITVALUE;
  }

  public String getAGREEMENTSDATEJUDICIALDEPOSIT() {
    return aGREEMENTSDATEJUDICIALDEPOSIT;
  }

  public void setAGREEMENTSDATEJUDICIALDEPOSIT(String aGREEMENTSDATEJUDICIALDEPOSIT) {
    this.aGREEMENTSDATEJUDICIALDEPOSIT = aGREEMENTSDATEJUDICIALDEPOSIT;
  }

  public String getNWEEKIMPOSEDINPOSSE() {
    return nWEEKIMPOSEDINPOSSE;
  }

  public void setNWEEKIMPOSEDINPOSSE(String nWEEKIMPOSEDINPOSSE) {
    this.nWEEKIMPOSEDINPOSSE = nWEEKIMPOSEDINPOSSE;
  }

  public String toString() {
    return "Landinfo{ID=" + id +
      ", Lot=" + Lot + 
      ", TRECHO=" + TRECHO + 
      ", CROSSING=" + CROSSING + 
      ", pROCESSNUMBER=" + pROCESSNUMBER + 
      ", oWNERNAME=" + oWNERNAME + 
      ", nAMEOFPROPERTY=" + nAMEOFPROPERTY + 
      ", COUNTY=" + COUNTY + 
      ", dATEPHYSICALREGISTRATION=" + dATEPHYSICALREGISTRATION + 
      ", nWEEKREGISTRATION=" + nWEEKREGISTRATION + 
      ", sTATUSPHYSICALREGISTRATION=" + sTATUSPHYSICALREGISTRATION + 
      ", sTATUSDOCUMENTARYREGISTRATION=" + sTATUSDOCUMENTARYREGISTRATION + 
      ", dOCUMENTARYPENDENCY=" + dOCUMENTARYPENDENCY + 
      ", CPF=" + CPF + 
      ", ADDRESS=" + ADDRESS + 
      ", zipCode=" + zipCode + 
      ", TELEPHONE=" + TELEPHONE + 
      ", REGISTRATION=" + REGISTRATION + 
      ", dATEUPDATEENROLLMENT=" + dATEUPDATEENROLLMENT + 
      ", rEFERENCETOPOGRAPHY=" + rEFERENCETOPOGRAPHY + 
      ", dATERECEIPTPLANT=" + dATERECEIPTPLANT + 
      ", aREAMDMAP=" + aREAMDMAP + 
      ", AXIS=" + AXIS + 
      ", sTATUSPLANTA=" + sTATUSPLANTA + 
      ", rEVIEWMAP=" + rEVIEWMAP + 
      ", dATESENDREVIEW=" + dATESENDREVIEW + 
      ", dATERETURNREVIEW=" + dATERETURNREVIEW + 
      ", Towers=" + Towers + 
      ", qTDETORRES=" + qTDETORRES + 
      ", aREAVertice=" + aREAVertice + 
      ", lEGALRESERVEREGISTRATION=" + lEGALRESERVEREGISTRATION + 
      ", pOSSIBLEPROTOCOLIZEDCAR=" + pOSSIBLEPROTOCOLIZEDCAR + 
      ", lEGALRESERVEGEORREFERENCIADA=" + lEGALRESERVEGEORREFERENCIADA + 
      ", iNTERCEPTEDLEGALRESERVATION=" + iNTERCEPTEDLEGALRESERVATION + 
      ", dATEAWARD=" + dATEAWARD + 
      ", cOMPLETEREPORT=" + cOMPLETEREPORT + 
      ", vALUESERVIDAO=" + vALUESERVIDAO + 
      ", nONREPRODUCTIVEBENEFITVALUE=" + nONREPRODUCTIVEBENEFITVALUE + 
      ", rEPRODUCTIVEBENEFITVALUE=" + rEPRODUCTIVEBENEFITVALUE + 
      ", vALUEAWARD=" + vALUEAWARD + 
      ", dATEAPPROVAL=" + dATEAPPROVAL + 
      ", aPPROVEDAPPEAL=" + aPPROVEDAPPEAL + 
      ", VALUE=" + VALUE + 
      ", vALUEOFFERED=" + vALUEOFFERED + 
      ", nEGOTIATEDVALUE=" + nEGOTIATEDVALUE + 
      ", rESPONSIBLENEGOTIATOR=" + rESPONSIBLENEGOTIATOR + 
      ", pASSAGEAUTHORIZATION=" + pASSAGEAUTHORIZATION + 
      ", sTATUSNEGOTIATION=" + sTATUSNEGOTIATION + 
      ", vALUEAGAINSTPROPOSAL=" + vALUEAGAINSTPROPOSAL + 
      ", nWEEKHOME=" + nWEEKHOME + 
      ", dATEOFFER=" + dATEOFFER + 
      ", oFFERWEEKNUMBER=" + oFFERWEEKNUMBER + 
      ", dATEAGREEMENT=" + dATEAGREEMENT + 
      ", Mumber=" + Mumber + 
      ", nAGREEMENTWEEK=" + nAGREEMENTWEEK + 
      ", sTATUSCHECKPGTO=" + sTATUSCHECKPGTO + 
      ", dATEREQUESTCHECK=" + dATEREQUESTCHECK + 
      ", noSOLITATIONRESOURCE=" + noSOLITATIONRESOURCE + 
      ", dATEOFCHECK=" + dATEOFCHECK + 
      ", noCHECK=" + noCHECK + 
      ", dATEPAYMENT=" + dATEPAYMENT + 
      ", noWEEKPGTO=" + noWEEKPGTO + 
      ", pAYMENTFORM=" + pAYMENTFORM + 
      ", nJUDICIALPROCESS=" + nJUDICIALPROCESS + 
      ", dATEOFEMPLOYMENT=" + dATEOFEMPLOYMENT + 
      ", dATEAPPLICATIONFORAPPEAL=" + dATEAPPLICATIONFORAPPEAL + 
      ", dATEDISTRIBUTIONACTION=" + dATEDISTRIBUTIONACTION + 
      ", dATELIMITED=" + dATELIMITED + 
      ", dATEIMPOSEDONPOSSESSION=" + dATEIMPOSEDONPOSSESSION + 
      ", jUDICIALDEPOSITVALUE=" + jUDICIALDEPOSITVALUE + 
      ", dUEJUDICIALDEPOSIT=" + dUEJUDICIALDEPOSIT + 
      ", aGREEMENTSJUDICIALDEPOSITVALUE=" + aGREEMENTSJUDICIALDEPOSITVALUE + 
      ", aGREEMENTSDATEJUDICIALDEPOSIT=" + aGREEMENTSDATEJUDICIALDEPOSIT + 
      ", nWEEKIMPOSEDINPOSSE=" + nWEEKIMPOSEDINPOSSE + 
      "}";
  }
}