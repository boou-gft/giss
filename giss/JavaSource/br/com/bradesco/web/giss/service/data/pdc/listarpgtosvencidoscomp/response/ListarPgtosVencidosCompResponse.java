/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response;

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
 * Class ListarPgtosVencidosCompResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarPgtosVencidosCompResponse implements java.io.Serializable {


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
     * Field _listaPgtosVencidosList
     */
    private java.util.Vector _listaPgtosVencidosList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarPgtosVencidosCompResponse() 
     {
        super();
        _listaPgtosVencidosList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListarPgtosVencidosCompResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaPgtosVencidos
     * 
     * 
     * 
     * @param vListaPgtosVencidos
     */
    public void addListaPgtosVencidos(br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos vListaPgtosVencidos)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaPgtosVencidosList.addElement(vListaPgtosVencidos);
    } //-- void addListaPgtosVencidos(br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos) 

    /**
     * Method addListaPgtosVencidos
     * 
     * 
     * 
     * @param index
     * @param vListaPgtosVencidos
     */
    public void addListaPgtosVencidos(int index, br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos vListaPgtosVencidos)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaPgtosVencidosList.insertElementAt(vListaPgtosVencidos, index);
    } //-- void addListaPgtosVencidos(int, br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos) 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaPgtosVencidos
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaPgtosVencidos()
    {
        return _listaPgtosVencidosList.elements();
    } //-- java.util.Enumeration enumerateListaPgtosVencidos() 

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
     * Method getListaPgtosVencidos
     * 
     * 
     * 
     * @param index
     * @return ListaPgtosVencidos
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos getListaPgtosVencidos(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaPgtosVencidosList.size())) {
            throw new IndexOutOfBoundsException("getListaPgtosVencidos: Index value '"+index+"' not in range [0.."+(_listaPgtosVencidosList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos) _listaPgtosVencidosList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos getListaPgtosVencidos(int) 

    /**
     * Method getListaPgtosVencidos
     * 
     * 
     * 
     * @return ListaPgtosVencidos
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos[] getListaPgtosVencidos()
    {
        int size = _listaPgtosVencidosList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos) _listaPgtosVencidosList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos[] getListaPgtosVencidos() 

    /**
     * Method getListaPgtosVencidosCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaPgtosVencidosCount()
    {
        return _listaPgtosVencidosList.size();
    } //-- int getListaPgtosVencidosCount() 

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
     * Method removeAllListaPgtosVencidos
     * 
     */
    public void removeAllListaPgtosVencidos()
    {
        _listaPgtosVencidosList.removeAllElements();
    } //-- void removeAllListaPgtosVencidos() 

    /**
     * Method removeListaPgtosVencidos
     * 
     * 
     * 
     * @param index
     * @return ListaPgtosVencidos
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos removeListaPgtosVencidos(int index)
    {
        java.lang.Object obj = _listaPgtosVencidosList.elementAt(index);
        _listaPgtosVencidosList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos removeListaPgtosVencidos(int) 

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
     * Method setListaPgtosVencidos
     * 
     * 
     * 
     * @param index
     * @param vListaPgtosVencidos
     */
    public void setListaPgtosVencidos(int index, br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos vListaPgtosVencidos)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaPgtosVencidosList.size())) {
            throw new IndexOutOfBoundsException("setListaPgtosVencidos: Index value '"+index+"' not in range [0.." + (_listaPgtosVencidosList.size() - 1) + "]");
        }
        _listaPgtosVencidosList.setElementAt(vListaPgtosVencidos, index);
    } //-- void setListaPgtosVencidos(int, br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos) 

    /**
     * Method setListaPgtosVencidos
     * 
     * 
     * 
     * @param listaPgtosVencidosArray
     */
    public void setListaPgtosVencidos(br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos[] listaPgtosVencidosArray)
    {
        //-- copy array
        _listaPgtosVencidosList.removeAllElements();
        for (int i = 0; i < listaPgtosVencidosArray.length; i++) {
            _listaPgtosVencidosList.addElement(listaPgtosVencidosArray[i]);
        }
    } //-- void setListaPgtosVencidos(br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos) 

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
     * @return ListarPgtosVencidosCompResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListarPgtosVencidosCompResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListarPgtosVencidosCompResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListarPgtosVencidosCompResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListarPgtosVencidosCompResponse unmarshal(java.io.Reader) 

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
