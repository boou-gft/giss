/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response;

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
 * Class ListarPagamentoManualResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarPagamentoManualResponse implements java.io.Serializable {


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
     * Field _listaPagamentoManualList
     */
    private java.util.Vector _listaPagamentoManualList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarPagamentoManualResponse() 
     {
        super();
        _listaPagamentoManualList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListarPagamentoManualResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaPagamentoManual
     * 
     * 
     * 
     * @param vListaPagamentoManual
     */
    public void addListaPagamentoManual(br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual vListaPagamentoManual)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaPagamentoManualList.addElement(vListaPagamentoManual);
    } //-- void addListaPagamentoManual(br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual) 

    /**
     * Method addListaPagamentoManual
     * 
     * 
     * 
     * @param index
     * @param vListaPagamentoManual
     */
    public void addListaPagamentoManual(int index, br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual vListaPagamentoManual)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaPagamentoManualList.insertElementAt(vListaPagamentoManual, index);
    } //-- void addListaPagamentoManual(int, br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual) 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaPagamentoManual
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaPagamentoManual()
    {
        return _listaPagamentoManualList.elements();
    } //-- java.util.Enumeration enumerateListaPagamentoManual() 

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
     * Method getListaPagamentoManual
     * 
     * 
     * 
     * @param index
     * @return ListaPagamentoManual
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual getListaPagamentoManual(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaPagamentoManualList.size())) {
            throw new IndexOutOfBoundsException("getListaPagamentoManual: Index value '"+index+"' not in range [0.."+(_listaPagamentoManualList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual) _listaPagamentoManualList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual getListaPagamentoManual(int) 

    /**
     * Method getListaPagamentoManual
     * 
     * 
     * 
     * @return ListaPagamentoManual
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual[] getListaPagamentoManual()
    {
        int size = _listaPagamentoManualList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual) _listaPagamentoManualList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual[] getListaPagamentoManual() 

    /**
     * Method getListaPagamentoManualCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaPagamentoManualCount()
    {
        return _listaPagamentoManualList.size();
    } //-- int getListaPagamentoManualCount() 

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
     * Method removeAllListaPagamentoManual
     * 
     */
    public void removeAllListaPagamentoManual()
    {
        _listaPagamentoManualList.removeAllElements();
    } //-- void removeAllListaPagamentoManual() 

    /**
     * Method removeListaPagamentoManual
     * 
     * 
     * 
     * @param index
     * @return ListaPagamentoManual
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual removeListaPagamentoManual(int index)
    {
        java.lang.Object obj = _listaPagamentoManualList.elementAt(index);
        _listaPagamentoManualList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual removeListaPagamentoManual(int) 

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
     * Method setListaPagamentoManual
     * 
     * 
     * 
     * @param index
     * @param vListaPagamentoManual
     */
    public void setListaPagamentoManual(int index, br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual vListaPagamentoManual)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaPagamentoManualList.size())) {
            throw new IndexOutOfBoundsException("setListaPagamentoManual: Index value '"+index+"' not in range [0.." + (_listaPagamentoManualList.size() - 1) + "]");
        }
        _listaPagamentoManualList.setElementAt(vListaPagamentoManual, index);
    } //-- void setListaPagamentoManual(int, br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual) 

    /**
     * Method setListaPagamentoManual
     * 
     * 
     * 
     * @param listaPagamentoManualArray
     */
    public void setListaPagamentoManual(br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual[] listaPagamentoManualArray)
    {
        //-- copy array
        _listaPagamentoManualList.removeAllElements();
        for (int i = 0; i < listaPagamentoManualArray.length; i++) {
            _listaPagamentoManualList.addElement(listaPagamentoManualArray[i]);
        }
    } //-- void setListaPagamentoManual(br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListaPagamentoManual) 

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
     * @return ListarPagamentoManualResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListarPagamentoManualResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListarPagamentoManualResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListarPagamentoManualResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.response.ListarPagamentoManualResponse unmarshal(java.io.Reader) 

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
