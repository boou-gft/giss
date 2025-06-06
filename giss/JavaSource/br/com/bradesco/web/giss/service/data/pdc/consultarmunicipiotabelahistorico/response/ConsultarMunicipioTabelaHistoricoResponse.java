/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarMunicipioTabelaHistoricoResponse.java,v 1.4 2018/04/06 14:20:40 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.response;

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
 * Class ConsultarMunicipioTabelaHistoricoResponse.
 * 
 * @version $Revision: 1.4 $ $Date: 2018/04/06 14:20:40 $
 */
public class ConsultarMunicipioTabelaHistoricoResponse implements java.io.Serializable {


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
     * Field _percentualAliquotaMunicipio
     */
    private java.math.BigDecimal _percentualAliquotaMunicipio = new java.math.BigDecimal("0");

    /**
     * Field _diaVencimento
     */
    private int _diaVencimento = 0;

    /**
     * keeps track of state for field: _diaVencimento
     */
    private boolean _has_diaVencimento;

    /**
     * Field _diaVencimentoAnt
     */
    private int _diaVencimentoAnt = 0;

    /**
     * keeps track of state for field: _diaVencimentoAnt
     */
    private boolean _has_diaVencimentoAnt;

    /**
     * Field _pagamentoDiaUtil
     */
    private java.lang.String _pagamentoDiaUtil;

    /**
     * Field _pagamentoDiaUtilAnt
     */
    private java.lang.String _pagamentoDiaUtilAnt;

    /**
     * Field _formaPagamento
     */
    private int _formaPagamento = 0;

    /**
     * keeps track of state for field: _formaPagamento
     */
    private boolean _has_formaPagamento;

    /**
     * Field _formaPagamentoAnt
     */
    private int _formaPagamentoAnt = 0;

    /**
     * keeps track of state for field: _formaPagamentoAnt
     */
    private boolean _has_formaPagamentoAnt;

    /**
     * Field _percentBaseCalculo
     */
    private java.math.BigDecimal _percentBaseCalculo = new java.math.BigDecimal("0");

    /**
     * Field _percentBaseCalculoAnt
     */
    private java.math.BigDecimal _percentBaseCalculoAnt = new java.math.BigDecimal("0");

    /**
     * Field _percentAliquotaPadrao
     */
    private java.math.BigDecimal _percentAliquotaPadrao = new java.math.BigDecimal("0");

    /**
     * Field _percentAliquotaPadraoAnt
     */
    private java.math.BigDecimal _percentAliquotaPadraoAnt = new java.math.BigDecimal("0");

    /**
     * Field _codigoTipoIncidencia
     */
    private int _codigoTipoIncidencia = 0;

    /**
     * keeps track of state for field: _codigoTipoIncidencia
     */
    private boolean _has_codigoTipoIncidencia;

    /**
     * Field _codigoTipoIncidenciaAnt
     */
    private int _codigoTipoIncidenciaAnt = 0;

    /**
     * keeps track of state for field: _codigoTipoIncidenciaAnt
     */
    private boolean _has_codigoTipoIncidenciaAnt;

    /**
     * Field _nomeIncidencia
     */
    private java.lang.String _nomeIncidencia;

    /**
     * Field _nomeIncidenciaAnt
     */
    private java.lang.String _nomeIncidenciaAnt;

    /**
     * Field _nomeEstadoResponsavel
     */
    private java.lang.String _nomeEstadoResponsavel;

    /**
     * Field _codigoUorgResponsavel
     */
    private int _codigoUorgResponsavel = 0;

    /**
     * keeps track of state for field: _codigoUorgResponsavel
     */
    private boolean _has_codigoUorgResponsavel;

    /**
     * Field _codigoUorgResponsavelAnt
     */
    private int _codigoUorgResponsavelAnt = 0;

    /**
     * keeps track of state for field: _codigoUorgResponsavelAnt
     */
    private boolean _has_codigoUorgResponsavelAnt;

    /**
     * Field _nomeUorgResponsavel
     */
    private java.lang.String _nomeUorgResponsavel;

    /**
     * Field _nomeUorgResponsavelAnt
     */
    private java.lang.String _nomeUorgResponsavelAnt;

    /**
     * Field _indiceVigencia
     */
    private java.lang.String _indiceVigencia;

    /**
     * Field _estadoCentralizador
     */
    private java.lang.String _estadoCentralizador;

    /**
     * Field _estadoCentralizadorAnt
     */
    private java.lang.String _estadoCentralizadorAnt;

    /**
     * Field _codigoMunicipioCentralizador
     */
    private long _codigoMunicipioCentralizador = 0;

    /**
     * keeps track of state for field: _codigoMunicipioCentralizador
     */
    private boolean _has_codigoMunicipioCentralizador;

    /**
     * Field _codigoMunicipioCentralizadorAnt
     */
    private long _codigoMunicipioCentralizadorAnt = 0;

    /**
     * keeps track of state for field:
     * _codigoMunicipioCentralizadorAnt
     */
    private boolean _has_codigoMunicipioCentralizadorAnt;

