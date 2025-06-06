/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarLcAliquotaResponse.java,v 1.3 2017/12/08 17:29:25 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response;

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
 * Class ListarLcAliquotaResponse.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/12/08 17:29:25 $
 */
public class ListarLcAliquotaResponse implements java.io.Serializable {


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
     * Field _listaLcAliquotaList
     */
    private java.util.Vector _listaLcAliquotaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarLcAliquotaResponse() 
     {
        super();
        _listaLcAliquotaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListarLcAliquotaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaLcAliquota
     * 
     * 
     * 
     * @param vListaLcAliquota
     */
    public void addListaLcAliquota(br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota vListaLcAliquota)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaLcAliquotaList.addElement(vListaLcAliquota);
    } //-- void addListaLcAliquota(br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota) 

    /**
     * Method addListaLcAliquota
     * 
     * 
     * 
     * @param index
     * @param vListaLcAliquota
     */
    public void addListaLcAliquota(int index, br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota vListaLcAliquota)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaLcAliquotaList.insertElementAt(vListaLcAliquota, index);
    } //-- void addListaLcAliquota(int, br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota) 

    /**
     * Method deleteNumConsulta
     * 
     */
    public void deleteNumConsulta()
    {
        this._has_numConsulta= false;
    } //-- void deleteNumConsulta() 

    /**
     * Method enumerateListaLcAliquota
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaLcAliquota()
    {
        return _listaLcAliquotaList.elements();
    } //-- java.util.Enumeration enumerateListaLcAliquota() 

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
     * Method getListaLcAliquota
     * 
     * 
     * 
     * @param index
     * @return ListaLcAliquota
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota getListaLcAliquota(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaLcAliquotaList.size())) {
            throw new IndexOutOfBoundsException("getListaLcAliquota: Index value '"+index+"' not in range [0.."+(_listaLcAliquotaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota) _listaLcAliquotaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota getListaLcAliquota(int) 

    /**
     * Method getListaLcAliquota
     * 
     * 
     * 
     * @return ListaLcAliquota
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota[] getListaLcAliquota()
    {
        int size = _listaLcAliquotaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota) _listaLcAliquotaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota[] getListaLcAliquota() 

    /**
     * Method getListaLcAliquotaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaLcAliquotaCount()
    {
        return _listaLcAliquotaList.size();
    } //-- int getListaLcAliquotaCount() 

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
     * Method removeAllListaLcAliquota
     * 
     */
    public void removeAllListaLcAliquota()
    {
        _listaLcAliquotaList.removeAllElements();
    } //-- void removeAllListaLcAliquota() 

    /**
     * Method removeListaLcAliquota
     * 
     * 
     * 
     * @param index
     * @return ListaLcAliquota
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota removeListaLcAliquota(int index)
    {
        java.lang.Object obj = _listaLcAliquotaList.elementAt(index);
        _listaLcAliquotaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota removeListaLcAliquota(int) 

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
     * Method setListaLcAliquota
     * 
     * 
     * 
     * @param index
     * @param vListaLcAliquota
     */
    public void setListaLcAliquota(int index, br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota vListaLcAliquota)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaLcAliquotaList.size())) {
            throw new IndexOutOfBoundsException("setListaLcAliquota: Index value '"+index+"' not in range [0.." + (_listaLcAliquotaList.size() - 1) + "]");
        }
        _listaLcAliquotaList.setElementAt(vListaLcAliquota, index);
    } //-- void setListaLcAliquota(int, br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota) 

    /**
     * Method setListaLcAliquota
     * 
     * 
     * 
     * @param listaLcAliquotaArray
     */
    public void setListaLcAliquota(br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota[] listaLcAliquotaArray)
    {
        //-- copy array
        _listaLcAliquotaList.removeAllElements();
        for (int i = 0; i < listaLcAliquotaArray.length; i++) {
            _listaLcAliquotaList.addElement(listaLcAliquotaArray[i]);
        }
    } //-- void setListaLcAliquota(br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListaLcAliquota) 

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
     * @return ListarLcAliquotaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListarLcAliquotaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListarLcAliquotaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListarLcAliquotaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.response.ListarLcAliquotaResponse unmarshal(java.io.Reader) 

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
