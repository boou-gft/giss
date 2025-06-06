/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response;

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
 * Class ListarEmpCadastrosResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarEmpCadastrosResponse implements java.io.Serializable {


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
     * Field _numConsultas
     */
    private int _numConsultas = 0;

    /**
     * keeps track of state for field: _numConsultas
     */
    private boolean _has_numConsultas;

    /**
     * Field _listaEmpCadastrosList
     */
    private java.util.Vector _listaEmpCadastrosList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarEmpCadastrosResponse() 
     {
        super();
        _listaEmpCadastrosList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListarEmpCadastrosResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaEmpCadastros
     * 
     * 
     * 
     * @param vListaEmpCadastros
     */
    public void addListaEmpCadastros(br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros vListaEmpCadastros)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaEmpCadastrosList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaEmpCadastros has a maximum of 100");
        }
        _listaEmpCadastrosList.addElement(vListaEmpCadastros);
    } //-- void addListaEmpCadastros(br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros) 

    /**
     * Method addListaEmpCadastros
     * 
     * 
     * 
     * @param index
     * @param vListaEmpCadastros
     */
    public void addListaEmpCadastros(int index, br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros vListaEmpCadastros)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaEmpCadastrosList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaEmpCadastros has a maximum of 100");
        }
        _listaEmpCadastrosList.insertElementAt(vListaEmpCadastros, index);
    } //-- void addListaEmpCadastros(int, br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method enumerateListaEmpCadastros
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaEmpCadastros()
    {
        return _listaEmpCadastrosList.elements();
    } //-- java.util.Enumeration enumerateListaEmpCadastros() 

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
     * Method getListaEmpCadastros
     * 
     * 
     * 
     * @param index
     * @return ListaEmpCadastros
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros getListaEmpCadastros(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaEmpCadastrosList.size())) {
            throw new IndexOutOfBoundsException("getListaEmpCadastros: Index value '"+index+"' not in range [0.."+(_listaEmpCadastrosList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros) _listaEmpCadastrosList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros getListaEmpCadastros(int) 

    /**
     * Method getListaEmpCadastros
     * 
     * 
     * 
     * @return ListaEmpCadastros
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros[] getListaEmpCadastros()
    {
        int size = _listaEmpCadastrosList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros) _listaEmpCadastrosList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros[] getListaEmpCadastros() 

    /**
     * Method getListaEmpCadastrosCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaEmpCadastrosCount()
    {
        return _listaEmpCadastrosList.size();
    } //-- int getListaEmpCadastrosCount() 

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
     * Method removeAllListaEmpCadastros
     * 
     */
    public void removeAllListaEmpCadastros()
    {
        _listaEmpCadastrosList.removeAllElements();
    } //-- void removeAllListaEmpCadastros() 

    /**
     * Method removeListaEmpCadastros
     * 
     * 
     * 
     * @param index
     * @return ListaEmpCadastros
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros removeListaEmpCadastros(int index)
    {
        java.lang.Object obj = _listaEmpCadastrosList.elementAt(index);
        _listaEmpCadastrosList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros removeListaEmpCadastros(int) 

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
     * Method setListaEmpCadastros
     * 
     * 
     * 
     * @param index
     * @param vListaEmpCadastros
     */
    public void setListaEmpCadastros(int index, br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros vListaEmpCadastros)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaEmpCadastrosList.size())) {
            throw new IndexOutOfBoundsException("setListaEmpCadastros: Index value '"+index+"' not in range [0.." + (_listaEmpCadastrosList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setListaEmpCadastros has a maximum of 100");
        }
        _listaEmpCadastrosList.setElementAt(vListaEmpCadastros, index);
    } //-- void setListaEmpCadastros(int, br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros) 

    /**
     * Method setListaEmpCadastros
     * 
     * 
     * 
     * @param listaEmpCadastrosArray
     */
    public void setListaEmpCadastros(br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros[] listaEmpCadastrosArray)
    {
        //-- copy array
        _listaEmpCadastrosList.removeAllElements();
        for (int i = 0; i < listaEmpCadastrosArray.length; i++) {
            _listaEmpCadastrosList.addElement(listaEmpCadastrosArray[i]);
        }
    } //-- void setListaEmpCadastros(br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros) 

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
     * @return ListarEmpCadastrosResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListarEmpCadastrosResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListarEmpCadastrosResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListarEmpCadastrosResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListarEmpCadastrosResponse unmarshal(java.io.Reader) 

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
