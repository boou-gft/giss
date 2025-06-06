/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ComboEstadosRequest.java,v 1.1 2017/04/11 14:07:21 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.comboestados.request;

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
 * Class ComboEstadosRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:07:21 $
 */
public class ComboEstadosRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _quantidadeOcorrencias
     */
    private int _quantidadeOcorrencias = 0;

    /**
     * keeps track of state for field: _quantidadeOcorrencias
     */
    private boolean _has_quantidadeOcorrencias;

    /**
     * Field _codigoUnidadeFederativa
     */
    private int _codigoUnidadeFederativa = 0;

    /**
     * keeps track of state for field: _codigoUnidadeFederativa
     */
    private boolean _has_codigoUnidadeFederativa;

    /**
     * Field _siglaUnidadeFederativa
     */
    private java.lang.String _siglaUnidadeFederativa;

    /**
     * Field _nomeUnidadeFederativa
     */
    private java.lang.String _nomeUnidadeFederativa;


      //----------------/
     //- Constructors -/
    //----------------/

    public ComboEstadosRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoUnidadeFederativa
     * 
     */
    public void deleteCodigoUnidadeFederativa()
    {
        this._has_codigoUnidadeFederativa= false;
    } //-- void deleteCodigoUnidadeFederativa() 

    /**
     * Method deleteQuantidadeOcorrencias
     * 
     */
    public void deleteQuantidadeOcorrencias()
    {
        this._has_quantidadeOcorrencias= false;
    } //-- void deleteQuantidadeOcorrencias() 

    /**
     * Returns the value of field 'codigoUnidadeFederativa'.
     * 
     * @return int
     * @return the value of field 'codigoUnidadeFederativa'.
     */
    public int getCodigoUnidadeFederativa()
    {
        return this._codigoUnidadeFederativa;
    } //-- int getCodigoUnidadeFederativa() 

    /**
     * Returns the value of field 'nomeUnidadeFederativa'.
     * 
     * @return String
     * @return the value of field 'nomeUnidadeFederativa'.
     */
    public java.lang.String getNomeUnidadeFederativa()
    {
        return this._nomeUnidadeFederativa;
    } //-- java.lang.String getNomeUnidadeFederativa() 

    /**
     * Returns the value of field 'quantidadeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'quantidadeOcorrencias'.
     */
    public int getQuantidadeOcorrencias()
    {
        return this._quantidadeOcorrencias;
    } //-- int getQuantidadeOcorrencias() 

    /**
     * Returns the value of field 'siglaUnidadeFederativa'.
     * 
     * @return String
     * @return the value of field 'siglaUnidadeFederativa'.
     */
    public java.lang.String getSiglaUnidadeFederativa()
    {
        return this._siglaUnidadeFederativa;
    } //-- java.lang.String getSiglaUnidadeFederativa() 

    /**
     * Method hasCodigoUnidadeFederativa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoUnidadeFederativa()
    {
        return this._has_codigoUnidadeFederativa;
    } //-- boolean hasCodigoUnidadeFederativa() 

    /**
     * Method hasQuantidadeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQuantidadeOcorrencias()
    {
        return this._has_quantidadeOcorrencias;
    } //-- boolean hasQuantidadeOcorrencias() 

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
     * Sets the value of field 'codigoUnidadeFederativa'.
     * 
     * @param codigoUnidadeFederativa the value of field
     * 'codigoUnidadeFederativa'.
     */
    public void setCodigoUnidadeFederativa(int codigoUnidadeFederativa)
    {
        this._codigoUnidadeFederativa = codigoUnidadeFederativa;
        this._has_codigoUnidadeFederativa = true;
    } //-- void setCodigoUnidadeFederativa(int) 

    /**
     * Sets the value of field 'nomeUnidadeFederativa'.
     * 
     * @param nomeUnidadeFederativa the value of field
     * 'nomeUnidadeFederativa'.
     */
    public void setNomeUnidadeFederativa(java.lang.String nomeUnidadeFederativa)
    {
        this._nomeUnidadeFederativa = nomeUnidadeFederativa;
    } //-- void setNomeUnidadeFederativa(java.lang.String) 

    /**
     * Sets the value of field 'quantidadeOcorrencias'.
     * 
     * @param quantidadeOcorrencias the value of field
     * 'quantidadeOcorrencias'.
     */
    public void setQuantidadeOcorrencias(int quantidadeOcorrencias)
    {
        this._quantidadeOcorrencias = quantidadeOcorrencias;
        this._has_quantidadeOcorrencias = true;
    } //-- void setQuantidadeOcorrencias(int) 

    /**
     * Sets the value of field 'siglaUnidadeFederativa'.
     * 
     * @param siglaUnidadeFederativa the value of field
     * 'siglaUnidadeFederativa'.
     */
    public void setSiglaUnidadeFederativa(java.lang.String siglaUnidadeFederativa)
    {
        this._siglaUnidadeFederativa = siglaUnidadeFederativa;
    } //-- void setSiglaUnidadeFederativa(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ComboEstadosRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.comboestados.request.ComboEstadosRequest unmarshal(java.io.Reader) 

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
