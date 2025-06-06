/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarMunicipioManterAllResponse.java,v 1.1 2017/06/12 17:41:02 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response;

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
 * Class ListarMunicipioManterAllResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/06/12 17:41:02 $
 */
public class ListarMunicipioManterAllResponse implements java.io.Serializable {


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
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _listaMunicipioList
     */
    private java.util.Vector _listaMunicipioList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarMunicipioManterAllResponse() 
     {
        super();
        _listaMunicipioList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListarMunicipioManterAllResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaMunicipio
     * 
     * 
     * 
     * @param vListaMunicipio
     */
    public void addListaMunicipio(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio vListaMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaMunicipioList.addElement(vListaMunicipio);
    } //-- void addListaMunicipio(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio) 

    /**
     * Method addListaMunicipio
     * 
     * 
     * 
     * @param index
     * @param vListaMunicipio
     */
    public void addListaMunicipio(int index, br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio vListaMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaMunicipioList.insertElementAt(vListaMunicipio, index);
    } //-- void addListaMunicipio(int, br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio) 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaMunicipio
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaMunicipio()
    {
        return _listaMunicipioList.elements();
    } //-- java.util.Enumeration enumerateListaMunicipio() 

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
     * Method getListaMunicipio
     * 
     * 
     * 
     * @param index
     * @return ListaMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio getListaMunicipio(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaMunicipioList.size())) {
            throw new IndexOutOfBoundsException("getListaMunicipio: Index value '"+index+"' not in range [0.."+(_listaMunicipioList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio) _listaMunicipioList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio getListaMunicipio(int) 

    /**
     * Method getListaMunicipio
     * 
     * 
     * 
     * @return ListaMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio[] getListaMunicipio()
    {
        int size = _listaMunicipioList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio) _listaMunicipioList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio[] getListaMunicipio() 

    /**
     * Method getListaMunicipioCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaMunicipioCount()
    {
        return _listaMunicipioList.size();
    } //-- int getListaMunicipioCount() 

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
     * Returns the value of field 'qtdeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdeOcorrencias'.
     */
    public int getQtdeOcorrencias()
    {
        return this._qtdeOcorrencias;
    } //-- int getQtdeOcorrencias() 

    /**
     * Method hasQtdeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcorrencias()
    {
        return this._has_qtdeOcorrencias;
    } //-- boolean hasQtdeOcorrencias() 

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
     * Method removeAllListaMunicipio
     * 
     */
    public void removeAllListaMunicipio()
    {
        _listaMunicipioList.removeAllElements();
    } //-- void removeAllListaMunicipio() 

    /**
     * Method removeListaMunicipio
     * 
     * 
     * 
     * @param index
     * @return ListaMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio removeListaMunicipio(int index)
    {
        java.lang.Object obj = _listaMunicipioList.elementAt(index);
        _listaMunicipioList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio removeListaMunicipio(int) 

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
     * Method setListaMunicipio
     * 
     * 
     * 
     * @param index
     * @param vListaMunicipio
     */
    public void setListaMunicipio(int index, br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio vListaMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaMunicipioList.size())) {
            throw new IndexOutOfBoundsException("setListaMunicipio: Index value '"+index+"' not in range [0.." + (_listaMunicipioList.size() - 1) + "]");
        }
        _listaMunicipioList.setElementAt(vListaMunicipio, index);
    } //-- void setListaMunicipio(int, br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio) 

    /**
     * Method setListaMunicipio
     * 
     * 
     * 
     * @param listaMunicipioArray
     */
    public void setListaMunicipio(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio[] listaMunicipioArray)
    {
        //-- copy array
        _listaMunicipioList.removeAllElements();
        for (int i = 0; i < listaMunicipioArray.length; i++) {
            _listaMunicipioList.addElement(listaMunicipioArray[i]);
        }
    } //-- void setListaMunicipio(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListaMunicipio) 

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
     * Sets the value of field 'qtdeOcorrencias'.
     * 
     * @param qtdeOcorrencias the value of field 'qtdeOcorrencias'.
     */
    public void setQtdeOcorrencias(int qtdeOcorrencias)
    {
        this._qtdeOcorrencias = qtdeOcorrencias;
        this._has_qtdeOcorrencias = true;
    } //-- void setQtdeOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarMunicipioManterAllResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListarMunicipioManterAllResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListarMunicipioManterAllResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListarMunicipioManterAllResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.response.ListarMunicipioManterAllResponse unmarshal(java.io.Reader) 

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
