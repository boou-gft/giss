/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request;

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
 * Class ProcessarRetificadorLiberacaoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ProcessarRetificadorLiberacaoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numeroConsultas
     */
    private int _numeroConsultas = 0;

    /**
     * keeps track of state for field: _numeroConsultas
     */
    private boolean _has_numeroConsultas;

    /**
     * Field _listaEntradaList
     */
    private java.util.Vector _listaEntradaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProcessarRetificadorLiberacaoRequest() 
     {
        super();
        _listaEntradaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ProcessarRetificadorLiberacaoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaEntrada
     * 
     * 
     * 
     * @param vListaEntrada
     */
    public void addListaEntrada(br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada vListaEntrada)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaEntradaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaEntrada has a maximum of 100");
        }
        _listaEntradaList.addElement(vListaEntrada);
    } //-- void addListaEntrada(br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada) 

    /**
     * Method addListaEntrada
     * 
     * 
     * 
     * @param index
     * @param vListaEntrada
     */
    public void addListaEntrada(int index, br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada vListaEntrada)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaEntradaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaEntrada has a maximum of 100");
        }
        _listaEntradaList.insertElementAt(vListaEntrada, index);
    } //-- void addListaEntrada(int, br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada) 

    /**
     * Method deleteNumeroConsultas
     * 
     */
    public void deleteNumeroConsultas()
    {
        this._has_numeroConsultas= false;
    } //-- void deleteNumeroConsultas() 

    /**
     * Method enumerateListaEntrada
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaEntrada()
    {
        return _listaEntradaList.elements();
    } //-- java.util.Enumeration enumerateListaEntrada() 

    /**
     * Method getListaEntrada
     * 
     * 
     * 
     * @param index
     * @return ListaEntrada
     */
    public br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada getListaEntrada(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaEntradaList.size())) {
            throw new IndexOutOfBoundsException("getListaEntrada: Index value '"+index+"' not in range [0.."+(_listaEntradaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada) _listaEntradaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada getListaEntrada(int) 

    /**
     * Method getListaEntrada
     * 
     * 
     * 
     * @return ListaEntrada
     */
    public br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada[] getListaEntrada()
    {
        int size = _listaEntradaList.size();
        br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada[] mArray = new br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada) _listaEntradaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada[] getListaEntrada() 

    /**
     * Method getListaEntradaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaEntradaCount()
    {
        return _listaEntradaList.size();
    } //-- int getListaEntradaCount() 

    /**
     * Returns the value of field 'numeroConsultas'.
     * 
     * @return int
     * @return the value of field 'numeroConsultas'.
     */
    public int getNumeroConsultas()
    {
        return this._numeroConsultas;
    } //-- int getNumeroConsultas() 

    /**
     * Method hasNumeroConsultas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroConsultas()
    {
        return this._has_numeroConsultas;
    } //-- boolean hasNumeroConsultas() 

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
     * Method removeAllListaEntrada
     * 
     */
    public void removeAllListaEntrada()
    {
        _listaEntradaList.removeAllElements();
    } //-- void removeAllListaEntrada() 

    /**
     * Method removeListaEntrada
     * 
     * 
     * 
     * @param index
     * @return ListaEntrada
     */
    public br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada removeListaEntrada(int index)
    {
        java.lang.Object obj = _listaEntradaList.elementAt(index);
        _listaEntradaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada removeListaEntrada(int) 

    /**
     * Method setListaEntrada
     * 
     * 
     * 
     * @param index
     * @param vListaEntrada
     */
    public void setListaEntrada(int index, br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada vListaEntrada)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaEntradaList.size())) {
            throw new IndexOutOfBoundsException("setListaEntrada: Index value '"+index+"' not in range [0.." + (_listaEntradaList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setListaEntrada has a maximum of 100");
        }
        _listaEntradaList.setElementAt(vListaEntrada, index);
    } //-- void setListaEntrada(int, br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada) 

    /**
     * Method setListaEntrada
     * 
     * 
     * 
     * @param listaEntradaArray
     */
    public void setListaEntrada(br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada[] listaEntradaArray)
    {
        //-- copy array
        _listaEntradaList.removeAllElements();
        for (int i = 0; i < listaEntradaArray.length; i++) {
            _listaEntradaList.addElement(listaEntradaArray[i]);
        }
    } //-- void setListaEntrada(br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ListaEntrada) 

    /**
     * Sets the value of field 'numeroConsultas'.
     * 
     * @param numeroConsultas the value of field 'numeroConsultas'.
     */
    public void setNumeroConsultas(int numeroConsultas)
    {
        this._numeroConsultas = numeroConsultas;
        this._has_numeroConsultas = true;
    } //-- void setNumeroConsultas(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ProcessarRetificadorLiberacaoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ProcessarRetificadorLiberacaoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ProcessarRetificadorLiberacaoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ProcessarRetificadorLiberacaoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.request.ProcessarRetificadorLiberacaoRequest unmarshal(java.io.Reader) 

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
