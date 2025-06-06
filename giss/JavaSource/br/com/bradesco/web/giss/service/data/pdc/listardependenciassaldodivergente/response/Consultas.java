/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Consultas.java,v 1.1 2017/04/11 14:12:54 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response;

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
 * Class Consultas.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:54 $
 */
public class Consultas implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _numeroSequenciaDependencia
     */
    private int _numeroSequenciaDependencia = 0;

    /**
     * keeps track of state for field: _numeroSequenciaDependencia
     */
    private boolean _has_numeroSequenciaDependencia;

    /**
     * Field _numeroConta
     */
    private long _numeroConta = 0;

    /**
     * keeps track of state for field: _numeroConta
     */
    private boolean _has_numeroConta;

    /**
     * Field _descricaoConta
     */
    private java.lang.String _descricaoConta;

    /**
     * Field _valorApuracao
     */
    private double _valorApuracao = 0;

    /**
     * keeps track of state for field: _valorApuracao
     */
    private boolean _has_valorApuracao;

    /**
     * Field _valorContabil
     */
    private double _valorContabil = 0;

    /**
     * keeps track of state for field: _valorContabil
     */
    private boolean _has_valorContabil;


      //----------------/
     //- Constructors -/
    //----------------/

    public Consultas() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Consultas()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteNumeroConta
     * 
     */
    public void deleteNumeroConta()
    {
        this._has_numeroConta= false;
    } //-- void deleteNumeroConta() 

    /**
     * Method deleteNumeroSequenciaDependencia
     * 
     */
    public void deleteNumeroSequenciaDependencia()
    {
        this._has_numeroSequenciaDependencia= false;
    } //-- void deleteNumeroSequenciaDependencia() 

    /**
     * Method deleteValorApuracao
     * 
     */
    public void deleteValorApuracao()
    {
        this._has_valorApuracao= false;
    } //-- void deleteValorApuracao() 

    /**
     * Method deleteValorContabil
     * 
     */
    public void deleteValorContabil()
    {
        this._has_valorContabil= false;
    } //-- void deleteValorContabil() 

    /**
     * Returns the value of field 'codigoPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codigoPessoaJuridica'.
     */
    public long getCodigoPessoaJuridica()
    {
        return this._codigoPessoaJuridica;
    } //-- long getCodigoPessoaJuridica() 

    /**
     * Returns the value of field 'descricaoConta'.
     * 
     * @return String
     * @return the value of field 'descricaoConta'.
     */
    public java.lang.String getDescricaoConta()
    {
        return this._descricaoConta;
    } //-- java.lang.String getDescricaoConta() 

    /**
     * Returns the value of field 'numeroConta'.
     * 
     * @return long
     * @return the value of field 'numeroConta'.
     */
    public long getNumeroConta()
    {
        return this._numeroConta;
    } //-- long getNumeroConta() 

    /**
     * Returns the value of field 'numeroSequenciaDependencia'.
     * 
     * @return int
     * @return the value of field 'numeroSequenciaDependencia'.
     */
    public int getNumeroSequenciaDependencia()
    {
        return this._numeroSequenciaDependencia;
    } //-- int getNumeroSequenciaDependencia() 

    /**
     * Returns the value of field 'valorApuracao'.
     * 
     * @return double
     * @return the value of field 'valorApuracao'.
     */
    public double getValorApuracao()
    {
        return this._valorApuracao;
    } //-- double getValorApuracao() 

    /**
     * Returns the value of field 'valorContabil'.
     * 
     * @return double
     * @return the value of field 'valorContabil'.
     */
    public double getValorContabil()
    {
        return this._valorContabil;
    } //-- double getValorContabil() 

    /**
     * Method hasCodigoPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaJuridica()
    {
        return this._has_codigoPessoaJuridica;
    } //-- boolean hasCodigoPessoaJuridica() 

    /**
     * Method hasNumeroConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroConta()
    {
        return this._has_numeroConta;
    } //-- boolean hasNumeroConta() 

    /**
     * Method hasNumeroSequenciaDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequenciaDependencia()
    {
        return this._has_numeroSequenciaDependencia;
    } //-- boolean hasNumeroSequenciaDependencia() 

    /**
     * Method hasValorApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorApuracao()
    {
        return this._has_valorApuracao;
    } //-- boolean hasValorApuracao() 

    /**
     * Method hasValorContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorContabil()
    {
        return this._has_valorContabil;
    } //-- boolean hasValorContabil() 

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
     * Sets the value of field 'codigoPessoaJuridica'.
     * 
     * @param codigoPessoaJuridica the value of field
     * 'codigoPessoaJuridica'.
     */
    public void setCodigoPessoaJuridica(long codigoPessoaJuridica)
    {
        this._codigoPessoaJuridica = codigoPessoaJuridica;
        this._has_codigoPessoaJuridica = true;
    } //-- void setCodigoPessoaJuridica(long) 

    /**
     * Sets the value of field 'descricaoConta'.
     * 
     * @param descricaoConta the value of field 'descricaoConta'.
     */
    public void setDescricaoConta(java.lang.String descricaoConta)
    {
        this._descricaoConta = descricaoConta;
    } //-- void setDescricaoConta(java.lang.String) 

    /**
     * Sets the value of field 'numeroConta'.
     * 
     * @param numeroConta the value of field 'numeroConta'.
     */
    public void setNumeroConta(long numeroConta)
    {
        this._numeroConta = numeroConta;
        this._has_numeroConta = true;
    } //-- void setNumeroConta(long) 

    /**
     * Sets the value of field 'numeroSequenciaDependencia'.
     * 
     * @param numeroSequenciaDependencia the value of field
     * 'numeroSequenciaDependencia'.
     */
    public void setNumeroSequenciaDependencia(int numeroSequenciaDependencia)
    {
        this._numeroSequenciaDependencia = numeroSequenciaDependencia;
        this._has_numeroSequenciaDependencia = true;
    } //-- void setNumeroSequenciaDependencia(int) 

    /**
     * Sets the value of field 'valorApuracao'.
     * 
     * @param valorApuracao the value of field 'valorApuracao'.
     */
    public void setValorApuracao(double valorApuracao)
    {
        this._valorApuracao = valorApuracao;
        this._has_valorApuracao = true;
    } //-- void setValorApuracao(double) 

    /**
     * Sets the value of field 'valorContabil'.
     * 
     * @param valorContabil the value of field 'valorContabil'.
     */
    public void setValorContabil(double valorContabil)
    {
        this._valorContabil = valorContabil;
        this._has_valorContabil = true;
    } //-- void setValorContabil(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Consultas
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Consultas unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Consultas) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Consultas.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Consultas unmarshal(java.io.Reader) 

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
