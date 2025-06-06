/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.request;

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
 * Class ConsultarHistoricoMinMaxAliquotaRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarHistoricoMinMaxAliquotaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataInicioVigencia
     */
    private java.lang.String _dataInicioVigencia;

    /**
     * Field _dataFimVigencia
     */
    private java.lang.String _dataFimVigencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarHistoricoMinMaxAliquotaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.request.ConsultarHistoricoMinMaxAliquotaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataFimVigencia'.
     * 
     * @return String
     * @return the value of field 'dataFimVigencia'.
     */
    public java.lang.String getDataFimVigencia()
    {
        return this._dataFimVigencia;
    } //-- java.lang.String getDataFimVigencia() 

    /**
     * Returns the value of field 'dataInicioVigencia'.
     * 
     * @return String
     * @return the value of field 'dataInicioVigencia'.
     */
    public java.lang.String getDataInicioVigencia()
    {
        return this._dataInicioVigencia;
    } //-- java.lang.String getDataInicioVigencia() 

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
     * Sets the value of field 'dataFimVigencia'.
     * 
     * @param dataFimVigencia the value of field 'dataFimVigencia'.
     */
    public void setDataFimVigencia(java.lang.String dataFimVigencia)
    {
        this._dataFimVigencia = dataFimVigencia;
    } //-- void setDataFimVigencia(java.lang.String) 

    /**
     * Sets the value of field 'dataInicioVigencia'.
     * 
     * @param dataInicioVigencia the value of field
     * 'dataInicioVigencia'.
     */
    public void setDataInicioVigencia(java.lang.String dataInicioVigencia)
    {
        this._dataInicioVigencia = dataInicioVigencia;
    } //-- void setDataInicioVigencia(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarHistoricoMinMaxAliquotaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.request.ConsultarHistoricoMinMaxAliquotaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.request.ConsultarHistoricoMinMaxAliquotaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.request.ConsultarHistoricoMinMaxAliquotaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.request.ConsultarHistoricoMinMaxAliquotaRequest unmarshal(java.io.Reader) 

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
