/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ProcessarContabilidadeRequest.java,v 1.2 2018/01/19 16:31:10 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request;

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
 * Class ProcessarContabilidadeRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2018/01/19 16:31:10 $
 */
public class ProcessarContabilidadeRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _indContabilizar
     */
    private java.lang.String _indContabilizar;

    /**
     * Field _numConsultas
     */
    private int _numConsultas = 0;

    /**
     * keeps track of state for field: _numConsultas
     */
    private boolean _has_numConsultas;

    /**
     * Field _listaProcessarContabilidadeList
     */
    private java.util.Vector _listaProcessarContabilidadeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProcessarContabilidadeRequest() 
     {
        super();
        _listaProcessarContabilidadeList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ProcessarContabilidadeRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaProcessarContabilidade
     * 
     * 
     * 
     * @param vListaProcessarContabilidade
     */
    public void addListaProcessarContabilidade(br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade vListaProcessarContabilidade)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaProcessarContabilidadeList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaProcessarContabilidade has a maximum of 100");
        }
        _listaProcessarContabilidadeList.addElement(vListaProcessarContabilidade);
    } //-- void addListaProcessarContabilidade(br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade) 

    /**
     * Method addListaProcessarContabilidade
     * 
     * 
     * 
     * @param index
     * @param vListaProcessarContabilidade
     */
    public void addListaProcessarContabilidade(int index, br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade vListaProcessarContabilidade)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaProcessarContabilidadeList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaProcessarContabilidade has a maximum of 100");
        }
        _listaProcessarContabilidadeList.insertElementAt(vListaProcessarContabilidade, index);
    } //-- void addListaProcessarContabilidade(int, br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method enumerateListaProcessarContabilidade
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaProcessarContabilidade()
    {
        return _listaProcessarContabilidadeList.elements();
    } //-- java.util.Enumeration enumerateListaProcessarContabilidade() 

    /**
     * Returns the value of field 'indContabilizar'.
     * 
     * @return String
     * @return the value of field 'indContabilizar'.
     */
    public java.lang.String getIndContabilizar()
    {
        return this._indContabilizar;
    } //-- java.lang.String getIndContabilizar() 

    /**
     * Method getListaProcessarContabilidade
     * 
     * 
     * 
     * @param index
     * @return ListaProcessarContabilidade
     */
    public br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade getListaProcessarContabilidade(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaProcessarContabilidadeList.size())) {
            throw new IndexOutOfBoundsException("getListaProcessarContabilidade: Index value '"+index+"' not in range [0.."+(_listaProcessarContabilidadeList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade) _listaProcessarContabilidadeList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade getListaProcessarContabilidade(int) 

    /**
     * Method getListaProcessarContabilidade
     * 
     * 
     * 
     * @return ListaProcessarContabilidade
     */
    public br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade[] getListaProcessarContabilidade()
    {
        int size = _listaProcessarContabilidadeList.size();
        br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade[] mArray = new br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade) _listaProcessarContabilidadeList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade[] getListaProcessarContabilidade() 

    /**
     * Method getListaProcessarContabilidadeCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaProcessarContabilidadeCount()
    {
        return _listaProcessarContabilidadeList.size();
    } //-- int getListaProcessarContabilidadeCount() 

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
     * Method removeAllListaProcessarContabilidade
     * 
     */
    public void removeAllListaProcessarContabilidade()
    {
        _listaProcessarContabilidadeList.removeAllElements();
    } //-- void removeAllListaProcessarContabilidade() 

    /**
     * Method removeListaProcessarContabilidade
     * 
     * 
     * 
     * @param index
     * @return ListaProcessarContabilidade
     */
    public br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade removeListaProcessarContabilidade(int index)
    {
        java.lang.Object obj = _listaProcessarContabilidadeList.elementAt(index);
        _listaProcessarContabilidadeList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade removeListaProcessarContabilidade(int) 

    /**
     * Sets the value of field 'indContabilizar'.
     * 
     * @param indContabilizar the value of field 'indContabilizar'.
     */
    public void setIndContabilizar(java.lang.String indContabilizar)
    {
        this._indContabilizar = indContabilizar;
    } //-- void setIndContabilizar(java.lang.String) 

    /**
     * Method setListaProcessarContabilidade
     * 
     * 
     * 
     * @param index
     * @param vListaProcessarContabilidade
     */
    public void setListaProcessarContabilidade(int index, br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade vListaProcessarContabilidade)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaProcessarContabilidadeList.size())) {
            throw new IndexOutOfBoundsException("setListaProcessarContabilidade: Index value '"+index+"' not in range [0.." + (_listaProcessarContabilidadeList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setListaProcessarContabilidade has a maximum of 100");
        }
        _listaProcessarContabilidadeList.setElementAt(vListaProcessarContabilidade, index);
    } //-- void setListaProcessarContabilidade(int, br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade) 

    /**
     * Method setListaProcessarContabilidade
     * 
     * 
     * 
     * @param listaProcessarContabilidadeArray
     */
    public void setListaProcessarContabilidade(br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade[] listaProcessarContabilidadeArray)
    {
        //-- copy array
        _listaProcessarContabilidadeList.removeAllElements();
        for (int i = 0; i < listaProcessarContabilidadeArray.length; i++) {
            _listaProcessarContabilidadeList.addElement(listaProcessarContabilidadeArray[i]);
        }
    } //-- void setListaProcessarContabilidade(br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade) 

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
     * @return ProcessarContabilidadeRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ProcessarContabilidadeRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ProcessarContabilidadeRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ProcessarContabilidadeRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ProcessarContabilidadeRequest unmarshal(java.io.Reader) 

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
