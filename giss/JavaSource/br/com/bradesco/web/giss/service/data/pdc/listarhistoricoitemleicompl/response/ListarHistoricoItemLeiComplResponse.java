/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response;

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
 * Class ListarHistoricoItemLeiComplResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarHistoricoItemLeiComplResponse implements java.io.Serializable {


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
     * Field _listaHistoricoItemLeiList
     */
    private java.util.Vector _listaHistoricoItemLeiList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarHistoricoItemLeiComplResponse() 
     {
        super();
        _listaHistoricoItemLeiList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListarHistoricoItemLeiComplResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaHistoricoItemLei
     * 
     * 
     * 
     * @param vListaHistoricoItemLei
     */
    public void addListaHistoricoItemLei(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei vListaHistoricoItemLei)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaHistoricoItemLeiList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaHistoricoItemLei has a maximum of 100");
        }
        _listaHistoricoItemLeiList.addElement(vListaHistoricoItemLei);
    } //-- void addListaHistoricoItemLei(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei) 

    /**
     * Method addListaHistoricoItemLei
     * 
     * 
     * 
     * @param index
     * @param vListaHistoricoItemLei
     */
    public void addListaHistoricoItemLei(int index, br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei vListaHistoricoItemLei)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaHistoricoItemLeiList.size() < 100)) {
            throw new IndexOutOfBoundsException("addListaHistoricoItemLei has a maximum of 100");
        }
        _listaHistoricoItemLeiList.insertElementAt(vListaHistoricoItemLei, index);
    } //-- void addListaHistoricoItemLei(int, br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei) 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaHistoricoItemLei
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaHistoricoItemLei()
    {
        return _listaHistoricoItemLeiList.elements();
    } //-- java.util.Enumeration enumerateListaHistoricoItemLei() 

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
     * Method getListaHistoricoItemLei
     * 
     * 
     * 
     * @param index
     * @return ListaHistoricoItemLei
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei getListaHistoricoItemLei(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaHistoricoItemLeiList.size())) {
            throw new IndexOutOfBoundsException("getListaHistoricoItemLei: Index value '"+index+"' not in range [0.."+(_listaHistoricoItemLeiList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei) _listaHistoricoItemLeiList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei getListaHistoricoItemLei(int) 

    /**
     * Method getListaHistoricoItemLei
     * 
     * 
     * 
     * @return ListaHistoricoItemLei
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei[] getListaHistoricoItemLei()
    {
        int size = _listaHistoricoItemLeiList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei) _listaHistoricoItemLeiList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei[] getListaHistoricoItemLei() 

    /**
     * Method getListaHistoricoItemLeiCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaHistoricoItemLeiCount()
    {
        return _listaHistoricoItemLeiList.size();
    } //-- int getListaHistoricoItemLeiCount() 

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
     * Method removeAllListaHistoricoItemLei
     * 
     */
    public void removeAllListaHistoricoItemLei()
    {
        _listaHistoricoItemLeiList.removeAllElements();
    } //-- void removeAllListaHistoricoItemLei() 

    /**
     * Method removeListaHistoricoItemLei
     * 
     * 
     * 
     * @param index
     * @return ListaHistoricoItemLei
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei removeListaHistoricoItemLei(int index)
    {
        java.lang.Object obj = _listaHistoricoItemLeiList.elementAt(index);
        _listaHistoricoItemLeiList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei removeListaHistoricoItemLei(int) 

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
     * Method setListaHistoricoItemLei
     * 
     * 
     * 
     * @param index
     * @param vListaHistoricoItemLei
     */
    public void setListaHistoricoItemLei(int index, br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei vListaHistoricoItemLei)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaHistoricoItemLeiList.size())) {
            throw new IndexOutOfBoundsException("setListaHistoricoItemLei: Index value '"+index+"' not in range [0.." + (_listaHistoricoItemLeiList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setListaHistoricoItemLei has a maximum of 100");
        }
        _listaHistoricoItemLeiList.setElementAt(vListaHistoricoItemLei, index);
    } //-- void setListaHistoricoItemLei(int, br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei) 

    /**
     * Method setListaHistoricoItemLei
     * 
     * 
     * 
     * @param listaHistoricoItemLeiArray
     */
    public void setListaHistoricoItemLei(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei[] listaHistoricoItemLeiArray)
    {
        //-- copy array
        _listaHistoricoItemLeiList.removeAllElements();
        for (int i = 0; i < listaHistoricoItemLeiArray.length; i++) {
            _listaHistoricoItemLeiList.addElement(listaHistoricoItemLeiArray[i]);
        }
    } //-- void setListaHistoricoItemLei(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei) 

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
     * @return ListarHistoricoItemLeiComplResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListarHistoricoItemLeiComplResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListarHistoricoItemLeiComplResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListarHistoricoItemLeiComplResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListarHistoricoItemLeiComplResponse unmarshal(java.io.Reader) 

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
