/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response;

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
 * Class ListarComboCosifEmpResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarComboCosifEmpResponse implements java.io.Serializable {


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
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _listaCosifList
     */
    private java.util.Vector _listaCosifList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarComboCosifEmpResponse() 
     {
        super();
        _listaCosifList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListarComboCosifEmpResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaCosif
     * 
     * 
     * 
     * @param vListaCosif
     */
    public void addListaCosif(br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif vListaCosif)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaCosifList.size() < 999)) {
            throw new IndexOutOfBoundsException("addListaCosif has a maximum of 999");
        }
        _listaCosifList.addElement(vListaCosif);
    } //-- void addListaCosif(br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif) 

    /**
     * Method addListaCosif
     * 
     * 
     * 
     * @param index
     * @param vListaCosif
     */
    public void addListaCosif(int index, br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif vListaCosif)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaCosifList.size() < 999)) {
            throw new IndexOutOfBoundsException("addListaCosif has a maximum of 999");
        }
        _listaCosifList.insertElementAt(vListaCosif, index);
    } //-- void addListaCosif(int, br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif) 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateListaCosif
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaCosif()
    {
        return _listaCosifList.elements();
    } //-- java.util.Enumeration enumerateListaCosif() 

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
     * Method getListaCosif
     * 
     * 
     * 
     * @param index
     * @return ListaCosif
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif getListaCosif(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaCosifList.size())) {
            throw new IndexOutOfBoundsException("getListaCosif: Index value '"+index+"' not in range [0.."+(_listaCosifList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif) _listaCosifList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif getListaCosif(int) 

    /**
     * Method getListaCosif
     * 
     * 
     * 
     * @return ListaCosif
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif[] getListaCosif()
    {
        int size = _listaCosifList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif) _listaCosifList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif[] getListaCosif() 

    /**
     * Method getListaCosifCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaCosifCount()
    {
        return _listaCosifList.size();
    } //-- int getListaCosifCount() 

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
     * Returns the value of field 'qtdeRegistros'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistros'.
     */
    public int getQtdeRegistros()
    {
        return this._qtdeRegistros;
    } //-- int getQtdeRegistros() 

    /**
     * Method hasQtdeRegistros
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistros()
    {
        return this._has_qtdeRegistros;
    } //-- boolean hasQtdeRegistros() 

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
     * Method removeAllListaCosif
     * 
     */
    public void removeAllListaCosif()
    {
        _listaCosifList.removeAllElements();
    } //-- void removeAllListaCosif() 

    /**
     * Method removeListaCosif
     * 
     * 
     * 
     * @param index
     * @return ListaCosif
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif removeListaCosif(int index)
    {
        java.lang.Object obj = _listaCosifList.elementAt(index);
        _listaCosifList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif removeListaCosif(int) 

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
     * Method setListaCosif
     * 
     * 
     * 
     * @param index
     * @param vListaCosif
     */
    public void setListaCosif(int index, br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif vListaCosif)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaCosifList.size())) {
            throw new IndexOutOfBoundsException("setListaCosif: Index value '"+index+"' not in range [0.." + (_listaCosifList.size() - 1) + "]");
        }
        if (!(index < 999)) {
            throw new IndexOutOfBoundsException("setListaCosif has a maximum of 999");
        }
        _listaCosifList.setElementAt(vListaCosif, index);
    } //-- void setListaCosif(int, br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif) 

    /**
     * Method setListaCosif
     * 
     * 
     * 
     * @param listaCosifArray
     */
    public void setListaCosif(br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif[] listaCosifArray)
    {
        //-- copy array
        _listaCosifList.removeAllElements();
        for (int i = 0; i < listaCosifArray.length; i++) {
            _listaCosifList.addElement(listaCosifArray[i]);
        }
    } //-- void setListaCosif(br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosif) 

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
     * Sets the value of field 'qtdeRegistros'.
     * 
     * @param qtdeRegistros the value of field 'qtdeRegistros'.
     */
    public void setQtdeRegistros(int qtdeRegistros)
    {
        this._qtdeRegistros = qtdeRegistros;
        this._has_qtdeRegistros = true;
    } //-- void setQtdeRegistros(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarComboCosifEmpResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListarComboCosifEmpResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListarComboCosifEmpResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListarComboCosifEmpResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListarComboCosifEmpResponse unmarshal(java.io.Reader) 

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
