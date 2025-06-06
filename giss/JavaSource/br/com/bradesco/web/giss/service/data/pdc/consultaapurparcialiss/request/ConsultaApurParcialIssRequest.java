/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultaApurParcialIssRequest.java,v 1.1 2017/09/19 18:34:47 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.request;

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
 * Class ConsultaApurParcialIssRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/09/19 18:34:47 $
 */
public class ConsultaApurParcialIssRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ocorrencia
     */
    private int _ocorrencia = 0;

    /**
     * keeps track of state for field: _ocorrencia
     */
    private boolean _has_ocorrencia;

    /**
     * Field _dataInicio
     */
    private java.lang.String _dataInicio;

    /**
     * Field _dataFim
     */
    private java.lang.String _dataFim;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _codigoUf
     */
    private int _codigoUf = 0;

    /**
     * keeps track of state for field: _codigoUf
     */
    private boolean _has_codigoUf;

    /**
     * Field _consolidado
     */
    private int _consolidado = 0;

    /**
     * keeps track of state for field: _consolidado
     */
    private boolean _has_consolidado;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultaApurParcialIssRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.request.ConsultaApurParcialIssRequest()


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
     * Method deleteCodigoUf
     * 
     */
    public void deleteCodigoUf()
    {
        this._has_codigoUf= false;
    } //-- void deleteCodigoUf() 

    /**
     * Method deleteConsolidado
     * 
     */
    public void deleteConsolidado()
    {
        this._has_consolidado= false;
    } //-- void deleteConsolidado() 

    /**
     * Method deleteOcorrencia
     * 
     */
    public void deleteOcorrencia()
    {
        this._has_ocorrencia= false;
    } //-- void deleteOcorrencia() 

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
     * Returns the value of field 'codigoUf'.
     * 
     * @return int
     * @return the value of field 'codigoUf'.
     */
    public int getCodigoUf()
    {
        return this._codigoUf;
    } //-- int getCodigoUf() 

    /**
     * Returns the value of field 'consolidado'.
     * 
     * @return int
     * @return the value of field 'consolidado'.
     */
    public int getConsolidado()
    {
        return this._consolidado;
    } //-- int getConsolidado() 

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
     * Returns the value of field 'ocorrencia'.
     * 
     * @return int
     * @return the value of field 'ocorrencia'.
     */
    public int getOcorrencia()
    {
        return this._ocorrencia;
    } //-- int getOcorrencia() 

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
     * Method hasCodigoUf
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoUf()
    {
        return this._has_codigoUf;
    } //-- boolean hasCodigoUf() 

    /**
     * Method hasConsolidado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasConsolidado()
    {
        return this._has_consolidado;
    } //-- boolean hasConsolidado() 

    /**
     * Method hasOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasOcorrencia()
    {
        return this._has_ocorrencia;
    } //-- boolean hasOcorrencia() 

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
     * Sets the value of field 'codigoUf'.
     * 
     * @param codigoUf the value of field 'codigoUf'.
     */
    public void setCodigoUf(int codigoUf)
    {
        this._codigoUf = codigoUf;
        this._has_codigoUf = true;
    } //-- void setCodigoUf(int) 

    /**
     * Sets the value of field 'consolidado'.
     * 
     * @param consolidado the value of field 'consolidado'.
     */
    public void setConsolidado(int consolidado)
    {
        this._consolidado = consolidado;
        this._has_consolidado = true;
    } //-- void setConsolidado(int) 

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
     * Sets the value of field 'ocorrencia'.
     * 
     * @param ocorrencia the value of field 'ocorrencia'.
     */
    public void setOcorrencia(int ocorrencia)
    {
        this._ocorrencia = ocorrencia;
        this._has_ocorrencia = true;
    } //-- void setOcorrencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultaApurParcialIssRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.request.ConsultaApurParcialIssRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.request.ConsultaApurParcialIssRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.request.ConsultaApurParcialIssRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.request.ConsultaApurParcialIssRequest unmarshal(java.io.Reader) 

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
