/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ExcluirEmpresaRequest.java,v 1.4 2017/11/16 20:32:08 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request;

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
 * Class ExcluirEmpresaRequest.
 * 
 * @version $Revision: 1.4 $ $Date: 2017/11/16 20:32:08 $
 */
public class ExcluirEmpresaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listaExcluirEmpresaList
     */
    private java.util.Vector _listaExcluirEmpresaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExcluirEmpresaRequest() 
     {
        super();
        _listaExcluirEmpresaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ExcluirEmpresaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaExcluirEmpresa
     * 
     * 
     * 
     * @param vListaExcluirEmpresa
     */
    public void addListaExcluirEmpresa(br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa vListaExcluirEmpresa)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaExcluirEmpresaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaExcluirEmpresa has a maximum of 100");
        }
        _listaExcluirEmpresaList.addElement(vListaExcluirEmpresa);
    } //-- void addListaExcluirEmpresa(br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa) 

    /**
     * Method addListaExcluirEmpresa
     * 
     * 
     * 
     * @param index
     * @param vListaExcluirEmpresa
     */
    public void addListaExcluirEmpresa(int index, br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa vListaExcluirEmpresa)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaExcluirEmpresaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaExcluirEmpresa has a maximum of 100");
        }
        _listaExcluirEmpresaList.insertElementAt(vListaExcluirEmpresa, index);
    } //-- void addListaExcluirEmpresa(int, br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa) 

    /**
     * Method enumerateListaExcluirEmpresa
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaExcluirEmpresa()
    {
        return _listaExcluirEmpresaList.elements();
    } //-- java.util.Enumeration enumerateListaExcluirEmpresa() 

    /**
     * Method getListaExcluirEmpresa
     * 
     * 
     * 
     * @param index
     * @return ListaExcluirEmpresa
     */
    public br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa getListaExcluirEmpresa(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaExcluirEmpresaList.size())) {
            throw new IndexOutOfBoundsException("getListaExcluirEmpresa: Index value '"+index+"' not in range [0.."+(_listaExcluirEmpresaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa) _listaExcluirEmpresaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa getListaExcluirEmpresa(int) 

    /**
     * Method getListaExcluirEmpresa
     * 
     * 
     * 
     * @return ListaExcluirEmpresa
     */
    public br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa[] getListaExcluirEmpresa()
    {
        int size = _listaExcluirEmpresaList.size();
        br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa[] mArray = new br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa) _listaExcluirEmpresaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa[] getListaExcluirEmpresa() 

    /**
     * Method getListaExcluirEmpresaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaExcluirEmpresaCount()
    {
        return _listaExcluirEmpresaList.size();
    } //-- int getListaExcluirEmpresaCount() 

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
     * Method removeAllListaExcluirEmpresa
     * 
     */
    public void removeAllListaExcluirEmpresa()
    {
        _listaExcluirEmpresaList.removeAllElements();
    } //-- void removeAllListaExcluirEmpresa() 

    /**
     * Method removeListaExcluirEmpresa
     * 
     * 
     * 
     * @param index
     * @return ListaExcluirEmpresa
     */
    public br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa removeListaExcluirEmpresa(int index)
    {
        java.lang.Object obj = _listaExcluirEmpresaList.elementAt(index);
        _listaExcluirEmpresaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa removeListaExcluirEmpresa(int) 

    /**
     * Method setListaExcluirEmpresa
     * 
     * 
     * 
     * @param index
     * @param vListaExcluirEmpresa
     */
    public void setListaExcluirEmpresa(int index, br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa vListaExcluirEmpresa)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaExcluirEmpresaList.size())) {
            throw new IndexOutOfBoundsException("setListaExcluirEmpresa: Index value '"+index+"' not in range [0.." + (_listaExcluirEmpresaList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setListaExcluirEmpresa has a maximum of 100");
        }
        _listaExcluirEmpresaList.setElementAt(vListaExcluirEmpresa, index);
    } //-- void setListaExcluirEmpresa(int, br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa) 

    /**
     * Method setListaExcluirEmpresa
     * 
     * 
     * 
     * @param listaExcluirEmpresaArray
     */
    public void setListaExcluirEmpresa(br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa[] listaExcluirEmpresaArray)
    {
        //-- copy array
        _listaExcluirEmpresaList.removeAllElements();
        for (int i = 0; i < listaExcluirEmpresaArray.length; i++) {
            _listaExcluirEmpresaList.addElement(listaExcluirEmpresaArray[i]);
        }
    } //-- void setListaExcluirEmpresa(br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ListaExcluirEmpresa) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ExcluirEmpresaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ExcluirEmpresaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ExcluirEmpresaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ExcluirEmpresaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluirempresa.request.ExcluirEmpresaRequest unmarshal(java.io.Reader) 

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
