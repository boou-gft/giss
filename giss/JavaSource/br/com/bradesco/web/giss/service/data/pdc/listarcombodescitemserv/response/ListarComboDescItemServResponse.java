/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarComboDescItemServResponse.java,v 1.4 2017/11/15 22:17:09 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response;

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
 * Class ListarComboDescItemServResponse.
 * 
 * @version $Revision: 1.4 $ $Date: 2017/11/15 22:17:09 $
 */
public class ListarComboDescItemServResponse implements java.io.Serializable {


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
     * Field _listaComboDescItemServList
     */
    private java.util.Vector _listaComboDescItemServList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarComboDescItemServResponse() 
     {
        super();
        _listaComboDescItemServList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListarComboDescItemServResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaComboDescItemServ
     * 
     * 
     * 
     * @param vListaComboDescItemServ
     */
    public void addListaComboDescItemServ(br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ vListaComboDescItemServ)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaComboDescItemServList.addElement(vListaComboDescItemServ);
    } //-- void addListaComboDescItemServ(br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ) 

    /**
     * Method addListaComboDescItemServ
     * 
     * 
     * 
     * @param index
     * @param vListaComboDescItemServ
     */
    public void addListaComboDescItemServ(int index, br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ vListaComboDescItemServ)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaComboDescItemServList.insertElementAt(vListaComboDescItemServ, index);
    } //-- void addListaComboDescItemServ(int, br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ) 

    /**
     * Method enumerateListaComboDescItemServ
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaComboDescItemServ()
    {
        return _listaComboDescItemServList.elements();
    } //-- java.util.Enumeration enumerateListaComboDescItemServ() 

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
     * Method getListaComboDescItemServ
     * 
     * 
     * 
     * @param index
     * @return ListaComboDescItemServ
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ getListaComboDescItemServ(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaComboDescItemServList.size())) {
            throw new IndexOutOfBoundsException("getListaComboDescItemServ: Index value '"+index+"' not in range [0.."+(_listaComboDescItemServList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ) _listaComboDescItemServList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ getListaComboDescItemServ(int) 

    /**
     * Method getListaComboDescItemServ
     * 
     * 
     * 
     * @return ListaComboDescItemServ
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ[] getListaComboDescItemServ()
    {
        int size = _listaComboDescItemServList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ) _listaComboDescItemServList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ[] getListaComboDescItemServ() 

    /**
     * Method getListaComboDescItemServCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaComboDescItemServCount()
    {
        return _listaComboDescItemServList.size();
    } //-- int getListaComboDescItemServCount() 

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
     * Method removeAllListaComboDescItemServ
     * 
     */
    public void removeAllListaComboDescItemServ()
    {
        _listaComboDescItemServList.removeAllElements();
    } //-- void removeAllListaComboDescItemServ() 

    /**
     * Method removeListaComboDescItemServ
     * 
     * 
     * 
     * @param index
     * @return ListaComboDescItemServ
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ removeListaComboDescItemServ(int index)
    {
        java.lang.Object obj = _listaComboDescItemServList.elementAt(index);
        _listaComboDescItemServList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ removeListaComboDescItemServ(int) 

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
     * Method setListaComboDescItemServ
     * 
     * 
     * 
     * @param index
     * @param vListaComboDescItemServ
     */
    public void setListaComboDescItemServ(int index, br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ vListaComboDescItemServ)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaComboDescItemServList.size())) {
            throw new IndexOutOfBoundsException("setListaComboDescItemServ: Index value '"+index+"' not in range [0.." + (_listaComboDescItemServList.size() - 1) + "]");
        }
        _listaComboDescItemServList.setElementAt(vListaComboDescItemServ, index);
    } //-- void setListaComboDescItemServ(int, br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ) 

    /**
     * Method setListaComboDescItemServ
     * 
     * 
     * 
     * @param listaComboDescItemServArray
     */
    public void setListaComboDescItemServ(br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ[] listaComboDescItemServArray)
    {
        //-- copy array
        _listaComboDescItemServList.removeAllElements();
        for (int i = 0; i < listaComboDescItemServArray.length; i++) {
            _listaComboDescItemServList.addElement(listaComboDescItemServArray[i]);
        }
    } //-- void setListaComboDescItemServ(br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ) 

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
     * @return ListarComboDescItemServResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListarComboDescItemServResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListarComboDescItemServResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListarComboDescItemServResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListarComboDescItemServResponse unmarshal(java.io.Reader) 

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
