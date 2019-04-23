

/* First created by JCasGen Thu Jul 05 13:32:10 CEST 2018 */
package fr.aphp.wind.uima.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.DocumentAnnotation;


/** 
 * Updated by JCasGen Thu Jul 05 13:32:10 CEST 2018
 * XML source: /home/nps/workspace/uima-aphp/uima-segmenter/src/main/resources/types/SectionSegmenterTypeSystem.xml
 * @generated */
public class CompteRendu extends DocumentAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CompteRendu.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected CompteRendu() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CompteRendu(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CompteRendu(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public CompteRendu(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: typeDoc

  /** getter for typeDoc - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTypeDoc() {
    if (CompteRendu_Type.featOkTst && ((CompteRendu_Type)jcasType).casFeat_typeDoc == null)
      jcasType.jcas.throwFeatMissing("typeDoc", "fr.aphp.wind.uima.type.CompteRendu");
    return jcasType.ll_cas.ll_getIntValue(addr, ((CompteRendu_Type)jcasType).casFeatCode_typeDoc);}
    
  /** setter for typeDoc - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTypeDoc(int v) {
    if (CompteRendu_Type.featOkTst && ((CompteRendu_Type)jcasType).casFeat_typeDoc == null)
      jcasType.jcas.throwFeatMissing("typeDoc", "fr.aphp.wind.uima.type.CompteRendu");
    jcasType.ll_cas.ll_setIntValue(addr, ((CompteRendu_Type)jcasType).casFeatCode_typeDoc, v);}    
   
    
  //*--------------*
  //* Feature: ids_doc

  /** getter for ids_doc - gets 
   * @generated
   * @return value of the feature 
   */
  public int getIds_doc() {
    if (CompteRendu_Type.featOkTst && ((CompteRendu_Type)jcasType).casFeat_ids_doc == null)
      jcasType.jcas.throwFeatMissing("ids_doc", "fr.aphp.wind.uima.type.CompteRendu");
    return jcasType.ll_cas.ll_getIntValue(addr, ((CompteRendu_Type)jcasType).casFeatCode_ids_doc);}
    
  /** setter for ids_doc - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIds_doc(int v) {
    if (CompteRendu_Type.featOkTst && ((CompteRendu_Type)jcasType).casFeat_ids_doc == null)
      jcasType.jcas.throwFeatMissing("ids_doc", "fr.aphp.wind.uima.type.CompteRendu");
    jcasType.ll_cas.ll_setIntValue(addr, ((CompteRendu_Type)jcasType).casFeatCode_ids_doc, v);}    
   
    
  //*--------------*
  //* Feature: category

  /** getter for category - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCategory() {
    if (CompteRendu_Type.featOkTst && ((CompteRendu_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "fr.aphp.wind.uima.type.CompteRendu");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CompteRendu_Type)jcasType).casFeatCode_category);}
    
  /** setter for category - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategory(String v) {
    if (CompteRendu_Type.featOkTst && ((CompteRendu_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "fr.aphp.wind.uima.type.CompteRendu");
    jcasType.ll_cas.ll_setStringValue(addr, ((CompteRendu_Type)jcasType).casFeatCode_category, v);}    
  }

    