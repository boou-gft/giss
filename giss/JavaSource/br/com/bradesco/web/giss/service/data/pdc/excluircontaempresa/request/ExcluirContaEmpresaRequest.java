/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ExcluirContaEmpresaRequest.java,v 1.3 2017/11/16 20:32:07 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request;

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
 * Class ExcluirContaEmpresaRequest.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/11/16 20:32:07 $
 */
public class ExcluirContaEmpresaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listaExcluirContasEmpList
     */
    private java.util.Vector _listaExcluirContasEmpList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExcluirContaEmpresaRequest() 
     {
        super();
        _listaExcluirContasEmpList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ExcluirContaEmpresaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaExcluirContasEmp
     * 
     * 
     * 
     * @param vListaExcluirContasEmp
     */
    public void addListaExcluirContasEmp(br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp vListaExcluirContasEmp)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaExcluirContasEmpList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaExcluirContasEmp has a maximum of 100");
        }
        _listaExcluirContasEmpList.addElement(vListaExcluirContasEmp);
    } //-- void addListaExcluirContasEmp(br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp) 

    /**
     * Method addListaExcluirContasEmp
     * 
     * 
     * 
     * @param index
     * @param vListaExcluirContasEmp
     */
    public void addListaExcluirContasEmp(int index, br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp vListaExcluirContasEmp)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaExcluirContasEmpList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaExcluirContasEmp has a maximum of 100");
        }
        _listaExcluirContasEmpList.insertElementAt(vListaExcluirContasEmp, index);
    } //-- void addListaExcluirContasEmp(int, br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp) 

    /**
     * Method enumerateListaExcluirContasEmp
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaExcluirContasEmp()
    {
        return _listaExcluirContasEmpList.elements();
    } //-- java.util.Enumeration enumerateListaExcluirContasEmp() 

    /**
     * Method getListaExcluirContasEmp
     * 
     * 
     * 
     * @param index
     * @return ListaExcluirContasEmp
     */
    public br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp getListaExcluirContasEmp(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaExcluirContasEmpList.size())) {
            throw new IndexOutOfBoundsException("getListaExcluirContasEmp: Index value '"+index+"' not in range [0.."+(_listaExcluirContasEmpList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp) _listaExcluirContasEmpList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp getListaExcluirContasEmp(int) 

    /**
     * Method getListaExcluirContasEmp
     * 
     * 
     * 
     * @return ListaExcluirContasEmp
     */
    public br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp[] getListaExcluirContasEmp()
    {
        int size = _listaExcluirContasEmpList.size();
        br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp[] mArray = new br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp) _listaExcluirContasEmpList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp[] getListaExcluirContasEmp() 

    /**
     * Method getListaExcluirContasEmpCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaExcluirContasEmpCount()
    {
        return _listaExcluirContasEmpList.size();
    } //-- int getListaExcluirContasEmpCount() 

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
     * Method removeAllListaExcluirContasEmp
     * 
     */
    public void removeAllListaExcluirContasEmp()
    {
        _listaExcluirContasEmpList.removeAllElements();
    } //-- void removeAllListaExcluirContasEmp() 

    /**
     * Method removeListaExcluirContasEmp
     * 
     * 
     * 
     * @param index
     * @return ListaExcluirContasEmp
     */
    public br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp removeListaExcluirContasEmp(int index)
    {
        java.lang.Object obj = _listaExcluirContasEmpList.elementAt(index);
        _listaExcluirContasEmpList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp removeListaExcluirContasEmp(int) 

    /**
     * Method setListaExcluirContasEmp
     * 
     * 
     * 
     * @param index
     * @param vListaExcluirContasEmp
     */
    public void setListaExcluirContasEmp(int index, br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp vListaExcluirContasEmp)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaExcluirContasEmpList.size())) {
            throw new IndexOutOfBoundsException("setListaExcluirContasEmp: Index value '"+index+"' not in range [0.." + (_listaExcluirContasEmpList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setListaExcluirContasEmp has a maximum of 100");
        }
        _listaExcluirContasEmpList.setElementAt(vListaExcluirContasEmp, index);
    } //-- void setListaExcluirContasEmp(int, br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp) 

    /**
     * Method setListaExcluirContasEmp
     * 
     * 
     * 
     * @param listaExcluirContasEmpArray
     */
    public void setListaExcluirContasEmp(br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp[] listaExcluirContasEmpArray)
    {
        //-- copy array
        _listaExcluirContasEmpList.removeAllElements();
        for (int i = 0; i < listaExcluirContasEmpArray.length; i++) {
            _listaExcluirContasEmpList.addElement(listaExcluirContasEmpArray[i]);
        }
    } //-- void setListaExcluirContasEmp(br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ExcluirContaEmpresaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ExcluirContaEmpresaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ExcluirContaEmpresaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ExcluirContaEmpresaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ExcluirContaEmpresaRequest unmarshal(java.io.Reader) 

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
