/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response;

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
 * Class ListarHistoricoMunicipioResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarHistoricoMunicipioResponse implements java.io.Serializable {


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
     * Field _listaHistoricoMunicipioList
     */
    private java.util.Vector _listaHistoricoMunicipioList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarHistoricoMunicipioResponse() 
     {
        super();
        _listaHistoricoMunicipioList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListarHistoricoMunicipioResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaHistoricoMunicipio
     * 
     * 
     * 
     * @param vListaHistoricoMunicipio
     */
    public void addListaHistoricoMunicipio(br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio vListaHistoricoMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaHistoricoMunicipioList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaHistoricoMunicipio has a maximum of 200");
        }
        _listaHistoricoMunicipioList.addElement(vListaHistoricoMunicipio);
    } //-- void addListaHistoricoMunicipio(br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio) 

    /**
     * Method addListaHistoricoMunicipio
     * 
     * 
     * 
     * @param index
     * @param vListaHistoricoMunicipio
     */
    public void addListaHistoricoMunicipio(int index, br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio vListaHistoricoMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaHistoricoMunicipioList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaHistoricoMunicipio has a maximum of 200");
        }
        _listaHistoricoMunicipioList.insertElementAt(vListaHistoricoMunicipio, index);
    } //-- void addListaHistoricoMunicipio(int, br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method enumerateListaHistoricoMunicipio
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaHistoricoMunicipio()
    {
        return _listaHistoricoMunicipioList.elements();
    } //-- java.util.Enumeration enumerateListaHistoricoMunicipio() 

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
     * Method getListaHistoricoMunicipio
     * 
     * 
     * 
     * @param index
     * @return ListaHistoricoMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio getListaHistoricoMunicipio(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaHistoricoMunicipioList.size())) {
            throw new IndexOutOfBoundsException("getListaHistoricoMunicipio: Index value '"+index+"' not in range [0.."+(_listaHistoricoMunicipioList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio) _listaHistoricoMunicipioList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio getListaHistoricoMunicipio(int) 

    /**
     * Method getListaHistoricoMunicipio
     * 
     * 
     * 
     * @return ListaHistoricoMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio[] getListaHistoricoMunicipio()
    {
        int size = _listaHistoricoMunicipioList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio) _listaHistoricoMunicipioList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio[] getListaHistoricoMunicipio() 

    /**
     * Method getListaHistoricoMunicipioCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaHistoricoMunicipioCount()
    {
        return _listaHistoricoMunicipioList.size();
    } //-- int getListaHistoricoMunicipioCount() 

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
     * Method removeAllListaHistoricoMunicipio
     * 
     */
    public void removeAllListaHistoricoMunicipio()
    {
        _listaHistoricoMunicipioList.removeAllElements();
    } //-- void removeAllListaHistoricoMunicipio() 

    /**
     * Method removeListaHistoricoMunicipio
     * 
     * 
     * 
     * @param index
     * @return ListaHistoricoMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio removeListaHistoricoMunicipio(int index)
    {
        java.lang.Object obj = _listaHistoricoMunicipioList.elementAt(index);
        _listaHistoricoMunicipioList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio removeListaHistoricoMunicipio(int) 

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
     * Method setListaHistoricoMunicipio
     * 
     * 
     * 
     * @param index
     * @param vListaHistoricoMunicipio
     */
    public void setListaHistoricoMunicipio(int index, br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio vListaHistoricoMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaHistoricoMunicipioList.size())) {
            throw new IndexOutOfBoundsException("setListaHistoricoMunicipio: Index value '"+index+"' not in range [0.." + (_listaHistoricoMunicipioList.size() - 1) + "]");
        }
        if (!(index < 200)) {
            throw new IndexOutOfBoundsException("setListaHistoricoMunicipio has a maximum of 200");
        }
        _listaHistoricoMunicipioList.setElementAt(vListaHistoricoMunicipio, index);
    } //-- void setListaHistoricoMunicipio(int, br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio) 

    /**
     * Method setListaHistoricoMunicipio
     * 
     * 
     * 
     * @param listaHistoricoMunicipioArray
     */
    public void setListaHistoricoMunicipio(br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio[] listaHistoricoMunicipioArray)
    {
        //-- copy array
        _listaHistoricoMunicipioList.removeAllElements();
        for (int i = 0; i < listaHistoricoMunicipioArray.length; i++) {
            _listaHistoricoMunicipioList.addElement(listaHistoricoMunicipioArray[i]);
        }
    } //-- void setListaHistoricoMunicipio(br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListaHistoricoMunicipio) 

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
     * @return ListarHistoricoMunicipioResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListarHistoricoMunicipioResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListarHistoricoMunicipioResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListarHistoricoMunicipioResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.response.ListarHistoricoMunicipioResponse unmarshal(java.io.Reader) 

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
