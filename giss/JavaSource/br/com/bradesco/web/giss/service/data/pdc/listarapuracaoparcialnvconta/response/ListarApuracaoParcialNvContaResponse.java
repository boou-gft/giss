/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarApuracaoParcialNvContaResponse.java,v 1.1 2018/05/21 14:33:45 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarApuracaoParcialNvContaResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/05/21 14:33:45 $
 */
public class ListarApuracaoParcialNvContaResponse implements java.io.Serializable {


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
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _percentBaseCalculo
     */
    private java.math.BigDecimal _percentBaseCalculo = new java.math.BigDecimal("0");

    /**
     * Field _percentAliquotaPadrao
     */
    private java.math.BigDecimal _percentAliquotaPadrao = new java.math.BigDecimal("0");

    /**
     * Field _descTipoIndicador
     */
    private java.lang.String _descTipoIndicador;

    /**
     * Field _numSolicitacaoApuracao
     */
    private int _numSolicitacaoApuracao = 0;

    /**
     * keeps track of state for field: _numSolicitacaoApuracao
     */
    private boolean _has_numSolicitacaoApuracao;

    /**
     * Field _dataSolicitacaoApuracao
     */
    private java.lang.String _dataSolicitacaoApuracao;

    /**
     * Field _horaProcessamento
     */
    private java.lang.String _horaProcessamento;

    /**
     * Field _sinalMovimentoTotal
     */
    private java.lang.String _sinalMovimentoTotal;

    /**
     * Field _valorMovimentoTotal
     */
    private java.math.BigDecimal _valorMovimentoTotal = new java.math.BigDecimal("0");

    /**
     * Field _sinalTributoTotal
     */
    private java.lang.String _sinalTributoTotal;

    /**
     * Field _valorTributoTotal
     */
    private java.math.BigDecimal _valorTributoTotal = new java.math.BigDecimal("0");

    /**
     * Field _sinalIssTotal
     */
    private java.lang.String _sinalIssTotal;

    /**
     * Field _valorIssTotal
     */
    private java.math.BigDecimal _valorIssTotal = new java.math.BigDecimal("0");

    /**
     * Field _listaApuracaoParcialNvContaList
     */
    private java.util.Vector _listaApuracaoParcialNvContaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoParcialNvContaResponse() 
     {
        super();
        setPercentBaseCalculo(new java.math.BigDecimal("0"));
        setPercentAliquotaPadrao(new java.math.BigDecimal("0"));
        setValorMovimentoTotal(new java.math.BigDecimal("0"));
        setValorTributoTotal(new java.math.BigDecimal("0"));
        setValorIssTotal(new java.math.BigDecimal("0"));
        _listaApuracaoParcialNvContaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListarApuracaoParcialNvContaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaApuracaoParcialNvConta
     * 
     * 
     * 
     * @param vListaApuracaoParcialNvConta
     */
    public void addListaApuracaoParcialNvConta(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta vListaApuracaoParcialNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaApuracaoParcialNvContaList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaApuracaoParcialNvConta has a maximum of 200");
        }
        _listaApuracaoParcialNvContaList.addElement(vListaApuracaoParcialNvConta);
    } //-- void addListaApuracaoParcialNvConta(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta) 

