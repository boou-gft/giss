/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarApurAposFechamentoNvContaResponse.java,v 1.1 2018/05/21 14:33:49 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response;

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
 * Class ListarApurAposFechamentoNvContaResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/05/21 14:33:49 $
 */
public class ListarApurAposFechamentoNvContaResponse implements java.io.Serializable {


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
     * Field _percentBaseCalc
     */
    private java.math.BigDecimal _percentBaseCalc = new java.math.BigDecimal("0");

    /**
     * Field _percentAliquotaPadrao
     */
    private java.math.BigDecimal _percentAliquotaPadrao = new java.math.BigDecimal("0");

    /**
     * Field _tipoIndicador
     */
    private java.lang.String _tipoIndicador;

    /**
     * Field _dataProcessamento
     */
    private java.lang.String _dataProcessamento;

    /**
     * Field _codDependencia
     */
    private int _codDependencia = 0;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;

    /**
     * Field _descDependencia
     */
    private java.lang.String _descDependencia;

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
     * Field _codUf
     */
    private java.lang.String _codUf;

    /**
     * Field _sinalMovimentoTotal
     */
    private java.lang.String _sinalMovimentoTotal;

    /**
     * Field _valorMovementoTotal
     */
    private java.math.BigDecimal _valorMovementoTotal = new java.math.BigDecimal("0");

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
     * Field _listaApurAposFechamentoNvContaList
     */
    private java.util.Vector _listaApurAposFechamentoNvContaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApurAposFechamentoNvContaResponse() 
     {
        super();
        setPercentBaseCalc(new java.math.BigDecimal("0"));
        setPercentAliquotaPadrao(new java.math.BigDecimal("0"));
        setValorMovementoTotal(new java.math.BigDecimal("0"));
        setValorTributoTotal(new java.math.BigDecimal("0"));
        setValorIssTotal(new java.math.BigDecimal("0"));
        _listaApurAposFechamentoNvContaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListarApurAposFechamentoNvContaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaApurAposFechamentoNvConta
     * 
     * 
     * 
     * @param vListaApurAposFechamentoNvConta
     */
    public void addListaApurAposFechamentoNvConta(br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta vListaApurAposFechamentoNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaApurAposFechamentoNvContaList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaApurAposFechamentoNvConta has a maximum of 200");
        }
        _listaApurAposFechamentoNvContaList.addElement(vListaApurAposFechamentoNvConta);
    } //-- void addListaApurAposFechamentoNvConta(br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta) 

