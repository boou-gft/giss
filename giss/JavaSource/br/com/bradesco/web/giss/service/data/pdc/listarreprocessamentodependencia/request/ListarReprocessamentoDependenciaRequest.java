/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarReprocessamentoDependenciaRequest.java,v 1.1 2017/04/11 14:09:40 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.request;

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
 * Class ListarReprocessamentoDependenciaRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:40 $
 */
public class ListarReprocessamentoDependenciaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numeroMaximoOcorrencias
     */
    private int _numeroMaximoOcorrencias = 0;

    /**
     * keeps track of state for field: _numeroMaximoOcorrencias
     */
    private boolean _has_numeroMaximoOcorrencias;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _dataInicialReprocessamento
     */
    private java.lang.String _dataInicialReprocessamento;

    /**
     * Field _dataFinalReprocessamento
     */
    private java.lang.String _dataFinalReprocessamento;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarReprocessamentoDependenciaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.request.ListarReprocessamentoDependenciaRequest()


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
     * Method deleteNumeroMaximoOcorrencias
     * 
     */
    public void deleteNumeroMaximoOcorrencias()
    {
        this._has_numeroMaximoOcorrencias= false;
    } //-- void deleteNumeroMaximoOcorrencias() 

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
     * Returns the value of field 'dataFinalReprocessamento'.
     * 
     * @return String
     * @return the value of field 'dataFinalReprocessamento'.
     */
    public java.lang.String getDataFinalReprocessamento()
    {
        return this._dataFinalReprocessamento;
    } //-- java.lang.String getDataFinalReprocessamento() 

    /**
     * Returns the value of field 'dataInicialReprocessamento'.
     * 
     * @return String
     * @return the value of field 'dataInicialReprocessamento'.
     */
    public java.lang.String getDataInicialReprocessamento()
    {
        return this._dataInicialReprocessamento;
    } //-- java.lang.String getDataInicialReprocessamento() 

    /**
     * Returns the value of field 'numeroMaximoOcorrencias'.
     * 
     * @return int
     * @return the value of field 'numeroMaximoOcorrencias'.
     */
    public int getNumeroMaximoOcorrencias()
    {
        return this._numeroMaximoOcorrencias;
    } //-- int getNumeroMaximoOcorrencias() 

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
     * Method hasNumeroMaximoOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroMaximoOcorrencias()
    {
        return this._has_numeroMaximoOcorrencias;
    } //-- boolean hasNumeroMaximoOcorrencias() 

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
     * Sets the value of field 'dataFinalReprocessamento'.
     * 
     * @param dataFinalReprocessamento the value of field
     * 'dataFinalReprocessamento'.
     */
    public void setDataFinalReprocessamento(java.lang.String dataFinalReprocessamento)
    {
        this._dataFinalReprocessamento = dataFinalReprocessamento;
    } //-- void setDataFinalReprocessamento(java.lang.String) 

    /**
     * Sets the value of field 'dataInicialReprocessamento'.
     * 
     * @param dataInicialReprocessamento the value of field
     * 'dataInicialReprocessamento'.
     */
    public void setDataInicialReprocessamento(java.lang.String dataInicialReprocessamento)
    {
        this._dataInicialReprocessamento = dataInicialReprocessamento;
    } //-- void setDataInicialReprocessamento(java.lang.String) 

    /**
     * Sets the value of field 'numeroMaximoOcorrencias'.
     * 
     * @param numeroMaximoOcorrencias the value of field
     * 'numeroMaximoOcorrencias'.
     */
    public void setNumeroMaximoOcorrencias(int numeroMaximoOcorrencias)
    {
        this._numeroMaximoOcorrencias = numeroMaximoOcorrencias;
        this._has_numeroMaximoOcorrencias = true;
    } //-- void setNumeroMaximoOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarReprocessamentoDependenciaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.request.ListarReprocessamentoDependenciaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.request.ListarReprocessamentoDependenciaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.request.ListarReprocessamentoDependenciaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.request.ListarReprocessamentoDependenciaRequest unmarshal(java.io.Reader) 

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
