/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarProcessarContabilidadeResponse.java,v 1.1 2018/01/12 17:35:08 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response;

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
 * Class ConsultarProcessarContabilidadeResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/01/12 17:35:08 $
 */
public class ConsultarProcessarContabilidadeResponse implements java.io.Serializable {


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
     * Field _listaConsultarProcessarContabilidadeList
     */
    private java.util.Vector _listaConsultarProcessarContabilidadeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarProcessarContabilidadeResponse() 
     {
        super();
        _listaConsultarProcessarContabilidadeList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ConsultarProcessarContabilidadeResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaConsultarProcessarContabilidade
     * 
     * 
     * 
     * @param vListaConsultarProcessarContabilidade
     */
    public void addListaConsultarProcessarContabilidade(br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade vListaConsultarProcessarContabilidade)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaConsultarProcessarContabilidadeList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaConsultarProcessarContabilidade has a maximum of 100");
        }
        _listaConsultarProcessarContabilidadeList.addElement(vListaConsultarProcessarContabilidade);
    } //-- void addListaConsultarProcessarContabilidade(br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade) 

    /**
     * Method addListaConsultarProcessarContabilidade
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarProcessarContabilidade
     */
    public void addListaConsultarProcessarContabilidade(int index, br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade vListaConsultarProcessarContabilidade)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaConsultarProcessarContabilidadeList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaConsultarProcessarContabilidade has a maximum of 100");
        }
        _listaConsultarProcessarContabilidadeList.insertElementAt(vListaConsultarProcessarContabilidade, index);
    } //-- void addListaConsultarProcessarContabilidade(int, br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method enumerateListaConsultarProcessarContabilidade
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaConsultarProcessarContabilidade()
    {
        return _listaConsultarProcessarContabilidadeList.elements();
    } //-- java.util.Enumeration enumerateListaConsultarProcessarContabilidade() 

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
     * Method getListaConsultarProcessarContabilidade
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarProcessarContabilidade
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade getListaConsultarProcessarContabilidade(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarProcessarContabilidadeList.size())) {
            throw new IndexOutOfBoundsException("getListaConsultarProcessarContabilidade: Index value '"+index+"' not in range [0.."+(_listaConsultarProcessarContabilidadeList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade) _listaConsultarProcessarContabilidadeList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade getListaConsultarProcessarContabilidade(int) 

    /**
     * Method getListaConsultarProcessarContabilidade
     * 
     * 
     * 
     * @return ListaConsultarProcessarContabilidade
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade[] getListaConsultarProcessarContabilidade()
    {
        int size = _listaConsultarProcessarContabilidadeList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade) _listaConsultarProcessarContabilidadeList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade[] getListaConsultarProcessarContabilidade() 

    /**
     * Method getListaConsultarProcessarContabilidadeCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaConsultarProcessarContabilidadeCount()
    {
        return _listaConsultarProcessarContabilidadeList.size();
    } //-- int getListaConsultarProcessarContabilidadeCount() 

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
     * Method removeAllListaConsultarProcessarContabilidade
     * 
     */
    public void removeAllListaConsultarProcessarContabilidade()
    {
        _listaConsultarProcessarContabilidadeList.removeAllElements();
    } //-- void removeAllListaConsultarProcessarContabilidade() 

    /**
     * Method removeListaConsultarProcessarContabilidade
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarProcessarContabilidade
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade removeListaConsultarProcessarContabilidade(int index)
    {
        java.lang.Object obj = _listaConsultarProcessarContabilidadeList.elementAt(index);
        _listaConsultarProcessarContabilidadeList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade removeListaConsultarProcessarContabilidade(int) 

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
     * Method setListaConsultarProcessarContabilidade
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarProcessarContabilidade
     */
    public void setListaConsultarProcessarContabilidade(int index, br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade vListaConsultarProcessarContabilidade)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarProcessarContabilidadeList.size())) {
            throw new IndexOutOfBoundsException("setListaConsultarProcessarContabilidade: Index value '"+index+"' not in range [0.." + (_listaConsultarProcessarContabilidadeList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setListaConsultarProcessarContabilidade has a maximum of 100");
        }
        _listaConsultarProcessarContabilidadeList.setElementAt(vListaConsultarProcessarContabilidade, index);
    } //-- void setListaConsultarProcessarContabilidade(int, br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade) 

    /**
     * Method setListaConsultarProcessarContabilidade
     * 
     * 
     * 
     * @param listaConsultarProcessarContabilidadeArray
     */
    public void setListaConsultarProcessarContabilidade(br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade[] listaConsultarProcessarContabilidadeArray)
    {
        //-- copy array
        _listaConsultarProcessarContabilidadeList.removeAllElements();
        for (int i = 0; i < listaConsultarProcessarContabilidadeArray.length; i++) {
            _listaConsultarProcessarContabilidadeList.addElement(listaConsultarProcessarContabilidadeArray[i]);
        }
    } //-- void setListaConsultarProcessarContabilidade(br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade) 

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
     * @return ConsultarProcessarContabilidadeResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ConsultarProcessarContabilidadeResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ConsultarProcessarContabilidadeResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ConsultarProcessarContabilidadeResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ConsultarProcessarContabilidadeResponse unmarshal(java.io.Reader) 

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
