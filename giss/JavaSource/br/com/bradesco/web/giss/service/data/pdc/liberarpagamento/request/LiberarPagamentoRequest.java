/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request;

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
 * Class LiberarPagamentoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class LiberarPagamentoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numConsultas
     */
    private int _numConsultas = 0;

    /**
     * keeps track of state for field: _numConsultas
     */
    private boolean _has_numConsultas;

    /**
     * Field _listaLiberarPagamentoList
     */
    private java.util.Vector _listaLiberarPagamentoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public LiberarPagamentoRequest() 
     {
        super();
        _listaLiberarPagamentoList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.LiberarPagamentoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaLiberarPagamento
     * 
     * 
     * 
     * @param vListaLiberarPagamento
     */
    public void addListaLiberarPagamento(br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento vListaLiberarPagamento)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaLiberarPagamentoList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaLiberarPagamento has a maximum of 100");
        }
        _listaLiberarPagamentoList.addElement(vListaLiberarPagamento);
    } //-- void addListaLiberarPagamento(br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento) 

    /**
     * Method addListaLiberarPagamento
     * 
     * 
     * 
     * @param index
     * @param vListaLiberarPagamento
     */
    public void addListaLiberarPagamento(int index, br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento vListaLiberarPagamento)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaLiberarPagamentoList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaLiberarPagamento has a maximum of 100");
        }
        _listaLiberarPagamentoList.insertElementAt(vListaLiberarPagamento, index);
    } //-- void addListaLiberarPagamento(int, br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method enumerateListaLiberarPagamento
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaLiberarPagamento()
    {
        return _listaLiberarPagamentoList.elements();
    } //-- java.util.Enumeration enumerateListaLiberarPagamento() 

    /**
     * Method getListaLiberarPagamento
     * 
     * 
     * 
     * @param index
     * @return ListaLiberarPagamento
     */
    public br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento getListaLiberarPagamento(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaLiberarPagamentoList.size())) {
            throw new IndexOutOfBoundsException("getListaLiberarPagamento: Index value '"+index+"' not in range [0.."+(_listaLiberarPagamentoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento) _listaLiberarPagamentoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento getListaLiberarPagamento(int) 

    /**
     * Method getListaLiberarPagamento
     * 
     * 
     * 
     * @return ListaLiberarPagamento
     */
    public br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento[] getListaLiberarPagamento()
    {
        int size = _listaLiberarPagamentoList.size();
        br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento[] mArray = new br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento) _listaLiberarPagamentoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento[] getListaLiberarPagamento() 

    /**
     * Method getListaLiberarPagamentoCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaLiberarPagamentoCount()
    {
        return _listaLiberarPagamentoList.size();
    } //-- int getListaLiberarPagamentoCount() 

    /**
     * Returns the value of field 'numConsultas'.
     * 
     * @return int
     * @return the value of field 'numConsultas'.
     */
    public int getNumConsultas()
    {
        return this._numConsultas;
    } //-- int getNumConsultas() 

    /**
     * Method hasNumConsultas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumConsultas()
    {
        return this._has_numConsultas;
    } //-- boolean hasNumConsultas() 

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
     * Method removeAllListaLiberarPagamento
     * 
     */
    public void removeAllListaLiberarPagamento()
    {
        _listaLiberarPagamentoList.removeAllElements();
    } //-- void removeAllListaLiberarPagamento() 

    /**
     * Method removeListaLiberarPagamento
     * 
     * 
     * 
     * @param index
     * @return ListaLiberarPagamento
     */
    public br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento removeListaLiberarPagamento(int index)
    {
        java.lang.Object obj = _listaLiberarPagamentoList.elementAt(index);
        _listaLiberarPagamentoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento removeListaLiberarPagamento(int) 

    /**
     * Method setListaLiberarPagamento
     * 
     * 
     * 
     * @param index
     * @param vListaLiberarPagamento
     */
    public void setListaLiberarPagamento(int index, br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento vListaLiberarPagamento)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaLiberarPagamentoList.size())) {
            throw new IndexOutOfBoundsException("setListaLiberarPagamento: Index value '"+index+"' not in range [0.." + (_listaLiberarPagamentoList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setListaLiberarPagamento has a maximum of 100");
        }
        _listaLiberarPagamentoList.setElementAt(vListaLiberarPagamento, index);
    } //-- void setListaLiberarPagamento(int, br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento) 

    /**
     * Method setListaLiberarPagamento
     * 
     * 
     * 
     * @param listaLiberarPagamentoArray
     */
    public void setListaLiberarPagamento(br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento[] listaLiberarPagamentoArray)
    {
        //-- copy array
        _listaLiberarPagamentoList.removeAllElements();
        for (int i = 0; i < listaLiberarPagamentoArray.length; i++) {
            _listaLiberarPagamentoList.addElement(listaLiberarPagamentoArray[i]);
        }
    } //-- void setListaLiberarPagamento(br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento) 

    /**
     * Sets the value of field 'numConsultas'.
     * 
     * @param numConsultas the value of field 'numConsultas'.
     */
    public void setNumConsultas(int numConsultas)
    {
        this._numConsultas = numConsultas;
        this._has_numConsultas = true;
    } //-- void setNumConsultas(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return LiberarPagamentoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.LiberarPagamentoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.LiberarPagamentoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.LiberarPagamentoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.LiberarPagamentoRequest unmarshal(java.io.Reader) 

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
