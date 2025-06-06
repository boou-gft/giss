/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response;

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
 * Class ListaCalculo.
 * 
 * @version $Revision$ $Date$
 */
public class ListaCalculo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _descEmpresa
     */
    private java.lang.String _descEmpresa;

    /**
     * Field _competencia
     */
    private int _competencia = 0;

    /**
     * keeps track of state for field: _competencia
     */
    private boolean _has_competencia;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _dataOriginal
     */
    private java.lang.String _dataOriginal;

    /**
     * Field _dataAgendamento
     */
    private java.lang.String _dataAgendamento;

    /**
     * Field _valorTotalApuracaoIss
     */
    private java.math.BigDecimal _valorTotalApuracaoIss = new java.math.BigDecimal("0");

    /**
     * Field _valorMulta
     */
    private java.math.BigDecimal _valorMulta = new java.math.BigDecimal("0");

    /**
     * Field _percentualAtualizacaoMonetaria
     */
    private java.math.BigDecimal _percentualAtualizacaoMonetaria = new java.math.BigDecimal("0");

    /**
     * Field _valorAtualizacaoMonetaria
     */
    private java.math.BigDecimal _valorAtualizacaoMonetaria = new java.math.BigDecimal("0");

    /**
     * Field _valorPagamentoAtualizado
     */
    private java.math.BigDecimal _valorPagamentoAtualizado = new java.math.BigDecimal("0");

    /**
     * Field _codStatus
     */
    private int _codStatus = 0;

    /**
     * keeps track of state for field: _codStatus
     */
    private boolean _has_codStatus;

    /**
     * Field _descStatus
     */
    private java.lang.String _descStatus;

    /**
     * Field _codProduto
     */
    private int _codProduto = 0;

    /**
     * keeps track of state for field: _codProduto
     */
    private boolean _has_codProduto;

    /**
     * Field _descProduto
     */
    private java.lang.String _descProduto;

    /**
     * Field _descTipoCredito
     */
    private java.lang.String _descTipoCredito;

    /**
     * Field _banco
     */
    private int _banco = 0;

    /**
     * keeps track of state for field: _banco
     */
    private boolean _has_banco;

    /**
     * Field _agencia
     */
    private int _agencia = 0;

    /**
     * keeps track of state for field: _agencia
     */
    private boolean _has_agencia;

    /**
     * Field _numConta
     */
    private long _numConta = 0;

    /**
     * keeps track of state for field: _numConta
     */
    private boolean _has_numConta;

    /**
     * Field _digitoConta
     */
    private java.lang.String _digitoConta;

    /**
     * Field _elegivelPgto
     */
    private java.lang.String _elegivelPgto;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaCalculo() 
     {
        super();
        setValorTotalApuracaoIss(new java.math.BigDecimal("0"));
        setValorMulta(new java.math.BigDecimal("0"));
        setPercentualAtualizacaoMonetaria(new java.math.BigDecimal("0"));
        setValorAtualizacaoMonetaria(new java.math.BigDecimal("0"));
        setValorPagamentoAtualizado(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAgencia
     * 
     */
    public void deleteAgencia()
    {
        this._has_agencia= false;
    } //-- void deleteAgencia() 

    /**
     * Method deleteBanco
     * 
     */
    public void deleteBanco()
    {
        this._has_banco= false;
    } //-- void deleteBanco() 

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodProduto
     * 
     */
    public void deleteCodProduto()
    {
        this._has_codProduto= false;
    } //-- void deleteCodProduto() 

    /**
     * Method deleteCodStatus
     * 
     */
    public void deleteCodStatus()
    {
        this._has_codStatus= false;
    } //-- void deleteCodStatus() 

    /**
     * Method deleteCompetencia
     * 
     */
    public void deleteCompetencia()
    {
        this._has_competencia= false;
    } //-- void deleteCompetencia() 

    /**
     * Method deleteNumConta
     * 
     */
    public void deleteNumConta()
    {
        this._has_numConta= false;
    } //-- void deleteNumConta() 

    /**
     * Returns the value of field 'agencia'.
     * 
     * @return int
     * @return the value of field 'agencia'.
     */
    public int getAgencia()
    {
        return this._agencia;
    } //-- int getAgencia() 

    /**
     * Returns the value of field 'banco'.
     * 
     * @return int
     * @return the value of field 'banco'.
     */
    public int getBanco()
    {
        return this._banco;
    } //-- int getBanco() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return int
     * @return the value of field 'codEmpresa'.
     */
    public int getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- int getCodEmpresa() 

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
     * Returns the value of field 'codProduto'.
     * 
     * @return int
     * @return the value of field 'codProduto'.
     */
    public int getCodProduto()
    {
        return this._codProduto;
    } //-- int getCodProduto() 

    /**
     * Returns the value of field 'codStatus'.
     * 
     * @return int
     * @return the value of field 'codStatus'.
     */
    public int getCodStatus()
    {
        return this._codStatus;
    } //-- int getCodStatus() 

    /**
     * Returns the value of field 'competencia'.
     * 
     * @return int
     * @return the value of field 'competencia'.
     */
    public int getCompetencia()
    {
        return this._competencia;
    } //-- int getCompetencia() 

    /**
     * Returns the value of field 'dataAgendamento'.
     * 
     * @return String
     * @return the value of field 'dataAgendamento'.
     */
    public java.lang.String getDataAgendamento()
    {
        return this._dataAgendamento;
    } //-- java.lang.String getDataAgendamento() 

    /**
     * Returns the value of field 'dataOriginal'.
     * 
     * @return String
     * @return the value of field 'dataOriginal'.
     */
    public java.lang.String getDataOriginal()
    {
        return this._dataOriginal;
    } //-- java.lang.String getDataOriginal() 

    /**
     * Returns the value of field 'descEmpresa'.
     * 
     * @return String
     * @return the value of field 'descEmpresa'.
     */
    public java.lang.String getDescEmpresa()
    {
        return this._descEmpresa;
    } //-- java.lang.String getDescEmpresa() 

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
     * Returns the value of field 'descProduto'.
     * 
     * @return String
     * @return the value of field 'descProduto'.
     */
    public java.lang.String getDescProduto()
    {
        return this._descProduto;
    } //-- java.lang.String getDescProduto() 

    /**
     * Returns the value of field 'descStatus'.
     * 
     * @return String
     * @return the value of field 'descStatus'.
     */
    public java.lang.String getDescStatus()
    {
        return this._descStatus;
    } //-- java.lang.String getDescStatus() 

    /**
     * Returns the value of field 'descTipoCredito'.
     * 
     * @return String
     * @return the value of field 'descTipoCredito'.
     */
    public java.lang.String getDescTipoCredito()
    {
        return this._descTipoCredito;
    } //-- java.lang.String getDescTipoCredito() 

    /**
     * Returns the value of field 'digitoConta'.
     * 
     * @return String
     * @return the value of field 'digitoConta'.
     */
    public java.lang.String getDigitoConta()
    {
        return this._digitoConta;
    } //-- java.lang.String getDigitoConta() 

    /**
     * Returns the value of field 'elegivelPgto'.
     * 
     * @return String
     * @return the value of field 'elegivelPgto'.
     */
    public java.lang.String getElegivelPgto()
    {
        return this._elegivelPgto;
    } //-- java.lang.String getElegivelPgto() 

    /**
     * Returns the value of field 'numConta'.
     * 
     * @return long
     * @return the value of field 'numConta'.
     */
    public long getNumConta()
    {
        return this._numConta;
    } //-- long getNumConta() 

    /**
     * Returns the value of field 'percentualAtualizacaoMonetaria'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentualAtualizacaoMonetaria'.
     */
    public java.math.BigDecimal getPercentualAtualizacaoMonetaria()
    {
        return this._percentualAtualizacaoMonetaria;
    } //-- java.math.BigDecimal getPercentualAtualizacaoMonetaria() 

    /**
     * Returns the value of field 'valorAtualizacaoMonetaria'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorAtualizacaoMonetaria'.
     */
    public java.math.BigDecimal getValorAtualizacaoMonetaria()
    {
        return this._valorAtualizacaoMonetaria;
    } //-- java.math.BigDecimal getValorAtualizacaoMonetaria() 

    /**
     * Returns the value of field 'valorMulta'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorMulta'.
     */
    public java.math.BigDecimal getValorMulta()
    {
        return this._valorMulta;
    } //-- java.math.BigDecimal getValorMulta() 

    /**
     * Returns the value of field 'valorPagamentoAtualizado'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorPagamentoAtualizado'.
     */
    public java.math.BigDecimal getValorPagamentoAtualizado()
    {
        return this._valorPagamentoAtualizado;
    } //-- java.math.BigDecimal getValorPagamentoAtualizado() 

    /**
     * Returns the value of field 'valorTotalApuracaoIss'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalApuracaoIss'.
     */
    public java.math.BigDecimal getValorTotalApuracaoIss()
    {
        return this._valorTotalApuracaoIss;
    } //-- java.math.BigDecimal getValorTotalApuracaoIss() 

    /**
     * Method hasAgencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAgencia()
    {
        return this._has_agencia;
    } //-- boolean hasAgencia() 

    /**
     * Method hasBanco
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasBanco()
    {
        return this._has_banco;
    } //-- boolean hasBanco() 

    /**
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

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
     * Method hasCodProduto
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodProduto()
    {
        return this._has_codProduto;
    } //-- boolean hasCodProduto() 

    /**
     * Method hasCodStatus
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodStatus()
    {
        return this._has_codStatus;
    } //-- boolean hasCodStatus() 

    /**
     * Method hasCompetencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCompetencia()
    {
        return this._has_competencia;
    } //-- boolean hasCompetencia() 

    /**
     * Method hasNumConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumConta()
    {
        return this._has_numConta;
    } //-- boolean hasNumConta() 

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
     * Sets the value of field 'agencia'.
     * 
     * @param agencia the value of field 'agencia'.
     */
    public void setAgencia(int agencia)
    {
        this._agencia = agencia;
        this._has_agencia = true;
    } //-- void setAgencia(int) 

    /**
     * Sets the value of field 'banco'.
     * 
     * @param banco the value of field 'banco'.
     */
    public void setBanco(int banco)
    {
        this._banco = banco;
        this._has_banco = true;
    } //-- void setBanco(int) 

    /**
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(int codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(int) 

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
     * Sets the value of field 'codProduto'.
     * 
     * @param codProduto the value of field 'codProduto'.
     */
    public void setCodProduto(int codProduto)
    {
        this._codProduto = codProduto;
        this._has_codProduto = true;
    } //-- void setCodProduto(int) 

    /**
     * Sets the value of field 'codStatus'.
     * 
     * @param codStatus the value of field 'codStatus'.
     */
    public void setCodStatus(int codStatus)
    {
        this._codStatus = codStatus;
        this._has_codStatus = true;
    } //-- void setCodStatus(int) 

    /**
     * Sets the value of field 'competencia'.
     * 
     * @param competencia the value of field 'competencia'.
     */
    public void setCompetencia(int competencia)
    {
        this._competencia = competencia;
        this._has_competencia = true;
    } //-- void setCompetencia(int) 

    /**
     * Sets the value of field 'dataAgendamento'.
     * 
     * @param dataAgendamento the value of field 'dataAgendamento'.
     */
    public void setDataAgendamento(java.lang.String dataAgendamento)
    {
        this._dataAgendamento = dataAgendamento;
    } //-- void setDataAgendamento(java.lang.String) 

    /**
     * Sets the value of field 'dataOriginal'.
     * 
     * @param dataOriginal the value of field 'dataOriginal'.
     */
    public void setDataOriginal(java.lang.String dataOriginal)
    {
        this._dataOriginal = dataOriginal;
    } //-- void setDataOriginal(java.lang.String) 

    /**
     * Sets the value of field 'descEmpresa'.
     * 
     * @param descEmpresa the value of field 'descEmpresa'.
     */
    public void setDescEmpresa(java.lang.String descEmpresa)
    {
        this._descEmpresa = descEmpresa;
    } //-- void setDescEmpresa(java.lang.String) 

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
     * Sets the value of field 'descProduto'.
     * 
     * @param descProduto the value of field 'descProduto'.
     */
    public void setDescProduto(java.lang.String descProduto)
    {
        this._descProduto = descProduto;
    } //-- void setDescProduto(java.lang.String) 

    /**
     * Sets the value of field 'descStatus'.
     * 
     * @param descStatus the value of field 'descStatus'.
     */
    public void setDescStatus(java.lang.String descStatus)
    {
        this._descStatus = descStatus;
    } //-- void setDescStatus(java.lang.String) 

    /**
     * Sets the value of field 'descTipoCredito'.
     * 
     * @param descTipoCredito the value of field 'descTipoCredito'.
     */
    public void setDescTipoCredito(java.lang.String descTipoCredito)
    {
        this._descTipoCredito = descTipoCredito;
    } //-- void setDescTipoCredito(java.lang.String) 

    /**
     * Sets the value of field 'digitoConta'.
     * 
     * @param digitoConta the value of field 'digitoConta'.
     */
    public void setDigitoConta(java.lang.String digitoConta)
    {
        this._digitoConta = digitoConta;
    } //-- void setDigitoConta(java.lang.String) 

    /**
     * Sets the value of field 'elegivelPgto'.
     * 
     * @param elegivelPgto the value of field 'elegivelPgto'.
     */
    public void setElegivelPgto(java.lang.String elegivelPgto)
    {
        this._elegivelPgto = elegivelPgto;
    } //-- void setElegivelPgto(java.lang.String) 

    /**
     * Sets the value of field 'numConta'.
     * 
     * @param numConta the value of field 'numConta'.
     */
    public void setNumConta(long numConta)
    {
        this._numConta = numConta;
        this._has_numConta = true;
    } //-- void setNumConta(long) 

    /**
     * Sets the value of field 'percentualAtualizacaoMonetaria'.
     * 
     * @param percentualAtualizacaoMonetaria the value of field
     * 'percentualAtualizacaoMonetaria'.
     */
    public void setPercentualAtualizacaoMonetaria(java.math.BigDecimal percentualAtualizacaoMonetaria)
    {
        this._percentualAtualizacaoMonetaria = percentualAtualizacaoMonetaria;
    } //-- void setPercentualAtualizacaoMonetaria(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorAtualizacaoMonetaria'.
     * 
     * @param valorAtualizacaoMonetaria the value of field
     * 'valorAtualizacaoMonetaria'.
     */
    public void setValorAtualizacaoMonetaria(java.math.BigDecimal valorAtualizacaoMonetaria)
    {
        this._valorAtualizacaoMonetaria = valorAtualizacaoMonetaria;
    } //-- void setValorAtualizacaoMonetaria(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorMulta'.
     * 
     * @param valorMulta the value of field 'valorMulta'.
     */
    public void setValorMulta(java.math.BigDecimal valorMulta)
    {
        this._valorMulta = valorMulta;
    } //-- void setValorMulta(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorPagamentoAtualizado'.
     * 
     * @param valorPagamentoAtualizado the value of field
     * 'valorPagamentoAtualizado'.
     */
    public void setValorPagamentoAtualizado(java.math.BigDecimal valorPagamentoAtualizado)
    {
        this._valorPagamentoAtualizado = valorPagamentoAtualizado;
    } //-- void setValorPagamentoAtualizado(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalApuracaoIss'.
     * 
     * @param valorTotalApuracaoIss the value of field
     * 'valorTotalApuracaoIss'.
     */
    public void setValorTotalApuracaoIss(java.math.BigDecimal valorTotalApuracaoIss)
    {
        this._valorTotalApuracaoIss = valorTotalApuracaoIss;
    } //-- void setValorTotalApuracaoIss(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaCalculo
     */
    public static br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo unmarshal(java.io.Reader) 

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
