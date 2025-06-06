/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response;

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
 * Class ListarContasEmpResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarContasEmpResponse implements java.io.Serializable {


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
     * Field _listaContasEmpList
     */
    private java.util.Vector _listaContasEmpList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarContasEmpResponse() 
     {
        super();
        _listaContasEmpList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListarContasEmpResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaContasEmp
     * 
     * 
     * 
     * @param vListaContasEmp
     */
    public void addListaContasEmp(br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp vListaContasEmp)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaContasEmpList.addElement(vListaContasEmp);
    } //-- void addListaContasEmp(br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp) 

    /**
     * Method addListaContasEmp
     * 
     * 
     * 
     * @param index
     * @param vListaContasEmp
     */
    public void addListaContasEmp(int index, br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp vListaContasEmp)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaContasEmpList.insertElementAt(vListaContasEmp, index);
    } //-- void addListaContasEmp(int, br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method enumerateListaContasEmp
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaContasEmp()
    {
        return _listaContasEmpList.elements();
    } //-- java.util.Enumeration enumerateListaContasEmp() 

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
     * Method getListaContasEmp
     * 
     * 
     * 
     * @param index
     * @return ListaContasEmp
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp getListaContasEmp(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaContasEmpList.size())) {
            throw new IndexOutOfBoundsException("getListaContasEmp: Index value '"+index+"' not in range [0.."+(_listaContasEmpList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp) _listaContasEmpList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp getListaContasEmp(int) 

    /**
     * Method getListaContasEmp
     * 
     * 
     * 
     * @return ListaContasEmp
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp[] getListaContasEmp()
    {
        int size = _listaContasEmpList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp) _listaContasEmpList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp[] getListaContasEmp() 

    /**
     * Method getListaContasEmpCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaContasEmpCount()
    {
        return _listaContasEmpList.size();
    } //-- int getListaContasEmpCount() 

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
     * Method removeAllListaContasEmp
     * 
     */
    public void removeAllListaContasEmp()
    {
        _listaContasEmpList.removeAllElements();
    } //-- void removeAllListaContasEmp() 

    /**
     * Method removeListaContasEmp
     * 
     * 
     * 
     * @param index
     * @return ListaContasEmp
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp removeListaContasEmp(int index)
    {
        java.lang.Object obj = _listaContasEmpList.elementAt(index);
        _listaContasEmpList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp removeListaContasEmp(int) 

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
     * Method setListaContasEmp
     * 
     * 
     * 
     * @param index
     * @param vListaContasEmp
     */
    public void setListaContasEmp(int index, br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp vListaContasEmp)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaContasEmpList.size())) {
            throw new IndexOutOfBoundsException("setListaContasEmp: Index value '"+index+"' not in range [0.." + (_listaContasEmpList.size() - 1) + "]");
        }
        _listaContasEmpList.setElementAt(vListaContasEmp, index);
    } //-- void setListaContasEmp(int, br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp) 

    /**
     * Method setListaContasEmp
     * 
     * 
     * 
     * @param listaContasEmpArray
     */
    public void setListaContasEmp(br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp[] listaContasEmpArray)
    {
        //-- copy array
        _listaContasEmpList.removeAllElements();
        for (int i = 0; i < listaContasEmpArray.length; i++) {
            _listaContasEmpList.addElement(listaContasEmpArray[i]);
        }
    } //-- void setListaContasEmp(br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListaContasEmp) 

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
     * @return ListarContasEmpResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListarContasEmpResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListarContasEmpResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListarContasEmpResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.response.ListarContasEmpResponse unmarshal(java.io.Reader) 

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
