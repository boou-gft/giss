/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarComboEstadoResponse.java,v 1.2 2017/12/18 11:45:59 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response;

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
 * Class ListarComboEstadoResponse.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/12/18 11:45:59 $
 */
public class ListarComboEstadoResponse implements java.io.Serializable {


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
     * Field _listaComboEstadoList
     */
    private java.util.Vector _listaComboEstadoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarComboEstadoResponse() 
     {
        super();
        _listaComboEstadoList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListarComboEstadoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaComboEstado
     * 
     * 
     * 
     * @param vListaComboEstado
     */
    public void addListaComboEstado(br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado vListaComboEstado)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaComboEstadoList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaComboEstado has a maximum of 200");
        }
        _listaComboEstadoList.addElement(vListaComboEstado);
    } //-- void addListaComboEstado(br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado) 

    /**
     * Method addListaComboEstado
     * 
     * 
     * 
     * @param index
     * @param vListaComboEstado
     */
    public void addListaComboEstado(int index, br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado vListaComboEstado)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaComboEstadoList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaComboEstado has a maximum of 200");
        }
        _listaComboEstadoList.insertElementAt(vListaComboEstado, index);
    } //-- void addListaComboEstado(int, br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado) 

    /**
     * Method deleteNumConsulta
     * 
     */
    public void deleteNumConsulta()
    {
        this._has_numConsulta= false;
    } //-- void deleteNumConsulta() 

    /**
     * Method enumerateListaComboEstado
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaComboEstado()
    {
        return _listaComboEstadoList.elements();
    } //-- java.util.Enumeration enumerateListaComboEstado() 

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
     * Method getListaComboEstado
     * 
     * 
     * 
     * @param index
     * @return ListaComboEstado
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado getListaComboEstado(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaComboEstadoList.size())) {
            throw new IndexOutOfBoundsException("getListaComboEstado: Index value '"+index+"' not in range [0.."+(_listaComboEstadoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado) _listaComboEstadoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado getListaComboEstado(int) 

    /**
     * Method getListaComboEstado
     * 
     * 
     * 
     * @return ListaComboEstado
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado[] getListaComboEstado()
    {
        int size = _listaComboEstadoList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado) _listaComboEstadoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado[] getListaComboEstado() 

    /**
     * Method getListaComboEstadoCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaComboEstadoCount()
    {
        return _listaComboEstadoList.size();
    } //-- int getListaComboEstadoCount() 

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
     * Method removeAllListaComboEstado
     * 
     */
    public void removeAllListaComboEstado()
    {
        _listaComboEstadoList.removeAllElements();
    } //-- void removeAllListaComboEstado() 

    /**
     * Method removeListaComboEstado
     * 
     * 
     * 
     * @param index
     * @return ListaComboEstado
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado removeListaComboEstado(int index)
    {
        java.lang.Object obj = _listaComboEstadoList.elementAt(index);
        _listaComboEstadoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado removeListaComboEstado(int) 

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
     * Method setListaComboEstado
     * 
     * 
     * 
     * @param index
     * @param vListaComboEstado
     */
    public void setListaComboEstado(int index, br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado vListaComboEstado)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaComboEstadoList.size())) {
            throw new IndexOutOfBoundsException("setListaComboEstado: Index value '"+index+"' not in range [0.." + (_listaComboEstadoList.size() - 1) + "]");
        }
        if (!(index < 200)) {
            throw new IndexOutOfBoundsException("setListaComboEstado has a maximum of 200");
        }
        _listaComboEstadoList.setElementAt(vListaComboEstado, index);
    } //-- void setListaComboEstado(int, br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado) 

    /**
     * Method setListaComboEstado
     * 
     * 
     * 
     * @param listaComboEstadoArray
     */
    public void setListaComboEstado(br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado[] listaComboEstadoArray)
    {
        //-- copy array
        _listaComboEstadoList.removeAllElements();
        for (int i = 0; i < listaComboEstadoArray.length; i++) {
            _listaComboEstadoList.addElement(listaComboEstadoArray[i]);
        }
    } //-- void setListaComboEstado(br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado) 

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
     * @return ListarComboEstadoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListarComboEstadoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListarComboEstadoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListarComboEstadoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListarComboEstadoResponse unmarshal(java.io.Reader) 

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
