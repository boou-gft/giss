/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response;

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
 * Class GerarRelatorioApuracaoResponse.
 * 
 * @version $Revision$ $Date$
 */
public class GerarRelatorioApuracaoResponse implements java.io.Serializable {


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
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _listaRelatorioApuracaoList
     */
    private java.util.Vector _listaRelatorioApuracaoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public GerarRelatorioApuracaoResponse() 
     {
        super();
        _listaRelatorioApuracaoList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.GerarRelatorioApuracaoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaRelatorioApuracao
     * 
     * 
     * 
     * @param vListaRelatorioApuracao
     */
    public void addListaRelatorioApuracao(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao vListaRelatorioApuracao)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaRelatorioApuracaoList.addElement(vListaRelatorioApuracao);
    } //-- void addListaRelatorioApuracao(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao) 

    /**
     * Method addListaRelatorioApuracao
     * 
     * 
     * 
     * @param index
     * @param vListaRelatorioApuracao
     */
    public void addListaRelatorioApuracao(int index, br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao vListaRelatorioApuracao)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaRelatorioApuracaoList.insertElementAt(vListaRelatorioApuracao, index);
    } //-- void addListaRelatorioApuracao(int, br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao) 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateListaRelatorioApuracao
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaRelatorioApuracao()
    {
        return _listaRelatorioApuracaoList.elements();
    } //-- java.util.Enumeration enumerateListaRelatorioApuracao() 

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
     * Method getListaRelatorioApuracao
     * 
     * 
     * 
     * @param index
     * @return ListaRelatorioApuracao
     */
    public br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao getListaRelatorioApuracao(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaRelatorioApuracaoList.size())) {
            throw new IndexOutOfBoundsException("getListaRelatorioApuracao: Index value '"+index+"' not in range [0.."+(_listaRelatorioApuracaoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao) _listaRelatorioApuracaoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao getListaRelatorioApuracao(int) 

    /**
     * Method getListaRelatorioApuracao
     * 
     * 
     * 
     * @return ListaRelatorioApuracao
     */
    public br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao[] getListaRelatorioApuracao()
    {
        int size = _listaRelatorioApuracaoList.size();
        br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao[] mArray = new br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao) _listaRelatorioApuracaoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao[] getListaRelatorioApuracao() 

    /**
     * Method getListaRelatorioApuracaoCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaRelatorioApuracaoCount()
    {
        return _listaRelatorioApuracaoList.size();
    } //-- int getListaRelatorioApuracaoCount() 

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
     * Returns the value of field 'qtdeRegistros'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistros'.
     */
    public int getQtdeRegistros()
    {
        return this._qtdeRegistros;
    } //-- int getQtdeRegistros() 

    /**
     * Method hasQtdeRegistros
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistros()
    {
        return this._has_qtdeRegistros;
    } //-- boolean hasQtdeRegistros() 

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
     * Method removeAllListaRelatorioApuracao
     * 
     */
    public void removeAllListaRelatorioApuracao()
    {
        _listaRelatorioApuracaoList.removeAllElements();
    } //-- void removeAllListaRelatorioApuracao() 

    /**
     * Method removeListaRelatorioApuracao
     * 
     * 
     * 
     * @param index
     * @return ListaRelatorioApuracao
     */
    public br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao removeListaRelatorioApuracao(int index)
    {
        java.lang.Object obj = _listaRelatorioApuracaoList.elementAt(index);
        _listaRelatorioApuracaoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao removeListaRelatorioApuracao(int) 

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
     * Method setListaRelatorioApuracao
     * 
     * 
     * 
     * @param index
     * @param vListaRelatorioApuracao
     */
    public void setListaRelatorioApuracao(int index, br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao vListaRelatorioApuracao)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaRelatorioApuracaoList.size())) {
            throw new IndexOutOfBoundsException("setListaRelatorioApuracao: Index value '"+index+"' not in range [0.." + (_listaRelatorioApuracaoList.size() - 1) + "]");
        }
        _listaRelatorioApuracaoList.setElementAt(vListaRelatorioApuracao, index);
    } //-- void setListaRelatorioApuracao(int, br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao) 

    /**
     * Method setListaRelatorioApuracao
     * 
     * 
     * 
     * @param listaRelatorioApuracaoArray
     */
    public void setListaRelatorioApuracao(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao[] listaRelatorioApuracaoArray)
    {
        //-- copy array
        _listaRelatorioApuracaoList.removeAllElements();
        for (int i = 0; i < listaRelatorioApuracaoArray.length; i++) {
            _listaRelatorioApuracaoList.addElement(listaRelatorioApuracaoArray[i]);
        }
    } //-- void setListaRelatorioApuracao(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao) 

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
     * Sets the value of field 'qtdeRegistros'.
     * 
     * @param qtdeRegistros the value of field 'qtdeRegistros'.
     */
    public void setQtdeRegistros(int qtdeRegistros)
    {
        this._qtdeRegistros = qtdeRegistros;
        this._has_qtdeRegistros = true;
    } //-- void setQtdeRegistros(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GerarRelatorioApuracaoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.GerarRelatorioApuracaoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.GerarRelatorioApuracaoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.GerarRelatorioApuracaoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.GerarRelatorioApuracaoResponse unmarshal(java.io.Reader) 

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
