/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultaApuracaoPaRequest.java,v 1.1 2017/09/19 18:34:53 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultaapuracaopa.request;

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
 * Class ConsultaApuracaoPaRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/09/19 18:34:53 $
 */
public class ConsultaApuracaoPaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataInicio
     */
    private java.lang.String _dataInicio;

    /**
     * Field _dataFim
     */
    private java.lang.String _dataFim;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultaApuracaoPaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaapuracaopa.request.ConsultaApuracaoPaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataFim'.
     * 
     * @return String
     * @return the value of field 'dataFim'.
     */
    public java.lang.String getDataFim()
    {
        return this._dataFim;
    } //-- java.lang.String getDataFim() 

    /**
     * Returns the value of field 'dataInicio'.
     * 
     * @return String
     * @return the value of field 'dataInicio'.
     */
    public java.lang.String getDataInicio()
    {
        return this._dataInicio;
    } //-- java.lang.String getDataInicio() 

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
     * Sets the value of field 'dataFim'.
     * 
     * @param dataFim the value of field 'dataFim'.
     */
    public void setDataFim(java.lang.String dataFim)
    {
        this._dataFim = dataFim;
    } //-- void setDataFim(java.lang.String) 

    /**
     * Sets the value of field 'dataInicio'.
     * 
     * @param dataInicio the value of field 'dataInicio'.
     */
    public void setDataInicio(java.lang.String dataInicio)
    {
        this._dataInicio = dataInicio;
    } //-- void setDataInicio(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultaApuracaoPaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultaapuracaopa.request.ConsultaApuracaoPaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultaapuracaopa.request.ConsultaApuracaoPaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultaapuracaopa.request.ConsultaApuracaoPaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaapuracaopa.request.ConsultaApuracaoPaRequest unmarshal(java.io.Reader) 

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
