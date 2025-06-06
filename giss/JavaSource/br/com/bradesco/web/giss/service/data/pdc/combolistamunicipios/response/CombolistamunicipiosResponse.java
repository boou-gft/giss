/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response;

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
 * Class CombolistamunicipiosResponse.
 * 
 * @version $Revision$ $Date$
 */
public class CombolistamunicipiosResponse implements java.io.Serializable {


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
     * Field _consultasSaidaList
     */
    private java.util.Vector _consultasSaidaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CombolistamunicipiosResponse() 
     {
        super();
        _consultasSaidaList = new Vector();
    } //-- br.com.bradesco.web.service.data.pdc.combolistamunicipios.response.CombolistamunicipiosResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConsultasSaida
     * 
     * 
     * 
     * @param vConsultasSaida
     */
    public void addConsultasSaida(br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida vConsultasSaida)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_consultasSaidaList.size() < 2000)) {
            throw new IndexOutOfBoundsException("addConsultasSaida has a maximum of 2000");
        }
        _consultasSaidaList.addElement(vConsultasSaida);
    } //-- void addConsultasSaida(br.com.bradesco.web.service.data.pdc.combolistamunicipios.response.ConsultasSaida) 

    /**
     * Method addConsultasSaida
     * 
     * 
     * 
     * @param index
     * @param vConsultasSaida
     */
    public void addConsultasSaida(int index, br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida vConsultasSaida)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_consultasSaidaList.size() < 2000)) {
            throw new IndexOutOfBoundsException("addConsultasSaida has a maximum of 2000");
        }
        _consultasSaidaList.insertElementAt(vConsultasSaida, index);
    } //-- void addConsultasSaida(int, br.com.bradesco.web.service.data.pdc.combolistamunicipios.response.ConsultasSaida) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method enumerateConsultasSaida
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateConsultasSaida()
    {
        return _consultasSaidaList.elements();
    } //-- java.util.Enumeration enumerateConsultasSaida() 

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
     * Method getConsultasSaida
     * 
     * 
     * 
     * @param index
     * @return ConsultasSaida
     */
    public br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida getConsultasSaida(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _consultasSaidaList.size())) {
            throw new IndexOutOfBoundsException("getConsultasSaida: Index value '"+index+"' not in range [0.."+(_consultasSaidaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida) _consultasSaidaList.elementAt(index);
    } //-- br.com.bradesco.web.service.data.pdc.combolistamunicipios.response.ConsultasSaida getConsultasSaida(int) 

    /**
     * Method getConsultasSaida
     * 
     * 
     * 
     * @return ConsultasSaida
     */
    public br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida[] getConsultasSaida()
    {
        int size = _consultasSaidaList.size();
        br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida[] mArray = new br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida) _consultasSaidaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.service.data.pdc.combolistamunicipios.response.ConsultasSaida[] getConsultasSaida() 

    /**
     * Method getConsultasSaidaCount
     * 
     * 
     * 
     * @return int
     */
    public int getConsultasSaidaCount()
    {
        return _consultasSaidaList.size();
    } //-- int getConsultasSaidaCount() 

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
     * Method removeAllConsultasSaida
     * 
     */
    public void removeAllConsultasSaida()
    {
        _consultasSaidaList.removeAllElements();
    } //-- void removeAllConsultasSaida() 

    /**
     * Method removeConsultasSaida
     * 
     * 
     * 
     * @param index
     * @return ConsultasSaida
     */
    public br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida removeConsultasSaida(int index)
    {
        java.lang.Object obj = _consultasSaidaList.elementAt(index);
        _consultasSaidaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida) obj;
    } //-- br.com.bradesco.web.service.data.pdc.combolistamunicipios.response.ConsultasSaida removeConsultasSaida(int) 

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
     * Method setConsultasSaida
     * 
     * 
     * 
     * @param index
     * @param vConsultasSaida
     */
    public void setConsultasSaida(int index, br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida vConsultasSaida)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _consultasSaidaList.size())) {
            throw new IndexOutOfBoundsException("setConsultasSaida: Index value '"+index+"' not in range [0.." + (_consultasSaidaList.size() - 1) + "]");
        }
        if (!(index < 200)) {
            throw new IndexOutOfBoundsException("setConsultasSaida has a maximum of 200");
        }
        _consultasSaidaList.setElementAt(vConsultasSaida, index);
    } //-- void setConsultasSaida(int, br.com.bradesco.web.service.data.pdc.combolistamunicipios.response.ConsultasSaida) 

    /**
     * Method setConsultasSaida
     * 
     * 
     * 
     * @param consultasSaidaArray
     */
    public void setConsultasSaida(br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.ConsultasSaida[] consultasSaidaArray)
    {
        //-- copy array
        _consultasSaidaList.removeAllElements();
        for (int i = 0; i < consultasSaidaArray.length; i++) {
            _consultasSaidaList.addElement(consultasSaidaArray[i]);
        }
    } //-- void setConsultasSaida(br.com.bradesco.web.service.data.pdc.combolistamunicipios.response.ConsultasSaida) 

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
     * @return CombolistamunicipiosResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.CombolistamunicipiosResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.CombolistamunicipiosResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.response.CombolistamunicipiosResponse.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.combolistamunicipios.response.CombolistamunicipiosResponse unmarshal(java.io.Reader) 

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
