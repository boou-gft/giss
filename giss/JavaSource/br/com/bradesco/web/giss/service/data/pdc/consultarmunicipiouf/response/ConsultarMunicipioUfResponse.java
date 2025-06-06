/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response;

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
 * Class ConsultarMunicipioUfResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarMunicipioUfResponse implements java.io.Serializable {


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
     * Field _listaConsultarMunicipioUfList
     */
    private java.util.Vector _listaConsultarMunicipioUfList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarMunicipioUfResponse() 
     {
        super();
        _listaConsultarMunicipioUfList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ConsultarMunicipioUfResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaConsultarMunicipioUf
     * 
     * 
     * 
     * @param vListaConsultarMunicipioUf
     */
    public void addListaConsultarMunicipioUf(br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf vListaConsultarMunicipioUf)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaConsultarMunicipioUfList.addElement(vListaConsultarMunicipioUf);
    } //-- void addListaConsultarMunicipioUf(br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf) 

    /**
     * Method addListaConsultarMunicipioUf
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarMunicipioUf
     */
    public void addListaConsultarMunicipioUf(int index, br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf vListaConsultarMunicipioUf)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaConsultarMunicipioUfList.insertElementAt(vListaConsultarMunicipioUf, index);
    } //-- void addListaConsultarMunicipioUf(int, br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method enumerateListaConsultarMunicipioUf
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaConsultarMunicipioUf()
    {
        return _listaConsultarMunicipioUfList.elements();
    } //-- java.util.Enumeration enumerateListaConsultarMunicipioUf() 

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
     * Method getListaConsultarMunicipioUf
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarMunicipioUf
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf getListaConsultarMunicipioUf(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarMunicipioUfList.size())) {
            throw new IndexOutOfBoundsException("getListaConsultarMunicipioUf: Index value '"+index+"' not in range [0.."+(_listaConsultarMunicipioUfList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf) _listaConsultarMunicipioUfList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf getListaConsultarMunicipioUf(int) 

    /**
     * Method getListaConsultarMunicipioUf
     * 
     * 
     * 
     * @return ListaConsultarMunicipioUf
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf[] getListaConsultarMunicipioUf()
    {
        int size = _listaConsultarMunicipioUfList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf) _listaConsultarMunicipioUfList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf[] getListaConsultarMunicipioUf() 

    /**
     * Method getListaConsultarMunicipioUfCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaConsultarMunicipioUfCount()
    {
        return _listaConsultarMunicipioUfList.size();
    } //-- int getListaConsultarMunicipioUfCount() 

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
     * Method removeAllListaConsultarMunicipioUf
     * 
     */
    public void removeAllListaConsultarMunicipioUf()
    {
        _listaConsultarMunicipioUfList.removeAllElements();
    } //-- void removeAllListaConsultarMunicipioUf() 

    /**
     * Method removeListaConsultarMunicipioUf
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarMunicipioUf
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf removeListaConsultarMunicipioUf(int index)
    {
        java.lang.Object obj = _listaConsultarMunicipioUfList.elementAt(index);
        _listaConsultarMunicipioUfList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf removeListaConsultarMunicipioUf(int) 

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
     * Method setListaConsultarMunicipioUf
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarMunicipioUf
     */
    public void setListaConsultarMunicipioUf(int index, br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf vListaConsultarMunicipioUf)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarMunicipioUfList.size())) {
            throw new IndexOutOfBoundsException("setListaConsultarMunicipioUf: Index value '"+index+"' not in range [0.." + (_listaConsultarMunicipioUfList.size() - 1) + "]");
        }
        _listaConsultarMunicipioUfList.setElementAt(vListaConsultarMunicipioUf, index);
    } //-- void setListaConsultarMunicipioUf(int, br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf) 

    /**
     * Method setListaConsultarMunicipioUf
     * 
     * 
     * 
     * @param listaConsultarMunicipioUfArray
     */
    public void setListaConsultarMunicipioUf(br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf[] listaConsultarMunicipioUfArray)
    {
        //-- copy array
        _listaConsultarMunicipioUfList.removeAllElements();
        for (int i = 0; i < listaConsultarMunicipioUfArray.length; i++) {
            _listaConsultarMunicipioUfList.addElement(listaConsultarMunicipioUfArray[i]);
        }
    } //-- void setListaConsultarMunicipioUf(br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf) 

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
     * @return ConsultarMunicipioUfResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ConsultarMunicipioUfResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ConsultarMunicipioUfResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ConsultarMunicipioUfResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ConsultarMunicipioUfResponse unmarshal(java.io.Reader) 

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
