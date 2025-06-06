/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response;

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
 * Class ListaConsultarArquivoEmp.
 * 
 * @version $Revision$ $Date$
 */
public class ListaConsultarArquivoEmp implements java.io.Serializable {


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
     * Field _produto
     */
    private java.lang.String _produto;

    /**
     * Field _anoMes
     */
    private java.lang.String _anoMes;

    /**
     * Field _dataRecepcao
     */
    private java.lang.String _dataRecepcao;

    /**
     * Field _statusArquivo
     */
    private java.lang.String _statusArquivo;

    /**
     * Field _codFinalidade
     */
    private java.lang.String _codFinalidade;

    /**
     * Field _qntRegistroRecebido
     */
    private long _qntRegistroRecebido = 0;

    /**
     * keeps track of state for field: _qntRegistroRecebido
     */
    private boolean _has_qntRegistroRecebido;

    /**
     * Field _valorRecebido
     */
    private java.math.BigDecimal _valorRecebido = new java.math.BigDecimal("0");

    /**
     * Field _qntRegistroAceitacao
     */
    private long _qntRegistroAceitacao = 0;

    /**
     * keeps track of state for field: _qntRegistroAceitacao
     */
    private boolean _has_qntRegistroAceitacao;

    /**
     * Field _valorAceitacao
     */
    private java.math.BigDecimal _valorAceitacao = new java.math.BigDecimal("0");

    /**
     * Field _qntRegistroRej
     */
    private long _qntRegistroRej = 0;

    /**
     * keeps track of state for field: _qntRegistroRej
     */
    private boolean _has_qntRegistroRej;

    /**
     * Field _valorRegistroRej
     */
    private java.math.BigDecimal _valorRegistroRej = new java.math.BigDecimal("0");

    /**
     * Field _qtdRegistroIssNegtv
     */
    private long _qtdRegistroIssNegtv = 0;

    /**
     * keeps track of state for field: _qtdRegistroIssNegtv
     */
    private boolean _has_qtdRegistroIssNegtv;

    /**
     * Field _valorTotalIssNegtv
     */
    private java.math.BigDecimal _valorTotalIssNegtv = new java.math.BigDecimal("0");

    /**
     * Field _percRejeitadoArqIss
     */
    private java.math.BigDecimal _percRejeitadoArqIss = new java.math.BigDecimal("0");

    /**
     * Field _valorBaseCalcApuracao
     */
    private java.math.BigDecimal _valorBaseCalcApuracao = new java.math.BigDecimal("0");

    /**
     * Field _valorTotalApuracaoIss
     */
    private java.math.BigDecimal _valorTotalApuracaoIss = new java.math.BigDecimal("0");

    /**
     * Field _percDistrIssPrestador
     */
    private java.math.BigDecimal _percDistrIssPrestador = new java.math.BigDecimal("0");

    /**
     * Field _valorTotalReceitaPrestador
     */
    private java.math.BigDecimal _valorTotalReceitaPrestador = new java.math.BigDecimal("0");

    /**
     * Field _valorTotalApuracaoPrestador
     */
    private java.math.BigDecimal _valorTotalApuracaoPrestador = new java.math.BigDecimal("0");

    /**
     * Field _percAliquotaPrestador
     */
    private java.math.BigDecimal _percAliquotaPrestador = new java.math.BigDecimal("0");

    /**
     * Field _percDistrIssTomador
     */
    private java.math.BigDecimal _percDistrIssTomador = new java.math.BigDecimal("0");

    /**
     * Field _valorTotalReceitaTomador
     */
    private java.math.BigDecimal _valorTotalReceitaTomador = new java.math.BigDecimal("0");

    /**
     * Field _valorTotalApuracaoTomador
     */
    private java.math.BigDecimal _valorTotalApuracaoTomador = new java.math.BigDecimal("0");

