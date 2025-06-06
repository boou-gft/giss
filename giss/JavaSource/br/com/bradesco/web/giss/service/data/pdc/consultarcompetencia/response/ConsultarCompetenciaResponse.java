/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarCompetenciaResponse.java,v 1.1 2018/03/12 11:24:01 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.response;

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
 * Class ConsultarCompetenciaResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/03/12 11:24:01 $
 */
public class ConsultarCompetenciaResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _exibeContabil
     */
    private java.lang.String _exibeContabil;

    /**
     * Field _competencia
     */
    private java.lang.String _competencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarCompetenciaResponse() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.response.ConsultarCompetenciaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

    /**
     * Returns the value of field 'competencia'.
     * 
     * @return String
     * @return the value of field 'competencia'.
     */
    public java.lang.String getCompetencia()
    {
        return this._competencia;
    } //-- java.lang.String getCompetencia() 

    /**
     * Returns the value of field 'exibeContabil'.
     * 
     * @return String
     * @return the value of field 'exibeContabil'.
     */
    public java.lang.String getExibeContabil()
    {
        return this._exibeContabil;
    } //-- java.lang.String getExibeContabil() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

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
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Sets the value of field 'competencia'.
     * 
     * @param competencia the value of field 'competencia'.
     */
    public void setCompetencia(java.lang.String competencia)
    {
        this._competencia = competencia;
    } //-- void setCompetencia(java.lang.String) 

    /**
     * Sets the value of field 'exibeContabil'.
     * 
     * @param exibeContabil the value of field 'exibeContabil'.
     */
    public void setExibeContabil(java.lang.String exibeContabil)
    {
        this._exibeContabil = exibeContabil;
    } //-- void setExibeContabil(java.lang.String) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarCompetenciaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.response.ConsultarCompetenciaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.response.ConsultarCompetenciaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.response.ConsultarCompetenciaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.response.ConsultarCompetenciaResponse unmarshal(java.io.Reader) 

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
