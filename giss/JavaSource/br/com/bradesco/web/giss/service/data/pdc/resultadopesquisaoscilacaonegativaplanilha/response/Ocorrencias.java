/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.2 2018/04/30 23:31:19 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response;

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
 * @version $Revision: 1.2 $ $Date: 2018/04/30 23:31:19 $
 */
public class Ocorrencias implements java.io.Serializable {


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
     * Field _nroSeqUndOrganizacional
     */
    private int _nroSeqUndOrganizacional = 0;

    /**
     * keeps track of state for field: _nroSeqUndOrganizacional
     */
    private boolean _has_nroSeqUndOrganizacional;

    /**
     * Field _contaContabil
     */
    private java.lang.String _contaContabil;

    /**
     * Field _codigoGrupo
     */
    private int _codigoGrupo = 0;

    /**
     * keeps track of state for field: _codigoGrupo
     */
    private boolean _has_codigoGrupo;

    /**
     * Field _codigoSubgrupo
     */
    private int _codigoSubgrupo = 0;

    /**
     * keeps track of state for field: _codigoSubgrupo
     */
    private boolean _has_codigoSubgrupo;

    /**
     * Field _codigoDependencia
     */
    private int _codigoDependencia = 0;

    /**
     * keeps track of state for field: _codigoDependencia
     */
    private boolean _has_codigoDependencia;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _siglaUf
     */
    private java.lang.String _siglaUf;

    /**
     * Field _anteriorSinal
     */
    private java.lang.String _anteriorSinal;

    /**
     * Field _anteriorValor
     */
    private java.math.BigDecimal _anteriorValor = new java.math.BigDecimal("0");

    /**
     * Field _atualSinal
     */
    private java.lang.String _atualSinal;

    /**
     * Field _atualValor
     */
    private java.math.BigDecimal _atualValor = new java.math.BigDecimal("0");

    /**
     * Field _oscilacaoSinal
     */
    private java.lang.String _oscilacaoSinal;

