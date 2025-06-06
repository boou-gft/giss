/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassivagerencial.request;

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
 * Class ConferirRejeitarCargaMassivaGerencialRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ConferirRejeitarCargaMassivaGerencialRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numeroRemessa
     */
    private long _numeroRemessa = 0;

    /**
     * keeps track of state for field: _numeroRemessa
     */
    private boolean _has_numeroRemessa;

    /**
     * Field _indicadorAcao
     */
    private java.lang.String _indicadorAcao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConferirRejeitarCargaMassivaGerencialRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassivagerencial.request.ConferirRejeitarCargaMassivaGerencialRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteNumeroRemessa
     * 
     */
    public void deleteNumeroRemessa()
    {
        this._has_numeroRemessa= false;
    } //-- void deleteNumeroRemessa() 

    /**
     * Returns the value of field 'indicadorAcao'.
     * 
     * @return String
     * @return the value of field 'indicadorAcao'.
     */
    public java.lang.String getIndicadorAcao()
    {
        return this._indicadorAcao;
    } //-- java.lang.String getIndicadorAcao() 

    /**
     * Returns the value of field 'numeroRemessa'.
     * 
     * @return long
     * @return the value of field 'numeroRemessa'.
     */
    public long getNumeroRemessa()
    {
        return this._numeroRemessa;
    } //-- long getNumeroRemessa() 

    /**
     * Method hasNumeroRemessa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroRemessa()
    {
        return this._has_numeroRemessa;
    } //-- boolean hasNumeroRemessa() 

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
     * Sets the value of field 'indicadorAcao'.
     * 
     * @param indicadorAcao the value of field 'indicadorAcao'.
     */
    public void setIndicadorAcao(java.lang.String indicadorAcao)
    {
        this._indicadorAcao = indicadorAcao;
    } //-- void setIndicadorAcao(java.lang.String) 

    /**
     * Sets the value of field 'numeroRemessa'.
     * 
     * @param numeroRemessa the value of field 'numeroRemessa'.
     */
    public void setNumeroRemessa(long numeroRemessa)
    {
        this._numeroRemessa = numeroRemessa;
        this._has_numeroRemessa = true;
    } //-- void setNumeroRemessa(long) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConferirRejeitarCargaMassivaGerencialRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassivagerencial.request.ConferirRejeitarCargaMassivaGerencialRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassivagerencial.request.ConferirRejeitarCargaMassivaGerencialRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassivagerencial.request.ConferirRejeitarCargaMassivaGerencialRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassivagerencial.request.ConferirRejeitarCargaMassivaGerencialRequest unmarshal(java.io.Reader) 

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
