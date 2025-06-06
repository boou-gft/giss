/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response;

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
 * Class DetalharHistoricoItemLeiComplResponse.
 * 
 * @version $Revision$ $Date$
 */
public class DetalharHistoricoItemLeiComplResponse implements java.io.Serializable {


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
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _listaDetItemLeiComplList
     */
    private java.util.Vector _listaDetItemLeiComplList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DetalharHistoricoItemLeiComplResponse() 
     {
        super();
        _listaDetItemLeiComplList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.DetalharHistoricoItemLeiComplResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaDetItemLeiCompl
     * 
     * 
     * 
     * @param vListaDetItemLeiCompl
     */
    public void addListaDetItemLeiCompl(br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl vListaDetItemLeiCompl)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaDetItemLeiComplList.size() < 2)) {
            throw new IndexOutOfBoundsException("addListaDetItemLeiCompl has a maximum of 2");
        }
        _listaDetItemLeiComplList.addElement(vListaDetItemLeiCompl);
    } //-- void addListaDetItemLeiCompl(br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl) 

    /**
     * Method addListaDetItemLeiCompl
     * 
     * 
     * 
     * @param index
     * @param vListaDetItemLeiCompl
     */
    public void addListaDetItemLeiCompl(int index, br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl vListaDetItemLeiCompl)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaDetItemLeiComplList.size() < 2)) {
            throw new IndexOutOfBoundsException("addListaDetItemLeiCompl has a maximum of 2");
        }
        _listaDetItemLeiComplList.insertElementAt(vListaDetItemLeiCompl, index);
    } //-- void addListaDetItemLeiCompl(int, br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl) 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaDetItemLeiCompl
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaDetItemLeiCompl()
    {
        return _listaDetItemLeiComplList.elements();
    } //-- java.util.Enumeration enumerateListaDetItemLeiCompl() 

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
     * Method getListaDetItemLeiCompl
     * 
     * 
     * 
     * @param index
     * @return ListaDetItemLeiCompl
     */
    public br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl getListaDetItemLeiCompl(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaDetItemLeiComplList.size())) {
            throw new IndexOutOfBoundsException("getListaDetItemLeiCompl: Index value '"+index+"' not in range [0.."+(_listaDetItemLeiComplList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl) _listaDetItemLeiComplList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl getListaDetItemLeiCompl(int) 

    /**
     * Method getListaDetItemLeiCompl
     * 
     * 
     * 
     * @return ListaDetItemLeiCompl
     */
    public br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl[] getListaDetItemLeiCompl()
    {
        int size = _listaDetItemLeiComplList.size();
        br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl[] mArray = new br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl) _listaDetItemLeiComplList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl[] getListaDetItemLeiCompl() 

    /**
     * Method getListaDetItemLeiComplCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaDetItemLeiComplCount()
    {
        return _listaDetItemLeiComplList.size();
    } //-- int getListaDetItemLeiComplCount() 

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
     * Method removeAllListaDetItemLeiCompl
     * 
     */
    public void removeAllListaDetItemLeiCompl()
    {
        _listaDetItemLeiComplList.removeAllElements();
    } //-- void removeAllListaDetItemLeiCompl() 

    /**
     * Method removeListaDetItemLeiCompl
     * 
     * 
     * 
     * @param index
     * @return ListaDetItemLeiCompl
     */
    public br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl removeListaDetItemLeiCompl(int index)
    {
        java.lang.Object obj = _listaDetItemLeiComplList.elementAt(index);
        _listaDetItemLeiComplList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl removeListaDetItemLeiCompl(int) 

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
     * Method setListaDetItemLeiCompl
     * 
     * 
     * 
     * @param index
     * @param vListaDetItemLeiCompl
     */
    public void setListaDetItemLeiCompl(int index, br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl vListaDetItemLeiCompl)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaDetItemLeiComplList.size())) {
            throw new IndexOutOfBoundsException("setListaDetItemLeiCompl: Index value '"+index+"' not in range [0.." + (_listaDetItemLeiComplList.size() - 1) + "]");
        }
        if (!(index < 2)) {
            throw new IndexOutOfBoundsException("setListaDetItemLeiCompl has a maximum of 2");
        }
        _listaDetItemLeiComplList.setElementAt(vListaDetItemLeiCompl, index);
    } //-- void setListaDetItemLeiCompl(int, br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl) 

    /**
     * Method setListaDetItemLeiCompl
     * 
     * 
     * 
     * @param listaDetItemLeiComplArray
     */
    public void setListaDetItemLeiCompl(br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl[] listaDetItemLeiComplArray)
    {
        //-- copy array
        _listaDetItemLeiComplList.removeAllElements();
        for (int i = 0; i < listaDetItemLeiComplArray.length; i++) {
            _listaDetItemLeiComplList.addElement(listaDetItemLeiComplArray[i]);
        }
    } //-- void setListaDetItemLeiCompl(br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl) 

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
     * @return DetalharHistoricoItemLeiComplResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.DetalharHistoricoItemLeiComplResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.DetalharHistoricoItemLeiComplResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.DetalharHistoricoItemLeiComplResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.DetalharHistoricoItemLeiComplResponse unmarshal(java.io.Reader) 

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
