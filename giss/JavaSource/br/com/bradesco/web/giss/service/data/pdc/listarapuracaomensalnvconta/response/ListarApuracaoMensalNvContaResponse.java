/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarApuracaoMensalNvContaResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarApuracaoMensalNvContaResponse implements java.io.Serializable {


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
     * Field _percentBaseCalculo
     */
    private double _percentBaseCalculo = 0;

    /**
     * keeps track of state for field: _percentBaseCalculo
     */
    private boolean _has_percentBaseCalculo;

    /**
     * Field _percentAliquotaPadrao
     */
    private double _percentAliquotaPadrao = 0;

    /**
     * keeps track of state for field: _percentAliquotaPadrao
     */
    private boolean _has_percentAliquotaPadrao;

    /**
     * Field _tipoIndicador
     */
    private java.lang.String _tipoIndicador;

    /**
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _sinalApuracaoTotal
     */
    private java.lang.String _sinalApuracaoTotal;

    /**
     * Field _valorApuracaoTotal
     */
    private double _valorApuracaoTotal = 0;

    /**
     * keeps track of state for field: _valorApuracaoTotal
     */
    private boolean _has_valorApuracaoTotal;

    /**
     * Field _sinalTributoTotal
     */
    private java.lang.String _sinalTributoTotal;

    /**
     * Field _valorTributoTotal
     */
    private double _valorTributoTotal = 0;

    /**
     * keeps track of state for field: _valorTributoTotal
     */
    private boolean _has_valorTributoTotal;

    /**
     * Field _sinalTributavelTotal
     */
    private java.lang.String _sinalTributavelTotal;

    /**
     * Field _valorTribututavelTotal
     */
    private double _valorTribututavelTotal = 0;

    /**
     * keeps track of state for field: _valorTribututavelTotal
     */
    private boolean _has_valorTribututavelTotal;

    /**
     * Field _listaApuracaoMensalNvContaList
     */
    private java.util.Vector _listaApuracaoMensalNvContaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoMensalNvContaResponse() 
     {
        super();
        _listaApuracaoMensalNvContaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListarApuracaoMensalNvContaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaApuracaoMensalNvConta
     * 
     * 
     * 
     * @param vListaApuracaoMensalNvConta
     */
    public void addListaApuracaoMensalNvConta(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta vListaApuracaoMensalNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaApuracaoMensalNvContaList.addElement(vListaApuracaoMensalNvConta);
    } //-- void addListaApuracaoMensalNvConta(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta) 

    /**
     * Method addListaApuracaoMensalNvConta
     * 
     * 
     * 
     * @param index
     * @param vListaApuracaoMensalNvConta
     */
    public void addListaApuracaoMensalNvConta(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta vListaApuracaoMensalNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaApuracaoMensalNvContaList.insertElementAt(vListaApuracaoMensalNvConta, index);
    } //-- void addListaApuracaoMensalNvConta(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta) 

    /**
     * Method deletePercentAliquotaPadrao
     * 
     */
    public void deletePercentAliquotaPadrao()
    {
        this._has_percentAliquotaPadrao= false;
    } //-- void deletePercentAliquotaPadrao() 

    /**
     * Method deletePercentBaseCalculo
     * 
     */
    public void deletePercentBaseCalculo()
    {
        this._has_percentBaseCalculo= false;
    } //-- void deletePercentBaseCalculo() 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method deleteValorApuracaoTotal
     * 
     */
    public void deleteValorApuracaoTotal()
    {
        this._has_valorApuracaoTotal= false;
    } //-- void deleteValorApuracaoTotal() 

    /**
     * Method deleteValorTributoTotal
     * 
     */
    public void deleteValorTributoTotal()
    {
        this._has_valorTributoTotal= false;
    } //-- void deleteValorTributoTotal() 

    /**
     * Method deleteValorTribututavelTotal
     * 
     */
    public void deleteValorTribututavelTotal()
    {
        this._has_valorTribututavelTotal= false;
    } //-- void deleteValorTribututavelTotal() 

    /**
     * Method enumerateListaApuracaoMensalNvConta
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaApuracaoMensalNvConta()
    {
        return _listaApuracaoMensalNvContaList.elements();
    } //-- java.util.Enumeration enumerateListaApuracaoMensalNvConta() 

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
     * Method getListaApuracaoMensalNvConta
     * 
     * 
     * 
     * @param index
     * @return ListaApuracaoMensalNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta getListaApuracaoMensalNvConta(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaApuracaoMensalNvContaList.size())) {
            throw new IndexOutOfBoundsException("getListaApuracaoMensalNvConta: Index value '"+index+"' not in range [0.."+(_listaApuracaoMensalNvContaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta) _listaApuracaoMensalNvContaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta getListaApuracaoMensalNvConta(int) 

    /**
     * Method getListaApuracaoMensalNvConta
     * 
     * 
     * 
     * @return ListaApuracaoMensalNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta[] getListaApuracaoMensalNvConta()
    {
        int size = _listaApuracaoMensalNvContaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta) _listaApuracaoMensalNvContaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta[] getListaApuracaoMensalNvConta() 

    /**
     * Method getListaApuracaoMensalNvContaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaApuracaoMensalNvContaCount()
    {
        return _listaApuracaoMensalNvContaList.size();
    } //-- int getListaApuracaoMensalNvContaCount() 

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
     * @return double
     * @return the value of field 'percentAliquotaPadrao'.
     */
    public double getPercentAliquotaPadrao()
    {
        return this._percentAliquotaPadrao;
    } //-- double getPercentAliquotaPadrao() 

    /**
     * Returns the value of field 'percentBaseCalculo'.
     * 
     * @return double
     * @return the value of field 'percentBaseCalculo'.
     */
    public double getPercentBaseCalculo()
    {
        return this._percentBaseCalculo;
    } //-- double getPercentBaseCalculo() 

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
     * Returns the value of field 'sinalTributavelTotal'.
     * 
     * @return String
     * @return the value of field 'sinalTributavelTotal'.
     */
    public java.lang.String getSinalTributavelTotal()
    {
        return this._sinalTributavelTotal;
    } //-- java.lang.String getSinalTributavelTotal() 

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
     * @return double
     * @return the value of field 'valorApuracaoTotal'.
     */
    public double getValorApuracaoTotal()
    {
        return this._valorApuracaoTotal;
    } //-- double getValorApuracaoTotal() 

    /**
     * Returns the value of field 'valorTributoTotal'.
     * 
     * @return double
     * @return the value of field 'valorTributoTotal'.
     */
    public double getValorTributoTotal()
    {
        return this._valorTributoTotal;
    } //-- double getValorTributoTotal() 

    /**
     * Returns the value of field 'valorTribututavelTotal'.
     * 
     * @return double
     * @return the value of field 'valorTribututavelTotal'.
     */
    public double getValorTribututavelTotal()
    {
        return this._valorTribututavelTotal;
    } //-- double getValorTribututavelTotal() 

    /**
     * Method hasPercentAliquotaPadrao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPercentAliquotaPadrao()
    {
        return this._has_percentAliquotaPadrao;
    } //-- boolean hasPercentAliquotaPadrao() 

    /**
     * Method hasPercentBaseCalculo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPercentBaseCalculo()
    {
        return this._has_percentBaseCalculo;
    } //-- boolean hasPercentBaseCalculo() 

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
     * Method hasValorApuracaoTotal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorApuracaoTotal()
    {
        return this._has_valorApuracaoTotal;
    } //-- boolean hasValorApuracaoTotal() 

    /**
     * Method hasValorTributoTotal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTributoTotal()
    {
        return this._has_valorTributoTotal;
    } //-- boolean hasValorTributoTotal() 

    /**
     * Method hasValorTribututavelTotal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTribututavelTotal()
    {
        return this._has_valorTribututavelTotal;
    } //-- boolean hasValorTribututavelTotal() 

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
     * Method removeAllListaApuracaoMensalNvConta
     * 
     */
    public void removeAllListaApuracaoMensalNvConta()
    {
        _listaApuracaoMensalNvContaList.removeAllElements();
    } //-- void removeAllListaApuracaoMensalNvConta() 

    /**
     * Method removeListaApuracaoMensalNvConta
     * 
     * 
     * 
     * @param index
     * @return ListaApuracaoMensalNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta removeListaApuracaoMensalNvConta(int index)
    {
        java.lang.Object obj = _listaApuracaoMensalNvContaList.elementAt(index);
        _listaApuracaoMensalNvContaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta removeListaApuracaoMensalNvConta(int) 

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
     * Method setListaApuracaoMensalNvConta
     * 
     * 
     * 
     * @param index
     * @param vListaApuracaoMensalNvConta
     */
    public void setListaApuracaoMensalNvConta(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta vListaApuracaoMensalNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaApuracaoMensalNvContaList.size())) {
            throw new IndexOutOfBoundsException("setListaApuracaoMensalNvConta: Index value '"+index+"' not in range [0.." + (_listaApuracaoMensalNvContaList.size() - 1) + "]");
        }
        _listaApuracaoMensalNvContaList.setElementAt(vListaApuracaoMensalNvConta, index);
    } //-- void setListaApuracaoMensalNvConta(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta) 

    /**
     * Method setListaApuracaoMensalNvConta
     * 
     * 
     * 
     * @param listaApuracaoMensalNvContaArray
     */
    public void setListaApuracaoMensalNvConta(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta[] listaApuracaoMensalNvContaArray)
    {
        //-- copy array
        _listaApuracaoMensalNvContaList.removeAllElements();
        for (int i = 0; i < listaApuracaoMensalNvContaArray.length; i++) {
            _listaApuracaoMensalNvContaList.addElement(listaApuracaoMensalNvContaArray[i]);
        }
    } //-- void setListaApuracaoMensalNvConta(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta) 

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
    public void setPercentAliquotaPadrao(double percentAliquotaPadrao)
    {
        this._percentAliquotaPadrao = percentAliquotaPadrao;
        this._has_percentAliquotaPadrao = true;
    } //-- void setPercentAliquotaPadrao(double) 

    /**
     * Sets the value of field 'percentBaseCalculo'.
     * 
     * @param percentBaseCalculo the value of field
     * 'percentBaseCalculo'.
     */
    public void setPercentBaseCalculo(double percentBaseCalculo)
    {
        this._percentBaseCalculo = percentBaseCalculo;
        this._has_percentBaseCalculo = true;
    } //-- void setPercentBaseCalculo(double) 

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
     * Sets the value of field 'sinalTributavelTotal'.
     * 
     * @param sinalTributavelTotal the value of field
     * 'sinalTributavelTotal'.
     */
    public void setSinalTributavelTotal(java.lang.String sinalTributavelTotal)
    {
        this._sinalTributavelTotal = sinalTributavelTotal;
    } //-- void setSinalTributavelTotal(java.lang.String) 

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
    public void setValorApuracaoTotal(double valorApuracaoTotal)
    {
        this._valorApuracaoTotal = valorApuracaoTotal;
        this._has_valorApuracaoTotal = true;
    } //-- void setValorApuracaoTotal(double) 

    /**
     * Sets the value of field 'valorTributoTotal'.
     * 
     * @param valorTributoTotal the value of field
     * 'valorTributoTotal'.
     */
    public void setValorTributoTotal(double valorTributoTotal)
    {
        this._valorTributoTotal = valorTributoTotal;
        this._has_valorTributoTotal = true;
    } //-- void setValorTributoTotal(double) 

    /**
     * Sets the value of field 'valorTribututavelTotal'.
     * 
     * @param valorTribututavelTotal the value of field
     * 'valorTribututavelTotal'.
     */
    public void setValorTribututavelTotal(double valorTribututavelTotal)
    {
        this._valorTribututavelTotal = valorTribututavelTotal;
        this._has_valorTribututavelTotal = true;
    } //-- void setValorTribututavelTotal(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarApuracaoMensalNvContaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListarApuracaoMensalNvContaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListarApuracaoMensalNvContaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListarApuracaoMensalNvContaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListarApuracaoMensalNvContaResponse unmarshal(java.io.Reader) 

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
