/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.request;

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
 * Class CombolistamunicipiosRequest.
 * 
 * @version $Revision$ $Date$
 */
public class CombolistamunicipiosRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxOcorr
     */
    private int _maxOcorr = 0;

    /**
     * keeps track of state for field: _maxOcorr
     */
    private boolean _has_maxOcorr;

    /**
     * Field _cUf
     */
    private int _cUf = 0;

    /**
     * keeps track of state for field: _cUf
     */
    private boolean _has_cUf;

    /**
     * Field _cMun
     */
    private long _cMun = 0;

    /**
     * keeps track of state for field: _cMun
     */
    private boolean _has_cMun;


      //----------------/
     //- Constructors -/
    //----------------/

    public CombolistamunicipiosRequest() 
     {
        super();
    } //-- br.com.bradesco.web.service.data.pdc.combolistamunicipios.request.CombolistamunicipiosRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCMun
     * 
     */
    public void deleteCMun()
    {
        this._has_cMun= false;
    } //-- void deleteCMun() 

    /**
     * Method deleteCUf
     * 
     */
    public void deleteCUf()
    {
        this._has_cUf= false;
    } //-- void deleteCUf() 

    /**
     * Method deleteMaxOcorr
     * 
     */
    public void deleteMaxOcorr()
    {
        this._has_maxOcorr= false;
    } //-- void deleteMaxOcorr() 

    /**
     * Returns the value of field 'cMun'.
     * 
     * @return long
     * @return the value of field 'cMun'.
     */
    public long getCMun()
    {
        return this._cMun;
    } //-- long getCMun() 

    /**
     * Returns the value of field 'cUf'.
     * 
     * @return int
     * @return the value of field 'cUf'.
     */
    public int getCUf()
    {
        return this._cUf;
    } //-- int getCUf() 

    /**
     * Returns the value of field 'maxOcorr'.
     * 
     * @return int
     * @return the value of field 'maxOcorr'.
     */
    public int getMaxOcorr()
    {
        return this._maxOcorr;
    } //-- int getMaxOcorr() 

    /**
     * Method hasCMun
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCMun()
    {
        return this._has_cMun;
    } //-- boolean hasCMun() 

    /**
     * Method hasCUf
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCUf()
    {
        return this._has_cUf;
    } //-- boolean hasCUf() 

    /**
     * Method hasMaxOcorr
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMaxOcorr()
    {
        return this._has_maxOcorr;
    } //-- boolean hasMaxOcorr() 

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
     * Sets the value of field 'cMun'.
     * 
     * @param cMun the value of field 'cMun'.
     */
    public void setCMun(long cMun)
    {
        this._cMun = cMun;
        this._has_cMun = true;
    } //-- void setCMun(long) 

    /**
     * Sets the value of field 'cUf'.
     * 
     * @param cUf the value of field 'cUf'.
     */
    public void setCUf(int cUf)
    {
        this._cUf = cUf;
        this._has_cUf = true;
    } //-- void setCUf(int) 

    /**
     * Sets the value of field 'maxOcorr'.
     * 
     * @param maxOcorr the value of field 'maxOcorr'.
     */
    public void setMaxOcorr(int maxOcorr)
    {
        this._maxOcorr = maxOcorr;
        this._has_maxOcorr = true;
    } //-- void setMaxOcorr(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return CombolistamunicipiosRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.request.CombolistamunicipiosRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.request.CombolistamunicipiosRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.request.CombolistamunicipiosRequest.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.combolistamunicipios.request.CombolistamunicipiosRequest unmarshal(java.io.Reader) 

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
