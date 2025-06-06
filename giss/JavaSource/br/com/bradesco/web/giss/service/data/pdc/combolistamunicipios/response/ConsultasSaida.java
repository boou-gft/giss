/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response;

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
 * Class ConsultasSaida.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultasSaida implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sCmun
     */
    private long _sCmun = 0;

    /**
     * keeps track of state for field: _sCmun
     */
    private boolean _has_sCmun;

    /**
     * Field _sCsglUf
     */
    private java.lang.String _sCsglUf;

    /**
     * Field _sImun
     */
    private java.lang.String _sImun;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultasSaida() 
     {
        super();
    } //-- br.com.bradesco.web.service.data.pdc.combolistamunicipios.response.ConsultasSaida()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteSCmun
     * 
     */
    public void deleteSCmun()
    {
        this._has_sCmun= false;
    } //-- void deleteSCmun() 

    /**
     * Returns the value of field 'sCmun'.
     * 
     * @return long
     * @return the value of field 'sCmun'.
     */
    public long getSCmun()
    {
        return this._sCmun;
    } //-- long getSCmun() 

    /**
     * Returns the value of field 'sCsglUf'.
     * 
     * @return String
     * @return the value of field 'sCsglUf'.
     */
    public java.lang.String getSCsglUf()
    {
        return this._sCsglUf;
    } //-- java.lang.String getSCsglUf() 

    /**
     * Returns the value of field 'sImun'.
     * 
     * @return String
     * @return the value of field 'sImun'.
     */
    public java.lang.String getSImun()
    {
        return this._sImun;
    } //-- java.lang.String getSImun() 

    /**
     * Method hasSCmun
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSCmun()
    {
        return this._has_sCmun;
    } //-- boolean hasSCmun() 

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
     * Sets the value of field 'sCmun'.
     * 
     * @param sCmun the value of field 'sCmun'.
     */
    public void setSCmun(long sCmun)
    {
        this._sCmun = sCmun;
        this._has_sCmun = true;
    } //-- void setSCmun(long) 

    /**
     * Sets the value of field 'sCsglUf'.
     * 
     * @param sCsglUf the value of field 'sCsglUf'.
     */
    public void setSCsglUf(java.lang.String sCsglUf)
    {
        this._sCsglUf = sCsglUf;
    } //-- void setSCsglUf(java.lang.String) 

    /**
     * Sets the value of field 'sImun'.
     * 
     * @param sImun the value of field 'sImun'.
     */
    public void setSImun(java.lang.String sImun)
    {
        this._sImun = sImun;
    } //-- void setSImun(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultasSaida
     */
    public static br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.combolistamunicipios.response.ConsultasSaida unmarshal(java.io.Reader) 

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
