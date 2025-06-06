/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ExcluirCodLancamentoRequest.java,v 1.6 2017/07/06 14:31:57 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request;

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
 * Class ExcluirCodLancamentoRequest.
 * 
 * @version $Revision: 1.6 $ $Date: 2017/07/06 14:31:57 $
 */
public class ExcluirCodLancamentoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _listaExcluirCodLancamentoList
     */
    private java.util.Vector _listaExcluirCodLancamentoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExcluirCodLancamentoRequest() 
     {
        super();
        _listaExcluirCodLancamentoList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ExcluirCodLancamentoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaExcluirCodLancamento
     * 
     * 
     * 
     * @param vListaExcluirCodLancamento
     */
    public void addListaExcluirCodLancamento(br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento vListaExcluirCodLancamento)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaExcluirCodLancamentoList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaExcluirCodLancamento has a maximum of 100");
        }
        _listaExcluirCodLancamentoList.addElement(vListaExcluirCodLancamento);
    } //-- void addListaExcluirCodLancamento(br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento) 

    /**
     * Method addListaExcluirCodLancamento
     * 
     * 
     * 
     * @param index
     * @param vListaExcluirCodLancamento
     */
    public void addListaExcluirCodLancamento(int index, br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento vListaExcluirCodLancamento)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaExcluirCodLancamentoList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaExcluirCodLancamento has a maximum of 100");
        }
        _listaExcluirCodLancamentoList.insertElementAt(vListaExcluirCodLancamento, index);
    } //-- void addListaExcluirCodLancamento(int, br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento) 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateListaExcluirCodLancamento
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaExcluirCodLancamento()
    {
        return _listaExcluirCodLancamentoList.elements();
    } //-- java.util.Enumeration enumerateListaExcluirCodLancamento() 

    /**
     * Method getListaExcluirCodLancamento
     * 
     * 
     * 
     * @param index
     * @return ListaExcluirCodLancamento
     */
    public br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento getListaExcluirCodLancamento(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaExcluirCodLancamentoList.size())) {
            throw new IndexOutOfBoundsException("getListaExcluirCodLancamento: Index value '"+index+"' not in range [0.."+(_listaExcluirCodLancamentoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento) _listaExcluirCodLancamentoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento getListaExcluirCodLancamento(int) 

    /**
     * Method getListaExcluirCodLancamento
     * 
     * 
     * 
     * @return ListaExcluirCodLancamento
     */
    public br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento[] getListaExcluirCodLancamento()
    {
        int size = _listaExcluirCodLancamentoList.size();
        br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento[] mArray = new br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento) _listaExcluirCodLancamentoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento[] getListaExcluirCodLancamento() 

    /**
     * Method getListaExcluirCodLancamentoCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaExcluirCodLancamentoCount()
    {
        return _listaExcluirCodLancamentoList.size();
    } //-- int getListaExcluirCodLancamentoCount() 

    /**
     * Returns the value of field 'qtdeRegistros'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistros'.
     */
    public int getQtdeRegistros()
    {
        return this._qtdeRegistros;
    } //-- int getQtdeRegistros() 

    /**
     * Method hasQtdeRegistros
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistros()
    {
        return this._has_qtdeRegistros;
    } //-- boolean hasQtdeRegistros() 

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
     * Method removeAllListaExcluirCodLancamento
     * 
     */
    public void removeAllListaExcluirCodLancamento()
    {
        _listaExcluirCodLancamentoList.removeAllElements();
    } //-- void removeAllListaExcluirCodLancamento() 

    /**
     * Method removeListaExcluirCodLancamento
     * 
     * 
     * 
     * @param index
     * @return ListaExcluirCodLancamento
     */
    public br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento removeListaExcluirCodLancamento(int index)
    {
        java.lang.Object obj = _listaExcluirCodLancamentoList.elementAt(index);
        _listaExcluirCodLancamentoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento removeListaExcluirCodLancamento(int) 

    /**
     * Method setListaExcluirCodLancamento
     * 
     * 
     * 
     * @param index
     * @param vListaExcluirCodLancamento
     */
    public void setListaExcluirCodLancamento(int index, br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento vListaExcluirCodLancamento)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaExcluirCodLancamentoList.size())) {
            throw new IndexOutOfBoundsException("setListaExcluirCodLancamento: Index value '"+index+"' not in range [0.." + (_listaExcluirCodLancamentoList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setListaExcluirCodLancamento has a maximum of 100");
        }
        _listaExcluirCodLancamentoList.setElementAt(vListaExcluirCodLancamento, index);
    } //-- void setListaExcluirCodLancamento(int, br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento) 

    /**
     * Method setListaExcluirCodLancamento
     * 
     * 
     * 
     * @param listaExcluirCodLancamentoArray
     */
    public void setListaExcluirCodLancamento(br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento[] listaExcluirCodLancamentoArray)
    {
        //-- copy array
        _listaExcluirCodLancamentoList.removeAllElements();
        for (int i = 0; i < listaExcluirCodLancamentoArray.length; i++) {
            _listaExcluirCodLancamentoList.addElement(listaExcluirCodLancamentoArray[i]);
        }
    } //-- void setListaExcluirCodLancamento(br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento) 

    /**
     * Sets the value of field 'qtdeRegistros'.
     * 
     * @param qtdeRegistros the value of field 'qtdeRegistros'.
     */
    public void setQtdeRegistros(int qtdeRegistros)
    {
        this._qtdeRegistros = qtdeRegistros;
        this._has_qtdeRegistros = true;
    } //-- void setQtdeRegistros(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ExcluirCodLancamentoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ExcluirCodLancamentoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ExcluirCodLancamentoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ExcluirCodLancamentoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ExcluirCodLancamentoRequest unmarshal(java.io.Reader) 

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
