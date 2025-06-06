/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response;

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
 * Class ConsultarArquivoEmpSemanalResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarArquivoEmpSemanalResponse implements java.io.Serializable {


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
     * Field _listaConsultarArquivoEmpSemanalList
     */
    private java.util.Vector _listaConsultarArquivoEmpSemanalList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarArquivoEmpSemanalResponse() 
     {
        super();
        _listaConsultarArquivoEmpSemanalList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ConsultarArquivoEmpSemanalResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaConsultarArquivoEmpSemanal
     * 
     * 
     * 
     * @param vListaConsultarArquivoEmpSemanal
     */
    public void addListaConsultarArquivoEmpSemanal(br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal vListaConsultarArquivoEmpSemanal)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaConsultarArquivoEmpSemanalList.size() < 50)) {
            throw new IndexOutOfBoundsException("addListaConsultarArquivoEmpSemanal has a maximum of 50");
        }
        _listaConsultarArquivoEmpSemanalList.addElement(vListaConsultarArquivoEmpSemanal);
    } //-- void addListaConsultarArquivoEmpSemanal(br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal) 

    /**
     * Method addListaConsultarArquivoEmpSemanal
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarArquivoEmpSemanal
     */
    public void addListaConsultarArquivoEmpSemanal(int index, br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal vListaConsultarArquivoEmpSemanal)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaConsultarArquivoEmpSemanalList.size() < 50)) {
            throw new IndexOutOfBoundsException("addListaConsultarArquivoEmpSemanal has a maximum of 50");
        }
        _listaConsultarArquivoEmpSemanalList.insertElementAt(vListaConsultarArquivoEmpSemanal, index);
    } //-- void addListaConsultarArquivoEmpSemanal(int, br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal) 

    /**
     * Method deleteNumConsulta
     * 
     */
    public void deleteNumConsulta()
    {
        this._has_numConsulta= false;
    } //-- void deleteNumConsulta() 

    /**
     * Method enumerateListaConsultarArquivoEmpSemanal
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaConsultarArquivoEmpSemanal()
    {
        return _listaConsultarArquivoEmpSemanalList.elements();
    } //-- java.util.Enumeration enumerateListaConsultarArquivoEmpSemanal() 

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
     * Method getListaConsultarArquivoEmpSemanal
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarArquivoEmpSemanal
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal getListaConsultarArquivoEmpSemanal(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarArquivoEmpSemanalList.size())) {
            throw new IndexOutOfBoundsException("getListaConsultarArquivoEmpSemanal: Index value '"+index+"' not in range [0.."+(_listaConsultarArquivoEmpSemanalList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal) _listaConsultarArquivoEmpSemanalList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal getListaConsultarArquivoEmpSemanal(int) 

    /**
     * Method getListaConsultarArquivoEmpSemanal
     * 
     * 
     * 
     * @return ListaConsultarArquivoEmpSemanal
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal[] getListaConsultarArquivoEmpSemanal()
    {
        int size = _listaConsultarArquivoEmpSemanalList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal) _listaConsultarArquivoEmpSemanalList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal[] getListaConsultarArquivoEmpSemanal() 

    /**
     * Method getListaConsultarArquivoEmpSemanalCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaConsultarArquivoEmpSemanalCount()
    {
        return _listaConsultarArquivoEmpSemanalList.size();
    } //-- int getListaConsultarArquivoEmpSemanalCount() 

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
     * Method removeAllListaConsultarArquivoEmpSemanal
     * 
     */
    public void removeAllListaConsultarArquivoEmpSemanal()
    {
        _listaConsultarArquivoEmpSemanalList.removeAllElements();
    } //-- void removeAllListaConsultarArquivoEmpSemanal() 

    /**
     * Method removeListaConsultarArquivoEmpSemanal
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarArquivoEmpSemanal
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal removeListaConsultarArquivoEmpSemanal(int index)
    {
        java.lang.Object obj = _listaConsultarArquivoEmpSemanalList.elementAt(index);
        _listaConsultarArquivoEmpSemanalList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal removeListaConsultarArquivoEmpSemanal(int) 

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
     * Method setListaConsultarArquivoEmpSemanal
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarArquivoEmpSemanal
     */
    public void setListaConsultarArquivoEmpSemanal(int index, br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal vListaConsultarArquivoEmpSemanal)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarArquivoEmpSemanalList.size())) {
            throw new IndexOutOfBoundsException("setListaConsultarArquivoEmpSemanal: Index value '"+index+"' not in range [0.." + (_listaConsultarArquivoEmpSemanalList.size() - 1) + "]");
        }
        if (!(index < 50)) {
            throw new IndexOutOfBoundsException("setListaConsultarArquivoEmpSemanal has a maximum of 50");
        }
        _listaConsultarArquivoEmpSemanalList.setElementAt(vListaConsultarArquivoEmpSemanal, index);
    } //-- void setListaConsultarArquivoEmpSemanal(int, br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal) 

    /**
     * Method setListaConsultarArquivoEmpSemanal
     * 
     * 
     * 
     * @param listaConsultarArquivoEmpSemanalArray
     */
    public void setListaConsultarArquivoEmpSemanal(br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal[] listaConsultarArquivoEmpSemanalArray)
    {
        //-- copy array
        _listaConsultarArquivoEmpSemanalList.removeAllElements();
        for (int i = 0; i < listaConsultarArquivoEmpSemanalArray.length; i++) {
            _listaConsultarArquivoEmpSemanalList.addElement(listaConsultarArquivoEmpSemanalArray[i]);
        }
    } //-- void setListaConsultarArquivoEmpSemanal(br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ListaConsultarArquivoEmpSemanal) 

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
     * @return ConsultarArquivoEmpSemanalResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ConsultarArquivoEmpSemanalResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ConsultarArquivoEmpSemanalResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ConsultarArquivoEmpSemanalResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.response.ConsultarArquivoEmpSemanalResponse unmarshal(java.io.Reader) 

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