    /**
     * Field _percAliquotaTomador
     */
    private java.math.BigDecimal _percAliquotaTomador = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaConsultarArquivoEmp() 
     {
        super();
        setValorRecebido(new java.math.BigDecimal("0"));
        setValorAceitacao(new java.math.BigDecimal("0"));
        setValorRegistroRej(new java.math.BigDecimal("0"));
        setValorTotalIssNegtv(new java.math.BigDecimal("0"));
        setPercRejeitadoArqIss(new java.math.BigDecimal("0"));
        setValorBaseCalcApuracao(new java.math.BigDecimal("0"));
        setValorTotalApuracaoIss(new java.math.BigDecimal("0"));
        setPercDistrIssPrestador(new java.math.BigDecimal("0"));
        setValorTotalReceitaPrestador(new java.math.BigDecimal("0"));
        setValorTotalApuracaoPrestador(new java.math.BigDecimal("0"));
        setPercAliquotaPrestador(new java.math.BigDecimal("0"));
        setPercDistrIssTomador(new java.math.BigDecimal("0"));
        setValorTotalReceitaTomador(new java.math.BigDecimal("0"));
        setValorTotalApuracaoTomador(new java.math.BigDecimal("0"));
        setPercAliquotaTomador(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteQntRegistroAceitacao
     * 
     */
    public void deleteQntRegistroAceitacao()
    {
        this._has_qntRegistroAceitacao= false;
    } //-- void deleteQntRegistroAceitacao() 

    /**
     * Method deleteQntRegistroRecebido
     * 
     */
    public void deleteQntRegistroRecebido()
    {
        this._has_qntRegistroRecebido= false;
    } //-- void deleteQntRegistroRecebido() 

    /**
     * Method deleteQntRegistroRej
     * 
     */
    public void deleteQntRegistroRej()
    {
        this._has_qntRegistroRej= false;
    } //-- void deleteQntRegistroRej() 

    /**
     * Method deleteQtdRegistroIssNegtv
     * 
     */
    public void deleteQtdRegistroIssNegtv()
    {
        this._has_qtdRegistroIssNegtv= false;
    } //-- void deleteQtdRegistroIssNegtv() 

    /**
     * Returns the value of field 'anoMes'.
     * 
     * @return String
     * @return the value of field 'anoMes'.
     */
    public java.lang.String getAnoMes()
    {
        return this._anoMes;
    } //-- java.lang.String getAnoMes() 

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
     * Returns the value of field 'codFinalidade'.
     * 
     * @return String
     * @return the value of field 'codFinalidade'.
     */
    public java.lang.String getCodFinalidade()
    {
        return this._codFinalidade;
    } //-- java.lang.String getCodFinalidade() 

    /**
     * Returns the value of field 'dataRecepcao'.
     * 
     * @return String
     * @return the value of field 'dataRecepcao'.
     */
    public java.lang.String getDataRecepcao()
    {
        return this._dataRecepcao;
    } //-- java.lang.String getDataRecepcao() 

    /**
     * Returns the value of field 'percAliquotaPrestador'.
     * 
     * @return BigDecimal
     * @return the value of field 'percAliquotaPrestador'.
     */
    public java.math.BigDecimal getPercAliquotaPrestador()
    {
        return this._percAliquotaPrestador;
    } //-- java.math.BigDecimal getPercAliquotaPrestador() 

    /**
     * Returns the value of field 'percAliquotaTomador'.
     * 
     * @return BigDecimal
     * @return the value of field 'percAliquotaTomador'.
     */
    public java.math.BigDecimal getPercAliquotaTomador()
    {
        return this._percAliquotaTomador;
    } //-- java.math.BigDecimal getPercAliquotaTomador() 

    /**
     * Returns the value of field 'percDistrIssPrestador'.
     * 
     * @return BigDecimal
     * @return the value of field 'percDistrIssPrestador'.
     */
    public java.math.BigDecimal getPercDistrIssPrestador()
    {
        return this._percDistrIssPrestador;
    } //-- java.math.BigDecimal getPercDistrIssPrestador() 

    /**
     * Returns the value of field 'percDistrIssTomador'.
     * 
     * @return BigDecimal
     * @return the value of field 'percDistrIssTomador'.
     */
    public java.math.BigDecimal getPercDistrIssTomador()
    {
        return this._percDistrIssTomador;
    } //-- java.math.BigDecimal getPercDistrIssTomador() 

    /**
     * Returns the value of field 'percRejeitadoArqIss'.
     * 
     * @return BigDecimal
     * @return the value of field 'percRejeitadoArqIss'.
     */
    public java.math.BigDecimal getPercRejeitadoArqIss()
    {
        return this._percRejeitadoArqIss;
    } //-- java.math.BigDecimal getPercRejeitadoArqIss() 

    /**
     * Returns the value of field 'produto'.
     * 
     * @return String
     * @return the value of field 'produto'.
     */
    public java.lang.String getProduto()
    {
        return this._produto;
    } //-- java.lang.String getProduto() 

    /**
     * Returns the value of field 'qntRegistroAceitacao'.
     * 
     * @return long
     * @return the value of field 'qntRegistroAceitacao'.
     */
    public long getQntRegistroAceitacao()
    {
        return this._qntRegistroAceitacao;
    } //-- long getQntRegistroAceitacao() 

    /**
     * Returns the value of field 'qntRegistroRecebido'.
     * 
     * @return long
     * @return the value of field 'qntRegistroRecebido'.
     */
    public long getQntRegistroRecebido()
    {
        return this._qntRegistroRecebido;
    } //-- long getQntRegistroRecebido() 

    /**
     * Returns the value of field 'qntRegistroRej'.
     * 
     * @return long
     * @return the value of field 'qntRegistroRej'.
     */
    public long getQntRegistroRej()
    {
        return this._qntRegistroRej;
    } //-- long getQntRegistroRej() 

    /**
     * Returns the value of field 'qtdRegistroIssNegtv'.
     * 
     * @return long
     * @return the value of field 'qtdRegistroIssNegtv'.
     */
    public long getQtdRegistroIssNegtv()
    {
        return this._qtdRegistroIssNegtv;
    } //-- long getQtdRegistroIssNegtv() 

    /**
     * Returns the value of field 'statusArquivo'.
     * 
     * @return String
     * @return the value of field 'statusArquivo'.
     */
    public java.lang.String getStatusArquivo()
    {
        return this._statusArquivo;
    } //-- java.lang.String getStatusArquivo() 

    /**
     * Returns the value of field 'valorAceitacao'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorAceitacao'.
     */
    public java.math.BigDecimal getValorAceitacao()
    {
        return this._valorAceitacao;
    } //-- java.math.BigDecimal getValorAceitacao() 

    /**
     * Returns the value of field 'valorBaseCalcApuracao'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorBaseCalcApuracao'.
     */
    public java.math.BigDecimal getValorBaseCalcApuracao()
    {
        return this._valorBaseCalcApuracao;
    } //-- java.math.BigDecimal getValorBaseCalcApuracao() 

    /**
     * Returns the value of field 'valorRecebido'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorRecebido'.
     */
    public java.math.BigDecimal getValorRecebido()
    {
        return this._valorRecebido;
    } //-- java.math.BigDecimal getValorRecebido() 

    /**
     * Returns the value of field 'valorRegistroRej'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorRegistroRej'.
     */
    public java.math.BigDecimal getValorRegistroRej()
    {
        return this._valorRegistroRej;
    } //-- java.math.BigDecimal getValorRegistroRej() 

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
     * Returns the value of field 'valorTotalApuracaoPrestador'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalApuracaoPrestador'.
     */
    public java.math.BigDecimal getValorTotalApuracaoPrestador()
    {
        return this._valorTotalApuracaoPrestador;
    } //-- java.math.BigDecimal getValorTotalApuracaoPrestador() 

    /**
     * Returns the value of field 'valorTotalApuracaoTomador'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalApuracaoTomador'.
     */
    public java.math.BigDecimal getValorTotalApuracaoTomador()
    {
        return this._valorTotalApuracaoTomador;
    } //-- java.math.BigDecimal getValorTotalApuracaoTomador() 

    /**
     * Returns the value of field 'valorTotalIssNegtv'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalIssNegtv'.
     */
    public java.math.BigDecimal getValorTotalIssNegtv()
    {
        return this._valorTotalIssNegtv;
    } //-- java.math.BigDecimal getValorTotalIssNegtv() 

    /**
     * Returns the value of field 'valorTotalReceitaPrestador'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalReceitaPrestador'.
     */
    public java.math.BigDecimal getValorTotalReceitaPrestador()
    {
        return this._valorTotalReceitaPrestador;
    } //-- java.math.BigDecimal getValorTotalReceitaPrestador() 

    /**
     * Returns the value of field 'valorTotalReceitaTomador'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalReceitaTomador'.
     */
    public java.math.BigDecimal getValorTotalReceitaTomador()
    {
        return this._valorTotalReceitaTomador;
    } //-- java.math.BigDecimal getValorTotalReceitaTomador() 

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
     * Method hasQntRegistroAceitacao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQntRegistroAceitacao()
    {
        return this._has_qntRegistroAceitacao;
    } //-- boolean hasQntRegistroAceitacao() 

    /**
     * Method hasQntRegistroRecebido
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQntRegistroRecebido()
    {
        return this._has_qntRegistroRecebido;
    } //-- boolean hasQntRegistroRecebido() 

    /**
     * Method hasQntRegistroRej
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQntRegistroRej()
    {
        return this._has_qntRegistroRej;
    } //-- boolean hasQntRegistroRej() 

    /**
     * Method hasQtdRegistroIssNegtv
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdRegistroIssNegtv()
    {
        return this._has_qtdRegistroIssNegtv;
    } //-- boolean hasQtdRegistroIssNegtv() 

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
     * Sets the value of field 'anoMes'.
     * 
     * @param anoMes the value of field 'anoMes'.
     */
    public void setAnoMes(java.lang.String anoMes)
    {
        this._anoMes = anoMes;
    } //-- void setAnoMes(java.lang.String) 

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
     * Sets the value of field 'codFinalidade'.
     * 
     * @param codFinalidade the value of field 'codFinalidade'.
     */
    public void setCodFinalidade(java.lang.String codFinalidade)
    {
        this._codFinalidade = codFinalidade;
    } //-- void setCodFinalidade(java.lang.String) 

    /**
     * Sets the value of field 'dataRecepcao'.
     * 
     * @param dataRecepcao the value of field 'dataRecepcao'.
     */
    public void setDataRecepcao(java.lang.String dataRecepcao)
    {
        this._dataRecepcao = dataRecepcao;
    } //-- void setDataRecepcao(java.lang.String) 

    /**
     * Sets the value of field 'percAliquotaPrestador'.
     * 
     * @param percAliquotaPrestador the value of field
     * 'percAliquotaPrestador'.
     */
    public void setPercAliquotaPrestador(java.math.BigDecimal percAliquotaPrestador)
    {
        this._percAliquotaPrestador = percAliquotaPrestador;
    } //-- void setPercAliquotaPrestador(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percAliquotaTomador'.
     * 
     * @param percAliquotaTomador the value of field
     * 'percAliquotaTomador'.
     */
    public void setPercAliquotaTomador(java.math.BigDecimal percAliquotaTomador)
    {
        this._percAliquotaTomador = percAliquotaTomador;
    } //-- void setPercAliquotaTomador(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percDistrIssPrestador'.
     * 
     * @param percDistrIssPrestador the value of field
     * 'percDistrIssPrestador'.
     */
    public void setPercDistrIssPrestador(java.math.BigDecimal percDistrIssPrestador)
    {
        this._percDistrIssPrestador = percDistrIssPrestador;
    } //-- void setPercDistrIssPrestador(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percDistrIssTomador'.
     * 
     * @param percDistrIssTomador the value of field
     * 'percDistrIssTomador'.
     */
    public void setPercDistrIssTomador(java.math.BigDecimal percDistrIssTomador)
    {
        this._percDistrIssTomador = percDistrIssTomador;
    } //-- void setPercDistrIssTomador(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percRejeitadoArqIss'.
     * 
     * @param percRejeitadoArqIss the value of field
     * 'percRejeitadoArqIss'.
     */
    public void setPercRejeitadoArqIss(java.math.BigDecimal percRejeitadoArqIss)
    {
        this._percRejeitadoArqIss = percRejeitadoArqIss;
    } //-- void setPercRejeitadoArqIss(java.math.BigDecimal) 

    /**
     * Sets the value of field 'produto'.
     * 
     * @param produto the value of field 'produto'.
     */
    public void setProduto(java.lang.String produto)
    {
        this._produto = produto;
    } //-- void setProduto(java.lang.String) 

    /**
     * Sets the value of field 'qntRegistroAceitacao'.
     * 
     * @param qntRegistroAceitacao the value of field
     * 'qntRegistroAceitacao'.
     */
    public void setQntRegistroAceitacao(long qntRegistroAceitacao)
    {
        this._qntRegistroAceitacao = qntRegistroAceitacao;
        this._has_qntRegistroAceitacao = true;
    } //-- void setQntRegistroAceitacao(long) 

    /**
     * Sets the value of field 'qntRegistroRecebido'.
     * 
     * @param qntRegistroRecebido the value of field
     * 'qntRegistroRecebido'.
     */
    public void setQntRegistroRecebido(long qntRegistroRecebido)
    {
        this._qntRegistroRecebido = qntRegistroRecebido;
        this._has_qntRegistroRecebido = true;
    } //-- void setQntRegistroRecebido(long) 

    /**
     * Sets the value of field 'qntRegistroRej'.
     * 
     * @param qntRegistroRej the value of field 'qntRegistroRej'.
     */
    public void setQntRegistroRej(long qntRegistroRej)
    {
        this._qntRegistroRej = qntRegistroRej;
        this._has_qntRegistroRej = true;
    } //-- void setQntRegistroRej(long) 

    /**
     * Sets the value of field 'qtdRegistroIssNegtv'.
     * 
     * @param qtdRegistroIssNegtv the value of field
     * 'qtdRegistroIssNegtv'.
     */
    public void setQtdRegistroIssNegtv(long qtdRegistroIssNegtv)
    {
        this._qtdRegistroIssNegtv = qtdRegistroIssNegtv;
        this._has_qtdRegistroIssNegtv = true;
    } //-- void setQtdRegistroIssNegtv(long) 

    /**
     * Sets the value of field 'statusArquivo'.
     * 
     * @param statusArquivo the value of field 'statusArquivo'.
     */
    public void setStatusArquivo(java.lang.String statusArquivo)
    {
        this._statusArquivo = statusArquivo;
    } //-- void setStatusArquivo(java.lang.String) 

    /**
     * Sets the value of field 'valorAceitacao'.
     * 
     * @param valorAceitacao the value of field 'valorAceitacao'.
     */
    public void setValorAceitacao(java.math.BigDecimal valorAceitacao)
    {
        this._valorAceitacao = valorAceitacao;
    } //-- void setValorAceitacao(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorBaseCalcApuracao'.
     * 
     * @param valorBaseCalcApuracao the value of field
     * 'valorBaseCalcApuracao'.
     */
    public void setValorBaseCalcApuracao(java.math.BigDecimal valorBaseCalcApuracao)
    {
        this._valorBaseCalcApuracao = valorBaseCalcApuracao;
    } //-- void setValorBaseCalcApuracao(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorRecebido'.
     * 
     * @param valorRecebido the value of field 'valorRecebido'.
     */
    public void setValorRecebido(java.math.BigDecimal valorRecebido)
    {
        this._valorRecebido = valorRecebido;
    } //-- void setValorRecebido(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorRegistroRej'.
     * 
     * @param valorRegistroRej the value of field 'valorRegistroRej'
     */
    public void setValorRegistroRej(java.math.BigDecimal valorRegistroRej)
    {
        this._valorRegistroRej = valorRegistroRej;
    } //-- void setValorRegistroRej(java.math.BigDecimal) 

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
     * Sets the value of field 'valorTotalApuracaoPrestador'.
     * 
     * @param valorTotalApuracaoPrestador the value of field
     * 'valorTotalApuracaoPrestador'.
     */
    public void setValorTotalApuracaoPrestador(java.math.BigDecimal valorTotalApuracaoPrestador)
    {
        this._valorTotalApuracaoPrestador = valorTotalApuracaoPrestador;
    } //-- void setValorTotalApuracaoPrestador(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalApuracaoTomador'.
     * 
     * @param valorTotalApuracaoTomador the value of field
     * 'valorTotalApuracaoTomador'.
     */
    public void setValorTotalApuracaoTomador(java.math.BigDecimal valorTotalApuracaoTomador)
    {
        this._valorTotalApuracaoTomador = valorTotalApuracaoTomador;
    } //-- void setValorTotalApuracaoTomador(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalIssNegtv'.
     * 
     * @param valorTotalIssNegtv the value of field
     * 'valorTotalIssNegtv'.
     */
    public void setValorTotalIssNegtv(java.math.BigDecimal valorTotalIssNegtv)
    {
        this._valorTotalIssNegtv = valorTotalIssNegtv;
    } //-- void setValorTotalIssNegtv(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalReceitaPrestador'.
     * 
     * @param valorTotalReceitaPrestador the value of field
     * 'valorTotalReceitaPrestador'.
     */
    public void setValorTotalReceitaPrestador(java.math.BigDecimal valorTotalReceitaPrestador)
    {
        this._valorTotalReceitaPrestador = valorTotalReceitaPrestador;
    } //-- void setValorTotalReceitaPrestador(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalReceitaTomador'.
     * 
     * @param valorTotalReceitaTomador the value of field
     * 'valorTotalReceitaTomador'.
     */
    public void setValorTotalReceitaTomador(java.math.BigDecimal valorTotalReceitaTomador)
    {
        this._valorTotalReceitaTomador = valorTotalReceitaTomador;
    } //-- void setValorTotalReceitaTomador(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaConsultarArquivoEmp
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp unmarshal(java.io.Reader) 

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
