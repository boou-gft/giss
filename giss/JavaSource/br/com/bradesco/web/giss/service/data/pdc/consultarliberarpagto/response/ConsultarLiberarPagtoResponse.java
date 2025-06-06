/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response;

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
 * Class ConsultarLiberarPagtoResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarLiberarPagtoResponse implements java.io.Serializable {


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
     * Field _consultarLiberarPagtoList
     */
    private java.util.Vector _consultarLiberarPagtoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarLiberarPagtoResponse() 
     {
        super();
        _consultarLiberarPagtoList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagtoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConsultarLiberarPagto
     * 
     * 
     * 
     * @param vConsultarLiberarPagto
     */
    public void addConsultarLiberarPagto(br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto vConsultarLiberarPagto)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_consultarLiberarPagtoList.size() < 80)) {
            throw new IndexOutOfBoundsException("addConsultarLiberarPagto has a maximum of 80");
        }
        _consultarLiberarPagtoList.addElement(vConsultarLiberarPagto);
    } //-- void addConsultarLiberarPagto(br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto) 

    /**
     * Method addConsultarLiberarPagto
     * 
     * 
     * 
     * @param index
     * @param vConsultarLiberarPagto
     */
    public void addConsultarLiberarPagto(int index, br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto vConsultarLiberarPagto)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_consultarLiberarPagtoList.size() < 80)) {
            throw new IndexOutOfBoundsException("addConsultarLiberarPagto has a maximum of 80");
        }
        _consultarLiberarPagtoList.insertElementAt(vConsultarLiberarPagto, index);
    } //-- void addConsultarLiberarPagto(int, br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method enumerateConsultarLiberarPagto
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateConsultarLiberarPagto()
    {
        return _consultarLiberarPagtoList.elements();
    } //-- java.util.Enumeration enumerateConsultarLiberarPagto() 

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
     * Method getConsultarLiberarPagto
     * 
     * 
     * 
     * @param index
     * @return ConsultarLiberarPagto
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto getConsultarLiberarPagto(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _consultarLiberarPagtoList.size())) {
            throw new IndexOutOfBoundsException("getConsultarLiberarPagto: Index value '"+index+"' not in range [0.."+(_consultarLiberarPagtoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto) _consultarLiberarPagtoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto getConsultarLiberarPagto(int) 

    /**
     * Method getConsultarLiberarPagto
     * 
     * 
     * 
     * @return ConsultarLiberarPagto
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto[] getConsultarLiberarPagto()
    {
        int size = _consultarLiberarPagtoList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto) _consultarLiberarPagtoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto[] getConsultarLiberarPagto() 

    /**
     * Method getConsultarLiberarPagtoCount
     * 
     * 
     * 
     * @return int
     */
    public int getConsultarLiberarPagtoCount()
    {
        return _consultarLiberarPagtoList.size();
    } //-- int getConsultarLiberarPagtoCount() 

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
     * Method removeAllConsultarLiberarPagto
     * 
     */
    public void removeAllConsultarLiberarPagto()
    {
        _consultarLiberarPagtoList.removeAllElements();
    } //-- void removeAllConsultarLiberarPagto() 

    /**
     * Method removeConsultarLiberarPagto
     * 
     * 
     * 
     * @param index
     * @return ConsultarLiberarPagto
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto removeConsultarLiberarPagto(int index)
    {
        java.lang.Object obj = _consultarLiberarPagtoList.elementAt(index);
        _consultarLiberarPagtoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto removeConsultarLiberarPagto(int) 

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
     * Method setConsultarLiberarPagto
     * 
     * 
     * 
     * @param index
     * @param vConsultarLiberarPagto
     */
    public void setConsultarLiberarPagto(int index, br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto vConsultarLiberarPagto)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _consultarLiberarPagtoList.size())) {
            throw new IndexOutOfBoundsException("setConsultarLiberarPagto: Index value '"+index+"' not in range [0.." + (_consultarLiberarPagtoList.size() - 1) + "]");
        }
        if (!(index < 80)) {
            throw new IndexOutOfBoundsException("setConsultarLiberarPagto has a maximum of 80");
        }
        _consultarLiberarPagtoList.setElementAt(vConsultarLiberarPagto, index);
    } //-- void setConsultarLiberarPagto(int, br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto) 

    /**
     * Method setConsultarLiberarPagto
     * 
     * 
     * 
     * @param consultarLiberarPagtoArray
     */
    public void setConsultarLiberarPagto(br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto[] consultarLiberarPagtoArray)
    {
        //-- copy array
        _consultarLiberarPagtoList.removeAllElements();
        for (int i = 0; i < consultarLiberarPagtoArray.length; i++) {
            _consultarLiberarPagtoList.addElement(consultarLiberarPagtoArray[i]);
        }
    } //-- void setConsultarLiberarPagto(br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagto) 

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
     * @return ConsultarLiberarPagtoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagtoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagtoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagtoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.response.ConsultarLiberarPagtoResponse unmarshal(java.io.Reader) 

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
