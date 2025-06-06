/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarComboCtaReceitaResponse.java,v 1.4 2017/11/24 15:07:17 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response;

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
 * Class ListarComboCtaReceitaResponse.
 * 
 * @version $Revision: 1.4 $ $Date: 2017/11/24 15:07:17 $
 */
public class ListarComboCtaReceitaResponse implements java.io.Serializable {


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
     * Field _numConsulta
     */
    private int _numConsulta = 0;

    /**
     * keeps track of state for field: _numConsulta
     */
    private boolean _has_numConsulta;

    /**
     * Field _listaComboCtaReceitaList
     */
    private java.util.Vector _listaComboCtaReceitaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarComboCtaReceitaResponse() 
     {
        super();
        _listaComboCtaReceitaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListarComboCtaReceitaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaComboCtaReceita
     * 
     * 
     * 
     * @param vListaComboCtaReceita
     */
    public void addListaComboCtaReceita(br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita vListaComboCtaReceita)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaComboCtaReceitaList.addElement(vListaComboCtaReceita);
    } //-- void addListaComboCtaReceita(br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita) 

    /**
     * Method addListaComboCtaReceita
     * 
     * 
     * 
     * @param index
     * @param vListaComboCtaReceita
     */
    public void addListaComboCtaReceita(int index, br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita vListaComboCtaReceita)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaComboCtaReceitaList.insertElementAt(vListaComboCtaReceita, index);
    } //-- void addListaComboCtaReceita(int, br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita) 

    /**
     * Method deleteNumConsulta
     * 
     */
    public void deleteNumConsulta()
    {
        this._has_numConsulta= false;
    } //-- void deleteNumConsulta() 

    /**
     * Method enumerateListaComboCtaReceita
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaComboCtaReceita()
    {
        return _listaComboCtaReceitaList.elements();
    } //-- java.util.Enumeration enumerateListaComboCtaReceita() 

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
     * Method getListaComboCtaReceita
     * 
     * 
     * 
     * @param index
     * @return ListaComboCtaReceita
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita getListaComboCtaReceita(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaComboCtaReceitaList.size())) {
            throw new IndexOutOfBoundsException("getListaComboCtaReceita: Index value '"+index+"' not in range [0.."+(_listaComboCtaReceitaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita) _listaComboCtaReceitaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita getListaComboCtaReceita(int) 

    /**
     * Method getListaComboCtaReceita
     * 
     * 
     * 
     * @return ListaComboCtaReceita
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita[] getListaComboCtaReceita()
    {
        int size = _listaComboCtaReceitaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita) _listaComboCtaReceitaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita[] getListaComboCtaReceita() 

    /**
     * Method getListaComboCtaReceitaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaComboCtaReceitaCount()
    {
        return _listaComboCtaReceitaList.size();
    } //-- int getListaComboCtaReceitaCount() 

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
     * Returns the value of field 'numConsulta'.
     * 
     * @return int
     * @return the value of field 'numConsulta'.
     */
    public int getNumConsulta()
    {
        return this._numConsulta;
    } //-- int getNumConsulta() 

    /**
     * Method hasNumConsulta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumConsulta()
    {
        return this._has_numConsulta;
    } //-- boolean hasNumConsulta() 

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
     * Method removeAllListaComboCtaReceita
     * 
     */
    public void removeAllListaComboCtaReceita()
    {
        _listaComboCtaReceitaList.removeAllElements();
    } //-- void removeAllListaComboCtaReceita() 

    /**
     * Method removeListaComboCtaReceita
     * 
     * 
     * 
     * @param index
     * @return ListaComboCtaReceita
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita removeListaComboCtaReceita(int index)
    {
        java.lang.Object obj = _listaComboCtaReceitaList.elementAt(index);
        _listaComboCtaReceitaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita removeListaComboCtaReceita(int) 

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
     * Method setListaComboCtaReceita
     * 
     * 
     * 
     * @param index
     * @param vListaComboCtaReceita
     */
    public void setListaComboCtaReceita(int index, br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita vListaComboCtaReceita)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaComboCtaReceitaList.size())) {
            throw new IndexOutOfBoundsException("setListaComboCtaReceita: Index value '"+index+"' not in range [0.." + (_listaComboCtaReceitaList.size() - 1) + "]");
        }
        _listaComboCtaReceitaList.setElementAt(vListaComboCtaReceita, index);
    } //-- void setListaComboCtaReceita(int, br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita) 

    /**
     * Method setListaComboCtaReceita
     * 
     * 
     * 
     * @param listaComboCtaReceitaArray
     */
    public void setListaComboCtaReceita(br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita[] listaComboCtaReceitaArray)
    {
        //-- copy array
        _listaComboCtaReceitaList.removeAllElements();
        for (int i = 0; i < listaComboCtaReceitaArray.length; i++) {
            _listaComboCtaReceitaList.addElement(listaComboCtaReceitaArray[i]);
        }
    } //-- void setListaComboCtaReceita(br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita) 

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
     * Sets the value of field 'numConsulta'.
     * 
     * @param numConsulta the value of field 'numConsulta'.
     */
    public void setNumConsulta(int numConsulta)
    {
        this._numConsulta = numConsulta;
        this._has_numConsulta = true;
    } //-- void setNumConsulta(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarComboCtaReceitaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListarComboCtaReceitaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListarComboCtaReceitaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListarComboCtaReceitaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListarComboCtaReceitaResponse unmarshal(java.io.Reader) 

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
