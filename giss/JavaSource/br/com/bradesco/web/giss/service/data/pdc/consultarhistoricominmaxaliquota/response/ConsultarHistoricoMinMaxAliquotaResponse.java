/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response;

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
 * Class ConsultarHistoricoMinMaxAliquotaResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarHistoricoMinMaxAliquotaResponse implements java.io.Serializable {


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
     * Field _quantidade
     */
    private int _quantidade = 0;

    /**
     * keeps track of state for field: _quantidade
     */
    private boolean _has_quantidade;

    /**
     * Field _listaList
     */
    private java.util.Vector _listaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarHistoricoMinMaxAliquotaResponse() 
     {
        super();
        _listaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.ConsultarHistoricoMinMaxAliquotaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addLista
     * 
     * 
     * 
     * @param vLista
     */
    public void addLista(br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista vLista)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addLista has a maximum of 100");
        }
        _listaList.addElement(vLista);
    } //-- void addLista(br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista) 

    /**
     * Method addLista
     * 
     * 
     * 
     * @param index
     * @param vLista
     */
    public void addLista(int index, br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista vLista)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addLista has a maximum of 100");
        }
        _listaList.insertElementAt(vLista, index);
    } //-- void addLista(int, br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista) 

    /**
     * Method deleteQuantidade
     * 
     */
    public void deleteQuantidade()
    {
        this._has_quantidade= false;
    } //-- void deleteQuantidade() 

    /**
     * Method enumerateLista
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateLista()
    {
        return _listaList.elements();
    } //-- java.util.Enumeration enumerateLista() 

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
     * Method getLista
     * 
     * 
     * 
     * @param index
     * @return Lista
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista getLista(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaList.size())) {
            throw new IndexOutOfBoundsException("getLista: Index value '"+index+"' not in range [0.."+(_listaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista) _listaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista getLista(int) 

    /**
     * Method getLista
     * 
     * 
     * 
     * @return Lista
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista[] getLista()
    {
        int size = _listaList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista) _listaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista[] getLista() 

    /**
     * Method getListaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaCount()
    {
        return _listaList.size();
    } //-- int getListaCount() 

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
     * Returns the value of field 'quantidade'.
     * 
     * @return int
     * @return the value of field 'quantidade'.
     */
    public int getQuantidade()
    {
        return this._quantidade;
    } //-- int getQuantidade() 

    /**
     * Method hasQuantidade
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQuantidade()
    {
        return this._has_quantidade;
    } //-- boolean hasQuantidade() 

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
     * Method removeAllLista
     * 
     */
    public void removeAllLista()
    {
        _listaList.removeAllElements();
    } //-- void removeAllLista() 

    /**
     * Method removeLista
     * 
     * 
     * 
     * @param index
     * @return Lista
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista removeLista(int index)
    {
        java.lang.Object obj = _listaList.elementAt(index);
        _listaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista removeLista(int) 

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
     * Method setLista
     * 
     * 
     * 
     * @param index
     * @param vLista
     */
    public void setLista(int index, br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista vLista)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaList.size())) {
            throw new IndexOutOfBoundsException("setLista: Index value '"+index+"' not in range [0.." + (_listaList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setLista has a maximum of 100");
        }
        _listaList.setElementAt(vLista, index);
    } //-- void setLista(int, br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista) 

    /**
     * Method setLista
     * 
     * 
     * 
     * @param listaArray
     */
    public void setLista(br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista[] listaArray)
    {
        //-- copy array
        _listaList.removeAllElements();
        for (int i = 0; i < listaArray.length; i++) {
            _listaList.addElement(listaArray[i]);
        }
    } //-- void setLista(br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista) 

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
     * Sets the value of field 'quantidade'.
     * 
     * @param quantidade the value of field 'quantidade'.
     */
    public void setQuantidade(int quantidade)
    {
        this._quantidade = quantidade;
        this._has_quantidade = true;
    } //-- void setQuantidade(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarHistoricoMinMaxAliquotaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.ConsultarHistoricoMinMaxAliquotaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.ConsultarHistoricoMinMaxAliquotaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.ConsultarHistoricoMinMaxAliquotaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.ConsultarHistoricoMinMaxAliquotaResponse unmarshal(java.io.Reader) 

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
