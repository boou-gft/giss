/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class LISTA.
 * 
 * @version $Revision$ $Date$
 */
public class LISTA implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _CMUN
     */
    private long _CMUN = 0;

    /**
     * keeps track of state for field: _CMUN
     */
    private boolean _has_CMUN;

    /**
     * Field _IMUN
     */
    private java.lang.String _IMUN;

    /**
     * Field _VBASECALCANT
     */
    private java.math.BigDecimal _VBASECALCANT = new java.math.BigDecimal("0");

    /**
     * Field _PALIQTANT
     */
    private java.math.BigDecimal _PALIQTANT = new java.math.BigDecimal("0");

    /**
     * Field _VAPURCANT
     */
    private java.math.BigDecimal _VAPURCANT = new java.math.BigDecimal("0");

    /**
     * Field _VBASECALCATU
     */
    private java.math.BigDecimal _VBASECALCATU = new java.math.BigDecimal("0");

    /**
     * Field _PALIQTATU
     */
    private java.math.BigDecimal _PALIQTATU = new java.math.BigDecimal("0");

    /**
     * Field _VAPURCATU
     */
    private java.math.BigDecimal _VAPURCATU = new java.math.BigDecimal("0");

    /**
     * Field _VALORDIF
     */
    private java.math.BigDecimal _VALORDIF = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public LISTA() 
     {
        super();
        setVBASECALCANT(new java.math.BigDecimal("0"));
        setPALIQTANT(new java.math.BigDecimal("0"));
        setVAPURCANT(new java.math.BigDecimal("0"));
        setVBASECALCATU(new java.math.BigDecimal("0"));
        setPALIQTATU(new java.math.BigDecimal("0"));
        setVAPURCATU(new java.math.BigDecimal("0"));
        setVALORDIF(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCMUN
     * 
     */
    public void deleteCMUN()
    {
        this._has_CMUN= false;
    } //-- void deleteCMUN() 

    /**
     * Returns the value of field 'CMUN'.
     * 
     * @return long
     * @return the value of field 'CMUN'.
     */
    public long getCMUN()
    {
        return this._CMUN;
    } //-- long getCMUN() 

    /**
     * Returns the value of field 'IMUN'.
     * 
     * @return String
     * @return the value of field 'IMUN'.
     */
    public java.lang.String getIMUN()
    {
        return this._IMUN;
    } //-- java.lang.String getIMUN() 

    /**
     * Returns the value of field 'PALIQTANT'.
     * 
     * @return BigDecimal
     * @return the value of field 'PALIQTANT'.
     */
    public java.math.BigDecimal getPALIQTANT()
    {
        return this._PALIQTANT;
    } //-- java.math.BigDecimal getPALIQTANT() 

    /**
     * Returns the value of field 'PALIQTATU'.
     * 
     * @return BigDecimal
     * @return the value of field 'PALIQTATU'.
     */
    public java.math.BigDecimal getPALIQTATU()
    {
        return this._PALIQTATU;
    } //-- java.math.BigDecimal getPALIQTATU() 

    /**
     * Returns the value of field 'VALORDIF'.
     * 
     * @return BigDecimal
     * @return the value of field 'VALORDIF'.
     */
    public java.math.BigDecimal getVALORDIF()
    {
        return this._VALORDIF;
    } //-- java.math.BigDecimal getVALORDIF() 

    /**
     * Returns the value of field 'VAPURCANT'.
     * 
     * @return BigDecimal
     * @return the value of field 'VAPURCANT'.
     */
    public java.math.BigDecimal getVAPURCANT()
    {
        return this._VAPURCANT;
    } //-- java.math.BigDecimal getVAPURCANT() 

    /**
     * Returns the value of field 'VAPURCATU'.
     * 
     * @return BigDecimal
     * @return the value of field 'VAPURCATU'.
     */
    public java.math.BigDecimal getVAPURCATU()
    {
        return this._VAPURCATU;
    } //-- java.math.BigDecimal getVAPURCATU() 

    /**
     * Returns the value of field 'VBASECALCANT'.
     * 
     * @return BigDecimal
     * @return the value of field 'VBASECALCANT'.
     */
    public java.math.BigDecimal getVBASECALCANT()
    {
        return this._VBASECALCANT;
    } //-- java.math.BigDecimal getVBASECALCANT() 

    /**
     * Returns the value of field 'VBASECALCATU'.
     * 
     * @return BigDecimal
     * @return the value of field 'VBASECALCATU'.
     */
    public java.math.BigDecimal getVBASECALCATU()
    {
        return this._VBASECALCATU;
    } //-- java.math.BigDecimal getVBASECALCATU() 

    /**
     * Method hasCMUN
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCMUN()
    {
        return this._has_CMUN;
    } //-- boolean hasCMUN() 

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
     * Sets the value of field 'CMUN'.
     * 
     * @param CMUN the value of field 'CMUN'.
     */
    public void setCMUN(long CMUN)
    {
        this._CMUN = CMUN;
        this._has_CMUN = true;
    } //-- void setCMUN(long) 

    /**
     * Sets the value of field 'IMUN'.
     * 
     * @param IMUN the value of field 'IMUN'.
     */
    public void setIMUN(java.lang.String IMUN)
    {
        this._IMUN = IMUN;
    } //-- void setIMUN(java.lang.String) 

    /**
     * Sets the value of field 'PALIQTANT'.
     * 
     * @param PALIQTANT the value of field 'PALIQTANT'.
     */
    public void setPALIQTANT(java.math.BigDecimal PALIQTANT)
    {
        this._PALIQTANT = PALIQTANT;
    } //-- void setPALIQTANT(java.math.BigDecimal) 

    /**
     * Sets the value of field 'PALIQTATU'.
     * 
     * @param PALIQTATU the value of field 'PALIQTATU'.
     */
    public void setPALIQTATU(java.math.BigDecimal PALIQTATU)
    {
        this._PALIQTATU = PALIQTATU;
    } //-- void setPALIQTATU(java.math.BigDecimal) 

    /**
     * Sets the value of field 'VALORDIF'.
     * 
     * @param VALORDIF the value of field 'VALORDIF'.
     */
    public void setVALORDIF(java.math.BigDecimal VALORDIF)
    {
        this._VALORDIF = VALORDIF;
    } //-- void setVALORDIF(java.math.BigDecimal) 

    /**
     * Sets the value of field 'VAPURCANT'.
     * 
     * @param VAPURCANT the value of field 'VAPURCANT'.
     */
    public void setVAPURCANT(java.math.BigDecimal VAPURCANT)
    {
        this._VAPURCANT = VAPURCANT;
    } //-- void setVAPURCANT(java.math.BigDecimal) 

    /**
     * Sets the value of field 'VAPURCATU'.
     * 
     * @param VAPURCATU the value of field 'VAPURCATU'.
     */
    public void setVAPURCATU(java.math.BigDecimal VAPURCATU)
    {
        this._VAPURCATU = VAPURCATU;
    } //-- void setVAPURCATU(java.math.BigDecimal) 

    /**
     * Sets the value of field 'VBASECALCANT'.
     * 
     * @param VBASECALCANT the value of field 'VBASECALCANT'.
     */
    public void setVBASECALCANT(java.math.BigDecimal VBASECALCANT)
    {
        this._VBASECALCANT = VBASECALCANT;
    } //-- void setVBASECALCANT(java.math.BigDecimal) 

    /**
     * Sets the value of field 'VBASECALCATU'.
     * 
     * @param VBASECALCATU the value of field 'VBASECALCATU'.
     */
    public void setVBASECALCATU(java.math.BigDecimal VBASECALCATU)
    {
        this._VBASECALCATU = VBASECALCATU;
    } //-- void setVBASECALCATU(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return LISTA
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA unmarshal(java.io.Reader) 

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
