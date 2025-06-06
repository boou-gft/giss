/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response;

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
 * Class ListarValorMesTotalNvContaResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarValorMesTotalNvContaResponse implements java.io.Serializable {


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
     * Field _sinalTotalReceita
     */
    private java.lang.String _sinalTotalReceita;

    /**
     * Field _valorTotalReceita
     */
    private double _valorTotalReceita = 0;

    /**
     * keeps track of state for field: _valorTotalReceita
     */
    private boolean _has_valorTotalReceita;

    /**
     * Field _sinalTotalIss
     */
    private java.lang.String _sinalTotalIss;

    /**
     * Field _valorTotalIss
     */
    private double _valorTotalIss = 0;

    /**
     * keeps track of state for field: _valorTotalIss
     */
    private boolean _has_valorTotalIss;

    /**
     * Field _listaValorMesTotalNvContaList
     */
    private java.util.Vector _listaValorMesTotalNvContaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarValorMesTotalNvContaResponse() 
     {
        super();
        _listaValorMesTotalNvContaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListarValorMesTotalNvContaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaValorMesTotalNvConta
     * 
     * 
     * 
     * @param vListaValorMesTotalNvConta
     */
    public void addListaValorMesTotalNvConta(br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta vListaValorMesTotalNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaValorMesTotalNvContaList.addElement(vListaValorMesTotalNvConta);
    } //-- void addListaValorMesTotalNvConta(br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta) 

    /**
     * Method addListaValorMesTotalNvConta
     * 
     * 
     * 
     * @param index
     * @param vListaValorMesTotalNvConta
     */
    public void addListaValorMesTotalNvConta(int index, br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta vListaValorMesTotalNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaValorMesTotalNvContaList.insertElementAt(vListaValorMesTotalNvConta, index);
    } //-- void addListaValorMesTotalNvConta(int, br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta) 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method deleteValorTotalIss
     * 
     */
    public void deleteValorTotalIss()
    {
        this._has_valorTotalIss= false;
    } //-- void deleteValorTotalIss() 

    /**
     * Method deleteValorTotalReceita
     * 
     */
    public void deleteValorTotalReceita()
    {
        this._has_valorTotalReceita= false;
    } //-- void deleteValorTotalReceita() 

    /**
     * Method enumerateListaValorMesTotalNvConta
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaValorMesTotalNvConta()
    {
        return _listaValorMesTotalNvContaList.elements();
    } //-- java.util.Enumeration enumerateListaValorMesTotalNvConta() 

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
     * Method getListaValorMesTotalNvConta
     * 
     * 
     * 
     * @param index
     * @return ListaValorMesTotalNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta getListaValorMesTotalNvConta(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaValorMesTotalNvContaList.size())) {
            throw new IndexOutOfBoundsException("getListaValorMesTotalNvConta: Index value '"+index+"' not in range [0.."+(_listaValorMesTotalNvContaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta) _listaValorMesTotalNvContaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta getListaValorMesTotalNvConta(int) 

    /**
     * Method getListaValorMesTotalNvConta
     * 
     * 
     * 
     * @return ListaValorMesTotalNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta[] getListaValorMesTotalNvConta()
    {
        int size = _listaValorMesTotalNvContaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta) _listaValorMesTotalNvContaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta[] getListaValorMesTotalNvConta() 

    /**
     * Method getListaValorMesTotalNvContaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaValorMesTotalNvContaCount()
    {
        return _listaValorMesTotalNvContaList.size();
    } //-- int getListaValorMesTotalNvContaCount() 

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
     * Returns the value of field 'sinalTotalIss'.
     * 
     * @return String
     * @return the value of field 'sinalTotalIss'.
     */
    public java.lang.String getSinalTotalIss()
    {
        return this._sinalTotalIss;
    } //-- java.lang.String getSinalTotalIss() 

    /**
     * Returns the value of field 'sinalTotalReceita'.
     * 
     * @return String
     * @return the value of field 'sinalTotalReceita'.
     */
    public java.lang.String getSinalTotalReceita()
    {
        return this._sinalTotalReceita;
    } //-- java.lang.String getSinalTotalReceita() 

    /**
     * Returns the value of field 'valorTotalIss'.
     * 
     * @return double
     * @return the value of field 'valorTotalIss'.
     */
    public double getValorTotalIss()
    {
        return this._valorTotalIss;
    } //-- double getValorTotalIss() 

    /**
     * Returns the value of field 'valorTotalReceita'.
     * 
     * @return double
     * @return the value of field 'valorTotalReceita'.
     */
    public double getValorTotalReceita()
    {
        return this._valorTotalReceita;
    } //-- double getValorTotalReceita() 

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
     * Method hasValorTotalIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTotalIss()
    {
        return this._has_valorTotalIss;
    } //-- boolean hasValorTotalIss() 

    /**
     * Method hasValorTotalReceita
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTotalReceita()
    {
        return this._has_valorTotalReceita;
    } //-- boolean hasValorTotalReceita() 

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
     * Method removeAllListaValorMesTotalNvConta
     * 
     */
    public void removeAllListaValorMesTotalNvConta()
    {
        _listaValorMesTotalNvContaList.removeAllElements();
    } //-- void removeAllListaValorMesTotalNvConta() 

    /**
     * Method removeListaValorMesTotalNvConta
     * 
     * 
     * 
     * @param index
     * @return ListaValorMesTotalNvConta
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta removeListaValorMesTotalNvConta(int index)
    {
        java.lang.Object obj = _listaValorMesTotalNvContaList.elementAt(index);
        _listaValorMesTotalNvContaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta removeListaValorMesTotalNvConta(int) 

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
     * Method setListaValorMesTotalNvConta
     * 
     * 
     * 
     * @param index
     * @param vListaValorMesTotalNvConta
     */
    public void setListaValorMesTotalNvConta(int index, br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta vListaValorMesTotalNvConta)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaValorMesTotalNvContaList.size())) {
            throw new IndexOutOfBoundsException("setListaValorMesTotalNvConta: Index value '"+index+"' not in range [0.." + (_listaValorMesTotalNvContaList.size() - 1) + "]");
        }
        _listaValorMesTotalNvContaList.setElementAt(vListaValorMesTotalNvConta, index);
    } //-- void setListaValorMesTotalNvConta(int, br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta) 

    /**
     * Method setListaValorMesTotalNvConta
     * 
     * 
     * 
     * @param listaValorMesTotalNvContaArray
     */
    public void setListaValorMesTotalNvConta(br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta[] listaValorMesTotalNvContaArray)
    {
        //-- copy array
        _listaValorMesTotalNvContaList.removeAllElements();
        for (int i = 0; i < listaValorMesTotalNvContaArray.length; i++) {
            _listaValorMesTotalNvContaList.addElement(listaValorMesTotalNvContaArray[i]);
        }
    } //-- void setListaValorMesTotalNvConta(br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListaValorMesTotalNvConta) 

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
     * Sets the value of field 'sinalTotalIss'.
     * 
     * @param sinalTotalIss the value of field 'sinalTotalIss'.
     */
    public void setSinalTotalIss(java.lang.String sinalTotalIss)
    {
        this._sinalTotalIss = sinalTotalIss;
    } //-- void setSinalTotalIss(java.lang.String) 

    /**
     * Sets the value of field 'sinalTotalReceita'.
     * 
     * @param sinalTotalReceita the value of field
     * 'sinalTotalReceita'.
     */
    public void setSinalTotalReceita(java.lang.String sinalTotalReceita)
    {
        this._sinalTotalReceita = sinalTotalReceita;
    } //-- void setSinalTotalReceita(java.lang.String) 

    /**
     * Sets the value of field 'valorTotalIss'.
     * 
     * @param valorTotalIss the value of field 'valorTotalIss'.
     */
    public void setValorTotalIss(double valorTotalIss)
    {
        this._valorTotalIss = valorTotalIss;
        this._has_valorTotalIss = true;
    } //-- void setValorTotalIss(double) 

    /**
     * Sets the value of field 'valorTotalReceita'.
     * 
     * @param valorTotalReceita the value of field
     * 'valorTotalReceita'.
     */
    public void setValorTotalReceita(double valorTotalReceita)
    {
        this._valorTotalReceita = valorTotalReceita;
        this._has_valorTotalReceita = true;
    } //-- void setValorTotalReceita(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarValorMesTotalNvContaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListarValorMesTotalNvContaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListarValorMesTotalNvContaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListarValorMesTotalNvContaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.response.ListarValorMesTotalNvContaResponse unmarshal(java.io.Reader) 

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