    /**
     * Field _oscilacaoValor
     */
    private java.math.BigDecimal _oscilacaoValor = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
        setAnteriorValor(new java.math.BigDecimal("0"));
        setAtualValor(new java.math.BigDecimal("0"));
        setOscilacaoValor(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoDependencia
     * 
     */
    public void deleteCodigoDependencia()
    {
        this._has_codigoDependencia= false;
    } //-- void deleteCodigoDependencia() 

    /**
     * Method deleteCodigoGrupo
     * 
     */
    public void deleteCodigoGrupo()
    {
        this._has_codigoGrupo= false;
    } //-- void deleteCodigoGrupo() 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteCodigoSubgrupo
     * 
     */
    public void deleteCodigoSubgrupo()
    {
        this._has_codigoSubgrupo= false;
    } //-- void deleteCodigoSubgrupo() 

    /**
     * Method deleteNroSeqUndOrganizacional
     * 
     */
    public void deleteNroSeqUndOrganizacional()
    {
        this._has_nroSeqUndOrganizacional= false;
    } //-- void deleteNroSeqUndOrganizacional() 

    /**
     * Returns the value of field 'anteriorSinal'.
     * 
     * @return String
     * @return the value of field 'anteriorSinal'.
     */
    public java.lang.String getAnteriorSinal()
    {
        return this._anteriorSinal;
    } //-- java.lang.String getAnteriorSinal() 

    /**
     * Returns the value of field 'anteriorValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'anteriorValor'.
     */
    public java.math.BigDecimal getAnteriorValor()
    {
        return this._anteriorValor;
    } //-- java.math.BigDecimal getAnteriorValor() 

    /**
     * Returns the value of field 'atualSinal'.
     * 
     * @return String
     * @return the value of field 'atualSinal'.
     */
    public java.lang.String getAtualSinal()
    {
        return this._atualSinal;
    } //-- java.lang.String getAtualSinal() 

    /**
     * Returns the value of field 'atualValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'atualValor'.
     */
    public java.math.BigDecimal getAtualValor()
    {
        return this._atualValor;
    } //-- java.math.BigDecimal getAtualValor() 

    /**
     * Returns the value of field 'codigoDependencia'.
     * 
     * @return int
     * @return the value of field 'codigoDependencia'.
     */
    public int getCodigoDependencia()
    {
        return this._codigoDependencia;
    } //-- int getCodigoDependencia() 

    /**
     * Returns the value of field 'codigoGrupo'.
     * 
     * @return int
     * @return the value of field 'codigoGrupo'.
     */
    public int getCodigoGrupo()
    {
        return this._codigoGrupo;
    } //-- int getCodigoGrupo() 

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
     * Returns the value of field 'codigoSubgrupo'.
     * 
     * @return int
     * @return the value of field 'codigoSubgrupo'.
     */
    public int getCodigoSubgrupo()
    {
        return this._codigoSubgrupo;
    } //-- int getCodigoSubgrupo() 

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
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'nroSeqUndOrganizacional'.
     * 
     * @return int
     * @return the value of field 'nroSeqUndOrganizacional'.
     */
    public int getNroSeqUndOrganizacional()
    {
        return this._nroSeqUndOrganizacional;
    } //-- int getNroSeqUndOrganizacional() 

    /**
     * Returns the value of field 'oscilacaoSinal'.
     * 
     * @return String
     * @return the value of field 'oscilacaoSinal'.
     */
    public java.lang.String getOscilacaoSinal()
    {
        return this._oscilacaoSinal;
    } //-- java.lang.String getOscilacaoSinal() 

    /**
     * Returns the value of field 'oscilacaoValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'oscilacaoValor'.
     */
    public java.math.BigDecimal getOscilacaoValor()
    {
        return this._oscilacaoValor;
    } //-- java.math.BigDecimal getOscilacaoValor() 

    /**
     * Returns the value of field 'siglaUf'.
     * 
     * @return String
     * @return the value of field 'siglaUf'.
     */
    public java.lang.String getSiglaUf()
    {
        return this._siglaUf;
    } //-- java.lang.String getSiglaUf() 

    /**
     * Method hasCodigoDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoDependencia()
    {
        return this._has_codigoDependencia;
    } //-- boolean hasCodigoDependencia() 

    /**
     * Method hasCodigoGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoGrupo()
    {
        return this._has_codigoGrupo;
    } //-- boolean hasCodigoGrupo() 

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
     * Method hasCodigoSubgrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoSubgrupo()
    {
        return this._has_codigoSubgrupo;
    } //-- boolean hasCodigoSubgrupo() 

    /**
     * Method hasNroSeqUndOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNroSeqUndOrganizacional()
    {
        return this._has_nroSeqUndOrganizacional;
    } //-- boolean hasNroSeqUndOrganizacional() 

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
     * Sets the value of field 'anteriorSinal'.
     * 
     * @param anteriorSinal the value of field 'anteriorSinal'.
     */
    public void setAnteriorSinal(java.lang.String anteriorSinal)
    {
        this._anteriorSinal = anteriorSinal;
    } //-- void setAnteriorSinal(java.lang.String) 

    /**
     * Sets the value of field 'anteriorValor'.
     * 
     * @param anteriorValor the value of field 'anteriorValor'.
     */
    public void setAnteriorValor(java.math.BigDecimal anteriorValor)
    {
        this._anteriorValor = anteriorValor;
    } //-- void setAnteriorValor(java.math.BigDecimal) 

    /**
     * Sets the value of field 'atualSinal'.
     * 
     * @param atualSinal the value of field 'atualSinal'.
     */
    public void setAtualSinal(java.lang.String atualSinal)
    {
        this._atualSinal = atualSinal;
    } //-- void setAtualSinal(java.lang.String) 

    /**
     * Sets the value of field 'atualValor'.
     * 
     * @param atualValor the value of field 'atualValor'.
     */
    public void setAtualValor(java.math.BigDecimal atualValor)
    {
        this._atualValor = atualValor;
    } //-- void setAtualValor(java.math.BigDecimal) 

    /**
     * Sets the value of field 'codigoDependencia'.
     * 
     * @param codigoDependencia the value of field
     * 'codigoDependencia'.
     */
    public void setCodigoDependencia(int codigoDependencia)
    {
        this._codigoDependencia = codigoDependencia;
        this._has_codigoDependencia = true;
    } //-- void setCodigoDependencia(int) 

    /**
     * Sets the value of field 'codigoGrupo'.
     * 
     * @param codigoGrupo the value of field 'codigoGrupo'.
     */
    public void setCodigoGrupo(int codigoGrupo)
    {
        this._codigoGrupo = codigoGrupo;
        this._has_codigoGrupo = true;
    } //-- void setCodigoGrupo(int) 

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
     * Sets the value of field 'codigoSubgrupo'.
     * 
     * @param codigoSubgrupo the value of field 'codigoSubgrupo'.
     */
    public void setCodigoSubgrupo(int codigoSubgrupo)
    {
        this._codigoSubgrupo = codigoSubgrupo;
        this._has_codigoSubgrupo = true;
    } //-- void setCodigoSubgrupo(int) 

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
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'nroSeqUndOrganizacional'.
     * 
     * @param nroSeqUndOrganizacional the value of field
     * 'nroSeqUndOrganizacional'.
     */
    public void setNroSeqUndOrganizacional(int nroSeqUndOrganizacional)
    {
        this._nroSeqUndOrganizacional = nroSeqUndOrganizacional;
        this._has_nroSeqUndOrganizacional = true;
    } //-- void setNroSeqUndOrganizacional(int) 

    /**
     * Sets the value of field 'oscilacaoSinal'.
     * 
     * @param oscilacaoSinal the value of field 'oscilacaoSinal'.
     */
    public void setOscilacaoSinal(java.lang.String oscilacaoSinal)
    {
        this._oscilacaoSinal = oscilacaoSinal;
    } //-- void setOscilacaoSinal(java.lang.String) 

    /**
     * Sets the value of field 'oscilacaoValor'.
     * 
     * @param oscilacaoValor the value of field 'oscilacaoValor'.
     */
    public void setOscilacaoValor(java.math.BigDecimal oscilacaoValor)
    {
        this._oscilacaoValor = oscilacaoValor;
    } //-- void setOscilacaoValor(java.math.BigDecimal) 

    /**
     * Sets the value of field 'siglaUf'.
     * 
     * @param siglaUf the value of field 'siglaUf'.
     */
    public void setSiglaUf(java.lang.String siglaUf)
    {
        this._siglaUf = siglaUf;
    } //-- void setSiglaUf(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias unmarshal(java.io.Reader) 

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
