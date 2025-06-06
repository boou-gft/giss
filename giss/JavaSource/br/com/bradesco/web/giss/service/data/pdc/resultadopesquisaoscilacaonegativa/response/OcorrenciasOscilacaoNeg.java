/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: OcorrenciasOscilacaoNeg.java,v 1.3 2018/04/24 02:26:59 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response;

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
 * Class OcorrenciasOscilacaoNeg.
 * 
 * @version $Revision: 1.3 $ $Date: 2018/04/24 02:26:59 $
 */
public class OcorrenciasOscilacaoNeg implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codPessoaJuridOcor
     */
    private long _codPessoaJuridOcor = 0;

    /**
     * keeps track of state for field: _codPessoaJuridOcor
     */
    private boolean _has_codPessoaJuridOcor;

    /**
     * Field _numSeqUnidadeOrganizacional
     */
    private int _numSeqUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field: _numSeqUnidadeOrganizacional
     */
    private boolean _has_numSeqUnidadeOrganizacional;

    /**
     * Field _contaContabil
     */
    private java.lang.String _contaContabil;

    /**
     * Field _codGrupo
     */
    private int _codGrupo = 0;

    /**
     * keeps track of state for field: _codGrupo
     */
    private boolean _has_codGrupo;

    /**
     * Field _codSubGrupo
     */
    private int _codSubGrupo = 0;

    /**
     * keeps track of state for field: _codSubGrupo
     */
    private boolean _has_codSubGrupo;

    /**
     * Field _codDependenciaOcor
     */
    private int _codDependenciaOcor = 0;

    /**
     * keeps track of state for field: _codDependenciaOcor
     */
    private boolean _has_codDependenciaOcor;

    /**
     * Field _codPa
     */
    private int _codPa = 0;

    /**
     * keeps track of state for field: _codPa
     */
    private boolean _has_codPa;

    /**
     * Field _codMunicipioOcor
     */
    private long _codMunicipioOcor = 0;

    /**
     * keeps track of state for field: _codMunicipioOcor
     */
    private boolean _has_codMunicipioOcor;

    /**
     * Field _descMunicipioOcor
     */
    private java.lang.String _descMunicipioOcor;

    /**
     * Field _descMunicipioPa
     */
    private java.lang.String _descMunicipioPa;

    /**
     * Field _codUFOcor
     */
    private java.lang.String _codUFOcor;

    /**
     * Field _sinalAnterior
     */
    private java.lang.String _sinalAnterior;

    /**
     * Field _valorAnterior
     */
    private java.math.BigDecimal _valorAnterior = new java.math.BigDecimal("0");

    /**
     * Field _sinalAtual
     */
    private java.lang.String _sinalAtual;

    /**
     * Field _valorAtual
     */
    private java.math.BigDecimal _valorAtual = new java.math.BigDecimal("0");

    /**
     * Field _sinalOscilacao
     */
    private java.lang.String _sinalOscilacao;

    /**
     * Field _valorOscilacao
     */
    private java.math.BigDecimal _valorOscilacao = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public OcorrenciasOscilacaoNeg() 
     {
        super();
        setValorAnterior(new java.math.BigDecimal("0"));
        setValorAtual(new java.math.BigDecimal("0"));
        setValorOscilacao(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodDependenciaOcor
     * 
     */
    public void deleteCodDependenciaOcor()
    {
        this._has_codDependenciaOcor= false;
    } //-- void deleteCodDependenciaOcor() 

    /**
     * Method deleteCodGrupo
     * 
     */
    public void deleteCodGrupo()
    {
        this._has_codGrupo= false;
    } //-- void deleteCodGrupo() 

    /**
     * Method deleteCodMunicipioOcor
     * 
     */
    public void deleteCodMunicipioOcor()
    {
        this._has_codMunicipioOcor= false;
    } //-- void deleteCodMunicipioOcor() 

    /**
     * Method deleteCodPa
     * 
     */
    public void deleteCodPa()
    {
        this._has_codPa= false;
    } //-- void deleteCodPa() 

    /**
     * Method deleteCodPessoaJuridOcor
     * 
     */
    public void deleteCodPessoaJuridOcor()
    {
        this._has_codPessoaJuridOcor= false;
    } //-- void deleteCodPessoaJuridOcor() 

    /**
     * Method deleteCodSubGrupo
     * 
     */
    public void deleteCodSubGrupo()
    {
        this._has_codSubGrupo= false;
    } //-- void deleteCodSubGrupo() 

    /**
     * Method deleteNumSeqUnidadeOrganizacional
     * 
     */
    public void deleteNumSeqUnidadeOrganizacional()
    {
        this._has_numSeqUnidadeOrganizacional= false;
    } //-- void deleteNumSeqUnidadeOrganizacional() 

    /**
     * Returns the value of field 'codDependenciaOcor'.
     * 
     * @return int
     * @return the value of field 'codDependenciaOcor'.
     */
    public int getCodDependenciaOcor()
    {
        return this._codDependenciaOcor;
    } //-- int getCodDependenciaOcor() 

    /**
     * Returns the value of field 'codGrupo'.
     * 
     * @return int
     * @return the value of field 'codGrupo'.
     */
    public int getCodGrupo()
    {
        return this._codGrupo;
    } //-- int getCodGrupo() 

    /**
     * Returns the value of field 'codMunicipioOcor'.
     * 
     * @return long
     * @return the value of field 'codMunicipioOcor'.
     */
    public long getCodMunicipioOcor()
    {
        return this._codMunicipioOcor;
    } //-- long getCodMunicipioOcor() 

    /**
     * Returns the value of field 'codPa'.
     * 
     * @return int
     * @return the value of field 'codPa'.
     */
    public int getCodPa()
    {
        return this._codPa;
    } //-- int getCodPa() 

    /**
     * Returns the value of field 'codPessoaJuridOcor'.
     * 
     * @return long
     * @return the value of field 'codPessoaJuridOcor'.
     */
    public long getCodPessoaJuridOcor()
    {
        return this._codPessoaJuridOcor;
    } //-- long getCodPessoaJuridOcor() 

    /**
     * Returns the value of field 'codSubGrupo'.
     * 
     * @return int
     * @return the value of field 'codSubGrupo'.
     */
    public int getCodSubGrupo()
    {
        return this._codSubGrupo;
    } //-- int getCodSubGrupo() 

    /**
     * Returns the value of field 'codUFOcor'.
     * 
     * @return String
     * @return the value of field 'codUFOcor'.
     */
    public java.lang.String getCodUFOcor()
    {
        return this._codUFOcor;
    } //-- java.lang.String getCodUFOcor() 

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
     * Returns the value of field 'descMunicipioOcor'.
     * 
     * @return String
     * @return the value of field 'descMunicipioOcor'.
     */
    public java.lang.String getDescMunicipioOcor()
    {
        return this._descMunicipioOcor;
    } //-- java.lang.String getDescMunicipioOcor() 

    /**
     * Returns the value of field 'descMunicipioPa'.
     * 
     * @return String
     * @return the value of field 'descMunicipioPa'.
     */
    public java.lang.String getDescMunicipioPa()
    {
        return this._descMunicipioPa;
    } //-- java.lang.String getDescMunicipioPa() 

    /**
     * Returns the value of field 'numSeqUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field 'numSeqUnidadeOrganizacional'.
     */
    public int getNumSeqUnidadeOrganizacional()
    {
        return this._numSeqUnidadeOrganizacional;
    } //-- int getNumSeqUnidadeOrganizacional() 

    /**
     * Returns the value of field 'sinalAnterior'.
     * 
     * @return String
     * @return the value of field 'sinalAnterior'.
     */
    public java.lang.String getSinalAnterior()
    {
        return this._sinalAnterior;
    } //-- java.lang.String getSinalAnterior() 

    /**
     * Returns the value of field 'sinalAtual'.
     * 
     * @return String
     * @return the value of field 'sinalAtual'.
     */
    public java.lang.String getSinalAtual()
    {
        return this._sinalAtual;
    } //-- java.lang.String getSinalAtual() 

    /**
     * Returns the value of field 'sinalOscilacao'.
     * 
     * @return String
     * @return the value of field 'sinalOscilacao'.
     */
    public java.lang.String getSinalOscilacao()
    {
        return this._sinalOscilacao;
    } //-- java.lang.String getSinalOscilacao() 

    /**
     * Returns the value of field 'valorAnterior'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorAnterior'.
     */
    public java.math.BigDecimal getValorAnterior()
    {
        return this._valorAnterior;
    } //-- java.math.BigDecimal getValorAnterior() 

    /**
     * Returns the value of field 'valorAtual'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorAtual'.
     */
    public java.math.BigDecimal getValorAtual()
    {
        return this._valorAtual;
    } //-- java.math.BigDecimal getValorAtual() 

    /**
     * Returns the value of field 'valorOscilacao'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorOscilacao'.
     */
    public java.math.BigDecimal getValorOscilacao()
    {
        return this._valorOscilacao;
    } //-- java.math.BigDecimal getValorOscilacao() 

    /**
     * Method hasCodDependenciaOcor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodDependenciaOcor()
    {
        return this._has_codDependenciaOcor;
    } //-- boolean hasCodDependenciaOcor() 

    /**
     * Method hasCodGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodGrupo()
    {
        return this._has_codGrupo;
    } //-- boolean hasCodGrupo() 

    /**
     * Method hasCodMunicipioOcor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipioOcor()
    {
        return this._has_codMunicipioOcor;
    } //-- boolean hasCodMunicipioOcor() 

    /**
     * Method hasCodPa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPa()
    {
        return this._has_codPa;
    } //-- boolean hasCodPa() 

    /**
     * Method hasCodPessoaJuridOcor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJuridOcor()
    {
        return this._has_codPessoaJuridOcor;
    } //-- boolean hasCodPessoaJuridOcor() 

    /**
     * Method hasCodSubGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodSubGrupo()
    {
        return this._has_codSubGrupo;
    } //-- boolean hasCodSubGrupo() 

    /**
     * Method hasNumSeqUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumSeqUnidadeOrganizacional()
    {
        return this._has_numSeqUnidadeOrganizacional;
    } //-- boolean hasNumSeqUnidadeOrganizacional() 

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
     * Sets the value of field 'codDependenciaOcor'.
     * 
     * @param codDependenciaOcor the value of field
     * 'codDependenciaOcor'.
     */
    public void setCodDependenciaOcor(int codDependenciaOcor)
    {
        this._codDependenciaOcor = codDependenciaOcor;
        this._has_codDependenciaOcor = true;
    } //-- void setCodDependenciaOcor(int) 

    /**
     * Sets the value of field 'codGrupo'.
     * 
     * @param codGrupo the value of field 'codGrupo'.
     */
    public void setCodGrupo(int codGrupo)
    {
        this._codGrupo = codGrupo;
        this._has_codGrupo = true;
    } //-- void setCodGrupo(int) 

    /**
     * Sets the value of field 'codMunicipioOcor'.
     * 
     * @param codMunicipioOcor the value of field 'codMunicipioOcor'
     */
    public void setCodMunicipioOcor(long codMunicipioOcor)
    {
        this._codMunicipioOcor = codMunicipioOcor;
        this._has_codMunicipioOcor = true;
    } //-- void setCodMunicipioOcor(long) 

    /**
     * Sets the value of field 'codPa'.
     * 
     * @param codPa the value of field 'codPa'.
     */
    public void setCodPa(int codPa)
    {
        this._codPa = codPa;
        this._has_codPa = true;
    } //-- void setCodPa(int) 

    /**
     * Sets the value of field 'codPessoaJuridOcor'.
     * 
     * @param codPessoaJuridOcor the value of field
     * 'codPessoaJuridOcor'.
     */
    public void setCodPessoaJuridOcor(long codPessoaJuridOcor)
    {
        this._codPessoaJuridOcor = codPessoaJuridOcor;
        this._has_codPessoaJuridOcor = true;
    } //-- void setCodPessoaJuridOcor(long) 

    /**
     * Sets the value of field 'codSubGrupo'.
     * 
     * @param codSubGrupo the value of field 'codSubGrupo'.
     */
    public void setCodSubGrupo(int codSubGrupo)
    {
        this._codSubGrupo = codSubGrupo;
        this._has_codSubGrupo = true;
    } //-- void setCodSubGrupo(int) 

    /**
     * Sets the value of field 'codUFOcor'.
     * 
     * @param codUFOcor the value of field 'codUFOcor'.
     */
    public void setCodUFOcor(java.lang.String codUFOcor)
    {
        this._codUFOcor = codUFOcor;
    } //-- void setCodUFOcor(java.lang.String) 

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
     * Sets the value of field 'descMunicipioOcor'.
     * 
     * @param descMunicipioOcor the value of field
     * 'descMunicipioOcor'.
     */
    public void setDescMunicipioOcor(java.lang.String descMunicipioOcor)
    {
        this._descMunicipioOcor = descMunicipioOcor;
    } //-- void setDescMunicipioOcor(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipioPa'.
     * 
     * @param descMunicipioPa the value of field 'descMunicipioPa'.
     */
    public void setDescMunicipioPa(java.lang.String descMunicipioPa)
    {
        this._descMunicipioPa = descMunicipioPa;
    } //-- void setDescMunicipioPa(java.lang.String) 

    /**
     * Sets the value of field 'numSeqUnidadeOrganizacional'.
     * 
     * @param numSeqUnidadeOrganizacional the value of field
     * 'numSeqUnidadeOrganizacional'.
     */
    public void setNumSeqUnidadeOrganizacional(int numSeqUnidadeOrganizacional)
    {
        this._numSeqUnidadeOrganizacional = numSeqUnidadeOrganizacional;
        this._has_numSeqUnidadeOrganizacional = true;
    } //-- void setNumSeqUnidadeOrganizacional(int) 

    /**
     * Sets the value of field 'sinalAnterior'.
     * 
     * @param sinalAnterior the value of field 'sinalAnterior'.
     */
    public void setSinalAnterior(java.lang.String sinalAnterior)
    {
        this._sinalAnterior = sinalAnterior;
    } //-- void setSinalAnterior(java.lang.String) 

    /**
     * Sets the value of field 'sinalAtual'.
     * 
     * @param sinalAtual the value of field 'sinalAtual'.
     */
    public void setSinalAtual(java.lang.String sinalAtual)
    {
        this._sinalAtual = sinalAtual;
    } //-- void setSinalAtual(java.lang.String) 

    /**
     * Sets the value of field 'sinalOscilacao'.
     * 
     * @param sinalOscilacao the value of field 'sinalOscilacao'.
     */
    public void setSinalOscilacao(java.lang.String sinalOscilacao)
    {
        this._sinalOscilacao = sinalOscilacao;
    } //-- void setSinalOscilacao(java.lang.String) 

    /**
     * Sets the value of field 'valorAnterior'.
     * 
     * @param valorAnterior the value of field 'valorAnterior'.
     */
    public void setValorAnterior(java.math.BigDecimal valorAnterior)
    {
        this._valorAnterior = valorAnterior;
    } //-- void setValorAnterior(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorAtual'.
     * 
     * @param valorAtual the value of field 'valorAtual'.
     */
    public void setValorAtual(java.math.BigDecimal valorAtual)
    {
        this._valorAtual = valorAtual;
    } //-- void setValorAtual(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorOscilacao'.
     * 
     * @param valorOscilacao the value of field 'valorOscilacao'.
     */
    public void setValorOscilacao(java.math.BigDecimal valorOscilacao)
    {
        this._valorOscilacao = valorOscilacao;
    } //-- void setValorOscilacao(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return OcorrenciasOscilacaoNeg
     */
    public static br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg unmarshal(java.io.Reader) 

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
