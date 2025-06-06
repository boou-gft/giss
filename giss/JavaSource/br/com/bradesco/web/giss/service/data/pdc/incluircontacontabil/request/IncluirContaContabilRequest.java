/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: IncluirContaContabilRequest.java,v 1.4 2017/12/05 10:28:45 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request;

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
 * Class IncluirContaContabilRequest.
 * 
 * @version $Revision: 1.4 $ $Date: 2017/12/05 10:28:45 $
 */
public class IncluirContaContabilRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _quantidadesOcorrencias
     */
    private int _quantidadesOcorrencias = 0;

    /**
     * keeps track of state for field: _quantidadesOcorrencias
     */
    private boolean _has_quantidadesOcorrencias;

    /**
     * Field _listaIncluirContaContabilList
     */
    private java.util.Vector _listaIncluirContaContabilList;


      //----------------/
     //- Constructors -/
    //----------------/

    public IncluirContaContabilRequest() 
     {
        super();
        _listaIncluirContaContabilList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.IncluirContaContabilRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaIncluirContaContabil
     * 
     * 
     * 
     * @param vListaIncluirContaContabil
     */
    public void addListaIncluirContaContabil(br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil vListaIncluirContaContabil)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaIncluirContaContabilList.size() < 99)) {
            throw new IndexOutOfBoundsException("addListaIncluirContaContabil has a maximum of 99");
        }
        _listaIncluirContaContabilList.addElement(vListaIncluirContaContabil);
    } //-- void addListaIncluirContaContabil(br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil) 

    /**
     * Method addListaIncluirContaContabil
     * 
     * 
     * 
     * @param index
     * @param vListaIncluirContaContabil
     */
    public void addListaIncluirContaContabil(int index, br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil vListaIncluirContaContabil)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaIncluirContaContabilList.size() < 99)) {
            throw new IndexOutOfBoundsException("addListaIncluirContaContabil has a maximum of 99");
        }
        _listaIncluirContaContabilList.insertElementAt(vListaIncluirContaContabil, index);
    } //-- void addListaIncluirContaContabil(int, br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil) 

    /**
     * Method deleteQuantidadesOcorrencias
     * 
     */
    public void deleteQuantidadesOcorrencias()
    {
        this._has_quantidadesOcorrencias= false;
    } //-- void deleteQuantidadesOcorrencias() 

    /**
     * Method enumerateListaIncluirContaContabil
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaIncluirContaContabil()
    {
        return _listaIncluirContaContabilList.elements();
    } //-- java.util.Enumeration enumerateListaIncluirContaContabil() 

    /**
     * Method getListaIncluirContaContabil
     * 
     * 
     * 
     * @param index
     * @return ListaIncluirContaContabil
     */
    public br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil getListaIncluirContaContabil(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaIncluirContaContabilList.size())) {
            throw new IndexOutOfBoundsException("getListaIncluirContaContabil: Index value '"+index+"' not in range [0.."+(_listaIncluirContaContabilList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil) _listaIncluirContaContabilList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil getListaIncluirContaContabil(int) 

    /**
     * Method getListaIncluirContaContabil
     * 
     * 
     * 
     * @return ListaIncluirContaContabil
     */
    public br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil[] getListaIncluirContaContabil()
    {
        int size = _listaIncluirContaContabilList.size();
        br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil[] mArray = new br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil) _listaIncluirContaContabilList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil[] getListaIncluirContaContabil() 

    /**
     * Method getListaIncluirContaContabilCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaIncluirContaContabilCount()
    {
        return _listaIncluirContaContabilList.size();
    } //-- int getListaIncluirContaContabilCount() 

    /**
     * Returns the value of field 'quantidadesOcorrencias'.
     * 
     * @return int
     * @return the value of field 'quantidadesOcorrencias'.
     */
    public int getQuantidadesOcorrencias()
    {
        return this._quantidadesOcorrencias;
    } //-- int getQuantidadesOcorrencias() 

    /**
     * Method hasQuantidadesOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQuantidadesOcorrencias()
    {
        return this._has_quantidadesOcorrencias;
    } //-- boolean hasQuantidadesOcorrencias() 

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
     * Method removeAllListaIncluirContaContabil
     * 
     */
    public void removeAllListaIncluirContaContabil()
    {
        _listaIncluirContaContabilList.removeAllElements();
    } //-- void removeAllListaIncluirContaContabil() 

    /**
     * Method removeListaIncluirContaContabil
     * 
     * 
     * 
     * @param index
     * @return ListaIncluirContaContabil
     */
    public br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil removeListaIncluirContaContabil(int index)
    {
        java.lang.Object obj = _listaIncluirContaContabilList.elementAt(index);
        _listaIncluirContaContabilList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil removeListaIncluirContaContabil(int) 

    /**
     * Method setListaIncluirContaContabil
     * 
     * 
     * 
     * @param index
     * @param vListaIncluirContaContabil
     */
    public void setListaIncluirContaContabil(int index, br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil vListaIncluirContaContabil)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaIncluirContaContabilList.size())) {
            throw new IndexOutOfBoundsException("setListaIncluirContaContabil: Index value '"+index+"' not in range [0.." + (_listaIncluirContaContabilList.size() - 1) + "]");
        }
        if (!(index < 99)) {
            throw new IndexOutOfBoundsException("setListaIncluirContaContabil has a maximum of 99");
        }
        _listaIncluirContaContabilList.setElementAt(vListaIncluirContaContabil, index);
    } //-- void setListaIncluirContaContabil(int, br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil) 

    /**
     * Method setListaIncluirContaContabil
     * 
     * 
     * 
     * @param listaIncluirContaContabilArray
     */
    public void setListaIncluirContaContabil(br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil[] listaIncluirContaContabilArray)
    {
        //-- copy array
        _listaIncluirContaContabilList.removeAllElements();
        for (int i = 0; i < listaIncluirContaContabilArray.length; i++) {
            _listaIncluirContaContabilList.addElement(listaIncluirContaContabilArray[i]);
        }
    } //-- void setListaIncluirContaContabil(br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.ListaIncluirContaContabil) 

    /**
     * Sets the value of field 'quantidadesOcorrencias'.
     * 
     * @param quantidadesOcorrencias the value of field
     * 'quantidadesOcorrencias'.
     */
    public void setQuantidadesOcorrencias(int quantidadesOcorrencias)
    {
        this._quantidadesOcorrencias = quantidadesOcorrencias;
        this._has_quantidadesOcorrencias = true;
    } //-- void setQuantidadesOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return IncluirContaContabilRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.IncluirContaContabilRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.IncluirContaContabilRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.IncluirContaContabilRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.request.IncluirContaContabilRequest unmarshal(java.io.Reader) 

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
