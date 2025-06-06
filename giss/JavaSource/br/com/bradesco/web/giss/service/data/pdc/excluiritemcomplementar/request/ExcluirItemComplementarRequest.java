/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ExcluirItemComplementarRequest.java,v 1.2 2017/11/12 23:36:10 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request;

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
 * Class ExcluirItemComplementarRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/11/12 23:36:10 $
 */
public class ExcluirItemComplementarRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listaItemComplementarList
     */
    private java.util.Vector _listaItemComplementarList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExcluirItemComplementarRequest() 
     {
        super();
        _listaItemComplementarList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ExcluirItemComplementarRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaItemComplementar
     * 
     * 
     * 
     * @param vListaItemComplementar
     */
    public void addListaItemComplementar(br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar vListaItemComplementar)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaItemComplementarList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaItemComplementar has a maximum of 100");
        }
        _listaItemComplementarList.addElement(vListaItemComplementar);
    } //-- void addListaItemComplementar(br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar) 

    /**
     * Method addListaItemComplementar
     * 
     * 
     * 
     * @param index
     * @param vListaItemComplementar
     */
    public void addListaItemComplementar(int index, br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar vListaItemComplementar)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaItemComplementarList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaItemComplementar has a maximum of 100");
        }
        _listaItemComplementarList.insertElementAt(vListaItemComplementar, index);
    } //-- void addListaItemComplementar(int, br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar) 

    /**
     * Method enumerateListaItemComplementar
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaItemComplementar()
    {
        return _listaItemComplementarList.elements();
    } //-- java.util.Enumeration enumerateListaItemComplementar() 

    /**
     * Method getListaItemComplementar
     * 
     * 
     * 
     * @param index
     * @return ListaItemComplementar
     */
    public br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar getListaItemComplementar(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaItemComplementarList.size())) {
            throw new IndexOutOfBoundsException("getListaItemComplementar: Index value '"+index+"' not in range [0.."+(_listaItemComplementarList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar) _listaItemComplementarList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar getListaItemComplementar(int) 

    /**
     * Method getListaItemComplementar
     * 
     * 
     * 
     * @return ListaItemComplementar
     */
    public br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar[] getListaItemComplementar()
    {
        int size = _listaItemComplementarList.size();
        br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar[] mArray = new br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar) _listaItemComplementarList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar[] getListaItemComplementar() 

    /**
     * Method getListaItemComplementarCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaItemComplementarCount()
    {
        return _listaItemComplementarList.size();
    } //-- int getListaItemComplementarCount() 

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
     * Method removeAllListaItemComplementar
     * 
     */
    public void removeAllListaItemComplementar()
    {
        _listaItemComplementarList.removeAllElements();
    } //-- void removeAllListaItemComplementar() 

    /**
     * Method removeListaItemComplementar
     * 
     * 
     * 
     * @param index
     * @return ListaItemComplementar
     */
    public br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar removeListaItemComplementar(int index)
    {
        java.lang.Object obj = _listaItemComplementarList.elementAt(index);
        _listaItemComplementarList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar removeListaItemComplementar(int) 

    /**
     * Method setListaItemComplementar
     * 
     * 
     * 
     * @param index
     * @param vListaItemComplementar
     */
    public void setListaItemComplementar(int index, br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar vListaItemComplementar)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaItemComplementarList.size())) {
            throw new IndexOutOfBoundsException("setListaItemComplementar: Index value '"+index+"' not in range [0.." + (_listaItemComplementarList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setListaItemComplementar has a maximum of 100");
        }
        _listaItemComplementarList.setElementAt(vListaItemComplementar, index);
    } //-- void setListaItemComplementar(int, br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar) 

    /**
     * Method setListaItemComplementar
     * 
     * 
     * 
     * @param listaItemComplementarArray
     */
    public void setListaItemComplementar(br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar[] listaItemComplementarArray)
    {
        //-- copy array
        _listaItemComplementarList.removeAllElements();
        for (int i = 0; i < listaItemComplementarArray.length; i++) {
            _listaItemComplementarList.addElement(listaItemComplementarArray[i]);
        }
    } //-- void setListaItemComplementar(br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ListaItemComplementar) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ExcluirItemComplementarRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ExcluirItemComplementarRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ExcluirItemComplementarRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ExcluirItemComplementarRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.request.ExcluirItemComplementarRequest unmarshal(java.io.Reader) 

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
