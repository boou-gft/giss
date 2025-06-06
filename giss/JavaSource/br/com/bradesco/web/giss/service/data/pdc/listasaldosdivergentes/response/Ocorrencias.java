/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/04/11 14:10:09 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Ocorrencias.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:09 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoContaContabil
     */
    private long _codigoContaContabil = 0;

    /**
     * keeps track of state for field: _codigoContaContabil
     */
    private boolean _has_codigoContaContabil;

    /**
     * Field _contaContabil
     */
    private java.lang.String _contaContabil;

    /**
     * Field _sinalApuracao
     */
    private java.lang.String _sinalApuracao;

    /**
     * Field _valorApuracao
     */
    private java.math.BigDecimal _valorApuracao = new java.math.BigDecimal("0");

    /**
     * Field _sinalContabil
     */
    private java.lang.String _sinalContabil;

    /**
     * Field _valorContabil
     */
    private java.math.BigDecimal _valorContabil = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
        setValorApuracao(new java.math.BigDecimal("0"));
        setValorContabil(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoContaContabil
     * 
     */
    public void deleteCodigoContaContabil()
    {
        this._has_codigoContaContabil= false;
    } //-- void deleteCodigoContaContabil() 

    /**
     * Returns the value of field 'codigoContaContabil'.
     * 
     * @return long
     * @return the value of field 'codigoContaContabil'.
     */
    public long getCodigoContaContabil()
    {
        return this._codigoContaContabil;
    } //-- long getCodigoContaContabil() 

    /**
     * Returns the value of field 'contaContabil'.
     * 
     * @return String
     * @return the value of field 'contaContabil'.
     */
    public java.lang.String getContaContabil()
    {
        return this._contaContabil;
    } //-- java.lang.String getContaContabil() 

    /**
     * Returns the value of field 'sinalApuracao'.
     * 
     * @return String
     * @return the value of field 'sinalApuracao'.
     */
    public java.lang.String getSinalApuracao()
    {
        return this._sinalApuracao;
    } //-- java.lang.String getSinalApuracao() 

    /**
     * Returns the value of field 'sinalContabil'.
     * 
     * @return String
     * @return the value of field 'sinalContabil'.
     */
    public java.lang.String getSinalContabil()
    {
        return this._sinalContabil;
    } //-- java.lang.String getSinalContabil() 

    /**
     * Returns the value of field 'valorApuracao'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorApuracao'.
     */
    public java.math.BigDecimal getValorApuracao()
    {
        return this._valorApuracao;
    } //-- java.math.BigDecimal getValorApuracao() 

    /**
     * Returns the value of field 'valorContabil'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorContabil'.
     */
    public java.math.BigDecimal getValorContabil()
    {
        return this._valorContabil;
    } //-- java.math.BigDecimal getValorContabil() 

    /**
     * Method hasCodigoContaContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoContaContabil()
    {
        return this._has_codigoContaContabil;
    } //-- boolean hasCodigoContaContabil() 

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
     * Sets the value of field 'codigoContaContabil'.
     * 
     * @param codigoContaContabil the value of field
     * 'codigoContaContabil'.
     */
    public void setCodigoContaContabil(long codigoContaContabil)
    {
        this._codigoContaContabil = codigoContaContabil;
        this._has_codigoContaContabil = true;
    } //-- void setCodigoContaContabil(long) 

    /**
     * Sets the value of field 'contaContabil'.
     * 
     * @param contaContabil the value of field 'contaContabil'.
     */
    public void setContaContabil(java.lang.String contaContabil)
    {
        this._contaContabil = contaContabil;
    } //-- void setContaContabil(java.lang.String) 

    /**
     * Sets the value of field 'sinalApuracao'.
     * 
     * @param sinalApuracao the value of field 'sinalApuracao'.
     */
    public void setSinalApuracao(java.lang.String sinalApuracao)
    {
        this._sinalApuracao = sinalApuracao;
    } //-- void setSinalApuracao(java.lang.String) 

    /**
     * Sets the value of field 'sinalContabil'.
     * 
     * @param sinalContabil the value of field 'sinalContabil'.
     */
    public void setSinalContabil(java.lang.String sinalContabil)
    {
        this._sinalContabil = sinalContabil;
    } //-- void setSinalContabil(java.lang.String) 

    /**
     * Sets the value of field 'valorApuracao'.
     * 
     * @param valorApuracao the value of field 'valorApuracao'.
     */
    public void setValorApuracao(java.math.BigDecimal valorApuracao)
    {
        this._valorApuracao = valorApuracao;
    } //-- void setValorApuracao(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorContabil'.
     * 
     * @param valorContabil the value of field 'valorContabil'.
     */
    public void setValorContabil(java.math.BigDecimal valorContabil)
    {
        this._valorContabil = valorContabil;
    } //-- void setValorContabil(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Ocorrencias unmarshal(java.io.Reader) 

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
