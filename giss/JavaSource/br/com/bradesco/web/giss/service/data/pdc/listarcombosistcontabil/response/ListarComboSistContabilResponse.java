/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarComboSistContabilResponse.java,v 1.3 2017/11/15 22:17:10 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response;

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
 * Class ListarComboSistContabilResponse.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/11/15 22:17:10 $
 */
public class ListarComboSistContabilResponse implements java.io.Serializable {


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
     * Field _listaComboSistContabilList
     */
    private java.util.Vector _listaComboSistContabilList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarComboSistContabilResponse() 
     {
        super();
        _listaComboSistContabilList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListarComboSistContabilResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaComboSistContabil
     * 
     * 
     * 
     * @param vListaComboSistContabil
     */
    public void addListaComboSistContabil(br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil vListaComboSistContabil)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaComboSistContabilList.addElement(vListaComboSistContabil);
    } //-- void addListaComboSistContabil(br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil) 

    /**
     * Method addListaComboSistContabil
     * 
     * 
     * 
     * @param index
     * @param vListaComboSistContabil
     */
    public void addListaComboSistContabil(int index, br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil vListaComboSistContabil)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaComboSistContabilList.insertElementAt(vListaComboSistContabil, index);
    } //-- void addListaComboSistContabil(int, br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil) 

    /**
     * Method enumerateListaComboSistContabil
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaComboSistContabil()
    {
        return _listaComboSistContabilList.elements();
    } //-- java.util.Enumeration enumerateListaComboSistContabil() 

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
     * Method getListaComboSistContabil
     * 
     * 
     * 
     * @param index
     * @return ListaComboSistContabil
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil getListaComboSistContabil(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaComboSistContabilList.size())) {
            throw new IndexOutOfBoundsException("getListaComboSistContabil: Index value '"+index+"' not in range [0.."+(_listaComboSistContabilList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil) _listaComboSistContabilList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil getListaComboSistContabil(int) 

    /**
     * Method getListaComboSistContabil
     * 
     * 
     * 
     * @return ListaComboSistContabil
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil[] getListaComboSistContabil()
    {
        int size = _listaComboSistContabilList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil) _listaComboSistContabilList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil[] getListaComboSistContabil() 

    /**
     * Method getListaComboSistContabilCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaComboSistContabilCount()
    {
        return _listaComboSistContabilList.size();
    } //-- int getListaComboSistContabilCount() 

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
     * Method removeAllListaComboSistContabil
     * 
     */
    public void removeAllListaComboSistContabil()
    {
        _listaComboSistContabilList.removeAllElements();
    } //-- void removeAllListaComboSistContabil() 

    /**
     * Method removeListaComboSistContabil
     * 
     * 
     * 
     * @param index
     * @return ListaComboSistContabil
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil removeListaComboSistContabil(int index)
    {
        java.lang.Object obj = _listaComboSistContabilList.elementAt(index);
        _listaComboSistContabilList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil removeListaComboSistContabil(int) 

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
     * Method setListaComboSistContabil
     * 
     * 
     * 
     * @param index
     * @param vListaComboSistContabil
     */
    public void setListaComboSistContabil(int index, br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil vListaComboSistContabil)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaComboSistContabilList.size())) {
            throw new IndexOutOfBoundsException("setListaComboSistContabil: Index value '"+index+"' not in range [0.." + (_listaComboSistContabilList.size() - 1) + "]");
        }
        _listaComboSistContabilList.setElementAt(vListaComboSistContabil, index);
    } //-- void setListaComboSistContabil(int, br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil) 

    /**
     * Method setListaComboSistContabil
     * 
     * 
     * 
     * @param listaComboSistContabilArray
     */
    public void setListaComboSistContabil(br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil[] listaComboSistContabilArray)
    {
        //-- copy array
        _listaComboSistContabilList.removeAllElements();
        for (int i = 0; i < listaComboSistContabilArray.length; i++) {
            _listaComboSistContabilList.addElement(listaComboSistContabilArray[i]);
        }
    } //-- void setListaComboSistContabil(br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListaComboSistContabil) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarComboSistContabilResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListarComboSistContabilResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListarComboSistContabilResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListarComboSistContabilResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.response.ListarComboSistContabilResponse unmarshal(java.io.Reader) 

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
