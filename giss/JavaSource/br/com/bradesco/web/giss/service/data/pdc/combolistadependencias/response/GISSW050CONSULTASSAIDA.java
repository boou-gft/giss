/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response;

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
 * Class GISSW050CONSULTASSAIDA.
 * 
 * @version $Revision$ $Date$
 */
public class GISSW050CONSULTASSAIDA implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sCdPjurid
     */
    private long _sCdPjurid = 0;

    /**
     * keeps track of state for field: _sCdPjurid
     */
    private boolean _has_sCdPjurid;

    /**
     * Field _sCdNseqPjurid
     */
    private int _sCdNseqPjurid = 0;

    /**
     * keeps track of state for field: _sCdNseqPjurid
     */
    private boolean _has_sCdNseqPjurid;

    /**
     * Field _sCdDependencia
     */
    private int _sCdDependencia = 0;

    /**
     * keeps track of state for field: _sCdDependencia
     */
    private boolean _has_sCdDependencia;

    /**
     * Field _sDepDescr
     */
    private java.lang.String _sDepDescr;

    /**
     * Field _sDtAtulz
     */
    private java.lang.String _sDtAtulz;

    /**
     * Field _sSitDepen
     */
    private java.lang.String _sSitDepen;


      //----------------/
     //- Constructors -/
    //----------------/

    public GISSW050CONSULTASSAIDA() 
     {
        super();
    } //-- br.com.bradesco.web.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteSCdDependencia
     * 
     */
    public void deleteSCdDependencia()
    {
        this._has_sCdDependencia= false;
    } //-- void deleteSCdDependencia() 

    /**
     * Method deleteSCdNseqPjurid
     * 
     */
    public void deleteSCdNseqPjurid()
    {
        this._has_sCdNseqPjurid= false;
    } //-- void deleteSCdNseqPjurid() 

    /**
     * Method deleteSCdPjurid
     * 
     */
    public void deleteSCdPjurid()
    {
        this._has_sCdPjurid= false;
    } //-- void deleteSCdPjurid() 

    /**
     * Returns the value of field 'sCdDependencia'.
     * 
     * @return int
     * @return the value of field 'sCdDependencia'.
     */
    public int getSCdDependencia()
    {
        return this._sCdDependencia;
    } //-- int getSCdDependencia() 

    /**
     * Returns the value of field 'sCdNseqPjurid'.
     * 
     * @return int
     * @return the value of field 'sCdNseqPjurid'.
     */
    public int getSCdNseqPjurid()
    {
        return this._sCdNseqPjurid;
    } //-- int getSCdNseqPjurid() 

    /**
     * Returns the value of field 'sCdPjurid'.
     * 
     * @return long
     * @return the value of field 'sCdPjurid'.
     */
    public long getSCdPjurid()
    {
        return this._sCdPjurid;
    } //-- long getSCdPjurid() 

    /**
     * Returns the value of field 'sDepDescr'.
     * 
     * @return String
     * @return the value of field 'sDepDescr'.
     */
    public java.lang.String getSDepDescr()
    {
        return this._sDepDescr;
    } //-- java.lang.String getSDepDescr() 

    /**
     * Returns the value of field 'sDtAtulz'.
     * 
     * @return String
     * @return the value of field 'sDtAtulz'.
     */
    public java.lang.String getSDtAtulz()
    {
        return this._sDtAtulz;
    } //-- java.lang.String getSDtAtulz() 

    /**
     * Returns the value of field 'sSitDepen'.
     * 
     * @return String
     * @return the value of field 'sSitDepen'.
     */
    public java.lang.String getSSitDepen()
    {
        return this._sSitDepen;
    } //-- java.lang.String getSSitDepen() 

    /**
     * Method hasSCdDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSCdDependencia()
    {
        return this._has_sCdDependencia;
    } //-- boolean hasSCdDependencia() 

    /**
     * Method hasSCdNseqPjurid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSCdNseqPjurid()
    {
        return this._has_sCdNseqPjurid;
    } //-- boolean hasSCdNseqPjurid() 

    /**
     * Method hasSCdPjurid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSCdPjurid()
    {
        return this._has_sCdPjurid;
    } //-- boolean hasSCdPjurid() 

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
     * Sets the value of field 'sCdDependencia'.
     * 
     * @param sCdDependencia the value of field 'sCdDependencia'.
     */
    public void setSCdDependencia(int sCdDependencia)
    {
        this._sCdDependencia = sCdDependencia;
        this._has_sCdDependencia = true;
    } //-- void setSCdDependencia(int) 

    /**
     * Sets the value of field 'sCdNseqPjurid'.
     * 
     * @param sCdNseqPjurid the value of field 'sCdNseqPjurid'.
     */
    public void setSCdNseqPjurid(int sCdNseqPjurid)
    {
        this._sCdNseqPjurid = sCdNseqPjurid;
        this._has_sCdNseqPjurid = true;
    } //-- void setSCdNseqPjurid(int) 

    /**
     * Sets the value of field 'sCdPjurid'.
     * 
     * @param sCdPjurid the value of field 'sCdPjurid'.
     */
    public void setSCdPjurid(long sCdPjurid)
    {
        this._sCdPjurid = sCdPjurid;
        this._has_sCdPjurid = true;
    } //-- void setSCdPjurid(long) 

    /**
     * Sets the value of field 'sDepDescr'.
     * 
     * @param sDepDescr the value of field 'sDepDescr'.
     */
    public void setSDepDescr(java.lang.String sDepDescr)
    {
        this._sDepDescr = sDepDescr;
    } //-- void setSDepDescr(java.lang.String) 

    /**
     * Sets the value of field 'sDtAtulz'.
     * 
     * @param sDtAtulz the value of field 'sDtAtulz'.
     */
    public void setSDtAtulz(java.lang.String sDtAtulz)
    {
        this._sDtAtulz = sDtAtulz;
    } //-- void setSDtAtulz(java.lang.String) 

    /**
     * Sets the value of field 'sSitDepen'.
     * 
     * @param sSitDepen the value of field 'sSitDepen'.
     */
    public void setSSitDepen(java.lang.String sSitDepen)
    {
        this._sSitDepen = sSitDepen;
    } //-- void setSSitDepen(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GISSW050CONSULTASSAIDA
     */
    public static br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA unmarshal(java.io.Reader) 

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
