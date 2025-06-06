/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarAliquotaResponse.java,v 1.3 2017/12/08 17:29:22 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response;

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
 * Class ConsultarAliquotaResponse.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/12/08 17:29:22 $
 */
public class ConsultarAliquotaResponse implements java.io.Serializable {


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
     * Field _listaConsultarAliquotaList
     */
    private java.util.Vector _listaConsultarAliquotaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarAliquotaResponse() 
     {
        super();
        _listaConsultarAliquotaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ConsultarAliquotaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaConsultarAliquota
     * 
     * 
     * 
     * @param vListaConsultarAliquota
     */
    public void addListaConsultarAliquota(br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota vListaConsultarAliquota)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaConsultarAliquotaList.addElement(vListaConsultarAliquota);
    } //-- void addListaConsultarAliquota(br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota) 

    /**
     * Method addListaConsultarAliquota
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarAliquota
     */
    public void addListaConsultarAliquota(int index, br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota vListaConsultarAliquota)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaConsultarAliquotaList.insertElementAt(vListaConsultarAliquota, index);
    } //-- void addListaConsultarAliquota(int, br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method enumerateListaConsultarAliquota
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaConsultarAliquota()
    {
        return _listaConsultarAliquotaList.elements();
    } //-- java.util.Enumeration enumerateListaConsultarAliquota() 

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
     * Method getListaConsultarAliquota
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarAliquota
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota getListaConsultarAliquota(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarAliquotaList.size())) {
            throw new IndexOutOfBoundsException("getListaConsultarAliquota: Index value '"+index+"' not in range [0.."+(_listaConsultarAliquotaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota) _listaConsultarAliquotaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota getListaConsultarAliquota(int) 

    /**
     * Method getListaConsultarAliquota
     * 
     * 
     * 
     * @return ListaConsultarAliquota
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota[] getListaConsultarAliquota()
    {
        int size = _listaConsultarAliquotaList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota) _listaConsultarAliquotaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota[] getListaConsultarAliquota() 

    /**
     * Method getListaConsultarAliquotaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaConsultarAliquotaCount()
    {
        return _listaConsultarAliquotaList.size();
    } //-- int getListaConsultarAliquotaCount() 

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
     * Method removeAllListaConsultarAliquota
     * 
     */
    public void removeAllListaConsultarAliquota()
    {
        _listaConsultarAliquotaList.removeAllElements();
    } //-- void removeAllListaConsultarAliquota() 

    /**
     * Method removeListaConsultarAliquota
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarAliquota
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota removeListaConsultarAliquota(int index)
    {
        java.lang.Object obj = _listaConsultarAliquotaList.elementAt(index);
        _listaConsultarAliquotaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota removeListaConsultarAliquota(int) 

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
     * Method setListaConsultarAliquota
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarAliquota
     */
    public void setListaConsultarAliquota(int index, br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota vListaConsultarAliquota)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarAliquotaList.size())) {
            throw new IndexOutOfBoundsException("setListaConsultarAliquota: Index value '"+index+"' not in range [0.." + (_listaConsultarAliquotaList.size() - 1) + "]");
        }
        _listaConsultarAliquotaList.setElementAt(vListaConsultarAliquota, index);
    } //-- void setListaConsultarAliquota(int, br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota) 

    /**
     * Method setListaConsultarAliquota
     * 
     * 
     * 
     * @param listaConsultarAliquotaArray
     */
    public void setListaConsultarAliquota(br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota[] listaConsultarAliquotaArray)
    {
        //-- copy array
        _listaConsultarAliquotaList.removeAllElements();
        for (int i = 0; i < listaConsultarAliquotaArray.length; i++) {
            _listaConsultarAliquotaList.addElement(listaConsultarAliquotaArray[i]);
        }
    } //-- void setListaConsultarAliquota(br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ListaConsultarAliquota) 

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
     * @return ConsultarAliquotaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ConsultarAliquotaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ConsultarAliquotaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ConsultarAliquotaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.response.ConsultarAliquotaResponse unmarshal(java.io.Reader) 

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
