/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.request;

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
 * Class LogTransmissaoArquivoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class LogTransmissaoArquivoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _eMaxOcorr
     */
    private int _eMaxOcorr = 0;

    /**
     * keeps track of state for field: _eMaxOcorr
     */
    private boolean _has_eMaxOcorr;

    /**
     * Field _eDataRemessaIni
     */
    private java.lang.String _eDataRemessaIni;

    /**
     * Field _eDataRemessaFim
     */
    private java.lang.String _eDataRemessaFim;


      //----------------/
     //- Constructors -/
    //----------------/

    public LogTransmissaoArquivoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.request.LogTransmissaoArquivoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteEMaxOcorr
     * 
     */
    public void deleteEMaxOcorr()
    {
        this._has_eMaxOcorr= false;
    } //-- void deleteEMaxOcorr() 

    /**
     * Returns the value of field 'eDataRemessaFim'.
     * 
     * @return String
     * @return the value of field 'eDataRemessaFim'.
     */
    public java.lang.String getEDataRemessaFim()
    {
        return this._eDataRemessaFim;
    } //-- java.lang.String getEDataRemessaFim() 

    /**
     * Returns the value of field 'eDataRemessaIni'.
     * 
     * @return String
     * @return the value of field 'eDataRemessaIni'.
     */
    public java.lang.String getEDataRemessaIni()
    {
        return this._eDataRemessaIni;
    } //-- java.lang.String getEDataRemessaIni() 

    /**
     * Returns the value of field 'eMaxOcorr'.
     * 
     * @return int
     * @return the value of field 'eMaxOcorr'.
     */
    public int getEMaxOcorr()
    {
        return this._eMaxOcorr;
    } //-- int getEMaxOcorr() 

    /**
     * Method hasEMaxOcorr
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasEMaxOcorr()
    {
        return this._has_eMaxOcorr;
    } //-- boolean hasEMaxOcorr() 

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
     * Sets the value of field 'eDataRemessaFim'.
     * 
     * @param eDataRemessaFim the value of field 'eDataRemessaFim'.
     */
    public void setEDataRemessaFim(java.lang.String eDataRemessaFim)
    {
        this._eDataRemessaFim = eDataRemessaFim;
    } //-- void setEDataRemessaFim(java.lang.String) 

    /**
     * Sets the value of field 'eDataRemessaIni'.
     * 
     * @param eDataRemessaIni the value of field 'eDataRemessaIni'.
     */
    public void setEDataRemessaIni(java.lang.String eDataRemessaIni)
    {
        this._eDataRemessaIni = eDataRemessaIni;
    } //-- void setEDataRemessaIni(java.lang.String) 

    /**
     * Sets the value of field 'eMaxOcorr'.
     * 
     * @param eMaxOcorr the value of field 'eMaxOcorr'.
     */
    public void setEMaxOcorr(int eMaxOcorr)
    {
        this._eMaxOcorr = eMaxOcorr;
        this._has_eMaxOcorr = true;
    } //-- void setEMaxOcorr(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return LogTransmissaoArquivoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.request.LogTransmissaoArquivoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.request.LogTransmissaoArquivoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.request.LogTransmissaoArquivoRequest.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.request.LogTransmissaoArquivoRequest unmarshal(java.io.Reader) 

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
