/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaComboSistContabil.java,v 1.3 2017/11/15 22:17:10 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListaComboSistContabil.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/11/15 22:17:10 $
 */
public class ListaComboSistContabil implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codSistemaContabil
     */
    private int _codSistemaContabil = 0;

    /**
     * keeps track of state for field: _codSistemaContabil
     */
    private boolean _has_codSistemaContabil;

    /**
     * Field _descSistemaContabil
     */
    private java.lang.String _descSistemaContabil;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaComboSistContabil() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodSistemaContabil
     * 
     */
    public void deleteCodSistemaContabil()
    {
        this._has_codSistemaContabil= false;
    } //-- void deleteCodSistemaContabil() 

    /**
     * Returns the value of field 'codSistemaContabil'.
     * 
     * @return int
     * @return the value of field 'codSistemaContabil'.
     */
    public int getCodSistemaContabil()
    {
        return this._codSistemaContabil;
    } //-- int getCodSistemaContabil() 

    /**
     * Returns the value of field 'descSistemaContabil'.
     * 
     * @return String
     * @return the value of field 'descSistemaContabil'.
     */
    public java.lang.String getDescSistemaContabil()
    {
        return this._descSistemaContabil;
    } //-- java.lang.String getDescSistemaContabil() 

    /**
     * Method hasCodSistemaContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodSistemaContabil()
    {
        return this._has_codSistemaContabil;
    } //-- boolean hasCodSistemaContabil() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'codSistemaContabil'.
     * 
     * @param codSistemaContabil the value of field
     * 'codSistemaContabil'.
     */
    public void setCodSistemaContabil(int codSistemaContabil)
    {
        this._codSistemaContabil = codSistemaContabil;
        this._has_codSistemaContabil = true;
    } //-- void setCodSistemaContabil(int) 

    /**
     * Sets the value of field 'descSistemaContabil'.
     * 
     * @param descSistemaContabil the value of field
     * 'descSistemaContabil'.
     */
    public void setDescSistemaContabil(java.lang.String descSistemaContabil)
    {
        this._descSistemaContabil = descSistemaContabil;
    } //-- void setDescSistemaContabil(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaComboSistContabil
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
