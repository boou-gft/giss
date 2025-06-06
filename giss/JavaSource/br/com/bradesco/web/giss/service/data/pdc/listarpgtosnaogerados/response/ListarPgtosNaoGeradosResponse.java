/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response;

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
 * Class ListarPgtosNaoGeradosResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarPgtosNaoGeradosResponse implements java.io.Serializable {


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
     * Field _ocorrencias
     */
    private int _ocorrencias = 0;

    /**
     * keeps track of state for field: _ocorrencias
     */
    private boolean _has_ocorrencias;

    /**
     * Field _listaPgtosNaoGeradosList
     */
    private java.util.Vector _listaPgtosNaoGeradosList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarPgtosNaoGeradosResponse() 
     {
        super();
        _listaPgtosNaoGeradosList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListarPgtosNaoGeradosResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaPgtosNaoGerados
     * 
     * 
     * 
     * @param vListaPgtosNaoGerados
     */
    public void addListaPgtosNaoGerados(br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados vListaPgtosNaoGerados)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaPgtosNaoGeradosList.addElement(vListaPgtosNaoGerados);
    } //-- void addListaPgtosNaoGerados(br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados) 

    /**
     * Method addListaPgtosNaoGerados
     * 
     * 
     * 
     * @param index
     * @param vListaPgtosNaoGerados
     */
    public void addListaPgtosNaoGerados(int index, br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados vListaPgtosNaoGerados)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaPgtosNaoGeradosList.insertElementAt(vListaPgtosNaoGerados, index);
    } //-- void addListaPgtosNaoGerados(int, br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados) 

    /**
     * Method deleteOcorrencias
     * 
     */
    public void deleteOcorrencias()
    {
        this._has_ocorrencias= false;
    } //-- void deleteOcorrencias() 

    /**
     * Method enumerateListaPgtosNaoGerados
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaPgtosNaoGerados()
    {
        return _listaPgtosNaoGeradosList.elements();
    } //-- java.util.Enumeration enumerateListaPgtosNaoGerados() 

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
     * Method getListaPgtosNaoGerados
     * 
     * 
     * 
     * @param index
     * @return ListaPgtosNaoGerados
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados getListaPgtosNaoGerados(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaPgtosNaoGeradosList.size())) {
            throw new IndexOutOfBoundsException("getListaPgtosNaoGerados: Index value '"+index+"' not in range [0.."+(_listaPgtosNaoGeradosList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados) _listaPgtosNaoGeradosList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados getListaPgtosNaoGerados(int) 

    /**
     * Method getListaPgtosNaoGerados
     * 
     * 
     * 
     * @return ListaPgtosNaoGerados
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados[] getListaPgtosNaoGerados()
    {
        int size = _listaPgtosNaoGeradosList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados) _listaPgtosNaoGeradosList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados[] getListaPgtosNaoGerados() 

    /**
     * Method getListaPgtosNaoGeradosCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaPgtosNaoGeradosCount()
    {
        return _listaPgtosNaoGeradosList.size();
    } //-- int getListaPgtosNaoGeradosCount() 

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
     * Returns the value of field 'ocorrencias'.
     * 
     * @return int
     * @return the value of field 'ocorrencias'.
     */
    public int getOcorrencias()
    {
        return this._ocorrencias;
    } //-- int getOcorrencias() 

    /**
     * Method hasOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasOcorrencias()
    {
        return this._has_ocorrencias;
    } //-- boolean hasOcorrencias() 

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
     * Method removeAllListaPgtosNaoGerados
     * 
     */
    public void removeAllListaPgtosNaoGerados()
    {
        _listaPgtosNaoGeradosList.removeAllElements();
    } //-- void removeAllListaPgtosNaoGerados() 

    /**
     * Method removeListaPgtosNaoGerados
     * 
     * 
     * 
     * @param index
     * @return ListaPgtosNaoGerados
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados removeListaPgtosNaoGerados(int index)
    {
        java.lang.Object obj = _listaPgtosNaoGeradosList.elementAt(index);
        _listaPgtosNaoGeradosList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados removeListaPgtosNaoGerados(int) 

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
     * Method setListaPgtosNaoGerados
     * 
     * 
     * 
     * @param index
     * @param vListaPgtosNaoGerados
     */
    public void setListaPgtosNaoGerados(int index, br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados vListaPgtosNaoGerados)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaPgtosNaoGeradosList.size())) {
            throw new IndexOutOfBoundsException("setListaPgtosNaoGerados: Index value '"+index+"' not in range [0.." + (_listaPgtosNaoGeradosList.size() - 1) + "]");
        }
        _listaPgtosNaoGeradosList.setElementAt(vListaPgtosNaoGerados, index);
    } //-- void setListaPgtosNaoGerados(int, br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados) 

    /**
     * Method setListaPgtosNaoGerados
     * 
     * 
     * 
     * @param listaPgtosNaoGeradosArray
     */
    public void setListaPgtosNaoGerados(br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados[] listaPgtosNaoGeradosArray)
    {
        //-- copy array
        _listaPgtosNaoGeradosList.removeAllElements();
        for (int i = 0; i < listaPgtosNaoGeradosArray.length; i++) {
            _listaPgtosNaoGeradosList.addElement(listaPgtosNaoGeradosArray[i]);
        }
    } //-- void setListaPgtosNaoGerados(br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListaPgtosNaoGerados) 

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
     * Sets the value of field 'ocorrencias'.
     * 
     * @param ocorrencias the value of field 'ocorrencias'.
     */
    public void setOcorrencias(int ocorrencias)
    {
        this._ocorrencias = ocorrencias;
        this._has_ocorrencias = true;
    } //-- void setOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarPgtosNaoGeradosResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListarPgtosNaoGeradosResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListarPgtosNaoGeradosResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListarPgtosNaoGeradosResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.response.ListarPgtosNaoGeradosResponse unmarshal(java.io.Reader) 

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