    /**
     * Method addListaApurAposFechamentoNvConta
     * 
     * 
     * 
     * @param index
     * @param vListaApurAposFechamentoNvConta
     */
    public void addListaApurAposFechamentoNvConta(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta vListaApurAposFechamentoNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaApurAposFechamentoNvContaList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaApurAposFechamentoNvConta has a maximum of 200");
        }
        _listaApurAposFechamentoNvContaList.insertElementAt(vListaApurAposFechamentoNvConta, index);
    } //-- void addListaApurAposFechamentoNvConta(int, br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta) 

    /**
     * Method deleteCodDependencia
     * 
     */
    public void deleteCodDependencia()
    {
        this._has_codDependencia= false;
    } //-- void deleteCodDependencia() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaApurAposFechamentoNvConta
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaApurAposFechamentoNvConta()
    {
        return _listaApurAposFechamentoNvContaList.elements();
    } //-- java.util.Enumeration enumerateListaApurAposFechamentoNvConta() 

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return int
     * @return the value of field 'codDependencia'.
     */
    public int getCodDependencia()
    {
        return this._codDependencia;
    } //-- int getCodDependencia() 

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
     * Returns the value of field 'codUf'.
     * 
     * @return String
     * @return the value of field 'codUf'.
     */
    public java.lang.String getCodUf()
    {
        return this._codUf;
    } //-- java.lang.String getCodUf() 

    /**
     * Returns the value of field 'dataProcessamento'.
     * 
     * @return String
     * @return the value of field 'dataProcessamento'.
     */
    public java.lang.String getDataProcessamento()
    {
        return this._dataProcessamento;
    } //-- java.lang.String getDataProcessamento() 

    /**
     * Returns the value of field 'descDependencia'.
     * 
     * @return String
     * @return the value of field 'descDependencia'.
     */
    public java.lang.String getDescDependencia()
    {
        return this._descDependencia;
    } //-- java.lang.String getDescDependencia() 

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
     * Method getListaApurAposFechamentoNvConta
     * 
     * 
     * 
     * @param index
     * @return ListaApurAposFechamentoNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta getListaApurAposFechamentoNvConta(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaApurAposFechamentoNvContaList.size())) {
            throw new IndexOutOfBoundsException("getListaApurAposFechamentoNvConta: Index value '"+index+"' not in range [0.."+(_listaApurAposFechamentoNvContaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta) _listaApurAposFechamentoNvContaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta getListaApurAposFechamentoNvConta(int) 

    /**
     * Method getListaApurAposFechamentoNvConta
     * 
     * 
     * 
     * @return ListaApurAposFechamentoNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta[] getListaApurAposFechamentoNvConta()
    {
        int size = _listaApurAposFechamentoNvContaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta) _listaApurAposFechamentoNvContaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta[] getListaApurAposFechamentoNvConta() 

    /**
     * Method getListaApurAposFechamentoNvContaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaApurAposFechamentoNvContaCount()
    {
        return _listaApurAposFechamentoNvContaList.size();
    } //-- int getListaApurAposFechamentoNvContaCount() 

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
     * Returns the value of field 'percentBaseCalc'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentBaseCalc'.
     */
    public java.math.BigDecimal getPercentBaseCalc()
    {
        return this._percentBaseCalc;
    } //-- java.math.BigDecimal getPercentBaseCalc() 

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
     * Returns the value of field 'tipoIndicador'.
     * 
     * @return String
     * @return the value of field 'tipoIndicador'.
     */
    public java.lang.String getTipoIndicador()
    {
        return this._tipoIndicador;
    } //-- java.lang.String getTipoIndicador() 

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
     * Returns the value of field 'valorMovementoTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorMovementoTotal'.
     */
    public java.math.BigDecimal getValorMovementoTotal()
    {
        return this._valorMovementoTotal;
    } //-- java.math.BigDecimal getValorMovementoTotal() 

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
     * Method hasCodDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodDependencia()
    {
        return this._has_codDependencia;
    } //-- boolean hasCodDependencia() 

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
     * Method removeAllListaApurAposFechamentoNvConta
     * 
     */
    public void removeAllListaApurAposFechamentoNvConta()
    {
        _listaApurAposFechamentoNvContaList.removeAllElements();
    } //-- void removeAllListaApurAposFechamentoNvConta() 

    /**
     * Method removeListaApurAposFechamentoNvConta
     * 
     * 
     * 
     * @param index
     * @return ListaApurAposFechamentoNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta removeListaApurAposFechamentoNvConta(int index)
    {
        java.lang.Object obj = _listaApurAposFechamentoNvContaList.elementAt(index);
        _listaApurAposFechamentoNvContaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta removeListaApurAposFechamentoNvConta(int) 

    /**
     * Sets the value of field 'codDependencia'.
     * 
     * @param codDependencia the value of field 'codDependencia'.
     */
    public void setCodDependencia(int codDependencia)
    {
        this._codDependencia = codDependencia;
        this._has_codDependencia = true;
    } //-- void setCodDependencia(int) 

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
     * Sets the value of field 'codUf'.
     * 
     * @param codUf the value of field 'codUf'.
     */
    public void setCodUf(java.lang.String codUf)
    {
        this._codUf = codUf;
    } //-- void setCodUf(java.lang.String) 

    /**
     * Sets the value of field 'dataProcessamento'.
     * 
     * @param dataProcessamento the value of field
     * 'dataProcessamento'.
     */
    public void setDataProcessamento(java.lang.String dataProcessamento)
    {
        this._dataProcessamento = dataProcessamento;
    } //-- void setDataProcessamento(java.lang.String) 

    /**
     * Sets the value of field 'descDependencia'.
     * 
     * @param descDependencia the value of field 'descDependencia'.
     */
    public void setDescDependencia(java.lang.String descDependencia)
    {
        this._descDependencia = descDependencia;
    } //-- void setDescDependencia(java.lang.String) 

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
     * Method setListaApurAposFechamentoNvConta
     * 
     * 
     * 
     * @param index
     * @param vListaApurAposFechamentoNvConta
     */
    public void setListaApurAposFechamentoNvConta(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta vListaApurAposFechamentoNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaApurAposFechamentoNvContaList.size())) {
            throw new IndexOutOfBoundsException("setListaApurAposFechamentoNvConta: Index value '"+index+"' not in range [0.." + (_listaApurAposFechamentoNvContaList.size() - 1) + "]");
        }
        if (!(index < 200)) {
            throw new IndexOutOfBoundsException("setListaApurAposFechamentoNvConta has a maximum of 200");
        }
        _listaApurAposFechamentoNvContaList.setElementAt(vListaApurAposFechamentoNvConta, index);
    } //-- void setListaApurAposFechamentoNvConta(int, br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta) 

    /**
     * Method setListaApurAposFechamentoNvConta
     * 
     * 
     * 
     * @param listaApurAposFechamentoNvContaArray
     */
    public void setListaApurAposFechamentoNvConta(br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta[] listaApurAposFechamentoNvContaArray)
    {
        //-- copy array
        _listaApurAposFechamentoNvContaList.removeAllElements();
        for (int i = 0; i < listaApurAposFechamentoNvContaArray.length; i++) {
            _listaApurAposFechamentoNvContaList.addElement(listaApurAposFechamentoNvContaArray[i]);
        }
    } //-- void setListaApurAposFechamentoNvConta(br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta) 

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
     * Sets the value of field 'percentBaseCalc'.
     * 
     * @param percentBaseCalc the value of field 'percentBaseCalc'.
     */
    public void setPercentBaseCalc(java.math.BigDecimal percentBaseCalc)
    {
        this._percentBaseCalc = percentBaseCalc;
    } //-- void setPercentBaseCalc(java.math.BigDecimal) 

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
     * Sets the value of field 'tipoIndicador'.
     * 
     * @param tipoIndicador the value of field 'tipoIndicador'.
     */
    public void setTipoIndicador(java.lang.String tipoIndicador)
    {
        this._tipoIndicador = tipoIndicador;
    } //-- void setTipoIndicador(java.lang.String) 

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
     * Sets the value of field 'valorMovementoTotal'.
     * 
     * @param valorMovementoTotal the value of field
     * 'valorMovementoTotal'.
     */
    public void setValorMovementoTotal(java.math.BigDecimal valorMovementoTotal)
    {
        this._valorMovementoTotal = valorMovementoTotal;
    } //-- void setValorMovementoTotal(java.math.BigDecimal) 

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
     * @return ListarApurAposFechamentoNvContaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListarApurAposFechamentoNvContaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListarApurAposFechamentoNvContaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListarApurAposFechamentoNvContaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListarApurAposFechamentoNvContaResponse unmarshal(java.io.Reader) 

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
