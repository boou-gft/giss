/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarListaContasTipoServicoResponse.java,v 1.2 2018/06/06 17:36:51 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response;

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
 * Class ConsultarListaContasTipoServicoResponse.
 * 
 * @version $Revision: 1.2 $ $Date: 2018/06/06 17:36:51 $
 */
public class ConsultarListaContasTipoServicoResponse implements java.io.Serializable {


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
     * Field _nroConsultas
     */
    private int _nroConsultas = 0;

    /**
     * keeps track of state for field: _nroConsultas
     */
    private boolean _has_nroConsultas;

    /**
     * Field _listaContasTpServList
     */
    private java.util.Vector _listaContasTpServList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarListaContasTipoServicoResponse() 
     {
        super();
        _listaContasTpServList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ConsultarListaContasTipoServicoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaContasTpServ
     * 
     * 
     * 
     * @param vListaContasTpServ
     */
    public void addListaContasTpServ(br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ vListaContasTpServ)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaContasTpServList.size() < 300)) {
            throw new IndexOutOfBoundsException("addListaContasTpServ has a maximum of 300");
        }
        _listaContasTpServList.addElement(vListaContasTpServ);
    } //-- void addListaContasTpServ(br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ) 

    /**
     * Method addListaContasTpServ
     * 
     * 
     * 
     * @param index
     * @param vListaContasTpServ
     */
    public void addListaContasTpServ(int index, br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ vListaContasTpServ)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaContasTpServList.size() < 300)) {
            throw new IndexOutOfBoundsException("addListaContasTpServ has a maximum of 300");
        }
        _listaContasTpServList.insertElementAt(vListaContasTpServ, index);
    } //-- void addListaContasTpServ(int, br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ) 

    /**
     * Method deleteNroConsultas
     * 
     */
    public void deleteNroConsultas()
    {
        this._has_nroConsultas= false;
    } //-- void deleteNroConsultas() 

    /**
     * Method enumerateListaContasTpServ
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaContasTpServ()
    {
        return _listaContasTpServList.elements();
    } //-- java.util.Enumeration enumerateListaContasTpServ() 

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
     * Method getListaContasTpServ
     * 
     * 
     * 
     * @param index
     * @return ListaContasTpServ
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ getListaContasTpServ(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaContasTpServList.size())) {
            throw new IndexOutOfBoundsException("getListaContasTpServ: Index value '"+index+"' not in range [0.."+(_listaContasTpServList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ) _listaContasTpServList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ getListaContasTpServ(int) 

    /**
     * Method getListaContasTpServ
     * 
     * 
     * 
     * @return ListaContasTpServ
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ[] getListaContasTpServ()
    {
        int size = _listaContasTpServList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ) _listaContasTpServList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ[] getListaContasTpServ() 

    /**
     * Method getListaContasTpServCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaContasTpServCount()
    {
        return _listaContasTpServList.size();
    } //-- int getListaContasTpServCount() 

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
     * Returns the value of field 'nroConsultas'.
     * 
     * @return int
     * @return the value of field 'nroConsultas'.
     */
    public int getNroConsultas()
    {
        return this._nroConsultas;
    } //-- int getNroConsultas() 

    /**
     * Method hasNroConsultas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNroConsultas()
    {
        return this._has_nroConsultas;
    } //-- boolean hasNroConsultas() 

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
     * Method removeAllListaContasTpServ
     * 
     */
    public void removeAllListaContasTpServ()
    {
        _listaContasTpServList.removeAllElements();
    } //-- void removeAllListaContasTpServ() 

    /**
     * Method removeListaContasTpServ
     * 
     * 
     * 
     * @param index
     * @return ListaContasTpServ
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ removeListaContasTpServ(int index)
    {
        java.lang.Object obj = _listaContasTpServList.elementAt(index);
        _listaContasTpServList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ removeListaContasTpServ(int) 

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
     * Method setListaContasTpServ
     * 
     * 
     * 
     * @param index
     * @param vListaContasTpServ
     */
    public void setListaContasTpServ(int index, br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ vListaContasTpServ)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaContasTpServList.size())) {
            throw new IndexOutOfBoundsException("setListaContasTpServ: Index value '"+index+"' not in range [0.." + (_listaContasTpServList.size() - 1) + "]");
        }
        if (!(index < 300)) {
            throw new IndexOutOfBoundsException("setListaContasTpServ has a maximum of 300");
        }
        _listaContasTpServList.setElementAt(vListaContasTpServ, index);
    } //-- void setListaContasTpServ(int, br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ) 

    /**
     * Method setListaContasTpServ
     * 
     * 
     * 
     * @param listaContasTpServArray
     */
    public void setListaContasTpServ(br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ[] listaContasTpServArray)
    {
        //-- copy array
        _listaContasTpServList.removeAllElements();
        for (int i = 0; i < listaContasTpServArray.length; i++) {
            _listaContasTpServList.addElement(listaContasTpServArray[i]);
        }
    } //-- void setListaContasTpServ(br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ) 

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
     * Sets the value of field 'nroConsultas'.
     * 
     * @param nroConsultas the value of field 'nroConsultas'.
     */
    public void setNroConsultas(int nroConsultas)
    {
        this._nroConsultas = nroConsultas;
        this._has_nroConsultas = true;
    } //-- void setNroConsultas(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarListaContasTipoServicoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ConsultarListaContasTipoServicoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ConsultarListaContasTipoServicoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ConsultarListaContasTipoServicoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ConsultarListaContasTipoServicoResponse unmarshal(java.io.Reader) 

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
