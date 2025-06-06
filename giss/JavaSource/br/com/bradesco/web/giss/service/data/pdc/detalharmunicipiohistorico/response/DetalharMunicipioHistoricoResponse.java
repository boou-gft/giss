/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.response;

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
 * Class DetalharMunicipioHistoricoResponse.
 * 
 * @version $Revision$ $Date$
 */
public class DetalharMunicipioHistoricoResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

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
     * Field _siglaUf
     */
    private java.lang.String _siglaUf;

    /**
     * Field _descEstado
     */
    private java.lang.String _descEstado;

    /**
     * Field _codBanco
     */
    private int _codBanco = 0;

    /**
     * keeps track of state for field: _codBanco
     */
    private boolean _has_codBanco;

    /**
     * Field _codAgencia
     */
    private int _codAgencia = 0;

    /**
     * keeps track of state for field: _codAgencia
     */
    private boolean _has_codAgencia;

    /**
     * Field _conta
     */
    private long _conta = 0;

    /**
     * keeps track of state for field: _conta
     */
    private boolean _has_conta;

    /**
     * Field _digitoConta
     */
    private java.lang.String _digitoConta;

    /**
     * Field _cnpjBase
     */
    private long _cnpjBase = 0;

    /**
     * keeps track of state for field: _cnpjBase
     */
    private boolean _has_cnpjBase;

    /**
     * Field _cnpjFilial
     */
    private int _cnpjFilial = 0;

    /**
     * keeps track of state for field: _cnpjFilial
     */
    private boolean _has_cnpjFilial;

    /**
     * Field _cnpjControle
     */
    private int _cnpjControle = 0;

    /**
     * keeps track of state for field: _cnpjControle
     */
    private boolean _has_cnpjControle;

    /**
     * Field _aliquota
     */
    private java.math.BigDecimal _aliquota = new java.math.BigDecimal("0");

    /**
     * Field _diaRecolhimento
     */
    private int _diaRecolhimento = 0;

    /**
     * keeps track of state for field: _diaRecolhimento
     */
    private boolean _has_diaRecolhimento;

    /**
     * Field _indicadorDiaUtil
     */
    private java.lang.String _indicadorDiaUtil;

    /**
     * Field _regraDiaNaoUtil
     */
    private java.lang.String _regraDiaNaoUtil;

    /**
     * Field _status
     */
    private java.lang.String _status;

    /**
     * Field _indicadorPagamento
     */
    private java.lang.String _indicadorPagamento;

    /**
     * Field _manutencao
     */
    private java.lang.String _manutencao;

    /**
     * Field _codUsuarioManutencao
     */
    private java.lang.String _codUsuarioManutencao;

    /**
     * Field _codBancoAnterior
     */
    private int _codBancoAnterior = 0;

    /**
     * keeps track of state for field: _codBancoAnterior
     */
    private boolean _has_codBancoAnterior;

    /**
     * Field _codAgenciaAnterior
     */
    private int _codAgenciaAnterior = 0;

    /**
     * keeps track of state for field: _codAgenciaAnterior
     */
    private boolean _has_codAgenciaAnterior;

    /**
     * Field _contaAnterior
     */
    private long _contaAnterior = 0;

    /**
     * keeps track of state for field: _contaAnterior
     */
    private boolean _has_contaAnterior;

    /**
     * Field _digitoContaAnterior
     */
    private java.lang.String _digitoContaAnterior;

    /**
     * Field _cnpjBaseAnterior
     */
    private long _cnpjBaseAnterior = 0;

    /**
     * keeps track of state for field: _cnpjBaseAnterior
     */
    private boolean _has_cnpjBaseAnterior;

    /**
     * Field _cnpjFilialAnterior
     */
    private int _cnpjFilialAnterior = 0;

    /**
     * keeps track of state for field: _cnpjFilialAnterior
     */
    private boolean _has_cnpjFilialAnterior;

    /**
     * Field _cnpjControleAnterior
     */
    private int _cnpjControleAnterior = 0;

    /**
     * keeps track of state for field: _cnpjControleAnterior
     */
    private boolean _has_cnpjControleAnterior;

    /**
     * Field _aliquotaAnterior
     */
    private java.math.BigDecimal _aliquotaAnterior = new java.math.BigDecimal("0");

    /**
     * Field _diaRecolhimentoAnterior
     */
    private int _diaRecolhimentoAnterior = 0;

    /**
     * keeps track of state for field: _diaRecolhimentoAnterior
     */
    private boolean _has_diaRecolhimentoAnterior;

    /**
     * Field _indicadorDiaUtilAnterior
     */
    private java.lang.String _indicadorDiaUtilAnterior;

    /**
     * Field _regraDiaNaoUtilAnterior
     */
    private java.lang.String _regraDiaNaoUtilAnterior;

    /**
     * Field _statusAnterior
     */
    private java.lang.String _statusAnterior;

    /**
     * Field _indicadorPagamentoAnterior
     */
    private java.lang.String _indicadorPagamentoAnterior;

    /**
     * Field _manutencaoAnterior
     */
    private java.lang.String _manutencaoAnterior;

    /**
     * Field _codUsuarioManutencaoAnterior
     */
    private java.lang.String _codUsuarioManutencaoAnterior;


      //----------------/
     //- Constructors -/
    //----------------/

    public DetalharMunicipioHistoricoResponse() 
     {
        super();
        setAliquota(new java.math.BigDecimal("0"));
        setAliquotaAnterior(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.response.DetalharMunicipioHistoricoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCnpjBase
     * 
     */
    public void deleteCnpjBase()
    {
        this._has_cnpjBase= false;
    } //-- void deleteCnpjBase() 

    /**
     * Method deleteCnpjBaseAnterior
     * 
     */
    public void deleteCnpjBaseAnterior()
    {
        this._has_cnpjBaseAnterior= false;
    } //-- void deleteCnpjBaseAnterior() 

    /**
     * Method deleteCnpjControle
     * 
     */
    public void deleteCnpjControle()
    {
        this._has_cnpjControle= false;
    } //-- void deleteCnpjControle() 

    /**
     * Method deleteCnpjControleAnterior
     * 
     */
    public void deleteCnpjControleAnterior()
    {
        this._has_cnpjControleAnterior= false;
    } //-- void deleteCnpjControleAnterior() 

    /**
     * Method deleteCnpjFilial
     * 
     */
    public void deleteCnpjFilial()
    {
        this._has_cnpjFilial= false;
    } //-- void deleteCnpjFilial() 

    /**
     * Method deleteCnpjFilialAnterior
     * 
     */
    public void deleteCnpjFilialAnterior()
    {
        this._has_cnpjFilialAnterior= false;
    } //-- void deleteCnpjFilialAnterior() 

    /**
     * Method deleteCodAgencia
     * 
     */
    public void deleteCodAgencia()
    {
        this._has_codAgencia= false;
    } //-- void deleteCodAgencia() 

    /**
     * Method deleteCodAgenciaAnterior
     * 
     */
    public void deleteCodAgenciaAnterior()
    {
        this._has_codAgenciaAnterior= false;
    } //-- void deleteCodAgenciaAnterior() 

    /**
     * Method deleteCodBanco
     * 
     */
    public void deleteCodBanco()
    {
        this._has_codBanco= false;
    } //-- void deleteCodBanco() 

    /**
     * Method deleteCodBancoAnterior
     * 
     */
    public void deleteCodBancoAnterior()
    {
        this._has_codBancoAnterior= false;
    } //-- void deleteCodBancoAnterior() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteConta
     * 
     */
    public void deleteConta()
    {
        this._has_conta= false;
    } //-- void deleteConta() 

    /**
     * Method deleteContaAnterior
     * 
     */
    public void deleteContaAnterior()
    {
        this._has_contaAnterior= false;
    } //-- void deleteContaAnterior() 

    /**
     * Method deleteDiaRecolhimento
     * 
     */
    public void deleteDiaRecolhimento()
    {
        this._has_diaRecolhimento= false;
    } //-- void deleteDiaRecolhimento() 

    /**
     * Method deleteDiaRecolhimentoAnterior
     * 
     */
    public void deleteDiaRecolhimentoAnterior()
    {
        this._has_diaRecolhimentoAnterior= false;
    } //-- void deleteDiaRecolhimentoAnterior() 

    /**
     * Returns the value of field 'aliquota'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquota'.
     */
    public java.math.BigDecimal getAliquota()
    {
        return this._aliquota;
    } //-- java.math.BigDecimal getAliquota() 

    /**
     * Returns the value of field 'aliquotaAnterior'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquotaAnterior'.
     */
    public java.math.BigDecimal getAliquotaAnterior()
    {
        return this._aliquotaAnterior;
    } //-- java.math.BigDecimal getAliquotaAnterior() 

    /**
     * Returns the value of field 'cnpjBase'.
     * 
     * @return long
     * @return the value of field 'cnpjBase'.
     */
    public long getCnpjBase()
    {
        return this._cnpjBase;
    } //-- long getCnpjBase() 

    /**
     * Returns the value of field 'cnpjBaseAnterior'.
     * 
     * @return long
     * @return the value of field 'cnpjBaseAnterior'.
     */
    public long getCnpjBaseAnterior()
    {
        return this._cnpjBaseAnterior;
    } //-- long getCnpjBaseAnterior() 

    /**
     * Returns the value of field 'cnpjControle'.
     * 
     * @return int
     * @return the value of field 'cnpjControle'.
     */
    public int getCnpjControle()
    {
        return this._cnpjControle;
    } //-- int getCnpjControle() 

    /**
     * Returns the value of field 'cnpjControleAnterior'.
     * 
     * @return int
     * @return the value of field 'cnpjControleAnterior'.
     */
    public int getCnpjControleAnterior()
    {
        return this._cnpjControleAnterior;
    } //-- int getCnpjControleAnterior() 

    /**
     * Returns the value of field 'cnpjFilial'.
     * 
     * @return int
     * @return the value of field 'cnpjFilial'.
     */
    public int getCnpjFilial()
    {
        return this._cnpjFilial;
    } //-- int getCnpjFilial() 

    /**
     * Returns the value of field 'cnpjFilialAnterior'.
     * 
     * @return int
     * @return the value of field 'cnpjFilialAnterior'.
     */
    public int getCnpjFilialAnterior()
    {
        return this._cnpjFilialAnterior;
    } //-- int getCnpjFilialAnterior() 

    /**
     * Returns the value of field 'codAgencia'.
     * 
     * @return int
     * @return the value of field 'codAgencia'.
     */
    public int getCodAgencia()
    {
        return this._codAgencia;
    } //-- int getCodAgencia() 

    /**
     * Returns the value of field 'codAgenciaAnterior'.
     * 
     * @return int
     * @return the value of field 'codAgenciaAnterior'.
     */
    public int getCodAgenciaAnterior()
    {
        return this._codAgenciaAnterior;
    } //-- int getCodAgenciaAnterior() 

    /**
     * Returns the value of field 'codBanco'.
     * 
     * @return int
     * @return the value of field 'codBanco'.
     */
    public int getCodBanco()
    {
        return this._codBanco;
    } //-- int getCodBanco() 

    /**
     * Returns the value of field 'codBancoAnterior'.
     * 
     * @return int
     * @return the value of field 'codBancoAnterior'.
     */
    public int getCodBancoAnterior()
    {
        return this._codBancoAnterior;
    } //-- int getCodBancoAnterior() 

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

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
     * Returns the value of field 'codUsuarioManutencao'.
     * 
     * @return String
     * @return the value of field 'codUsuarioManutencao'.
     */
    public java.lang.String getCodUsuarioManutencao()
    {
        return this._codUsuarioManutencao;
    } //-- java.lang.String getCodUsuarioManutencao() 

    /**
     * Returns the value of field 'codUsuarioManutencaoAnterior'.
     * 
     * @return String
     * @return the value of field 'codUsuarioManutencaoAnterior'.
     */
    public java.lang.String getCodUsuarioManutencaoAnterior()
    {
        return this._codUsuarioManutencaoAnterior;
    } //-- java.lang.String getCodUsuarioManutencaoAnterior() 

    /**
     * Returns the value of field 'conta'.
     * 
     * @return long
     * @return the value of field 'conta'.
     */
    public long getConta()
    {
        return this._conta;
    } //-- long getConta() 

    /**
     * Returns the value of field 'contaAnterior'.
     * 
     * @return long
     * @return the value of field 'contaAnterior'.
     */
    public long getContaAnterior()
    {
        return this._contaAnterior;
    } //-- long getContaAnterior() 

    /**
     * Returns the value of field 'descEstado'.
     * 
     * @return String
     * @return the value of field 'descEstado'.
     */
    public java.lang.String getDescEstado()
    {
        return this._descEstado;
    } //-- java.lang.String getDescEstado() 

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
     * Returns the value of field 'diaRecolhimento'.
     * 
     * @return int
     * @return the value of field 'diaRecolhimento'.
     */
    public int getDiaRecolhimento()
    {
        return this._diaRecolhimento;
    } //-- int getDiaRecolhimento() 

    /**
     * Returns the value of field 'diaRecolhimentoAnterior'.
     * 
     * @return int
     * @return the value of field 'diaRecolhimentoAnterior'.
     */
    public int getDiaRecolhimentoAnterior()
    {
        return this._diaRecolhimentoAnterior;
    } //-- int getDiaRecolhimentoAnterior() 

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
     * Returns the value of field 'digitoContaAnterior'.
     * 
     * @return String
     * @return the value of field 'digitoContaAnterior'.
     */
    public java.lang.String getDigitoContaAnterior()
    {
        return this._digitoContaAnterior;
    } //-- java.lang.String getDigitoContaAnterior() 

    /**
     * Returns the value of field 'indicadorDiaUtil'.
     * 
     * @return String
     * @return the value of field 'indicadorDiaUtil'.
     */
    public java.lang.String getIndicadorDiaUtil()
    {
        return this._indicadorDiaUtil;
    } //-- java.lang.String getIndicadorDiaUtil() 

    /**
     * Returns the value of field 'indicadorDiaUtilAnterior'.
     * 
     * @return String
     * @return the value of field 'indicadorDiaUtilAnterior'.
     */
    public java.lang.String getIndicadorDiaUtilAnterior()
    {
        return this._indicadorDiaUtilAnterior;
    } //-- java.lang.String getIndicadorDiaUtilAnterior() 

    /**
     * Returns the value of field 'indicadorPagamento'.
     * 
     * @return String
     * @return the value of field 'indicadorPagamento'.
     */
    public java.lang.String getIndicadorPagamento()
    {
        return this._indicadorPagamento;
    } //-- java.lang.String getIndicadorPagamento() 

    /**
     * Returns the value of field 'indicadorPagamentoAnterior'.
     * 
     * @return String
     * @return the value of field 'indicadorPagamentoAnterior'.
     */
    public java.lang.String getIndicadorPagamentoAnterior()
    {
        return this._indicadorPagamentoAnterior;
    } //-- java.lang.String getIndicadorPagamentoAnterior() 

    /**
     * Returns the value of field 'manutencao'.
     * 
     * @return String
     * @return the value of field 'manutencao'.
     */
    public java.lang.String getManutencao()
    {
        return this._manutencao;
    } //-- java.lang.String getManutencao() 

    /**
     * Returns the value of field 'manutencaoAnterior'.
     * 
     * @return String
     * @return the value of field 'manutencaoAnterior'.
     */
    public java.lang.String getManutencaoAnterior()
    {
        return this._manutencaoAnterior;
    } //-- java.lang.String getManutencaoAnterior() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Returns the value of field 'regraDiaNaoUtil'.
     * 
     * @return String
     * @return the value of field 'regraDiaNaoUtil'.
     */
    public java.lang.String getRegraDiaNaoUtil()
    {
        return this._regraDiaNaoUtil;
    } //-- java.lang.String getRegraDiaNaoUtil() 

    /**
     * Returns the value of field 'regraDiaNaoUtilAnterior'.
     * 
     * @return String
     * @return the value of field 'regraDiaNaoUtilAnterior'.
     */
    public java.lang.String getRegraDiaNaoUtilAnterior()
    {
        return this._regraDiaNaoUtilAnterior;
    } //-- java.lang.String getRegraDiaNaoUtilAnterior() 

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
     * Returns the value of field 'status'.
     * 
     * @return String
     * @return the value of field 'status'.
     */
    public java.lang.String getStatus()
    {
        return this._status;
    } //-- java.lang.String getStatus() 

    /**
     * Returns the value of field 'statusAnterior'.
     * 
     * @return String
     * @return the value of field 'statusAnterior'.
     */
    public java.lang.String getStatusAnterior()
    {
        return this._statusAnterior;
    } //-- java.lang.String getStatusAnterior() 

    /**
     * Method hasCnpjBase
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjBase()
    {
        return this._has_cnpjBase;
    } //-- boolean hasCnpjBase() 

    /**
     * Method hasCnpjBaseAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjBaseAnterior()
    {
        return this._has_cnpjBaseAnterior;
    } //-- boolean hasCnpjBaseAnterior() 

    /**
     * Method hasCnpjControle
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjControle()
    {
        return this._has_cnpjControle;
    } //-- boolean hasCnpjControle() 

    /**
     * Method hasCnpjControleAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjControleAnterior()
    {
        return this._has_cnpjControleAnterior;
    } //-- boolean hasCnpjControleAnterior() 

    /**
     * Method hasCnpjFilial
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjFilial()
    {
        return this._has_cnpjFilial;
    } //-- boolean hasCnpjFilial() 

    /**
     * Method hasCnpjFilialAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjFilialAnterior()
    {
        return this._has_cnpjFilialAnterior;
    } //-- boolean hasCnpjFilialAnterior() 

    /**
     * Method hasCodAgencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodAgencia()
    {
        return this._has_codAgencia;
    } //-- boolean hasCodAgencia() 

    /**
     * Method hasCodAgenciaAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodAgenciaAnterior()
    {
        return this._has_codAgenciaAnterior;
    } //-- boolean hasCodAgenciaAnterior() 

    /**
     * Method hasCodBanco
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodBanco()
    {
        return this._has_codBanco;
    } //-- boolean hasCodBanco() 

    /**
     * Method hasCodBancoAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodBancoAnterior()
    {
        return this._has_codBancoAnterior;
    } //-- boolean hasCodBancoAnterior() 

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
     * Method hasConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasConta()
    {
        return this._has_conta;
    } //-- boolean hasConta() 

    /**
     * Method hasContaAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasContaAnterior()
    {
        return this._has_contaAnterior;
    } //-- boolean hasContaAnterior() 

    /**
     * Method hasDiaRecolhimento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDiaRecolhimento()
    {
        return this._has_diaRecolhimento;
    } //-- boolean hasDiaRecolhimento() 

    /**
     * Method hasDiaRecolhimentoAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDiaRecolhimentoAnterior()
    {
        return this._has_diaRecolhimentoAnterior;
    } //-- boolean hasDiaRecolhimentoAnterior() 

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
     * Sets the value of field 'aliquota'.
     * 
     * @param aliquota the value of field 'aliquota'.
     */
    public void setAliquota(java.math.BigDecimal aliquota)
    {
        this._aliquota = aliquota;
    } //-- void setAliquota(java.math.BigDecimal) 

    /**
     * Sets the value of field 'aliquotaAnterior'.
     * 
     * @param aliquotaAnterior the value of field 'aliquotaAnterior'
     */
    public void setAliquotaAnterior(java.math.BigDecimal aliquotaAnterior)
    {
        this._aliquotaAnterior = aliquotaAnterior;
    } //-- void setAliquotaAnterior(java.math.BigDecimal) 

    /**
     * Sets the value of field 'cnpjBase'.
     * 
     * @param cnpjBase the value of field 'cnpjBase'.
     */
    public void setCnpjBase(long cnpjBase)
    {
        this._cnpjBase = cnpjBase;
        this._has_cnpjBase = true;
    } //-- void setCnpjBase(long) 

    /**
     * Sets the value of field 'cnpjBaseAnterior'.
     * 
     * @param cnpjBaseAnterior the value of field 'cnpjBaseAnterior'
     */
    public void setCnpjBaseAnterior(long cnpjBaseAnterior)
    {
        this._cnpjBaseAnterior = cnpjBaseAnterior;
        this._has_cnpjBaseAnterior = true;
    } //-- void setCnpjBaseAnterior(long) 

    /**
     * Sets the value of field 'cnpjControle'.
     * 
     * @param cnpjControle the value of field 'cnpjControle'.
     */
    public void setCnpjControle(int cnpjControle)
    {
        this._cnpjControle = cnpjControle;
        this._has_cnpjControle = true;
    } //-- void setCnpjControle(int) 

    /**
     * Sets the value of field 'cnpjControleAnterior'.
     * 
     * @param cnpjControleAnterior the value of field
     * 'cnpjControleAnterior'.
     */
    public void setCnpjControleAnterior(int cnpjControleAnterior)
    {
        this._cnpjControleAnterior = cnpjControleAnterior;
        this._has_cnpjControleAnterior = true;
    } //-- void setCnpjControleAnterior(int) 

    /**
     * Sets the value of field 'cnpjFilial'.
     * 
     * @param cnpjFilial the value of field 'cnpjFilial'.
     */
    public void setCnpjFilial(int cnpjFilial)
    {
        this._cnpjFilial = cnpjFilial;
        this._has_cnpjFilial = true;
    } //-- void setCnpjFilial(int) 

    /**
     * Sets the value of field 'cnpjFilialAnterior'.
     * 
     * @param cnpjFilialAnterior the value of field
     * 'cnpjFilialAnterior'.
     */
    public void setCnpjFilialAnterior(int cnpjFilialAnterior)
    {
        this._cnpjFilialAnterior = cnpjFilialAnterior;
        this._has_cnpjFilialAnterior = true;
    } //-- void setCnpjFilialAnterior(int) 

    /**
     * Sets the value of field 'codAgencia'.
     * 
     * @param codAgencia the value of field 'codAgencia'.
     */
    public void setCodAgencia(int codAgencia)
    {
        this._codAgencia = codAgencia;
        this._has_codAgencia = true;
    } //-- void setCodAgencia(int) 

    /**
     * Sets the value of field 'codAgenciaAnterior'.
     * 
     * @param codAgenciaAnterior the value of field
     * 'codAgenciaAnterior'.
     */
    public void setCodAgenciaAnterior(int codAgenciaAnterior)
    {
        this._codAgenciaAnterior = codAgenciaAnterior;
        this._has_codAgenciaAnterior = true;
    } //-- void setCodAgenciaAnterior(int) 

    /**
     * Sets the value of field 'codBanco'.
     * 
     * @param codBanco the value of field 'codBanco'.
     */
    public void setCodBanco(int codBanco)
    {
        this._codBanco = codBanco;
        this._has_codBanco = true;
    } //-- void setCodBanco(int) 

    /**
     * Sets the value of field 'codBancoAnterior'.
     * 
     * @param codBancoAnterior the value of field 'codBancoAnterior'
     */
    public void setCodBancoAnterior(int codBancoAnterior)
    {
        this._codBancoAnterior = codBancoAnterior;
        this._has_codBancoAnterior = true;
    } //-- void setCodBancoAnterior(int) 

    /**
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

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
     * Sets the value of field 'codUsuarioManutencao'.
     * 
     * @param codUsuarioManutencao the value of field
     * 'codUsuarioManutencao'.
     */
    public void setCodUsuarioManutencao(java.lang.String codUsuarioManutencao)
    {
        this._codUsuarioManutencao = codUsuarioManutencao;
    } //-- void setCodUsuarioManutencao(java.lang.String) 

    /**
     * Sets the value of field 'codUsuarioManutencaoAnterior'.
     * 
     * @param codUsuarioManutencaoAnterior the value of field
     * 'codUsuarioManutencaoAnterior'.
     */
    public void setCodUsuarioManutencaoAnterior(java.lang.String codUsuarioManutencaoAnterior)
    {
        this._codUsuarioManutencaoAnterior = codUsuarioManutencaoAnterior;
    } //-- void setCodUsuarioManutencaoAnterior(java.lang.String) 

    /**
     * Sets the value of field 'conta'.
     * 
     * @param conta the value of field 'conta'.
     */
    public void setConta(long conta)
    {
        this._conta = conta;
        this._has_conta = true;
    } //-- void setConta(long) 

    /**
     * Sets the value of field 'contaAnterior'.
     * 
     * @param contaAnterior the value of field 'contaAnterior'.
     */
    public void setContaAnterior(long contaAnterior)
    {
        this._contaAnterior = contaAnterior;
        this._has_contaAnterior = true;
    } //-- void setContaAnterior(long) 

    /**
     * Sets the value of field 'descEstado'.
     * 
     * @param descEstado the value of field 'descEstado'.
     */
    public void setDescEstado(java.lang.String descEstado)
    {
        this._descEstado = descEstado;
    } //-- void setDescEstado(java.lang.String) 

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
     * Sets the value of field 'diaRecolhimento'.
     * 
     * @param diaRecolhimento the value of field 'diaRecolhimento'.
     */
    public void setDiaRecolhimento(int diaRecolhimento)
    {
        this._diaRecolhimento = diaRecolhimento;
        this._has_diaRecolhimento = true;
    } //-- void setDiaRecolhimento(int) 

    /**
     * Sets the value of field 'diaRecolhimentoAnterior'.
     * 
     * @param diaRecolhimentoAnterior the value of field
     * 'diaRecolhimentoAnterior'.
     */
    public void setDiaRecolhimentoAnterior(int diaRecolhimentoAnterior)
    {
        this._diaRecolhimentoAnterior = diaRecolhimentoAnterior;
        this._has_diaRecolhimentoAnterior = true;
    } //-- void setDiaRecolhimentoAnterior(int) 

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
     * Sets the value of field 'digitoContaAnterior'.
     * 
     * @param digitoContaAnterior the value of field
     * 'digitoContaAnterior'.
     */
    public void setDigitoContaAnterior(java.lang.String digitoContaAnterior)
    {
        this._digitoContaAnterior = digitoContaAnterior;
    } //-- void setDigitoContaAnterior(java.lang.String) 

    /**
     * Sets the value of field 'indicadorDiaUtil'.
     * 
     * @param indicadorDiaUtil the value of field 'indicadorDiaUtil'
     */
    public void setIndicadorDiaUtil(java.lang.String indicadorDiaUtil)
    {
        this._indicadorDiaUtil = indicadorDiaUtil;
    } //-- void setIndicadorDiaUtil(java.lang.String) 

    /**
     * Sets the value of field 'indicadorDiaUtilAnterior'.
     * 
     * @param indicadorDiaUtilAnterior the value of field
     * 'indicadorDiaUtilAnterior'.
     */
    public void setIndicadorDiaUtilAnterior(java.lang.String indicadorDiaUtilAnterior)
    {
        this._indicadorDiaUtilAnterior = indicadorDiaUtilAnterior;
    } //-- void setIndicadorDiaUtilAnterior(java.lang.String) 

    /**
     * Sets the value of field 'indicadorPagamento'.
     * 
     * @param indicadorPagamento the value of field
     * 'indicadorPagamento'.
     */
    public void setIndicadorPagamento(java.lang.String indicadorPagamento)
    {
        this._indicadorPagamento = indicadorPagamento;
    } //-- void setIndicadorPagamento(java.lang.String) 

    /**
     * Sets the value of field 'indicadorPagamentoAnterior'.
     * 
     * @param indicadorPagamentoAnterior the value of field
     * 'indicadorPagamentoAnterior'.
     */
    public void setIndicadorPagamentoAnterior(java.lang.String indicadorPagamentoAnterior)
    {
        this._indicadorPagamentoAnterior = indicadorPagamentoAnterior;
    } //-- void setIndicadorPagamentoAnterior(java.lang.String) 

    /**
     * Sets the value of field 'manutencao'.
     * 
     * @param manutencao the value of field 'manutencao'.
     */
    public void setManutencao(java.lang.String manutencao)
    {
        this._manutencao = manutencao;
    } //-- void setManutencao(java.lang.String) 

    /**
     * Sets the value of field 'manutencaoAnterior'.
     * 
     * @param manutencaoAnterior the value of field
     * 'manutencaoAnterior'.
     */
    public void setManutencaoAnterior(java.lang.String manutencaoAnterior)
    {
        this._manutencaoAnterior = manutencaoAnterior;
    } //-- void setManutencaoAnterior(java.lang.String) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field 'regraDiaNaoUtil'.
     * 
     * @param regraDiaNaoUtil the value of field 'regraDiaNaoUtil'.
     */
    public void setRegraDiaNaoUtil(java.lang.String regraDiaNaoUtil)
    {
        this._regraDiaNaoUtil = regraDiaNaoUtil;
    } //-- void setRegraDiaNaoUtil(java.lang.String) 

    /**
     * Sets the value of field 'regraDiaNaoUtilAnterior'.
     * 
     * @param regraDiaNaoUtilAnterior the value of field
     * 'regraDiaNaoUtilAnterior'.
     */
    public void setRegraDiaNaoUtilAnterior(java.lang.String regraDiaNaoUtilAnterior)
    {
        this._regraDiaNaoUtilAnterior = regraDiaNaoUtilAnterior;
    } //-- void setRegraDiaNaoUtilAnterior(java.lang.String) 

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
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(java.lang.String status)
    {
        this._status = status;
    } //-- void setStatus(java.lang.String) 

    /**
     * Sets the value of field 'statusAnterior'.
     * 
     * @param statusAnterior the value of field 'statusAnterior'.
     */
    public void setStatusAnterior(java.lang.String statusAnterior)
    {
        this._statusAnterior = statusAnterior;
    } //-- void setStatusAnterior(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return DetalharMunicipioHistoricoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.response.DetalharMunicipioHistoricoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.response.DetalharMunicipioHistoricoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.response.DetalharMunicipioHistoricoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.response.DetalharMunicipioHistoricoResponse unmarshal(java.io.Reader) 

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
