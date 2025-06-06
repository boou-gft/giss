/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarMovNaoTributavelNvContaResponse.java,v 1.1 2018/05/21 14:33:50 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response;

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
 * Class ListarMovNaoTributavelNvContaResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/05/21 14:33:50 $
 */
public class ListarMovNaoTributavelNvContaResponse implements java.io.Serializable {


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
     * Field _percentAliquota
     */
    private java.math.BigDecimal _percentAliquota = new java.math.BigDecimal("0");

    /**
     * Field _tipoIndicador
     */
    private java.lang.String _tipoIndicador;

    /**
     * Field _sinalApuracaoTotal
     */
    private java.lang.String _sinalApuracaoTotal;

    /**
     * Field _valorApuracaoTotal
     */
    private java.math.BigDecimal _valorApuracaoTotal = new java.math.BigDecimal("0");

    /**
     * Field _sinalTributoTotal
     */
    private java.lang.String _sinalTributoTotal;

    /**
     * Field _valorTributoTotal
     */
    private java.math.BigDecimal _valorTributoTotal = new java.math.BigDecimal("0");

    /**
     * Field _listaMovNaoTributavelNvContaList
     */
    private java.util.Vector _listaMovNaoTributavelNvContaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarMovNaoTributavelNvContaResponse() 
     {
        super();
        setPercentBaseCalc(new java.math.BigDecimal("0"));
        setPercentAliquota(new java.math.BigDecimal("0"));
        setValorApuracaoTotal(new java.math.BigDecimal("0"));
        setValorTributoTotal(new java.math.BigDecimal("0"));
        _listaMovNaoTributavelNvContaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListarMovNaoTributavelNvContaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaMovNaoTributavelNvConta
     * 
     * 
     * 
     * @param vListaMovNaoTributavelNvConta
     */
    public void addListaMovNaoTributavelNvConta(br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta vListaMovNaoTributavelNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaMovNaoTributavelNvContaList.size() < 350)) {
            throw new IndexOutOfBoundsException("addListaMovNaoTributavelNvConta has a maximum of 350");
        }
        _listaMovNaoTributavelNvContaList.addElement(vListaMovNaoTributavelNvConta);
    } //-- void addListaMovNaoTributavelNvConta(br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta) 

    /**
     * Method addListaMovNaoTributavelNvConta
     * 
     * 
     * 
     * @param index
     * @param vListaMovNaoTributavelNvConta
     */
    public void addListaMovNaoTributavelNvConta(int index, br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta vListaMovNaoTributavelNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaMovNaoTributavelNvContaList.size() < 350)) {
            throw new IndexOutOfBoundsException("addListaMovNaoTributavelNvConta has a maximum of 350");
        }
        _listaMovNaoTributavelNvContaList.insertElementAt(vListaMovNaoTributavelNvConta, index);
    } //-- void addListaMovNaoTributavelNvConta(int, br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta) 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaMovNaoTributavelNvConta
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaMovNaoTributavelNvConta()
    {
        return _listaMovNaoTributavelNvContaList.elements();
    } //-- java.util.Enumeration enumerateListaMovNaoTributavelNvConta() 

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
     * Method getListaMovNaoTributavelNvConta
     * 
     * 
     * 
     * @param index
     * @return ListaMovNaoTributavelNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta getListaMovNaoTributavelNvConta(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaMovNaoTributavelNvContaList.size())) {
            throw new IndexOutOfBoundsException("getListaMovNaoTributavelNvConta: Index value '"+index+"' not in range [0.."+(_listaMovNaoTributavelNvContaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta) _listaMovNaoTributavelNvContaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta getListaMovNaoTributavelNvConta(int) 

    /**
     * Method getListaMovNaoTributavelNvConta
     * 
     * 
     * 
     * @return ListaMovNaoTributavelNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta[] getListaMovNaoTributavelNvConta()
    {
        int size = _listaMovNaoTributavelNvContaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta) _listaMovNaoTributavelNvContaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta[] getListaMovNaoTributavelNvConta() 

    /**
     * Method getListaMovNaoTributavelNvContaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaMovNaoTributavelNvContaCount()
    {
        return _listaMovNaoTributavelNvContaList.size();
    } //-- int getListaMovNaoTributavelNvContaCount() 

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
     * Returns the value of field 'percentAliquota'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentAliquota'.
     */
    public java.math.BigDecimal getPercentAliquota()
    {
        return this._percentAliquota;
    } //-- java.math.BigDecimal getPercentAliquota() 

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
     * Returns the value of field 'sinalApuracaoTotal'.
     * 
     * @return String
     * @return the value of field 'sinalApuracaoTotal'.
     */
    public java.lang.String getSinalApuracaoTotal()
    {
        return this._sinalApuracaoTotal;
    } //-- java.lang.String getSinalApuracaoTotal() 

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
     * Returns the value of field 'valorApuracaoTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorApuracaoTotal'.
     */
    public java.math.BigDecimal getValorApuracaoTotal()
    {
        return this._valorApuracaoTotal;
    } //-- java.math.BigDecimal getValorApuracaoTotal() 

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
     * Method removeAllListaMovNaoTributavelNvConta
     * 
     */
    public void removeAllListaMovNaoTributavelNvConta()
    {
        _listaMovNaoTributavelNvContaList.removeAllElements();
    } //-- void removeAllListaMovNaoTributavelNvConta() 

    /**
     * Method removeListaMovNaoTributavelNvConta
     * 
     * 
     * 
     * @param index
     * @return ListaMovNaoTributavelNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta removeListaMovNaoTributavelNvConta(int index)
    {
        java.lang.Object obj = _listaMovNaoTributavelNvContaList.elementAt(index);
        _listaMovNaoTributavelNvContaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta removeListaMovNaoTributavelNvConta(int) 

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
     * Method setListaMovNaoTributavelNvConta
     * 
     * 
     * 
     * @param index
     * @param vListaMovNaoTributavelNvConta
     */
    public void setListaMovNaoTributavelNvConta(int index, br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta vListaMovNaoTributavelNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaMovNaoTributavelNvContaList.size())) {
            throw new IndexOutOfBoundsException("setListaMovNaoTributavelNvConta: Index value '"+index+"' not in range [0.." + (_listaMovNaoTributavelNvContaList.size() - 1) + "]");
        }
        if (!(index < 350)) {
            throw new IndexOutOfBoundsException("setListaMovNaoTributavelNvConta has a maximum of 350");
        }
        _listaMovNaoTributavelNvContaList.setElementAt(vListaMovNaoTributavelNvConta, index);
    } //-- void setListaMovNaoTributavelNvConta(int, br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta) 

    /**
     * Method setListaMovNaoTributavelNvConta
     * 
     * 
     * 
     * @param listaMovNaoTributavelNvContaArray
     */
    public void setListaMovNaoTributavelNvConta(br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta[] listaMovNaoTributavelNvContaArray)
    {
        //-- copy array
        _listaMovNaoTributavelNvContaList.removeAllElements();
        for (int i = 0; i < listaMovNaoTributavelNvContaArray.length; i++) {
            _listaMovNaoTributavelNvContaList.addElement(listaMovNaoTributavelNvContaArray[i]);
        }
    } //-- void setListaMovNaoTributavelNvConta(br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListaMovNaoTributavelNvConta) 

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
     * Sets the value of field 'percentAliquota'.
     * 
     * @param percentAliquota the value of field 'percentAliquota'.
     */
    public void setPercentAliquota(java.math.BigDecimal percentAliquota)
    {
        this._percentAliquota = percentAliquota;
    } //-- void setPercentAliquota(java.math.BigDecimal) 

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
     * Sets the value of field 'sinalApuracaoTotal'.
     * 
     * @param sinalApuracaoTotal the value of field
     * 'sinalApuracaoTotal'.
     */
    public void setSinalApuracaoTotal(java.lang.String sinalApuracaoTotal)
    {
        this._sinalApuracaoTotal = sinalApuracaoTotal;
    } //-- void setSinalApuracaoTotal(java.lang.String) 

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
     * Sets the value of field 'valorApuracaoTotal'.
     * 
     * @param valorApuracaoTotal the value of field
     * 'valorApuracaoTotal'.
     */
    public void setValorApuracaoTotal(java.math.BigDecimal valorApuracaoTotal)
    {
        this._valorApuracaoTotal = valorApuracaoTotal;
    } //-- void setValorApuracaoTotal(java.math.BigDecimal) 

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
     * @return ListarMovNaoTributavelNvContaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListarMovNaoTributavelNvContaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListarMovNaoTributavelNvContaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListarMovNaoTributavelNvContaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.response.ListarMovNaoTributavelNvContaResponse unmarshal(java.io.Reader) 

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
