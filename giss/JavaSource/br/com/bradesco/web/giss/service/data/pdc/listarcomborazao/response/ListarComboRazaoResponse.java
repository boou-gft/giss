/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarComboRazaoResponse.java,v 1.2 2017/11/28 20:09:00 gabrielmarani Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response;

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
 * Class ListarComboRazaoResponse.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/11/28 20:09:00 $
 */
public class ListarComboRazaoResponse implements java.io.Serializable {


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
     * Field _listaComboRazaoList
     */
    private java.util.Vector _listaComboRazaoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarComboRazaoResponse() 
     {
        super();
        _listaComboRazaoList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListarComboRazaoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaComboRazao
     * 
     * 
     * 
     * @param vListaComboRazao
     */
    public void addListaComboRazao(br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao vListaComboRazao)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaComboRazaoList.size() < 300)) {
            throw new IndexOutOfBoundsException("addListaComboRazao has a maximum of 300");
        }
        _listaComboRazaoList.addElement(vListaComboRazao);
    } //-- void addListaComboRazao(br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao) 

    /**
     * Method addListaComboRazao
     * 
     * 
     * 
     * @param index
     * @param vListaComboRazao
     */
    public void addListaComboRazao(int index, br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao vListaComboRazao)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaComboRazaoList.size() < 300)) {
            throw new IndexOutOfBoundsException("addListaComboRazao has a maximum of 300");
        }
        _listaComboRazaoList.insertElementAt(vListaComboRazao, index);
    } //-- void addListaComboRazao(int, br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao) 

    /**
     * Method deleteNumConsulta
     * 
     */
    public void deleteNumConsulta()
    {
        this._has_numConsulta= false;
    } //-- void deleteNumConsulta() 

    /**
     * Method enumerateListaComboRazao
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaComboRazao()
    {
        return _listaComboRazaoList.elements();
    } //-- java.util.Enumeration enumerateListaComboRazao() 

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
     * Method getListaComboRazao
     * 
     * 
     * 
     * @param index
     * @return ListaComboRazao
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao getListaComboRazao(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaComboRazaoList.size())) {
            throw new IndexOutOfBoundsException("getListaComboRazao: Index value '"+index+"' not in range [0.."+(_listaComboRazaoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao) _listaComboRazaoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao getListaComboRazao(int) 

    /**
     * Method getListaComboRazao
     * 
     * 
     * 
     * @return ListaComboRazao
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao[] getListaComboRazao()
    {
        int size = _listaComboRazaoList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao) _listaComboRazaoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao[] getListaComboRazao() 

    /**
     * Method getListaComboRazaoCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaComboRazaoCount()
    {
        return _listaComboRazaoList.size();
    } //-- int getListaComboRazaoCount() 

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
     * Method removeAllListaComboRazao
     * 
     */
    public void removeAllListaComboRazao()
    {
        _listaComboRazaoList.removeAllElements();
    } //-- void removeAllListaComboRazao() 

    /**
     * Method removeListaComboRazao
     * 
     * 
     * 
     * @param index
     * @return ListaComboRazao
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao removeListaComboRazao(int index)
    {
        java.lang.Object obj = _listaComboRazaoList.elementAt(index);
        _listaComboRazaoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao removeListaComboRazao(int) 

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
     * Method setListaComboRazao
     * 
     * 
     * 
     * @param index
     * @param vListaComboRazao
     */
    public void setListaComboRazao(int index, br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao vListaComboRazao)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaComboRazaoList.size())) {
            throw new IndexOutOfBoundsException("setListaComboRazao: Index value '"+index+"' not in range [0.." + (_listaComboRazaoList.size() - 1) + "]");
        }
        if (!(index < 300)) {
            throw new IndexOutOfBoundsException("setListaComboRazao has a maximum of 300");
        }
        _listaComboRazaoList.setElementAt(vListaComboRazao, index);
    } //-- void setListaComboRazao(int, br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao) 

    /**
     * Method setListaComboRazao
     * 
     * 
     * 
     * @param listaComboRazaoArray
     */
    public void setListaComboRazao(br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao[] listaComboRazaoArray)
    {
        //-- copy array
        _listaComboRazaoList.removeAllElements();
        for (int i = 0; i < listaComboRazaoArray.length; i++) {
            _listaComboRazaoList.addElement(listaComboRazaoArray[i]);
        }
    } //-- void setListaComboRazao(br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListaComboRazao) 

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
     * @return ListarComboRazaoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListarComboRazaoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListarComboRazaoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListarComboRazaoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.response.ListarComboRazaoResponse unmarshal(java.io.Reader) 

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
