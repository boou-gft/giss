/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response;

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
 * Class ListaConsultarArquivoEmpSemanal.
 * 
 * @version $Revision$ $Date$
 */
public class ListaConsultarArquivoEmpSemanal implements java.io.Serializable {


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
     * Field _sPeriodoIni
     */
    private java.lang.String _sPeriodoIni;

    /**
     * Field _sPeriodoFim
     */
    private java.lang.String _sPeriodoFim;

    /**
     * Field _anoMes
     */
    private int _anoMes = 0;

    /**
     * keeps track of state for field: _anoMes
     */
    private boolean _has_anoMes;

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
     * Field _qntRegistroRejeitado
     */
    private long _qntRegistroRejeitado = 0;

    /**
     * keeps track of state for field: _qntRegistroRejeitado
     */
    private boolean _has_qntRegistroRejeitado;

    /**
     * Field _sPercentualRejeicaoArqIss
     */
    private double _sPercentualRejeicaoArqIss = 0;

    /**
     * keeps track of state for field: _sPercentualRejeicaoArqIss
     */
    private boolean _has_sPercentualRejeicaoArqIss;

    /**
     * Field _sValorRegistroRejeitado
     */
    private double _sValorRegistroRejeitado = 0;

    /**
     * keeps track of state for field: _sValorRegistroRejeitado
     */
    private boolean _has_sValorRegistroRejeitado;

    /**
     * Field _sQntdRegistroAcatado
     */
    private long _sQntdRegistroAcatado = 0;

    /**
     * keeps track of state for field: _sQntdRegistroAcatado
     */
    private boolean _has_sQntdRegistroAcatado;

    /**
     * Field _sValorAcatado
     */
    private double _sValorAcatado = 0;

    /**
     * keeps track of state for field: _sValorAcatado
     */
    private boolean _has_sValorAcatado;

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
    private double _valorTotalIssNegtv = 0;

    /**
     * keeps track of state for field: _valorTotalIssNegtv
     */
    private boolean _has_valorTotalIssNegtv;

    /**
     * Field _valorBaseCalcApuracao
     */
    private double _valorBaseCalcApuracao = 0;

    /**
     * keeps track of state for field: _valorBaseCalcApuracao
     */
    private boolean _has_valorBaseCalcApuracao;

    /**
     * Field _valorTotalApuracaoIss
     */
    private double _valorTotalApuracaoIss = 0;

    /**
     * keeps track of state for field: _valorTotalApuracaoIss
     */
    private boolean _has_valorTotalApuracaoIss;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaConsultarArquivoEmpSemanal() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAnoMes
     * 
     */
    public void deleteAnoMes()
    {
        this._has_anoMes= false;
    } //-- void deleteAnoMes() 

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteQntRegistroRecebido
     * 
     */
    public void deleteQntRegistroRecebido()
    {
        this._has_qntRegistroRecebido= false;
    } //-- void deleteQntRegistroRecebido() 

    /**
     * Method deleteQntRegistroRejeitado
     * 
     */
    public void deleteQntRegistroRejeitado()
    {
        this._has_qntRegistroRejeitado= false;
    } //-- void deleteQntRegistroRejeitado() 

    /**
     * Method deleteQtdRegistroIssNegtv
     * 
     */
    public void deleteQtdRegistroIssNegtv()
    {
        this._has_qtdRegistroIssNegtv= false;
    } //-- void deleteQtdRegistroIssNegtv() 

    /**
     * Method deleteSPercentualRejeicaoArqIss
     * 
     */
    public void deleteSPercentualRejeicaoArqIss()
    {
        this._has_sPercentualRejeicaoArqIss= false;
    } //-- void deleteSPercentualRejeicaoArqIss() 

    /**
     * Method deleteSQntdRegistroAcatado
     * 
     */
    public void deleteSQntdRegistroAcatado()
    {
        this._has_sQntdRegistroAcatado= false;
    } //-- void deleteSQntdRegistroAcatado() 

    /**
     * Method deleteSValorAcatado
     * 
     */
    public void deleteSValorAcatado()
    {
        this._has_sValorAcatado= false;
    } //-- void deleteSValorAcatado() 

    /**
     * Method deleteSValorRegistroRejeitado
     * 
     */
    public void deleteSValorRegistroRejeitado()
    {
        this._has_sValorRegistroRejeitado= false;
    } //-- void deleteSValorRegistroRejeitado() 

    /**
     * Method deleteValorBaseCalcApuracao
     * 
     */
    public void deleteValorBaseCalcApuracao()
    {
        this._has_valorBaseCalcApuracao= false;
    } //-- void deleteValorBaseCalcApuracao() 

    /**
     * Method deleteValorTotalApuracaoIss
     * 
     */
    public void deleteValorTotalApuracaoIss()
    {
        this._has_valorTotalApuracaoIss= false;
    } //-- void deleteValorTotalApuracaoIss() 

    /**
     * Method deleteValorTotalIssNegtv
     * 
     */
    public void deleteValorTotalIssNegtv()
    {
        this._has_valorTotalIssNegtv= false;
    } //-- void deleteValorTotalIssNegtv() 

