/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response;

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
 * Class ListarNaoElegiveisResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarNaoElegiveisResponse implements java.io.Serializable {


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
     * Field _listaPgtosNaoElegiveisList
     */
    private java.util.Vector _listaPgtosNaoElegiveisList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarNaoElegiveisResponse() 
     {
        super();
        _listaPgtosNaoElegiveisList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListarNaoElegiveisResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaPgtosNaoElegiveis
     * 
     * 
     * 
     * @param vListaPgtosNaoElegiveis
     */
    public void addListaPgtosNaoElegiveis(br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis vListaPgtosNaoElegiveis)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaPgtosNaoElegiveisList.addElement(vListaPgtosNaoElegiveis);
    } //-- void addListaPgtosNaoElegiveis(br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis) 

    /**
     * Method addListaPgtosNaoElegiveis
     * 
     * 
     * 
     * @param index
     * @param vListaPgtosNaoElegiveis
     */
    public void addListaPgtosNaoElegiveis(int index, br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis vListaPgtosNaoElegiveis)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaPgtosNaoElegiveisList.insertElementAt(vListaPgtosNaoElegiveis, index);
    } //-- void addListaPgtosNaoElegiveis(int, br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis) 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaPgtosNaoElegiveis
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaPgtosNaoElegiveis()
    {
        return _listaPgtosNaoElegiveisList.elements();
    } //-- java.util.Enumeration enumerateListaPgtosNaoElegiveis() 

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
     * Method getListaPgtosNaoElegiveis
     * 
     * 
     * 
     * @param index
     * @return ListaPgtosNaoElegiveis
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis getListaPgtosNaoElegiveis(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaPgtosNaoElegiveisList.size())) {
            throw new IndexOutOfBoundsException("getListaPgtosNaoElegiveis: Index value '"+index+"' not in range [0.."+(_listaPgtosNaoElegiveisList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis) _listaPgtosNaoElegiveisList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis getListaPgtosNaoElegiveis(int) 

    /**
     * Method getListaPgtosNaoElegiveis
     * 
     * 
     * 
     * @return ListaPgtosNaoElegiveis
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis[] getListaPgtosNaoElegiveis()
    {
        int size = _listaPgtosNaoElegiveisList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis) _listaPgtosNaoElegiveisList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis[] getListaPgtosNaoElegiveis() 

    /**
     * Method getListaPgtosNaoElegiveisCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaPgtosNaoElegiveisCount()
    {
        return _listaPgtosNaoElegiveisList.size();
    } //-- int getListaPgtosNaoElegiveisCount() 

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
     * Method removeAllListaPgtosNaoElegiveis
     * 
     */
    public void removeAllListaPgtosNaoElegiveis()
    {
        _listaPgtosNaoElegiveisList.removeAllElements();
    } //-- void removeAllListaPgtosNaoElegiveis() 

    /**
     * Method removeListaPgtosNaoElegiveis
     * 
     * 
     * 
     * @param index
     * @return ListaPgtosNaoElegiveis
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis removeListaPgtosNaoElegiveis(int index)
    {
        java.lang.Object obj = _listaPgtosNaoElegiveisList.elementAt(index);
        _listaPgtosNaoElegiveisList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis removeListaPgtosNaoElegiveis(int) 

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
     * Method setListaPgtosNaoElegiveis
     * 
     * 
     * 
     * @param index
     * @param vListaPgtosNaoElegiveis
     */
    public void setListaPgtosNaoElegiveis(int index, br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis vListaPgtosNaoElegiveis)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaPgtosNaoElegiveisList.size())) {
            throw new IndexOutOfBoundsException("setListaPgtosNaoElegiveis: Index value '"+index+"' not in range [0.." + (_listaPgtosNaoElegiveisList.size() - 1) + "]");
        }
        _listaPgtosNaoElegiveisList.setElementAt(vListaPgtosNaoElegiveis, index);
    } //-- void setListaPgtosNaoElegiveis(int, br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis) 

    /**
     * Method setListaPgtosNaoElegiveis
     * 
     * 
     * 
     * @param listaPgtosNaoElegiveisArray
     */
    public void setListaPgtosNaoElegiveis(br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis[] listaPgtosNaoElegiveisArray)
    {
        //-- copy array
        _listaPgtosNaoElegiveisList.removeAllElements();
        for (int i = 0; i < listaPgtosNaoElegiveisArray.length; i++) {
            _listaPgtosNaoElegiveisList.addElement(listaPgtosNaoElegiveisArray[i]);
        }
    } //-- void setListaPgtosNaoElegiveis(br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListaPgtosNaoElegiveis) 

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
     * @return ListarNaoElegiveisResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListarNaoElegiveisResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListarNaoElegiveisResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListarNaoElegiveisResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.response.ListarNaoElegiveisResponse unmarshal(java.io.Reader) 

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
