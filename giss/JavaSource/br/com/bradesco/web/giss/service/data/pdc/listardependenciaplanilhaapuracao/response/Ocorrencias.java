/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response;

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
 * Class Ocorrencias.
 * 
 * @version $Revision$ $Date$
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoPessoaJuridica
     */
    private int _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _numeroSequencial
     */
    private int _numeroSequencial = 0;

    /**
     * keeps track of state for field: _numeroSequencial
     */
    private boolean _has_numeroSequencial;

    /**
     * Field _dataCompetencia
     */
    private int _dataCompetencia = 0;

    /**
     * keeps track of state for field: _dataCompetencia
     */
    private boolean _has_dataCompetencia;

    /**
     * Field _contaContabil
     */
    private long _contaContabil = 0;

    /**
     * keeps track of state for field: _contaContabil
     */
    private boolean _has_contaContabil;

    /**
     * Field _codigoDependencia
     */
    private java.lang.String _codigoDependencia;

    /**
     * Field _codigoPaa
     */
    private int _codigoPaa = 0;

    /**
     * keeps track of state for field: _codigoPaa
     */
    private boolean _has_codigoPaa;

    /**
     * Field _descricaoDependencia
     */
    private java.lang.String _descricaoDependencia;

    /**
     * Field _descricaoPa
     */
    private java.lang.String _descricaoPa;

    /**
     * Field _sinalReceita
     */
    private java.lang.String _sinalReceita;

    /**
     * Field _valorReceita
     */
    private double _valorReceita = 0;

    /**
     * keeps track of state for field: _valorReceita
     */
    private boolean _has_valorReceita;

    /**
     * Field _sinalTributoApuracao
     */
    private java.lang.String _sinalTributoApuracao;

    /**
     * Field _valorTributoApuracao
     */
    private double _valorTributoApuracao = 0;

    /**
     * keeps track of state for field: _valorTributoApuracao
     */
    private boolean _has_valorTributoApuracao;

    /**
     * Field _uf
     */
    private java.lang.String _uf;

    /**
     * Field _municipio
     */
    private java.lang.String _municipio;

    /**
     * Field _tragSemTrag
     */
    private java.lang.String _tragSemTrag;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodigoPaa
     * 
     */
    public void deleteCodigoPaa()
    {
        this._has_codigoPaa= false;
    } //-- void deleteCodigoPaa() 

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteContaContabil
     * 
     */
    public void deleteContaContabil()
    {
        this._has_contaContabil= false;
    } //-- void deleteContaContabil() 

    /**
     * Method deleteDataCompetencia
     * 
     */
    public void deleteDataCompetencia()
    {
        this._has_dataCompetencia= false;
    } //-- void deleteDataCompetencia() 

    /**
     * Method deleteNumeroSequencial
     * 
     */
    public void deleteNumeroSequencial()
    {
        this._has_numeroSequencial= false;
    } //-- void deleteNumeroSequencial() 

    /**
     * Method deleteValorReceita
     * 
     */
    public void deleteValorReceita()
    {
        this._has_valorReceita= false;
    } //-- void deleteValorReceita() 

    /**
     * Method deleteValorTributoApuracao
     * 
     */
    public void deleteValorTributoApuracao()
    {
        this._has_valorTributoApuracao= false;
    } //-- void deleteValorTributoApuracao() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codigoDependencia'.
     * 
     * @return String
     * @return the value of field 'codigoDependencia'.
     */
    public java.lang.String getCodigoDependencia()
    {
        return this._codigoDependencia;
    } //-- java.lang.String getCodigoDependencia() 

    /**
     * Returns the value of field 'codigoPaa'.
     * 
     * @return int
     * @return the value of field 'codigoPaa'.
     */
    public int getCodigoPaa()
    {
        return this._codigoPaa;
    } //-- int getCodigoPaa() 

    /**
     * Returns the value of field 'codigoPessoaJuridica'.
     * 
     * @return int
     * @return the value of field 'codigoPessoaJuridica'.
     */
    public int getCodigoPessoaJuridica()
    {
        return this._codigoPessoaJuridica;
    } //-- int getCodigoPessoaJuridica() 

    /**
     * Returns the value of field 'contaContabil'.
     * 
     * @return long
     * @return the value of field 'contaContabil'.
     */
    public long getContaContabil()
    {
        return this._contaContabil;
    } //-- long getContaContabil() 

    /**
     * Returns the value of field 'dataCompetencia'.
     * 
     * @return int
     * @return the value of field 'dataCompetencia'.
     */
    public int getDataCompetencia()
    {
        return this._dataCompetencia;
    } //-- int getDataCompetencia() 

    /**
     * Returns the value of field 'descricaoDependencia'.
     * 
     * @return String
     * @return the value of field 'descricaoDependencia'.
     */
    public java.lang.String getDescricaoDependencia()
    {
        return this._descricaoDependencia;
    } //-- java.lang.String getDescricaoDependencia() 

    /**
     * Returns the value of field 'descricaoPa'.
     * 
     * @return String
     * @return the value of field 'descricaoPa'.
     */
    public java.lang.String getDescricaoPa()
    {
        return this._descricaoPa;
    } //-- java.lang.String getDescricaoPa() 

    /**
     * Returns the value of field 'municipio'.
     * 
     * @return String
     * @return the value of field 'municipio'.
     */
    public java.lang.String getMunicipio()
    {
        return this._municipio;
    } //-- java.lang.String getMunicipio() 

    /**
     * Returns the value of field 'numeroSequencial'.
     * 
     * @return int
     * @return the value of field 'numeroSequencial'.
     */
    public int getNumeroSequencial()
    {
        return this._numeroSequencial;
    } //-- int getNumeroSequencial() 

    /**
     * Returns the value of field 'sinalReceita'.
     * 
     * @return String
     * @return the value of field 'sinalReceita'.
     */
    public java.lang.String getSinalReceita()
    {
        return this._sinalReceita;
    } //-- java.lang.String getSinalReceita() 

    /**
     * Returns the value of field 'sinalTributoApuracao'.
     * 
     * @return String
     * @return the value of field 'sinalTributoApuracao'.
     */
    public java.lang.String getSinalTributoApuracao()
    {
        return this._sinalTributoApuracao;
    } //-- java.lang.String getSinalTributoApuracao() 

    /**
     * Returns the value of field 'tragSemTrag'.
     * 
     * @return String
     * @return the value of field 'tragSemTrag'.
     */
    public java.lang.String getTragSemTrag()
    {
        return this._tragSemTrag;
    } //-- java.lang.String getTragSemTrag() 

    /**
     * Returns the value of field 'uf'.
     * 
     * @return String
     * @return the value of field 'uf'.
     */
    public java.lang.String getUf()
    {
        return this._uf;
    } //-- java.lang.String getUf() 

    /**
     * Returns the value of field 'valorReceita'.
     * 
     * @return double
     * @return the value of field 'valorReceita'.
     */
    public double getValorReceita()
    {
        return this._valorReceita;
    } //-- double getValorReceita() 

    /**
     * Returns the value of field 'valorTributoApuracao'.
     * 
     * @return double
     * @return the value of field 'valorTributoApuracao'.
     */
    public double getValorTributoApuracao()
    {
        return this._valorTributoApuracao;
    } //-- double getValorTributoApuracao() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasCodigoPaa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPaa()
    {
        return this._has_codigoPaa;
    } //-- boolean hasCodigoPaa() 

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
     * Method hasContaContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasContaContabil()
    {
        return this._has_contaContabil;
    } //-- boolean hasContaContabil() 

    /**
     * Method hasDataCompetencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDataCompetencia()
    {
        return this._has_dataCompetencia;
    } //-- boolean hasDataCompetencia() 

    /**
     * Method hasNumeroSequencial
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequencial()
    {
        return this._has_numeroSequencial;
    } //-- boolean hasNumeroSequencial() 

    /**
     * Method hasValorReceita
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorReceita()
    {
        return this._has_valorReceita;
    } //-- boolean hasValorReceita() 

    /**
     * Method hasValorTributoApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTributoApuracao()
    {
        return this._has_valorTributoApuracao;
    } //-- boolean hasValorTributoApuracao() 

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
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codigoDependencia'.
     * 
     * @param codigoDependencia the value of field
     * 'codigoDependencia'.
     */
    public void setCodigoDependencia(java.lang.String codigoDependencia)
    {
        this._codigoDependencia = codigoDependencia;
    } //-- void setCodigoDependencia(java.lang.String) 

    /**
     * Sets the value of field 'codigoPaa'.
     * 
     * @param codigoPaa the value of field 'codigoPaa'.
     */
    public void setCodigoPaa(int codigoPaa)
    {
        this._codigoPaa = codigoPaa;
        this._has_codigoPaa = true;
    } //-- void setCodigoPaa(int) 

    /**
     * Sets the value of field 'codigoPessoaJuridica'.
     * 
     * @param codigoPessoaJuridica the value of field
     * 'codigoPessoaJuridica'.
     */
    public void setCodigoPessoaJuridica(int codigoPessoaJuridica)
    {
        this._codigoPessoaJuridica = codigoPessoaJuridica;
        this._has_codigoPessoaJuridica = true;
    } //-- void setCodigoPessoaJuridica(int) 

    /**
     * Sets the value of field 'contaContabil'.
     * 
     * @param contaContabil the value of field 'contaContabil'.
     */
    public void setContaContabil(long contaContabil)
    {
        this._contaContabil = contaContabil;
        this._has_contaContabil = true;
    } //-- void setContaContabil(long) 

    /**
     * Sets the value of field 'dataCompetencia'.
     * 
     * @param dataCompetencia the value of field 'dataCompetencia'.
     */
    public void setDataCompetencia(int dataCompetencia)
    {
        this._dataCompetencia = dataCompetencia;
        this._has_dataCompetencia = true;
    } //-- void setDataCompetencia(int) 

    /**
     * Sets the value of field 'descricaoDependencia'.
     * 
     * @param descricaoDependencia the value of field
     * 'descricaoDependencia'.
     */
    public void setDescricaoDependencia(java.lang.String descricaoDependencia)
    {
        this._descricaoDependencia = descricaoDependencia;
    } //-- void setDescricaoDependencia(java.lang.String) 

    /**
     * Sets the value of field 'descricaoPa'.
     * 
     * @param descricaoPa the value of field 'descricaoPa'.
     */
    public void setDescricaoPa(java.lang.String descricaoPa)
    {
        this._descricaoPa = descricaoPa;
    } //-- void setDescricaoPa(java.lang.String) 

    /**
     * Sets the value of field 'municipio'.
     * 
     * @param municipio the value of field 'municipio'.
     */
    public void setMunicipio(java.lang.String municipio)
    {
        this._municipio = municipio;
    } //-- void setMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'numeroSequencial'.
     * 
     * @param numeroSequencial the value of field 'numeroSequencial'
     */
    public void setNumeroSequencial(int numeroSequencial)
    {
        this._numeroSequencial = numeroSequencial;
        this._has_numeroSequencial = true;
    } //-- void setNumeroSequencial(int) 

    /**
     * Sets the value of field 'sinalReceita'.
     * 
     * @param sinalReceita the value of field 'sinalReceita'.
     */
    public void setSinalReceita(java.lang.String sinalReceita)
    {
        this._sinalReceita = sinalReceita;
    } //-- void setSinalReceita(java.lang.String) 

    /**
     * Sets the value of field 'sinalTributoApuracao'.
     * 
     * @param sinalTributoApuracao the value of field
     * 'sinalTributoApuracao'.
     */
    public void setSinalTributoApuracao(java.lang.String sinalTributoApuracao)
    {
        this._sinalTributoApuracao = sinalTributoApuracao;
    } //-- void setSinalTributoApuracao(java.lang.String) 

    /**
     * Sets the value of field 'tragSemTrag'.
     * 
     * @param tragSemTrag the value of field 'tragSemTrag'.
     */
    public void setTragSemTrag(java.lang.String tragSemTrag)
    {
        this._tragSemTrag = tragSemTrag;
    } //-- void setTragSemTrag(java.lang.String) 

    /**
     * Sets the value of field 'uf'.
     * 
     * @param uf the value of field 'uf'.
     */
    public void setUf(java.lang.String uf)
    {
        this._uf = uf;
    } //-- void setUf(java.lang.String) 

    /**
     * Sets the value of field 'valorReceita'.
     * 
     * @param valorReceita the value of field 'valorReceita'.
     */
    public void setValorReceita(double valorReceita)
    {
        this._valorReceita = valorReceita;
        this._has_valorReceita = true;
    } //-- void setValorReceita(double) 

    /**
     * Sets the value of field 'valorTributoApuracao'.
     * 
     * @param valorTributoApuracao the value of field
     * 'valorTributoApuracao'.
     */
    public void setValorTributoApuracao(double valorTributoApuracao)
    {
        this._valorTributoApuracao = valorTributoApuracao;
        this._has_valorTributoApuracao = true;
    } //-- void setValorTributoApuracao(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias unmarshal(java.io.Reader) 

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
