/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencia.java,v 1.2 2017/09/11 13:29:49 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response;

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
 * Class Ocorrencia.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/09/11 13:29:49 $
 */
public class Ocorrencia implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoPa
     */
    private int _codigoPa = 0;

    /**
     * keeps track of state for field: _codigoPa
     */
    private boolean _has_codigoPa;

    /**
     * Field _nomePa
     */
    private java.lang.String _nomePa;

    /**
     * Field _nomeMunicipioPa
     */
    private java.lang.String _nomeMunicipioPa;

    /**
     * Field _nomeUfPa
     */
    private java.lang.String _nomeUfPa;

    /**
     * Field _codigoAgencia
     */
    private int _codigoAgencia = 0;

    /**
     * keeps track of state for field: _codigoAgencia
     */
    private boolean _has_codigoAgencia;

    /**
     * Field _nomeMunicipioAgencia
     */
    private java.lang.String _nomeMunicipioAgencia;

    /**
     * Field _nomeUfAgencia
     */
    private java.lang.String _nomeUfAgencia;

    /**
     * Field _valorReceita
     */
    private java.math.BigDecimal _valorReceita = new java.math.BigDecimal("0");

    /**
     * Field _valorIss
     */
    private java.math.BigDecimal _valorIss = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencia() 
     {
        super();
        setValorReceita(new java.math.BigDecimal("0"));
        setValorIss(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoAgencia
     * 
     */
    public void deleteCodigoAgencia()
    {
        this._has_codigoAgencia= false;
    } //-- void deleteCodigoAgencia() 

    /**
     * Method deleteCodigoPa
     * 
     */
    public void deleteCodigoPa()
    {
        this._has_codigoPa= false;
    } //-- void deleteCodigoPa() 

    /**
     * Returns the value of field 'codigoAgencia'.
     * 
     * @return int
     * @return the value of field 'codigoAgencia'.
     */
    public int getCodigoAgencia()
    {
        return this._codigoAgencia;
    } //-- int getCodigoAgencia() 

    /**
     * Returns the value of field 'codigoPa'.
     * 
     * @return int
     * @return the value of field 'codigoPa'.
     */
    public int getCodigoPa()
    {
        return this._codigoPa;
    } //-- int getCodigoPa() 

    /**
     * Returns the value of field 'nomeMunicipioAgencia'.
     * 
     * @return String
     * @return the value of field 'nomeMunicipioAgencia'.
     */
    public java.lang.String getNomeMunicipioAgencia()
    {
        return this._nomeMunicipioAgencia;
    } //-- java.lang.String getNomeMunicipioAgencia() 

    /**
     * Returns the value of field 'nomeMunicipioPa'.
     * 
     * @return String
     * @return the value of field 'nomeMunicipioPa'.
     */
    public java.lang.String getNomeMunicipioPa()
    {
        return this._nomeMunicipioPa;
    } //-- java.lang.String getNomeMunicipioPa() 

    /**
     * Returns the value of field 'nomePa'.
     * 
     * @return String
     * @return the value of field 'nomePa'.
     */
    public java.lang.String getNomePa()
    {
        return this._nomePa;
    } //-- java.lang.String getNomePa() 

    /**
     * Returns the value of field 'nomeUfAgencia'.
     * 
     * @return String
     * @return the value of field 'nomeUfAgencia'.
     */
    public java.lang.String getNomeUfAgencia()
    {
        return this._nomeUfAgencia;
    } //-- java.lang.String getNomeUfAgencia() 

    /**
     * Returns the value of field 'nomeUfPa'.
     * 
     * @return String
     * @return the value of field 'nomeUfPa'.
     */
    public java.lang.String getNomeUfPa()
    {
        return this._nomeUfPa;
    } //-- java.lang.String getNomeUfPa() 

    /**
     * Returns the value of field 'valorIss'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorIss'.
     */
    public java.math.BigDecimal getValorIss()
    {
        return this._valorIss;
    } //-- java.math.BigDecimal getValorIss() 

    /**
     * Returns the value of field 'valorReceita'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorReceita'.
     */
    public java.math.BigDecimal getValorReceita()
    {
        return this._valorReceita;
    } //-- java.math.BigDecimal getValorReceita() 

    /**
     * Method hasCodigoAgencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoAgencia()
    {
        return this._has_codigoAgencia;
    } //-- boolean hasCodigoAgencia() 

    /**
     * Method hasCodigoPa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPa()
    {
        return this._has_codigoPa;
    } //-- boolean hasCodigoPa() 

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
     * Sets the value of field 'codigoAgencia'.
     * 
     * @param codigoAgencia the value of field 'codigoAgencia'.
     */
    public void setCodigoAgencia(int codigoAgencia)
    {
        this._codigoAgencia = codigoAgencia;
        this._has_codigoAgencia = true;
    } //-- void setCodigoAgencia(int) 

    /**
     * Sets the value of field 'codigoPa'.
     * 
     * @param codigoPa the value of field 'codigoPa'.
     */
    public void setCodigoPa(int codigoPa)
    {
        this._codigoPa = codigoPa;
        this._has_codigoPa = true;
    } //-- void setCodigoPa(int) 

    /**
     * Sets the value of field 'nomeMunicipioAgencia'.
     * 
     * @param nomeMunicipioAgencia the value of field
     * 'nomeMunicipioAgencia'.
     */
    public void setNomeMunicipioAgencia(java.lang.String nomeMunicipioAgencia)
    {
        this._nomeMunicipioAgencia = nomeMunicipioAgencia;
    } //-- void setNomeMunicipioAgencia(java.lang.String) 

    /**
     * Sets the value of field 'nomeMunicipioPa'.
     * 
     * @param nomeMunicipioPa the value of field 'nomeMunicipioPa'.
     */
    public void setNomeMunicipioPa(java.lang.String nomeMunicipioPa)
    {
        this._nomeMunicipioPa = nomeMunicipioPa;
    } //-- void setNomeMunicipioPa(java.lang.String) 

    /**
     * Sets the value of field 'nomePa'.
     * 
     * @param nomePa the value of field 'nomePa'.
     */
    public void setNomePa(java.lang.String nomePa)
    {
        this._nomePa = nomePa;
    } //-- void setNomePa(java.lang.String) 

    /**
     * Sets the value of field 'nomeUfAgencia'.
     * 
     * @param nomeUfAgencia the value of field 'nomeUfAgencia'.
     */
    public void setNomeUfAgencia(java.lang.String nomeUfAgencia)
    {
        this._nomeUfAgencia = nomeUfAgencia;
    } //-- void setNomeUfAgencia(java.lang.String) 

    /**
     * Sets the value of field 'nomeUfPa'.
     * 
     * @param nomeUfPa the value of field 'nomeUfPa'.
     */
    public void setNomeUfPa(java.lang.String nomeUfPa)
    {
        this._nomeUfPa = nomeUfPa;
    } //-- void setNomeUfPa(java.lang.String) 

    /**
     * Sets the value of field 'valorIss'.
     * 
     * @param valorIss the value of field 'valorIss'.
     */
    public void setValorIss(java.math.BigDecimal valorIss)
    {
        this._valorIss = valorIss;
    } //-- void setValorIss(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorReceita'.
     * 
     * @param valorReceita the value of field 'valorReceita'.
     */
    public void setValorReceita(java.math.BigDecimal valorReceita)
    {
        this._valorReceita = valorReceita;
    } //-- void setValorReceita(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencia
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia unmarshal(java.io.Reader) 

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