    /**
     * Returns the value of field 'anoMes'.
     * 
     * @return int
     * @return the value of field 'anoMes'.
     */
    public int getAnoMes()
    {
        return this._anoMes;
    } //-- int getAnoMes() 

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
     * Returns the value of field 'qntRegistroRejeitado'.
     * 
     * @return long
     * @return the value of field 'qntRegistroRejeitado'.
     */
    public long getQntRegistroRejeitado()
    {
        return this._qntRegistroRejeitado;
    } //-- long getQntRegistroRejeitado() 

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
     * Returns the value of field 'sPercentualRejeicaoArqIss'.
     * 
     * @return double
     * @return the value of field 'sPercentualRejeicaoArqIss'.
     */
    public double getSPercentualRejeicaoArqIss()
    {
        return this._sPercentualRejeicaoArqIss;
    } //-- double getSPercentualRejeicaoArqIss() 

    /**
     * Returns the value of field 'sPeriodoFim'.
     * 
     * @return String
     * @return the value of field 'sPeriodoFim'.
     */
    public java.lang.String getSPeriodoFim()
    {
        return this._sPeriodoFim;
    } //-- java.lang.String getSPeriodoFim() 

    /**
     * Returns the value of field 'sPeriodoIni'.
     * 
     * @return String
     * @return the value of field 'sPeriodoIni'.
     */
    public java.lang.String getSPeriodoIni()
    {
        return this._sPeriodoIni;
    } //-- java.lang.String getSPeriodoIni() 

    /**
     * Returns the value of field 'sQntdRegistroAcatado'.
     * 
     * @return long
     * @return the value of field 'sQntdRegistroAcatado'.
     */
    public long getSQntdRegistroAcatado()
    {
        return this._sQntdRegistroAcatado;
    } //-- long getSQntdRegistroAcatado() 

    /**
     * Returns the value of field 'sValorAcatado'.
     * 
     * @return double
     * @return the value of field 'sValorAcatado'.
     */
    public double getSValorAcatado()
    {
        return this._sValorAcatado;
    } //-- double getSValorAcatado() 

    /**
     * Returns the value of field 'sValorRegistroRejeitado'.
     * 
     * @return double
     * @return the value of field 'sValorRegistroRejeitado'.
     */
    public double getSValorRegistroRejeitado()
    {
        return this._sValorRegistroRejeitado;
    } //-- double getSValorRegistroRejeitado() 

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
     * Returns the value of field 'valorBaseCalcApuracao'.
     * 
     * @return double
     * @return the value of field 'valorBaseCalcApuracao'.
     */
    public double getValorBaseCalcApuracao()
    {
        return this._valorBaseCalcApuracao;
    } //-- double getValorBaseCalcApuracao() 

    /**
     * Returns the value of field 'valorTotalApuracaoIss'.
     * 
     * @return double
     * @return the value of field 'valorTotalApuracaoIss'.
     */
    public double getValorTotalApuracaoIss()
    {
        return this._valorTotalApuracaoIss;
    } //-- double getValorTotalApuracaoIss() 

    /**
     * Returns the value of field 'valorTotalIssNegtv'.
     * 
     * @return double
     * @return the value of field 'valorTotalIssNegtv'.
     */
    public double getValorTotalIssNegtv()
    {
        return this._valorTotalIssNegtv;
    } //-- double getValorTotalIssNegtv() 

    /**
     * Method hasAnoMes
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnoMes()
    {
        return this._has_anoMes;
    } //-- boolean hasAnoMes() 

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
     * Method hasQntRegistroRejeitado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQntRegistroRejeitado()
    {
        return this._has_qntRegistroRejeitado;
    } //-- boolean hasQntRegistroRejeitado() 

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
     * Method hasSPercentualRejeicaoArqIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSPercentualRejeicaoArqIss()
    {
        return this._has_sPercentualRejeicaoArqIss;
    } //-- boolean hasSPercentualRejeicaoArqIss() 

    /**
     * Method hasSQntdRegistroAcatado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSQntdRegistroAcatado()
    {
        return this._has_sQntdRegistroAcatado;
    } //-- boolean hasSQntdRegistroAcatado() 

    /**
     * Method hasSValorAcatado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSValorAcatado()
    {
        return this._has_sValorAcatado;
    } //-- boolean hasSValorAcatado() 

    /**
     * Method hasSValorRegistroRejeitado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSValorRegistroRejeitado()
    {
        return this._has_sValorRegistroRejeitado;
    } //-- boolean hasSValorRegistroRejeitado() 

    /**
     * Method hasValorBaseCalcApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorBaseCalcApuracao()
    {
        return this._has_valorBaseCalcApuracao;
    } //-- boolean hasValorBaseCalcApuracao() 

    /**
     * Method hasValorTotalApuracaoIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTotalApuracaoIss()
    {
        return this._has_valorTotalApuracaoIss;
    } //-- boolean hasValorTotalApuracaoIss() 

    /**
     * Method hasValorTotalIssNegtv
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTotalIssNegtv()
    {
        return this._has_valorTotalIssNegtv;
    } //-- boolean hasValorTotalIssNegtv() 

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
    public void setAnoMes(int anoMes)
    {
        this._anoMes = anoMes;
        this._has_anoMes = true;
    } //-- void setAnoMes(int) 

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
     * Sets the value of field 'produto'.
     * 
     * @param produto the value of field 'produto'.
     */
    public void setProduto(java.lang.String produto)
    {
        this._produto = produto;
    } //-- void setProduto(java.lang.String) 

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
     * Sets the value of field 'qntRegistroRejeitado'.
     * 
     * @param qntRegistroRejeitado the value of field
     * 'qntRegistroRejeitado'.
     */
    public void setQntRegistroRejeitado(long qntRegistroRejeitado)
    {
        this._qntRegistroRejeitado = qntRegistroRejeitado;
        this._has_qntRegistroRejeitado = true;
    } //-- void setQntRegistroRejeitado(long) 

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
     * Sets the value of field 'sPercentualRejeicaoArqIss'.
     * 
     * @param sPercentualRejeicaoArqIss the value of field
     * 'sPercentualRejeicaoArqIss'.
     */
    public void setSPercentualRejeicaoArqIss(double sPercentualRejeicaoArqIss)
    {
        this._sPercentualRejeicaoArqIss = sPercentualRejeicaoArqIss;
        this._has_sPercentualRejeicaoArqIss = true;
    } //-- void setSPercentualRejeicaoArqIss(double) 