    /**
     * Field _descricaoMunicipioCentralizador
     */
    private java.lang.String _descricaoMunicipioCentralizador;

    /**
     * Field _descricaoMunicipioCentralizadorAnt
     */
    private java.lang.String _descricaoMunicipioCentralizadorAnt;

    /**
     * Field _codigoLeiVigente
     */
    private int _codigoLeiVigente = 0;

    /**
     * keeps track of state for field: _codigoLeiVigente
     */
    private boolean _has_codigoLeiVigente;

    /**
     * Field _codigoLeiVigenteAnt
     */
    private int _codigoLeiVigenteAnt = 0;

    /**
     * keeps track of state for field: _codigoLeiVigenteAnt
     */
    private boolean _has_codigoLeiVigenteAnt;

    /**
     * Field _descLeiVigente
     */
    private java.lang.String _descLeiVigente;

    /**
     * Field _descLeiVigenteAnt
     */
    private java.lang.String _descLeiVigenteAnt;

    /**
     * Field _informacaoComplementar
     */
    private java.lang.String _informacaoComplementar;

    /**
     * Field _informacaoComplementarAnt
     */
    private java.lang.String _informacaoComplementarAnt;

    /**
     * Field _saldoAlteracao
     */
    private int _saldoAlteracao = 0;

    /**
     * keeps track of state for field: _saldoAlteracao
     */
    private boolean _has_saldoAlteracao;

    /**
     * Field _saldoAnterior
     */
    private java.lang.String _saldoAnterior;

