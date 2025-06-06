/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarMunicipioTabelaHistoricoRequest.java,v 1.4 2018/04/06 14:20:41 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.request;

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
 * Class ConsultarMunicipioTabelaHistoricoRequest.
 * 
 * @version $Revision: 1.4 $ $Date: 2018/04/06 14:20:41 $
 */
public class ConsultarMunicipioTabelaHistoricoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _timeStamp
     */
    private java.lang.String _timeStamp;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarMunicipioTabelaHistoricoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.request.ConsultarMunicipioTabelaHistoricoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

    /**
     * Returns the value of field 'timeStamp'.
     * 
     * @return String
     * @return the value of field 'timeStamp'.
     */
    public java.lang.String getTimeStamp()
    {
        return this._timeStamp;
    } //-- java.lang.String getTimeStamp() 

    /**
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

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
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

    /**
     * Sets the value of field 'timeStamp'.
     * 
     * @param timeStamp the value of field 'timeStamp'.
     */
    public void setTimeStamp(java.lang.String timeStamp)
    {
        this._timeStamp = timeStamp;
    } //-- void setTimeStamp(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarMunicipioTabelaHistoricoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.request.ConsultarMunicipioTabelaHistoricoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.request.ConsultarMunicipioTabelaHistoricoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.request.ConsultarMunicipioTabelaHistoricoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.request.ConsultarMunicipioTabelaHistoricoRequest unmarshal(java.io.Reader) 

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
