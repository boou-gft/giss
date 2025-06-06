/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarHistCodLancamentoResponse.java,v 1.8 2018/05/17 18:47:15 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response;

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
 * Class ListarHistCodLancamentoResponse.
 * 
 * @version $Revision: 1.8 $ $Date: 2018/05/17 18:47:15 $
 */
public class ListarHistCodLancamentoResponse implements java.io.Serializable {


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
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _listaHistCodLancamentoList
     */
    private java.util.Vector _listaHistCodLancamentoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarHistCodLancamentoResponse() 
     {
        super();
        _listaHistCodLancamentoList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListarHistCodLancamentoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaHistCodLancamento
     * 
     * 
     * 
     * @param vListaHistCodLancamento
     */
    public void addListaHistCodLancamento(br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento vListaHistCodLancamento)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaHistCodLancamentoList.addElement(vListaHistCodLancamento);
    } //-- void addListaHistCodLancamento(br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento) 

    /**
     * Method addListaHistCodLancamento
     * 
     * 
     * 
     * @param index
     * @param vListaHistCodLancamento
     */
    public void addListaHistCodLancamento(int index, br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento vListaHistCodLancamento)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaHistCodLancamentoList.insertElementAt(vListaHistCodLancamento, index);
    } //-- void addListaHistCodLancamento(int, br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento) 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateListaHistCodLancamento
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaHistCodLancamento()
    {
        return _listaHistCodLancamentoList.elements();
    } //-- java.util.Enumeration enumerateListaHistCodLancamento() 

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
     * Method getListaHistCodLancamento
     * 
     * 
     * 
     * @param index
     * @return ListaHistCodLancamento
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento getListaHistCodLancamento(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaHistCodLancamentoList.size())) {
            throw new IndexOutOfBoundsException("getListaHistCodLancamento: Index value '"+index+"' not in range [0.."+(_listaHistCodLancamentoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento) _listaHistCodLancamentoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento getListaHistCodLancamento(int) 

    /**
     * Method getListaHistCodLancamento
     * 
     * 
     * 
     * @return ListaHistCodLancamento
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento[] getListaHistCodLancamento()
    {
        int size = _listaHistCodLancamentoList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento) _listaHistCodLancamentoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento[] getListaHistCodLancamento() 

    /**
     * Method getListaHistCodLancamentoCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaHistCodLancamentoCount()
    {
        return _listaHistCodLancamentoList.size();
    } //-- int getListaHistCodLancamentoCount() 

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
     * Method removeAllListaHistCodLancamento
     * 
     */
    public void removeAllListaHistCodLancamento()
    {
        _listaHistCodLancamentoList.removeAllElements();
    } //-- void removeAllListaHistCodLancamento() 

    /**
     * Method removeListaHistCodLancamento
     * 
     * 
     * 
     * @param index
     * @return ListaHistCodLancamento
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento removeListaHistCodLancamento(int index)
    {
        java.lang.Object obj = _listaHistCodLancamentoList.elementAt(index);
        _listaHistCodLancamentoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento removeListaHistCodLancamento(int) 

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
     * Method setListaHistCodLancamento
     * 
     * 
     * 
     * @param index
     * @param vListaHistCodLancamento
     */
    public void setListaHistCodLancamento(int index, br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento vListaHistCodLancamento)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaHistCodLancamentoList.size())) {
            throw new IndexOutOfBoundsException("setListaHistCodLancamento: Index value '"+index+"' not in range [0.." + (_listaHistCodLancamentoList.size() - 1) + "]");
        }
        _listaHistCodLancamentoList.setElementAt(vListaHistCodLancamento, index);
    } //-- void setListaHistCodLancamento(int, br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento) 

    /**
     * Method setListaHistCodLancamento
     * 
     * 
     * 
     * @param listaHistCodLancamentoArray
     */
    public void setListaHistCodLancamento(br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento[] listaHistCodLancamentoArray)
    {
        //-- copy array
        _listaHistCodLancamentoList.removeAllElements();
        for (int i = 0; i < listaHistCodLancamentoArray.length; i++) {
            _listaHistCodLancamentoList.addElement(listaHistCodLancamentoArray[i]);
        }
    } //-- void setListaHistCodLancamento(br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListaHistCodLancamento) 

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
     * @return ListarHistCodLancamentoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListarHistCodLancamentoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListarHistCodLancamentoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListarHistCodLancamentoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.response.ListarHistCodLancamentoResponse unmarshal(java.io.Reader) 

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