    /**
     * Field _saldoAtual
     */
    private java.lang.String _saldoAtual;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarMunicipioTabelaHistoricoResponse() 
     {
        super();
        setPercentualAliquotaMunicipio(new java.math.BigDecimal("0"));
        setPercentBaseCalculo(new java.math.BigDecimal("0"));
        setPercentBaseCalculoAnt(new java.math.BigDecimal("0"));
        setPercentAliquotaPadrao(new java.math.BigDecimal("0"));
        setPercentAliquotaPadraoAnt(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.response.ConsultarMunicipioTabelaHistoricoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoLeiVigente
     * 
     */
    public void deleteCodigoLeiVigente()
    {
        this._has_codigoLeiVigente= false;
    } //-- void deleteCodigoLeiVigente() 

    /**
     * Method deleteCodigoLeiVigenteAnt
     * 
     */
    public void deleteCodigoLeiVigenteAnt()
    {
        this._has_codigoLeiVigenteAnt= false;
    } //-- void deleteCodigoLeiVigenteAnt() 

    /**
     * Method deleteCodigoMunicipioCentralizador
     * 
     */
    public void deleteCodigoMunicipioCentralizador()
    {
        this._has_codigoMunicipioCentralizador= false;
    } //-- void deleteCodigoMunicipioCentralizador() 

    /**
     * Method deleteCodigoMunicipioCentralizadorAnt
     * 
     */
    public void deleteCodigoMunicipioCentralizadorAnt()
    {
        this._has_codigoMunicipioCentralizadorAnt= false;
    } //-- void deleteCodigoMunicipioCentralizadorAnt() 

    /**
     * Method deleteCodigoTipoIncidencia
     * 
     */
    public void deleteCodigoTipoIncidencia()
    {
        this._has_codigoTipoIncidencia= false;
    } //-- void deleteCodigoTipoIncidencia() 

    /**
     * Method deleteCodigoTipoIncidenciaAnt
     * 
     */
    public void deleteCodigoTipoIncidenciaAnt()
    {
        this._has_codigoTipoIncidenciaAnt= false;
    } //-- void deleteCodigoTipoIncidenciaAnt() 

    /**
     * Method deleteCodigoUorgResponsavel
     * 
     */
    public void deleteCodigoUorgResponsavel()
    {
        this._has_codigoUorgResponsavel= false;
    } //-- void deleteCodigoUorgResponsavel() 

    /**
     * Method deleteCodigoUorgResponsavelAnt
     * 
     */
    public void deleteCodigoUorgResponsavelAnt()
    {
        this._has_codigoUorgResponsavelAnt= false;
    } //-- void deleteCodigoUorgResponsavelAnt() 

    /**
     * Method deleteDiaVencimento
     * 
     */
    public void deleteDiaVencimento()
    {
        this._has_diaVencimento= false;
    } //-- void deleteDiaVencimento() 

    /**
     * Method deleteDiaVencimentoAnt
     * 
     */
    public void deleteDiaVencimentoAnt()
    {
        this._has_diaVencimentoAnt= false;
    } //-- void deleteDiaVencimentoAnt() 

    /**
     * Method deleteFormaPagamento
     * 
     */
    public void deleteFormaPagamento()
    {
        this._has_formaPagamento= false;
    } //-- void deleteFormaPagamento() 

    /**
     * Method deleteFormaPagamentoAnt
     * 
     */
    public void deleteFormaPagamentoAnt()
    {
        this._has_formaPagamentoAnt= false;
    } //-- void deleteFormaPagamentoAnt() 

    /**
     * Method deleteSaldoAlteracao
     * 
     */
    public void deleteSaldoAlteracao()
    {
        this._has_saldoAlteracao= false;
    } //-- void deleteSaldoAlteracao() 

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
     * Returns the value of field 'codigoLeiVigente'.
     * 
     * @return int
     * @return the value of field 'codigoLeiVigente'.
     */
    public int getCodigoLeiVigente()
    {
        return this._codigoLeiVigente;
    } //-- int getCodigoLeiVigente() 

    /**
     * Returns the value of field 'codigoLeiVigenteAnt'.
     * 
     * @return int
     * @return the value of field 'codigoLeiVigenteAnt'.
     */
    public int getCodigoLeiVigenteAnt()
    {
        return this._codigoLeiVigenteAnt;
    } //-- int getCodigoLeiVigenteAnt() 

    /**
     * Returns the value of field 'codigoMunicipioCentralizador'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipioCentralizador'.
     */
    public long getCodigoMunicipioCentralizador()
    {
        return this._codigoMunicipioCentralizador;
    } //-- long getCodigoMunicipioCentralizador() 

    /**
     * Returns the value of field
     * 'codigoMunicipioCentralizadorAnt'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipioCentralizadorAnt'.
     */
    public long getCodigoMunicipioCentralizadorAnt()
    {
        return this._codigoMunicipioCentralizadorAnt;
    } //-- long getCodigoMunicipioCentralizadorAnt() 

    /**
     * Returns the value of field 'codigoTipoIncidencia'.
     * 
     * @return int
     * @return the value of field 'codigoTipoIncidencia'.
     */
    public int getCodigoTipoIncidencia()
    {
        return this._codigoTipoIncidencia;
    } //-- int getCodigoTipoIncidencia() 

    /**
     * Returns the value of field 'codigoTipoIncidenciaAnt'.
     * 
     * @return int
     * @return the value of field 'codigoTipoIncidenciaAnt'.
     */
    public int getCodigoTipoIncidenciaAnt()
    {
        return this._codigoTipoIncidenciaAnt;
    } //-- int getCodigoTipoIncidenciaAnt() 

    /**
     * Returns the value of field 'codigoUorgResponsavel'.
     * 
     * @return int
     * @return the value of field 'codigoUorgResponsavel'.
     */
    public int getCodigoUorgResponsavel()
    {
        return this._codigoUorgResponsavel;
    } //-- int getCodigoUorgResponsavel() 

    /**
     * Returns the value of field 'codigoUorgResponsavelAnt'.
     * 
     * @return int
     * @return the value of field 'codigoUorgResponsavelAnt'.
     */
    public int getCodigoUorgResponsavelAnt()
    {
        return this._codigoUorgResponsavelAnt;
    } //-- int getCodigoUorgResponsavelAnt() 

    /**
     * Returns the value of field 'descLeiVigente'.
     * 
     * @return String
     * @return the value of field 'descLeiVigente'.
     */
    public java.lang.String getDescLeiVigente()
    {
        return this._descLeiVigente;
    } //-- java.lang.String getDescLeiVigente() 

    /**
     * Returns the value of field 'descLeiVigenteAnt'.
     * 
     * @return String
     * @return the value of field 'descLeiVigenteAnt'.
     */
    public java.lang.String getDescLeiVigenteAnt()
    {
        return this._descLeiVigenteAnt;
    } //-- java.lang.String getDescLeiVigenteAnt() 

    /**
     * Returns the value of field
     * 'descricaoMunicipioCentralizador'.
     * 
     * @return String
     * @return the value of field 'descricaoMunicipioCentralizador'.
     */
    public java.lang.String getDescricaoMunicipioCentralizador()
    {
        return this._descricaoMunicipioCentralizador;
    } //-- java.lang.String getDescricaoMunicipioCentralizador() 

    /**
     * Returns the value of field
     * 'descricaoMunicipioCentralizadorAnt'.
     * 
     * @return String
     * @return the value of field
     * 'descricaoMunicipioCentralizadorAnt'.
     */
    public java.lang.String getDescricaoMunicipioCentralizadorAnt()
    {
        return this._descricaoMunicipioCentralizadorAnt;
    } //-- java.lang.String getDescricaoMunicipioCentralizadorAnt() 

    /**
     * Returns the value of field 'diaVencimento'.
     * 
     * @return int
     * @return the value of field 'diaVencimento'.
     */
    public int getDiaVencimento()
    {
        return this._diaVencimento;
    } //-- int getDiaVencimento() 

    /**
     * Returns the value of field 'diaVencimentoAnt'.
     * 
     * @return int
     * @return the value of field 'diaVencimentoAnt'.
     */
    public int getDiaVencimentoAnt()
    {
        return this._diaVencimentoAnt;
    } //-- int getDiaVencimentoAnt() 

    /**
     * Returns the value of field 'estadoCentralizador'.
     * 
     * @return String
     * @return the value of field 'estadoCentralizador'.
     */
    public java.lang.String getEstadoCentralizador()
    {
        return this._estadoCentralizador;
    } //-- java.lang.String getEstadoCentralizador() 

    /**
     * Returns the value of field 'estadoCentralizadorAnt'.
     * 
     * @return String
     * @return the value of field 'estadoCentralizadorAnt'.
     */
    public java.lang.String getEstadoCentralizadorAnt()
    {
        return this._estadoCentralizadorAnt;
    } //-- java.lang.String getEstadoCentralizadorAnt() 

    /**
     * Returns the value of field 'formaPagamento'.
     * 
     * @return int
     * @return the value of field 'formaPagamento'.
     */
    public int getFormaPagamento()
    {
        return this._formaPagamento;
    } //-- int getFormaPagamento() 

    /**
     * Returns the value of field 'formaPagamentoAnt'.
     * 
     * @return int
     * @return the value of field 'formaPagamentoAnt'.
     */
    public int getFormaPagamentoAnt()
    {
        return this._formaPagamentoAnt;
    } //-- int getFormaPagamentoAnt() 

    /**
     * Returns the value of field 'indiceVigencia'.
     * 
     * @return String
     * @return the value of field 'indiceVigencia'.
     */
    public java.lang.String getIndiceVigencia()
    {
        return this._indiceVigencia;
    } //-- java.lang.String getIndiceVigencia() 

    /**
     * Returns the value of field 'informacaoComplementar'.
     * 
     * @return String
     * @return the value of field 'informacaoComplementar'.
     */
    public java.lang.String getInformacaoComplementar()
    {
        return this._informacaoComplementar;
    } //-- java.lang.String getInformacaoComplementar() 

    /**
     * Returns the value of field 'informacaoComplementarAnt'.
     * 
     * @return String
     * @return the value of field 'informacaoComplementarAnt'.
     */
    public java.lang.String getInformacaoComplementarAnt()
    {
        return this._informacaoComplementarAnt;
    } //-- java.lang.String getInformacaoComplementarAnt() 

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
     * Returns the value of field 'nomeEstadoResponsavel'.
     * 
     * @return String
     * @return the value of field 'nomeEstadoResponsavel'.
     */
    public java.lang.String getNomeEstadoResponsavel()
    {
        return this._nomeEstadoResponsavel;
    } //-- java.lang.String getNomeEstadoResponsavel() 

    /**
     * Returns the value of field 'nomeIncidencia'.
     * 
     * @return String
     * @return the value of field 'nomeIncidencia'.
     */
    public java.lang.String getNomeIncidencia()
    {
        return this._nomeIncidencia;
    } //-- java.lang.String getNomeIncidencia() 

    /**
     * Returns the value of field 'nomeIncidenciaAnt'.
     * 
     * @return String
     * @return the value of field 'nomeIncidenciaAnt'.
     */
    public java.lang.String getNomeIncidenciaAnt()
    {
        return this._nomeIncidenciaAnt;
    } //-- java.lang.String getNomeIncidenciaAnt() 

    /**
     * Returns the value of field 'nomeUorgResponsavel'.
     * 
     * @return String
     * @return the value of field 'nomeUorgResponsavel'.
     */
    public java.lang.String getNomeUorgResponsavel()
    {
        return this._nomeUorgResponsavel;
    } //-- java.lang.String getNomeUorgResponsavel() 

    /**
     * Returns the value of field 'nomeUorgResponsavelAnt'.
     * 
     * @return String
     * @return the value of field 'nomeUorgResponsavelAnt'.
     */
    public java.lang.String getNomeUorgResponsavelAnt()
    {
        return this._nomeUorgResponsavelAnt;
    } //-- java.lang.String getNomeUorgResponsavelAnt() 

    /**
     * Returns the value of field 'pagamentoDiaUtil'.
     * 
     * @return String
     * @return the value of field 'pagamentoDiaUtil'.
     */
    public java.lang.String getPagamentoDiaUtil()
    {
        return this._pagamentoDiaUtil;
    } //-- java.lang.String getPagamentoDiaUtil() 

    /**
     * Returns the value of field 'pagamentoDiaUtilAnt'.
     * 
     * @return String
     * @return the value of field 'pagamentoDiaUtilAnt'.
     */
    public java.lang.String getPagamentoDiaUtilAnt()
    {
        return this._pagamentoDiaUtilAnt;
    } //-- java.lang.String getPagamentoDiaUtilAnt() 

    /**
     * Returns the value of field 'percentAliquotaPadrao'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentAliquotaPadrao'.
     */
    public java.math.BigDecimal getPercentAliquotaPadrao()
    {
        return this._percentAliquotaPadrao;
    } //-- java.math.BigDecimal getPercentAliquotaPadrao() 

    /**
     * Returns the value of field 'percentAliquotaPadraoAnt'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentAliquotaPadraoAnt'.
     */
    public java.math.BigDecimal getPercentAliquotaPadraoAnt()
    {
        return this._percentAliquotaPadraoAnt;
    } //-- java.math.BigDecimal getPercentAliquotaPadraoAnt() 

    /**
     * Returns the value of field 'percentBaseCalculo'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentBaseCalculo'.
     */
    public java.math.BigDecimal getPercentBaseCalculo()
    {
        return this._percentBaseCalculo;
    } //-- java.math.BigDecimal getPercentBaseCalculo() 

    /**
     * Returns the value of field 'percentBaseCalculoAnt'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentBaseCalculoAnt'.
     */
    public java.math.BigDecimal getPercentBaseCalculoAnt()
    {
        return this._percentBaseCalculoAnt;
    } //-- java.math.BigDecimal getPercentBaseCalculoAnt() 

    /**
     * Returns the value of field 'percentualAliquotaMunicipio'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentualAliquotaMunicipio'.
     */
    public java.math.BigDecimal getPercentualAliquotaMunicipio()
    {
        return this._percentualAliquotaMunicipio;
    } //-- java.math.BigDecimal getPercentualAliquotaMunicipio() 

    /**
     * Returns the value of field 'saldoAlteracao'.
     * 
     * @return int
     * @return the value of field 'saldoAlteracao'.
     */
    public int getSaldoAlteracao()
    {
        return this._saldoAlteracao;
    } //-- int getSaldoAlteracao() 

    /**
     * Returns the value of field 'saldoAnterior'.
     * 
     * @return String
     * @return the value of field 'saldoAnterior'.
     */
    public java.lang.String getSaldoAnterior()
    {
        return this._saldoAnterior;
    } //-- java.lang.String getSaldoAnterior() 

    /**
     * Returns the value of field 'saldoAtual'.
     * 
     * @return String
     * @return the value of field 'saldoAtual'.
     */
    public java.lang.String getSaldoAtual()
    {
        return this._saldoAtual;
    } //-- java.lang.String getSaldoAtual() 

    /**
     * Method hasCodigoLeiVigente
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoLeiVigente()
    {
        return this._has_codigoLeiVigente;
    } //-- boolean hasCodigoLeiVigente() 

    /**
     * Method hasCodigoLeiVigenteAnt
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoLeiVigenteAnt()
    {
        return this._has_codigoLeiVigenteAnt;
    } //-- boolean hasCodigoLeiVigenteAnt() 

    /**
     * Method hasCodigoMunicipioCentralizador
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipioCentralizador()
    {
        return this._has_codigoMunicipioCentralizador;
    } //-- boolean hasCodigoMunicipioCentralizador() 

    /**
     * Method hasCodigoMunicipioCentralizadorAnt
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipioCentralizadorAnt()
    {
        return this._has_codigoMunicipioCentralizadorAnt;
    } //-- boolean hasCodigoMunicipioCentralizadorAnt() 

    /**
     * Method hasCodigoTipoIncidencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTipoIncidencia()
    {
        return this._has_codigoTipoIncidencia;
    } //-- boolean hasCodigoTipoIncidencia() 

    /**
     * Method hasCodigoTipoIncidenciaAnt
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTipoIncidenciaAnt()
    {
        return this._has_codigoTipoIncidenciaAnt;
    } //-- boolean hasCodigoTipoIncidenciaAnt() 

    /**
     * Method hasCodigoUorgResponsavel
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoUorgResponsavel()
    {
        return this._has_codigoUorgResponsavel;
    } //-- boolean hasCodigoUorgResponsavel() 

    /**
     * Method hasCodigoUorgResponsavelAnt
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoUorgResponsavelAnt()
    {
        return this._has_codigoUorgResponsavelAnt;
    } //-- boolean hasCodigoUorgResponsavelAnt() 

    /**
     * Method hasDiaVencimento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDiaVencimento()
    {
        return this._has_diaVencimento;
    } //-- boolean hasDiaVencimento() 

    /**
     * Method hasDiaVencimentoAnt
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDiaVencimentoAnt()
    {
        return this._has_diaVencimentoAnt;
    } //-- boolean hasDiaVencimentoAnt() 

    /**
     * Method hasFormaPagamento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasFormaPagamento()
    {
        return this._has_formaPagamento;
    } //-- boolean hasFormaPagamento() 

    /**
     * Method hasFormaPagamentoAnt
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasFormaPagamentoAnt()
    {
        return this._has_formaPagamentoAnt;
    } //-- boolean hasFormaPagamentoAnt() 

    /**
     * Method hasSaldoAlteracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSaldoAlteracao()
    {
        return this._has_saldoAlteracao;
    } //-- boolean hasSaldoAlteracao() 

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
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Sets the value of field 'codigoLeiVigente'.
     * 
     * @param codigoLeiVigente the value of field 'codigoLeiVigente'
     */
    public void setCodigoLeiVigente(int codigoLeiVigente)
    {
        this._codigoLeiVigente = codigoLeiVigente;
        this._has_codigoLeiVigente = true;
    } //-- void setCodigoLeiVigente(int) 

    /**
     * Sets the value of field 'codigoLeiVigenteAnt'.
     * 
     * @param codigoLeiVigenteAnt the value of field
     * 'codigoLeiVigenteAnt'.
     */
    public void setCodigoLeiVigenteAnt(int codigoLeiVigenteAnt)
    {
        this._codigoLeiVigenteAnt = codigoLeiVigenteAnt;
        this._has_codigoLeiVigenteAnt = true;
    } //-- void setCodigoLeiVigenteAnt(int) 

    /**
     * Sets the value of field 'codigoMunicipioCentralizador'.
     * 
     * @param codigoMunicipioCentralizador the value of field
     * 'codigoMunicipioCentralizador'.
     */
    public void setCodigoMunicipioCentralizador(long codigoMunicipioCentralizador)
    {
        this._codigoMunicipioCentralizador = codigoMunicipioCentralizador;
        this._has_codigoMunicipioCentralizador = true;
    } //-- void setCodigoMunicipioCentralizador(long) 

    /**
     * Sets the value of field 'codigoMunicipioCentralizadorAnt'.
     * 
     * @param codigoMunicipioCentralizadorAnt the value of field
     * 'codigoMunicipioCentralizadorAnt'.
     */
    public void setCodigoMunicipioCentralizadorAnt(long codigoMunicipioCentralizadorAnt)
    {
        this._codigoMunicipioCentralizadorAnt = codigoMunicipioCentralizadorAnt;
        this._has_codigoMunicipioCentralizadorAnt = true;
    } //-- void setCodigoMunicipioCentralizadorAnt(long) 

    /**
     * Sets the value of field 'codigoTipoIncidencia'.
     * 
     * @param codigoTipoIncidencia the value of field
     * 'codigoTipoIncidencia'.
     */
    public void setCodigoTipoIncidencia(int codigoTipoIncidencia)
    {
        this._codigoTipoIncidencia = codigoTipoIncidencia;
        this._has_codigoTipoIncidencia = true;
    } //-- void setCodigoTipoIncidencia(int) 

    /**
     * Sets the value of field 'codigoTipoIncidenciaAnt'.
     * 
     * @param codigoTipoIncidenciaAnt the value of field
     * 'codigoTipoIncidenciaAnt'.
     */
    public void setCodigoTipoIncidenciaAnt(int codigoTipoIncidenciaAnt)
    {
        this._codigoTipoIncidenciaAnt = codigoTipoIncidenciaAnt;
        this._has_codigoTipoIncidenciaAnt = true;
    } //-- void setCodigoTipoIncidenciaAnt(int) 

    /**
     * Sets the value of field 'codigoUorgResponsavel'.
     * 
     * @param codigoUorgResponsavel the value of field
     * 'codigoUorgResponsavel'.
     */
    public void setCodigoUorgResponsavel(int codigoUorgResponsavel)
    {
        this._codigoUorgResponsavel = codigoUorgResponsavel;
        this._has_codigoUorgResponsavel = true;
    } //-- void setCodigoUorgResponsavel(int) 

    /**
     * Sets the value of field 'codigoUorgResponsavelAnt'.
     * 
     * @param codigoUorgResponsavelAnt the value of field
     * 'codigoUorgResponsavelAnt'.
     */
    public void setCodigoUorgResponsavelAnt(int codigoUorgResponsavelAnt)
    {
        this._codigoUorgResponsavelAnt = codigoUorgResponsavelAnt;
        this._has_codigoUorgResponsavelAnt = true;
    } //-- void setCodigoUorgResponsavelAnt(int) 

    /**
     * Sets the value of field 'descLeiVigente'.
     * 
     * @param descLeiVigente the value of field 'descLeiVigente'.
     */
    public void setDescLeiVigente(java.lang.String descLeiVigente)
    {
        this._descLeiVigente = descLeiVigente;
    } //-- void setDescLeiVigente(java.lang.String) 

    /**
     * Sets the value of field 'descLeiVigenteAnt'.
     * 
     * @param descLeiVigenteAnt the value of field
     * 'descLeiVigenteAnt'.
     */
    public void setDescLeiVigenteAnt(java.lang.String descLeiVigenteAnt)
    {
        this._descLeiVigenteAnt = descLeiVigenteAnt;
    } //-- void setDescLeiVigenteAnt(java.lang.String) 

    /**
     * Sets the value of field 'descricaoMunicipioCentralizador'.
     * 
     * @param descricaoMunicipioCentralizador the value of field
     * 'descricaoMunicipioCentralizador'.
     */
    public void setDescricaoMunicipioCentralizador(java.lang.String descricaoMunicipioCentralizador)
    {
        this._descricaoMunicipioCentralizador = descricaoMunicipioCentralizador;
    } //-- void setDescricaoMunicipioCentralizador(java.lang.String) 

    /**
     * Sets the value of field
     * 'descricaoMunicipioCentralizadorAnt'.
     * 
     * @param descricaoMunicipioCentralizadorAnt the value of field
     * 'descricaoMunicipioCentralizadorAnt'.
     */
    public void setDescricaoMunicipioCentralizadorAnt(java.lang.String descricaoMunicipioCentralizadorAnt)
    {
        this._descricaoMunicipioCentralizadorAnt = descricaoMunicipioCentralizadorAnt;
    } //-- void setDescricaoMunicipioCentralizadorAnt(java.lang.String) 

    /**
     * Sets the value of field 'diaVencimento'.
     * 
     * @param diaVencimento the value of field 'diaVencimento'.
     */
    public void setDiaVencimento(int diaVencimento)
    {
        this._diaVencimento = diaVencimento;
        this._has_diaVencimento = true;
    } //-- void setDiaVencimento(int) 

    /**
     * Sets the value of field 'diaVencimentoAnt'.
     * 
     * @param diaVencimentoAnt the value of field 'diaVencimentoAnt'
     */
    public void setDiaVencimentoAnt(int diaVencimentoAnt)
    {
        this._diaVencimentoAnt = diaVencimentoAnt;
        this._has_diaVencimentoAnt = true;
    } //-- void setDiaVencimentoAnt(int) 

    /**
     * Sets the value of field 'estadoCentralizador'.
     * 
     * @param estadoCentralizador the value of field
     * 'estadoCentralizador'.
     */
    public void setEstadoCentralizador(java.lang.String estadoCentralizador)
    {
        this._estadoCentralizador = estadoCentralizador;
    } //-- void setEstadoCentralizador(java.lang.String) 

    /**
     * Sets the value of field 'estadoCentralizadorAnt'.
     * 
     * @param estadoCentralizadorAnt the value of field
     * 'estadoCentralizadorAnt'.
     */
    public void setEstadoCentralizadorAnt(java.lang.String estadoCentralizadorAnt)
    {
        this._estadoCentralizadorAnt = estadoCentralizadorAnt;
    } //-- void setEstadoCentralizadorAnt(java.lang.String) 

    /**
     * Sets the value of field 'formaPagamento'.
     * 
     * @param formaPagamento the value of field 'formaPagamento'.
     */
    public void setFormaPagamento(int formaPagamento)
    {
        this._formaPagamento = formaPagamento;
        this._has_formaPagamento = true;
    } //-- void setFormaPagamento(int) 

    /**
     * Sets the value of field 'formaPagamentoAnt'.
     * 
     * @param formaPagamentoAnt the value of field
     * 'formaPagamentoAnt'.
     */
    public void setFormaPagamentoAnt(int formaPagamentoAnt)
    {
        this._formaPagamentoAnt = formaPagamentoAnt;
        this._has_formaPagamentoAnt = true;
    } //-- void setFormaPagamentoAnt(int) 

    /**
     * Sets the value of field 'indiceVigencia'.
     * 
     * @param indiceVigencia the value of field 'indiceVigencia'.
     */
    public void setIndiceVigencia(java.lang.String indiceVigencia)
    {
        this._indiceVigencia = indiceVigencia;
    } //-- void setIndiceVigencia(java.lang.String) 

    /**
     * Sets the value of field 'informacaoComplementar'.
     * 
     * @param informacaoComplementar the value of field
     * 'informacaoComplementar'.
     */
    public void setInformacaoComplementar(java.lang.String informacaoComplementar)
    {
        this._informacaoComplementar = informacaoComplementar;
    } //-- void setInformacaoComplementar(java.lang.String) 

    /**
     * Sets the value of field 'informacaoComplementarAnt'.
     * 
     * @param informacaoComplementarAnt the value of field
     * 'informacaoComplementarAnt'.
     */
    public void setInformacaoComplementarAnt(java.lang.String informacaoComplementarAnt)
    {
        this._informacaoComplementarAnt = informacaoComplementarAnt;
    } //-- void setInformacaoComplementarAnt(java.lang.String) 

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
     * Sets the value of field 'nomeEstadoResponsavel'.
     * 
     * @param nomeEstadoResponsavel the value of field
     * 'nomeEstadoResponsavel'.
     */
    public void setNomeEstadoResponsavel(java.lang.String nomeEstadoResponsavel)
    {
        this._nomeEstadoResponsavel = nomeEstadoResponsavel;
    } //-- void setNomeEstadoResponsavel(java.lang.String) 

    /**
     * Sets the value of field 'nomeIncidencia'.
     * 
     * @param nomeIncidencia the value of field 'nomeIncidencia'.
     */
    public void setNomeIncidencia(java.lang.String nomeIncidencia)
    {
        this._nomeIncidencia = nomeIncidencia;
    } //-- void setNomeIncidencia(java.lang.String) 

    /**
     * Sets the value of field 'nomeIncidenciaAnt'.
     * 
     * @param nomeIncidenciaAnt the value of field
     * 'nomeIncidenciaAnt'.
     */
    public void setNomeIncidenciaAnt(java.lang.String nomeIncidenciaAnt)
    {
        this._nomeIncidenciaAnt = nomeIncidenciaAnt;
    } //-- void setNomeIncidenciaAnt(java.lang.String) 

    /**
     * Sets the value of field 'nomeUorgResponsavel'.
     * 
     * @param nomeUorgResponsavel the value of field
     * 'nomeUorgResponsavel'.
     */
    public void setNomeUorgResponsavel(java.lang.String nomeUorgResponsavel)
    {
        this._nomeUorgResponsavel = nomeUorgResponsavel;
    } //-- void setNomeUorgResponsavel(java.lang.String) 

    /**
     * Sets the value of field 'nomeUorgResponsavelAnt'.
     * 
     * @param nomeUorgResponsavelAnt the value of field
     * 'nomeUorgResponsavelAnt'.
     */
    public void setNomeUorgResponsavelAnt(java.lang.String nomeUorgResponsavelAnt)
    {
        this._nomeUorgResponsavelAnt = nomeUorgResponsavelAnt;
    } //-- void setNomeUorgResponsavelAnt(java.lang.String) 

    /**
     * Sets the value of field 'pagamentoDiaUtil'.
     * 
     * @param pagamentoDiaUtil the value of field 'pagamentoDiaUtil'
     */
    public void setPagamentoDiaUtil(java.lang.String pagamentoDiaUtil)
    {
        this._pagamentoDiaUtil = pagamentoDiaUtil;
    } //-- void setPagamentoDiaUtil(java.lang.String) 

    /**
     * Sets the value of field 'pagamentoDiaUtilAnt'.
     * 
     * @param pagamentoDiaUtilAnt the value of field
     * 'pagamentoDiaUtilAnt'.
     */
    public void setPagamentoDiaUtilAnt(java.lang.String pagamentoDiaUtilAnt)
    {
        this._pagamentoDiaUtilAnt = pagamentoDiaUtilAnt;
    } //-- void setPagamentoDiaUtilAnt(java.lang.String) 

    /**
     * Sets the value of field 'percentAliquotaPadrao'.
     * 
     * @param percentAliquotaPadrao the value of field
     * 'percentAliquotaPadrao'.
     */
    public void setPercentAliquotaPadrao(java.math.BigDecimal percentAliquotaPadrao)
    {
        this._percentAliquotaPadrao = percentAliquotaPadrao;
    } //-- void setPercentAliquotaPadrao(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percentAliquotaPadraoAnt'.
     * 
     * @param percentAliquotaPadraoAnt the value of field
     * 'percentAliquotaPadraoAnt'.
     */
    public void setPercentAliquotaPadraoAnt(java.math.BigDecimal percentAliquotaPadraoAnt)
    {
        this._percentAliquotaPadraoAnt = percentAliquotaPadraoAnt;
    } //-- void setPercentAliquotaPadraoAnt(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percentBaseCalculo'.
     * 
     * @param percentBaseCalculo the value of field
     * 'percentBaseCalculo'.
     */
    public void setPercentBaseCalculo(java.math.BigDecimal percentBaseCalculo)
    {
        this._percentBaseCalculo = percentBaseCalculo;
    } //-- void setPercentBaseCalculo(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percentBaseCalculoAnt'.
     * 
     * @param percentBaseCalculoAnt the value of field
     * 'percentBaseCalculoAnt'.
     */
    public void setPercentBaseCalculoAnt(java.math.BigDecimal percentBaseCalculoAnt)
    {
        this._percentBaseCalculoAnt = percentBaseCalculoAnt;
    } //-- void setPercentBaseCalculoAnt(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percentualAliquotaMunicipio'.
     * 
     * @param percentualAliquotaMunicipio the value of field
     * 'percentualAliquotaMunicipio'.
     */
    public void setPercentualAliquotaMunicipio(java.math.BigDecimal percentualAliquotaMunicipio)
    {
        this._percentualAliquotaMunicipio = percentualAliquotaMunicipio;
    } //-- void setPercentualAliquotaMunicipio(java.math.BigDecimal) 

    /**
     * Sets the value of field 'saldoAlteracao'.
     * 
     * @param saldoAlteracao the value of field 'saldoAlteracao'.
     */
    public void setSaldoAlteracao(int saldoAlteracao)
    {
        this._saldoAlteracao = saldoAlteracao;
        this._has_saldoAlteracao = true;
    } //-- void setSaldoAlteracao(int) 

    /**
     * Sets the value of field 'saldoAnterior'.
     * 
     * @param saldoAnterior the value of field 'saldoAnterior'.
     */
    public void setSaldoAnterior(java.lang.String saldoAnterior)
    {
        this._saldoAnterior = saldoAnterior;
    } //-- void setSaldoAnterior(java.lang.String) 

    /**
     * Sets the value of field 'saldoAtual'.
     * 
     * @param saldoAtual the value of field 'saldoAtual'.
     */
    public void setSaldoAtual(java.lang.String saldoAtual)
    {
        this._saldoAtual = saldoAtual;
    } //-- void setSaldoAtual(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarMunicipioTabelaHistoricoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.response.ConsultarMunicipioTabelaHistoricoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.response.ConsultarMunicipioTabelaHistoricoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.response.ConsultarMunicipioTabelaHistoricoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.response.ConsultarMunicipioTabelaHistoricoResponse unmarshal(java.io.Reader) 

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