    /**
     * Sets the value of field 'sPeriodoFim'.
     * 
     * @param sPeriodoFim the value of field 'sPeriodoFim'.
     */
    public void setSPeriodoFim(java.lang.String sPeriodoFim)
    {
        this._sPeriodoFim = sPeriodoFim;
    } //-- void setSPeriodoFim(java.lang.String) 

    /**
     * Sets the value of field 'sPeriodoIni'.
     * 
     * @param sPeriodoIni the value of field 'sPeriodoIni'.
     */
    public void setSPeriodoIni(java.lang.String sPeriodoIni)
    {
        this._sPeriodoIni = sPeriodoIni;
    } //-- void setSPeriodoIni(java.lang.String) 

    /**
     * Sets the value of field 'sQntdRegistroAcatado'.
     * 
     * @param sQntdRegistroAcatado the value of field
     * 'sQntdRegistroAcatado'.
     */
    public void setSQntdRegistroAcatado(long sQntdRegistroAcatado)
    {
        this._sQntdRegistroAcatado = sQntdRegistroAcatado;
        this._has_sQntdRegistroAcatado = true;
    } //-- void setSQntdRegistroAcatado(long) 

    /**
     * Sets the value of field 'sValorAcatado'.
     * 
     * @param sValorAcatado the value of field 'sValorAcatado'.
     */
    public void setSValorAcatado(double sValorAcatado)
    {
        this._sValorAcatado = sValorAcatado;
        this._has_sValorAcatado = true;
    } //-- void setSValorAcatado(double) 

    /**
     * Sets the value of field 'sValorRegistroRejeitado'.
     * 
     * @param sValorRegistroRejeitado the value of field
     * 'sValorRegistroRejeitado'.
     */
    public void setSValorRegistroRejeitado(double sValorRegistroRejeitado)
    {
        this._sValorRegistroRejeitado = sValorRegistroRejeitado;
        this._has_sValorRegistroRejeitado = true;
    } //-- void setSValorRegistroRejeitado(double) 

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
     * Sets the value of field 'valorBaseCalcApuracao'.
     * 
     * @param valorBaseCalcApuracao the value of field
     * 'valorBaseCalcApuracao'.
     */
    public void setValorBaseCalcApuracao(double valorBaseCalcApuracao)
    {
        this._valorBaseCalcApuracao = valorBaseCalcApuracao;
        this._has_valorBaseCalcApuracao = true;
    } //-- void setValorBaseCalcApuracao(double) 

    /**
     * Sets the value of field 'valorTotalApuracaoIss'.
     * 
     * @param valorTotalApuracaoIss the value of field
     * 'valorTotalApuracaoIss'.
     */
    public void setValorTotalApuracaoIss(double valorTotalApuracaoIss)
    {
        this._valorTotalApuracaoIss = valorTotalApuracaoIss;
        this._has_valorTotalApuracaoIss = true;
    } //-- void setValorTotalApuracaoIss(double) 

    /**
     * Sets the value of field 'valorTotalIssNegtv'.
     * 
     * @param valorTotalIssNegtv the value of field
     * 'valorTotalIssNegtv'.
     */
    public void setValorTotalIssNegtv(double valorTotalIssNegtv)
    {
        this._valorTotalIssNegtv = valorTotalIssNegtv;
        this._has_valorTotalIssNegtv = true;
    } //-- void setValorTotalIssNegtv(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaConsultarArquivoEmpSemanal
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal unmarshal(java.io.Reader) 

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
