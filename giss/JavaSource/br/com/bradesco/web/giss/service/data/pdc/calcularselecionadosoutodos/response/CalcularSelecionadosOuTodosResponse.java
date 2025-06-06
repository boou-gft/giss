/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response;

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
 * Class CalcularSelecionadosOuTodosResponse.
 * 
 * @version $Revision$ $Date$
 */
public class CalcularSelecionadosOuTodosResponse implements java.io.Serializable {


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
     * Field _listaCalculoList
     */
    private java.util.Vector _listaCalculoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CalcularSelecionadosOuTodosResponse() 
     {
        super();
        _listaCalculoList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.CalcularSelecionadosOuTodosResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaCalculo
     * 
     * 
     * 
     * @param vListaCalculo
     */
    public void addListaCalculo(br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo vListaCalculo)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaCalculoList.addElement(vListaCalculo);
    } //-- void addListaCalculo(br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo) 

    /**
     * Method addListaCalculo
     * 
     * 
     * 
     * @param index
     * @param vListaCalculo
     */
    public void addListaCalculo(int index, br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo vListaCalculo)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaCalculoList.insertElementAt(vListaCalculo, index);
    } //-- void addListaCalculo(int, br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo) 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaCalculo
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaCalculo()
    {
        return _listaCalculoList.elements();
    } //-- java.util.Enumeration enumerateListaCalculo() 

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
     * Method getListaCalculo
     * 
     * 
     * 
     * @param index
     * @return ListaCalculo
     */
    public br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo getListaCalculo(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaCalculoList.size())) {
            throw new IndexOutOfBoundsException("getListaCalculo: Index value '"+index+"' not in range [0.."+(_listaCalculoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo) _listaCalculoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo getListaCalculo(int) 

    /**
     * Method getListaCalculo
     * 
     * 
     * 
     * @return ListaCalculo
     */
    public br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo[] getListaCalculo()
    {
        int size = _listaCalculoList.size();
        br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo[] mArray = new br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo) _listaCalculoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo[] getListaCalculo() 

    /**
     * Method getListaCalculoCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaCalculoCount()
    {
        return _listaCalculoList.size();
    } //-- int getListaCalculoCount() 

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
     * Method removeAllListaCalculo
     * 
     */
    public void removeAllListaCalculo()
    {
        _listaCalculoList.removeAllElements();
    } //-- void removeAllListaCalculo() 

    /**
     * Method removeListaCalculo
     * 
     * 
     * 
     * @param index
     * @return ListaCalculo
     */
    public br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo removeListaCalculo(int index)
    {
        java.lang.Object obj = _listaCalculoList.elementAt(index);
        _listaCalculoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo removeListaCalculo(int) 

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
     * Method setListaCalculo
     * 
     * 
     * 
     * @param index
     * @param vListaCalculo
     */
    public void setListaCalculo(int index, br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo vListaCalculo)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaCalculoList.size())) {
            throw new IndexOutOfBoundsException("setListaCalculo: Index value '"+index+"' not in range [0.." + (_listaCalculoList.size() - 1) + "]");
        }
        _listaCalculoList.setElementAt(vListaCalculo, index);
    } //-- void setListaCalculo(int, br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo) 

    /**
     * Method setListaCalculo
     * 
     * 
     * 
     * @param listaCalculoArray
     */
    public void setListaCalculo(br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo[] listaCalculoArray)
    {
        //-- copy array
        _listaCalculoList.removeAllElements();
        for (int i = 0; i < listaCalculoArray.length; i++) {
            _listaCalculoList.addElement(listaCalculoArray[i]);
        }
    } //-- void setListaCalculo(br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.ListaCalculo) 

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
     * @return CalcularSelecionadosOuTodosResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.CalcularSelecionadosOuTodosResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.CalcularSelecionadosOuTodosResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.CalcularSelecionadosOuTodosResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.response.CalcularSelecionadosOuTodosResponse unmarshal(java.io.Reader) 

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
