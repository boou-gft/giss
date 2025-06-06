/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request;

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
 * Class EfetivaSelecMunicipiosSemConvRequest.
 * 
 * @version $Revision$ $Date$
 */
public class EfetivaSelecMunicipiosSemConvRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeOcor
     */
    private int _qtdeOcor = 0;

    /**
     * keeps track of state for field: _qtdeOcor
     */
    private boolean _has_qtdeOcor;

    /**
     * Field _listaEntradaList
     */
    private java.util.Vector _listaEntradaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EfetivaSelecMunicipiosSemConvRequest() 
     {
        super();
        _listaEntradaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.EfetivaSelecMunicipiosSemConvRequest()


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
    public void addListaEntrada(br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada vListaEntrada)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaEntradaList.addElement(vListaEntrada);
    } //-- void addListaEntrada(br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada) 

    /**
     * Method addListaEntrada
     * 
     * 
     * 
     * @param index
     * @param vListaEntrada
     */
    public void addListaEntrada(int index, br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada vListaEntrada)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaEntradaList.insertElementAt(vListaEntrada, index);
    } //-- void addListaEntrada(int, br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada) 

    /**
     * Method deleteQtdeOcor
     * 
     */
    public void deleteQtdeOcor()
    {
        this._has_qtdeOcor= false;
    } //-- void deleteQtdeOcor() 

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
    public br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada getListaEntrada(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaEntradaList.size())) {
            throw new IndexOutOfBoundsException("getListaEntrada: Index value '"+index+"' not in range [0.."+(_listaEntradaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada) _listaEntradaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada getListaEntrada(int) 

    /**
     * Method getListaEntrada
     * 
     * 
     * 
     * @return ListaEntrada
     */
    public br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada[] getListaEntrada()
    {
        int size = _listaEntradaList.size();
        br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada[] mArray = new br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada) _listaEntradaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada[] getListaEntrada() 

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
     * Returns the value of field 'qtdeOcor'.
     * 
     * @return int
     * @return the value of field 'qtdeOcor'.
     */
    public int getQtdeOcor()
    {
        return this._qtdeOcor;
    } //-- int getQtdeOcor() 

    /**
     * Method hasQtdeOcor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcor()
    {
        return this._has_qtdeOcor;
    } //-- boolean hasQtdeOcor() 

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
    public br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada removeListaEntrada(int index)
    {
        java.lang.Object obj = _listaEntradaList.elementAt(index);
        _listaEntradaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada removeListaEntrada(int) 

    /**
     * Method setListaEntrada
     * 
     * 
     * 
     * @param index
     * @param vListaEntrada
     */
    public void setListaEntrada(int index, br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada vListaEntrada)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaEntradaList.size())) {
            throw new IndexOutOfBoundsException("setListaEntrada: Index value '"+index+"' not in range [0.." + (_listaEntradaList.size() - 1) + "]");
        }
        _listaEntradaList.setElementAt(vListaEntrada, index);
    } //-- void setListaEntrada(int, br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada) 

    /**
     * Method setListaEntrada
     * 
     * 
     * 
     * @param listaEntradaArray
     */
    public void setListaEntrada(br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada[] listaEntradaArray)
    {
        //-- copy array
        _listaEntradaList.removeAllElements();
        for (int i = 0; i < listaEntradaArray.length; i++) {
            _listaEntradaList.addElement(listaEntradaArray[i]);
        }
    } //-- void setListaEntrada(br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.ListaEntrada) 

    /**
     * Sets the value of field 'qtdeOcor'.
     * 
     * @param qtdeOcor the value of field 'qtdeOcor'.
     */
    public void setQtdeOcor(int qtdeOcor)
    {
        this._qtdeOcor = qtdeOcor;
        this._has_qtdeOcor = true;
    } //-- void setQtdeOcor(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return EfetivaSelecMunicipiosSemConvRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.EfetivaSelecMunicipiosSemConvRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.EfetivaSelecMunicipiosSemConvRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.EfetivaSelecMunicipiosSemConvRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.request.EfetivaSelecMunicipiosSemConvRequest unmarshal(java.io.Reader) 

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
