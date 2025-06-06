/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request;

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
 * Class AgendarPgtoLoteRequest.
 * 
 * @version $Revision$ $Date$
 */
public class AgendarPgtoLoteRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _listaAgendamentoPgtoLoteList
     */
    private java.util.Vector _listaAgendamentoPgtoLoteList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AgendarPgtoLoteRequest() 
     {
        super();
        _listaAgendamentoPgtoLoteList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.AgendarPgtoLoteRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaAgendamentoPgtoLote
     * 
     * 
     * 
     * @param vListaAgendamentoPgtoLote
     */
    public void addListaAgendamentoPgtoLote(br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote vListaAgendamentoPgtoLote)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaAgendamentoPgtoLoteList.size() < 70)) {
            throw new IndexOutOfBoundsException("addListaAgendamentoPgtoLote has a maximum of 70");
        }
        _listaAgendamentoPgtoLoteList.addElement(vListaAgendamentoPgtoLote);
    } //-- void addListaAgendamentoPgtoLote(br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote) 

    /**
     * Method addListaAgendamentoPgtoLote
     * 
     * 
     * 
     * @param index
     * @param vListaAgendamentoPgtoLote
     */
    public void addListaAgendamentoPgtoLote(int index, br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote vListaAgendamentoPgtoLote)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaAgendamentoPgtoLoteList.size() < 70)) {
            throw new IndexOutOfBoundsException("addListaAgendamentoPgtoLote has a maximum of 70");
        }
        _listaAgendamentoPgtoLoteList.insertElementAt(vListaAgendamentoPgtoLote, index);
    } //-- void addListaAgendamentoPgtoLote(int, br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote) 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaAgendamentoPgtoLote
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaAgendamentoPgtoLote()
    {
        return _listaAgendamentoPgtoLoteList.elements();
    } //-- java.util.Enumeration enumerateListaAgendamentoPgtoLote() 

    /**
     * Method getListaAgendamentoPgtoLote
     * 
     * 
     * 
     * @param index
     * @return ListaAgendamentoPgtoLote
     */
    public br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote getListaAgendamentoPgtoLote(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaAgendamentoPgtoLoteList.size())) {
            throw new IndexOutOfBoundsException("getListaAgendamentoPgtoLote: Index value '"+index+"' not in range [0.."+(_listaAgendamentoPgtoLoteList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote) _listaAgendamentoPgtoLoteList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote getListaAgendamentoPgtoLote(int) 

    /**
     * Method getListaAgendamentoPgtoLote
     * 
     * 
     * 
     * @return ListaAgendamentoPgtoLote
     */
    public br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote[] getListaAgendamentoPgtoLote()
    {
        int size = _listaAgendamentoPgtoLoteList.size();
        br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote[] mArray = new br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote) _listaAgendamentoPgtoLoteList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote[] getListaAgendamentoPgtoLote() 

    /**
     * Method getListaAgendamentoPgtoLoteCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaAgendamentoPgtoLoteCount()
    {
        return _listaAgendamentoPgtoLoteList.size();
    } //-- int getListaAgendamentoPgtoLoteCount() 

    /**
     * Returns the value of field 'qtdeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdeOcorrencias'.
     */
    public int getQtdeOcorrencias()
    {
        return this._qtdeOcorrencias;
    } //-- int getQtdeOcorrencias() 

    /**
     * Method hasQtdeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcorrencias()
    {
        return this._has_qtdeOcorrencias;
    } //-- boolean hasQtdeOcorrencias() 

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
     * Method removeAllListaAgendamentoPgtoLote
     * 
     */
    public void removeAllListaAgendamentoPgtoLote()
    {
        _listaAgendamentoPgtoLoteList.removeAllElements();
    } //-- void removeAllListaAgendamentoPgtoLote() 

    /**
     * Method removeListaAgendamentoPgtoLote
     * 
     * 
     * 
     * @param index
     * @return ListaAgendamentoPgtoLote
     */
    public br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote removeListaAgendamentoPgtoLote(int index)
    {
        java.lang.Object obj = _listaAgendamentoPgtoLoteList.elementAt(index);
        _listaAgendamentoPgtoLoteList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote removeListaAgendamentoPgtoLote(int) 

    /**
     * Method setListaAgendamentoPgtoLote
     * 
     * 
     * 
     * @param index
     * @param vListaAgendamentoPgtoLote
     */
    public void setListaAgendamentoPgtoLote(int index, br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote vListaAgendamentoPgtoLote)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaAgendamentoPgtoLoteList.size())) {
            throw new IndexOutOfBoundsException("setListaAgendamentoPgtoLote: Index value '"+index+"' not in range [0.." + (_listaAgendamentoPgtoLoteList.size() - 1) + "]");
        }
        if (!(index < 70)) {
            throw new IndexOutOfBoundsException("setListaAgendamentoPgtoLote has a maximum of 70");
        }
        _listaAgendamentoPgtoLoteList.setElementAt(vListaAgendamentoPgtoLote, index);
    } //-- void setListaAgendamentoPgtoLote(int, br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote) 

    /**
     * Method setListaAgendamentoPgtoLote
     * 
     * 
     * 
     * @param listaAgendamentoPgtoLoteArray
     */
    public void setListaAgendamentoPgtoLote(br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote[] listaAgendamentoPgtoLoteArray)
    {
        //-- copy array
        _listaAgendamentoPgtoLoteList.removeAllElements();
        for (int i = 0; i < listaAgendamentoPgtoLoteArray.length; i++) {
            _listaAgendamentoPgtoLoteList.addElement(listaAgendamentoPgtoLoteArray[i]);
        }
    } //-- void setListaAgendamentoPgtoLote(br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.ListaAgendamentoPgtoLote) 

    /**
     * Sets the value of field 'qtdeOcorrencias'.
     * 
     * @param qtdeOcorrencias the value of field 'qtdeOcorrencias'.
     */
    public void setQtdeOcorrencias(int qtdeOcorrencias)
    {
        this._qtdeOcorrencias = qtdeOcorrencias;
        this._has_qtdeOcorrencias = true;
    } //-- void setQtdeOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AgendarPgtoLoteRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.AgendarPgtoLoteRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.AgendarPgtoLoteRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.AgendarPgtoLoteRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.request.AgendarPgtoLoteRequest unmarshal(java.io.Reader) 

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
