/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response;

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
 * Class ListarMunicipiosSemConvenioResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarMunicipiosSemConvenioResponse implements java.io.Serializable {


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
     * Field _listaSaidaList
     */
    private java.util.Vector _listaSaidaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarMunicipiosSemConvenioResponse() 
     {
        super();
        _listaSaidaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListarMunicipiosSemConvenioResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaSaida
     * 
     * 
     * 
     * @param vListaSaida
     */
    public void addListaSaida(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida vListaSaida)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaSaidaList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaSaida has a maximum of 200");
        }
        _listaSaidaList.addElement(vListaSaida);
    } //-- void addListaSaida(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida) 

    /**
     * Method addListaSaida
     * 
     * 
     * 
     * @param index
     * @param vListaSaida
     */
    public void addListaSaida(int index, br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida vListaSaida)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaSaidaList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaSaida has a maximum of 200");
        }
        _listaSaidaList.insertElementAt(vListaSaida, index);
    } //-- void addListaSaida(int, br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method enumerateListaSaida
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaSaida()
    {
        return _listaSaidaList.elements();
    } //-- java.util.Enumeration enumerateListaSaida() 

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
     * Method getListaSaida
     * 
     * 
     * 
     * @param index
     * @return ListaSaida
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida getListaSaida(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaSaidaList.size())) {
            throw new IndexOutOfBoundsException("getListaSaida: Index value '"+index+"' not in range [0.."+(_listaSaidaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida) _listaSaidaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida getListaSaida(int) 

    /**
     * Method getListaSaida
     * 
     * 
     * 
     * @return ListaSaida
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida[] getListaSaida()
    {
        int size = _listaSaidaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida) _listaSaidaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida[] getListaSaida() 

    /**
     * Method getListaSaidaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaSaidaCount()
    {
        return _listaSaidaList.size();
    } //-- int getListaSaidaCount() 

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
     * Method removeAllListaSaida
     * 
     */
    public void removeAllListaSaida()
    {
        _listaSaidaList.removeAllElements();
    } //-- void removeAllListaSaida() 

    /**
     * Method removeListaSaida
     * 
     * 
     * 
     * @param index
     * @return ListaSaida
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida removeListaSaida(int index)
    {
        java.lang.Object obj = _listaSaidaList.elementAt(index);
        _listaSaidaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida removeListaSaida(int) 

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
     * Method setListaSaida
     * 
     * 
     * 
     * @param index
     * @param vListaSaida
     */
    public void setListaSaida(int index, br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida vListaSaida)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaSaidaList.size())) {
            throw new IndexOutOfBoundsException("setListaSaida: Index value '"+index+"' not in range [0.." + (_listaSaidaList.size() - 1) + "]");
        }
        if (!(index < 200)) {
            throw new IndexOutOfBoundsException("setListaSaida has a maximum of 200");
        }
        _listaSaidaList.setElementAt(vListaSaida, index);
    } //-- void setListaSaida(int, br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida) 

    /**
     * Method setListaSaida
     * 
     * 
     * 
     * @param listaSaidaArray
     */
    public void setListaSaida(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida[] listaSaidaArray)
    {
        //-- copy array
        _listaSaidaList.removeAllElements();
        for (int i = 0; i < listaSaidaArray.length; i++) {
            _listaSaidaList.addElement(listaSaidaArray[i]);
        }
    } //-- void setListaSaida(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida) 

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
     * @return ListarMunicipiosSemConvenioResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListarMunicipiosSemConvenioResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListarMunicipiosSemConvenioResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListarMunicipiosSemConvenioResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListarMunicipiosSemConvenioResponse unmarshal(java.io.Reader) 

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
