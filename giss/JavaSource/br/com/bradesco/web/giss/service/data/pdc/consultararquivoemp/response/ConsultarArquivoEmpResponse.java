/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response;

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
 * Class ConsultarArquivoEmpResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarArquivoEmpResponse implements java.io.Serializable {


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
     * Field _listaConsultarArquivoEmpList
     */
    private java.util.Vector _listaConsultarArquivoEmpList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarArquivoEmpResponse() 
     {
        super();
        _listaConsultarArquivoEmpList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ConsultarArquivoEmpResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaConsultarArquivoEmp
     * 
     * 
     * 
     * @param vListaConsultarArquivoEmp
     */
    public void addListaConsultarArquivoEmp(br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp vListaConsultarArquivoEmp)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaConsultarArquivoEmpList.addElement(vListaConsultarArquivoEmp);
    } //-- void addListaConsultarArquivoEmp(br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp) 

    /**
     * Method addListaConsultarArquivoEmp
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarArquivoEmp
     */
    public void addListaConsultarArquivoEmp(int index, br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp vListaConsultarArquivoEmp)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaConsultarArquivoEmpList.insertElementAt(vListaConsultarArquivoEmp, index);
    } //-- void addListaConsultarArquivoEmp(int, br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp) 

    /**
     * Method deleteNumConsulta
     * 
     */
    public void deleteNumConsulta()
    {
        this._has_numConsulta= false;
    } //-- void deleteNumConsulta() 

    /**
     * Method enumerateListaConsultarArquivoEmp
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaConsultarArquivoEmp()
    {
        return _listaConsultarArquivoEmpList.elements();
    } //-- java.util.Enumeration enumerateListaConsultarArquivoEmp() 

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
     * Method getListaConsultarArquivoEmp
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarArquivoEmp
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp getListaConsultarArquivoEmp(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarArquivoEmpList.size())) {
            throw new IndexOutOfBoundsException("getListaConsultarArquivoEmp: Index value '"+index+"' not in range [0.."+(_listaConsultarArquivoEmpList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp) _listaConsultarArquivoEmpList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp getListaConsultarArquivoEmp(int) 

    /**
     * Method getListaConsultarArquivoEmp
     * 
     * 
     * 
     * @return ListaConsultarArquivoEmp
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp[] getListaConsultarArquivoEmp()
    {
        int size = _listaConsultarArquivoEmpList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp) _listaConsultarArquivoEmpList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp[] getListaConsultarArquivoEmp() 

    /**
     * Method getListaConsultarArquivoEmpCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaConsultarArquivoEmpCount()
    {
        return _listaConsultarArquivoEmpList.size();
    } //-- int getListaConsultarArquivoEmpCount() 

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
     * Method removeAllListaConsultarArquivoEmp
     * 
     */
    public void removeAllListaConsultarArquivoEmp()
    {
        _listaConsultarArquivoEmpList.removeAllElements();
    } //-- void removeAllListaConsultarArquivoEmp() 

    /**
     * Method removeListaConsultarArquivoEmp
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarArquivoEmp
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp removeListaConsultarArquivoEmp(int index)
    {
        java.lang.Object obj = _listaConsultarArquivoEmpList.elementAt(index);
        _listaConsultarArquivoEmpList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp removeListaConsultarArquivoEmp(int) 

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
     * Method setListaConsultarArquivoEmp
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarArquivoEmp
     */
    public void setListaConsultarArquivoEmp(int index, br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp vListaConsultarArquivoEmp)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarArquivoEmpList.size())) {
            throw new IndexOutOfBoundsException("setListaConsultarArquivoEmp: Index value '"+index+"' not in range [0.." + (_listaConsultarArquivoEmpList.size() - 1) + "]");
        }
        _listaConsultarArquivoEmpList.setElementAt(vListaConsultarArquivoEmp, index);
    } //-- void setListaConsultarArquivoEmp(int, br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp) 

    /**
     * Method setListaConsultarArquivoEmp
     * 
     * 
     * 
     * @param listaConsultarArquivoEmpArray
     */
    public void setListaConsultarArquivoEmp(br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp[] listaConsultarArquivoEmpArray)
    {
        //-- copy array
        _listaConsultarArquivoEmpList.removeAllElements();
        for (int i = 0; i < listaConsultarArquivoEmpArray.length; i++) {
            _listaConsultarArquivoEmpList.addElement(listaConsultarArquivoEmpArray[i]);
        }
    } //-- void setListaConsultarArquivoEmp(br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ListaConsultarArquivoEmp) 

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
     * @return ConsultarArquivoEmpResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ConsultarArquivoEmpResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ConsultarArquivoEmpResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ConsultarArquivoEmpResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.response.ConsultarArquivoEmpResponse unmarshal(java.io.Reader) 

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
