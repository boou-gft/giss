/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultaHistoricoCodigosLancamentoRequest.java,v 1.2 2017/12/05 10:15:11 jaquelinebrito Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.request;

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
 * Class ConsultaHistoricoCodigosLancamentoRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/12/05 10:15:11 $
 */
public class ConsultaHistoricoCodigosLancamentoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _cdLancamento
     */
    private int _cdLancamento = 0;

    /**
     * keeps track of state for field: _cdLancamento
     */
    private boolean _has_cdLancamento;

    /**
     * Field _paramLancamentoContabio
     */
    private int _paramLancamentoContabio = 0;

    /**
     * keeps track of state for field: _paramLancamentoContabio
     */
    private boolean _has_paramLancamentoContabio;

    /**
     * Field _horainclusaoRegistroHistorico
     */
    private java.lang.String _horainclusaoRegistroHistorico;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultaHistoricoCodigosLancamentoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.request.ConsultaHistoricoCodigosLancamentoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCdLancamento
     * 
     */
    public void deleteCdLancamento()
    {
        this._has_cdLancamento= false;
    } //-- void deleteCdLancamento() 

    /**
     * Method deleteParamLancamentoContabio
     * 
     */
    public void deleteParamLancamentoContabio()
    {
        this._has_paramLancamentoContabio= false;
    } //-- void deleteParamLancamentoContabio() 

    /**
     * Returns the value of field 'cdLancamento'.
     * 
     * @return int
     * @return the value of field 'cdLancamento'.
     */
    public int getCdLancamento()
    {
        return this._cdLancamento;
    } //-- int getCdLancamento() 

    /**
     * Returns the value of field 'horainclusaoRegistroHistorico'.
     * 
     * @return String
     * @return the value of field 'horainclusaoRegistroHistorico'.
     */
    public java.lang.String getHorainclusaoRegistroHistorico()
    {
        return this._horainclusaoRegistroHistorico;
    } //-- java.lang.String getHorainclusaoRegistroHistorico() 

    /**
     * Returns the value of field 'paramLancamentoContabio'.
     * 
     * @return int
     * @return the value of field 'paramLancamentoContabio'.
     */
    public int getParamLancamentoContabio()
    {
        return this._paramLancamentoContabio;
    } //-- int getParamLancamentoContabio() 

    /**
     * Method hasCdLancamento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdLancamento()
    {
        return this._has_cdLancamento;
    } //-- boolean hasCdLancamento() 

    /**
     * Method hasParamLancamentoContabio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasParamLancamentoContabio()
    {
        return this._has_paramLancamentoContabio;
    } //-- boolean hasParamLancamentoContabio() 

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
     * Sets the value of field 'cdLancamento'.
     * 
     * @param cdLancamento the value of field 'cdLancamento'.
     */
    public void setCdLancamento(int cdLancamento)
    {
        this._cdLancamento = cdLancamento;
        this._has_cdLancamento = true;
    } //-- void setCdLancamento(int) 

    /**
     * Sets the value of field 'horainclusaoRegistroHistorico'.
     * 
     * @param horainclusaoRegistroHistorico the value of field
     * 'horainclusaoRegistroHistorico'.
     */
    public void setHorainclusaoRegistroHistorico(java.lang.String horainclusaoRegistroHistorico)
    {
        this._horainclusaoRegistroHistorico = horainclusaoRegistroHistorico;
    } //-- void setHorainclusaoRegistroHistorico(java.lang.String) 

    /**
     * Sets the value of field 'paramLancamentoContabio'.
     * 
     * @param paramLancamentoContabio the value of field
     * 'paramLancamentoContabio'.
     */
    public void setParamLancamentoContabio(int paramLancamentoContabio)
    {
        this._paramLancamentoContabio = paramLancamentoContabio;
        this._has_paramLancamentoContabio = true;
    } //-- void setParamLancamentoContabio(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultaHistoricoCodigosLancamentoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.request.ConsultaHistoricoCodigosLancamentoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.request.ConsultaHistoricoCodigosLancamentoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.request.ConsultaHistoricoCodigosLancamentoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.request.ConsultaHistoricoCodigosLancamentoRequest unmarshal(java.io.Reader) 

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
