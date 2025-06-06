/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request;

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
 * Class ListaEntrada.
 * 
 * @version $Revision$ $Date$
 */
public class ListaEntrada implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _cmun
     */
    private long _cmun = 0;

    /**
     * keeps track of state for field: _cmun
     */
    private boolean _has_cmun;

    /**
     * Field _ativDesatv
     */
    private int _ativDesatv = 0;

    /**
     * keeps track of state for field: _ativDesatv
     */
    private boolean _has_ativDesatv;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaEntrada() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAtivDesatv
     * 
     */
    public void deleteAtivDesatv()
    {
        this._has_ativDesatv= false;
    } //-- void deleteAtivDesatv() 

    /**
     * Method deleteCmun
     * 
     */
    public void deleteCmun()
    {
        this._has_cmun= false;
    } //-- void deleteCmun() 

    /**
     * Returns the value of field 'ativDesatv'.
     * 
     * @return int
     * @return the value of field 'ativDesatv'.
     */
    public int getAtivDesatv()
    {
        return this._ativDesatv;
    } //-- int getAtivDesatv() 

    /**
     * Returns the value of field 'cmun'.
     * 
     * @return long
     * @return the value of field 'cmun'.
     */
    public long getCmun()
    {
        return this._cmun;
    } //-- long getCmun() 

    /**
     * Method hasAtivDesatv
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAtivDesatv()
    {
        return this._has_ativDesatv;
    } //-- boolean hasAtivDesatv() 

    /**
     * Method hasCmun
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCmun()
    {
        return this._has_cmun;
    } //-- boolean hasCmun() 

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
     * Sets the value of field 'ativDesatv'.
     * 
     * @param ativDesatv the value of field 'ativDesatv'.
     */
    public void setAtivDesatv(int ativDesatv)
    {
        this._ativDesatv = ativDesatv;
        this._has_ativDesatv = true;
    } //-- void setAtivDesatv(int) 

    /**
     * Sets the value of field 'cmun'.
     * 
     * @param cmun the value of field 'cmun'.
     */
    public void setCmun(long cmun)
    {
        this._cmun = cmun;
        this._has_cmun = true;
    } //-- void setCmun(long) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaEntrada
     */
    public static br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada unmarshal(java.io.Reader) 

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