    /**
     * Method addListaApuracaoParcialNvConta
     * 
     * 
     * 
     * @param index
     * @param vListaApuracaoParcialNvConta
     */
    public void addListaApuracaoParcialNvConta(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta vListaApuracaoParcialNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaApuracaoParcialNvContaList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaApuracaoParcialNvConta has a maximum of 200");
        }
        _listaApuracaoParcialNvContaList.insertElementAt(vListaApuracaoParcialNvConta, index);
    } //-- void addListaApuracaoParcialNvConta(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta) 

    /**
     * Method deleteNumSolicitacaoApuracao
     * 
     */
    public void deleteNumSolicitacaoApuracao()
    {
        this._has_numSolicitacaoApuracao= false;
    } //-- void deleteNumSolicitacaoApuracao() 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaApuracaoParcialNvConta
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaApuracaoParcialNvConta()
    {
        return _listaApuracaoParcialNvContaList.elements();
    } //-- java.util.Enumeration enumerateListaApuracaoParcialNvConta() 

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
     * Returns the value of field 'dataSolicitacaoApuracao'.
     * 
     * @return String
     * @return the value of field 'dataSolicitacaoApuracao'.
     */
    public java.lang.String getDataSolicitacaoApuracao()
    {
        return this._dataSolicitacaoApuracao;
    } //-- java.lang.String getDataSolicitacaoApuracao() 

    /**
     * Returns the value of field 'descTipoIndicador'.
     * 
     * @return String
     * @return the value of field 'descTipoIndicador'.
     */
    public java.lang.String getDescTipoIndicador()
    {
        return this._descTipoIndicador;
    } //-- java.lang.String getDescTipoIndicador() 

    /**
     * Returns the value of field 'horaProcessamento'.
     * 
     * @return String
     * @return the value of field 'horaProcessamento'.
     */
    public java.lang.String getHoraProcessamento()
    {
        return this._horaProcessamento;
    } //-- java.lang.String getHoraProcessamento() 

    /**
     * Method getListaApuracaoParcialNvConta
     * 
     * 
     * 
     * @param index
     * @return ListaApuracaoParcialNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta getListaApuracaoParcialNvConta(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaApuracaoParcialNvContaList.size())) {
            throw new IndexOutOfBoundsException("getListaApuracaoParcialNvConta: Index value '"+index+"' not in range [0.."+(_listaApuracaoParcialNvContaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta) _listaApuracaoParcialNvContaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta getListaApuracaoParcialNvConta(int) 

    /**
     * Method getListaApuracaoParcialNvConta
     * 
     * 
     * 
     * @return ListaApuracaoParcialNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta[] getListaApuracaoParcialNvConta()
    {
        int size = _listaApuracaoParcialNvContaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta) _listaApuracaoParcialNvContaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta[] getListaApuracaoParcialNvConta() 

    /**
     * Method getListaApuracaoParcialNvContaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaApuracaoParcialNvContaCount()
    {
        return _listaApuracaoParcialNvContaList.size();
    } //-- int getListaApuracaoParcialNvContaCount() 

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
     * Returns the value of field 'numSolicitacaoApuracao'.
     * 
     * @return int
     * @return the value of field 'numSolicitacaoApuracao'.
     */
    public int getNumSolicitacaoApuracao()
    {
        return this._numSolicitacaoApuracao;
    } //-- int getNumSolicitacaoApuracao() 

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
     * Returns the value of field 'qtdeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdeOcorrencias'.
     */
    public int getQtdeOcorrencias()
    {
        return this._qtdeOcorrencias;
    } //-- int getQtdeOcorrencias() 

    /**
     * Returns the value of field 'sinalIssTotal'.
     * 
     * @return String
     * @return the value of field 'sinalIssTotal'.
     */
    public java.lang.String getSinalIssTotal()
    {
        return this._sinalIssTotal;
    } //-- java.lang.String getSinalIssTotal() 

    /**
     * Returns the value of field 'sinalMovimentoTotal'.
     * 
     * @return String
     * @return the value of field 'sinalMovimentoTotal'.
     */
    public java.lang.String getSinalMovimentoTotal()
    {
        return this._sinalMovimentoTotal;
    } //-- java.lang.String getSinalMovimentoTotal() 

    /**
     * Returns the value of field 'sinalTributoTotal'.
     * 
     * @return String
     * @return the value of field 'sinalTributoTotal'.
     */
    public java.lang.String getSinalTributoTotal()
    {
        return this._sinalTributoTotal;
    } //-- java.lang.String getSinalTributoTotal() 

    /**
     * Returns the value of field 'valorIssTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorIssTotal'.
     */
    public java.math.BigDecimal getValorIssTotal()
    {
        return this._valorIssTotal;
    } //-- java.math.BigDecimal getValorIssTotal() 

    /**
     * Returns the value of field 'valorMovimentoTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorMovimentoTotal'.
     */
    public java.math.BigDecimal getValorMovimentoTotal()
    {
        return this._valorMovimentoTotal;
    } //-- java.math.BigDecimal getValorMovimentoTotal() 

    /**
     * Returns the value of field 'valorTributoTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTributoTotal'.
     */
    public java.math.BigDecimal getValorTributoTotal()
    {
        return this._valorTributoTotal;
    } //-- java.math.BigDecimal getValorTributoTotal() 

    /**
     * Method hasNumSolicitacaoApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumSolicitacaoApuracao()
    {
        return this._has_numSolicitacaoApuracao;
    } //-- boolean hasNumSolicitacaoApuracao() 

    /**
     * Method hasQtdeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcorrencias()
    {
        return this._has_qtdeOcorrencias;
    } //-- boolean hasQtdeOcorrencias() 

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
     * Method removeAllListaApuracaoParcialNvConta
     * 
     */
    public void removeAllListaApuracaoParcialNvConta()
    {
        _listaApuracaoParcialNvContaList.removeAllElements();
    } //-- void removeAllListaApuracaoParcialNvConta() 

    /**
     * Method removeListaApuracaoParcialNvConta
     * 
     * 
     * 
     * @param index
     * @return ListaApuracaoParcialNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta removeListaApuracaoParcialNvConta(int index)
    {
        java.lang.Object obj = _listaApuracaoParcialNvContaList.elementAt(index);
        _listaApuracaoParcialNvContaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta removeListaApuracaoParcialNvConta(int) 

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
     * Sets the value of field 'dataSolicitacaoApuracao'.
     * 
     * @param dataSolicitacaoApuracao the value of field
     * 'dataSolicitacaoApuracao'.
     */
    public void setDataSolicitacaoApuracao(java.lang.String dataSolicitacaoApuracao)
    {
        this._dataSolicitacaoApuracao = dataSolicitacaoApuracao;
    } //-- void setDataSolicitacaoApuracao(java.lang.String) 

    /**
     * Sets the value of field 'descTipoIndicador'.
     * 
     * @param descTipoIndicador the value of field
     * 'descTipoIndicador'.
     */
    public void setDescTipoIndicador(java.lang.String descTipoIndicador)
    {
        this._descTipoIndicador = descTipoIndicador;
    } //-- void setDescTipoIndicador(java.lang.String) 

    /**
     * Sets the value of field 'horaProcessamento'.
     * 
     * @param horaProcessamento the value of field
     * 'horaProcessamento'.
     */
    public void setHoraProcessamento(java.lang.String horaProcessamento)
    {
        this._horaProcessamento = horaProcessamento;
    } //-- void setHoraProcessamento(java.lang.String) 

    /**
     * Method setListaApuracaoParcialNvConta
     * 
     * 
     * 
     * @param index
     * @param vListaApuracaoParcialNvConta
     */
    public void setListaApuracaoParcialNvConta(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta vListaApuracaoParcialNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaApuracaoParcialNvContaList.size())) {
            throw new IndexOutOfBoundsException("setListaApuracaoParcialNvConta: Index value '"+index+"' not in range [0.." + (_listaApuracaoParcialNvContaList.size() - 1) + "]");
        }
        if (!(index < 200)) {
            throw new IndexOutOfBoundsException("setListaApuracaoParcialNvConta has a maximum of 200");
        }
        _listaApuracaoParcialNvContaList.setElementAt(vListaApuracaoParcialNvConta, index);
    } //-- void setListaApuracaoParcialNvConta(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta) 

    /**
     * Method setListaApuracaoParcialNvConta
     * 
     * 
     * 
     * @param listaApuracaoParcialNvContaArray
     */
    public void setListaApuracaoParcialNvConta(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta[] listaApuracaoParcialNvContaArray)
    {
        //-- copy array
        _listaApuracaoParcialNvContaList.removeAllElements();
        for (int i = 0; i < listaApuracaoParcialNvContaArray.length; i++) {
            _listaApuracaoParcialNvContaList.addElement(listaApuracaoParcialNvContaArray[i]);
        }
    } //-- void setListaApuracaoParcialNvConta(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListaApuracaoParcialNvConta) 

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
     * Sets the value of field 'numSolicitacaoApuracao'.
     * 
     * @param numSolicitacaoApuracao the value of field
     * 'numSolicitacaoApuracao'.
     */
    public void setNumSolicitacaoApuracao(int numSolicitacaoApuracao)
    {
        this._numSolicitacaoApuracao = numSolicitacaoApuracao;
        this._has_numSolicitacaoApuracao = true;
    } //-- void setNumSolicitacaoApuracao(int) 

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
     * Sets the value of field 'qtdeOcorrencias'.
     * 
     * @param qtdeOcorrencias the value of field 'qtdeOcorrencias'.
     */
    public void setQtdeOcorrencias(int qtdeOcorrencias)
    {
        this._qtdeOcorrencias = qtdeOcorrencias;
        this._has_qtdeOcorrencias = true;
    } //-- void setQtdeOcorrencias(int) 

    /**
     * Sets the value of field 'sinalIssTotal'.
     * 
     * @param sinalIssTotal the value of field 'sinalIssTotal'.
     */
    public void setSinalIssTotal(java.lang.String sinalIssTotal)
    {
        this._sinalIssTotal = sinalIssTotal;
    } //-- void setSinalIssTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalMovimentoTotal'.
     * 
     * @param sinalMovimentoTotal the value of field
     * 'sinalMovimentoTotal'.
     */
    public void setSinalMovimentoTotal(java.lang.String sinalMovimentoTotal)
    {
        this._sinalMovimentoTotal = sinalMovimentoTotal;
    } //-- void setSinalMovimentoTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalTributoTotal'.
     * 
     * @param sinalTributoTotal the value of field
     * 'sinalTributoTotal'.
     */
    public void setSinalTributoTotal(java.lang.String sinalTributoTotal)
    {
        this._sinalTributoTotal = sinalTributoTotal;
    } //-- void setSinalTributoTotal(java.lang.String) 

    /**
     * Sets the value of field 'valorIssTotal'.
     * 
     * @param valorIssTotal the value of field 'valorIssTotal'.
     */
    public void setValorIssTotal(java.math.BigDecimal valorIssTotal)
    {
        this._valorIssTotal = valorIssTotal;
    } //-- void setValorIssTotal(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorMovimentoTotal'.
     * 
     * @param valorMovimentoTotal the value of field
     * 'valorMovimentoTotal'.
     */
    public void setValorMovimentoTotal(java.math.BigDecimal valorMovimentoTotal)
    {
        this._valorMovimentoTotal = valorMovimentoTotal;
    } //-- void setValorMovimentoTotal(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTributoTotal'.
     * 
     * @param valorTributoTotal the value of field
     * 'valorTributoTotal'.
     */
    public void setValorTributoTotal(java.math.BigDecimal valorTributoTotal)
    {
        this._valorTributoTotal = valorTributoTotal;
    } //-- void setValorTributoTotal(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarApuracaoParcialNvContaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListarApuracaoParcialNvContaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListarApuracaoParcialNvContaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListarApuracaoParcialNvContaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.response.ListarApuracaoParcialNvContaResponse unmarshal(java.io.Reader) 

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
