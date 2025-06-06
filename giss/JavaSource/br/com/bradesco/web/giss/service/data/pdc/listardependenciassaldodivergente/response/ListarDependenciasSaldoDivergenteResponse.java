/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarDependenciasSaldoDivergenteResponse.java,v 1.1 2017/04/11 14:12:54 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarDependenciasSaldoDivergenteResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:54 $
 */
public class ListarDependenciasSaldoDivergenteResponse implements java.io.Serializable {


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
     * Field _numeroConsultas
     */
    private int _numeroConsultas = 0;

    /**
     * keeps track of state for field: _numeroConsultas
     */
    private boolean _has_numeroConsultas;

    /**
     * Field _sinalTotalApuracao
     */
    private java.lang.String _sinalTotalApuracao;

    /**
     * Field _valorTotalApuracao
     */
    private java.math.BigDecimal _valorTotalApuracao = new java.math.BigDecimal("0");

    /**
     * Field _sinalTotalContabil
     */
    private java.lang.String _sinalTotalContabil;

    /**
     * Field _valorTotalContabil
     */
    private java.math.BigDecimal _valorTotalContabil = new java.math.BigDecimal("0");

    /**
     * Field _ocorrenciasList
     */
    private java.util.Vector _ocorrenciasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarDependenciasSaldoDivergenteResponse() 
     {
        super();
        setValorTotalApuracao(new java.math.BigDecimal("0"));
        setValorTotalContabil(new java.math.BigDecimal("0"));
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.ListarDependenciasSaldoDivergenteResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param vOcorrencias
     */
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias) 

    /**
     * Method deleteNumeroConsultas
     * 
     */
    public void deleteNumeroConsultas()
    {
        this._has_numeroConsultas= false;
    } //-- void deleteNumeroConsultas() 

    /**
     * Method enumerateOcorrencias
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrencias()
    {
        return _ocorrenciasList.elements();
    } //-- java.util.Enumeration enumerateOcorrencias() 

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
     * Returns the value of field 'numeroConsultas'.
     * 
     * @return int
     * @return the value of field 'numeroConsultas'.
     */
    public int getNumeroConsultas()
    {
        return this._numeroConsultas;
    } //-- int getNumeroConsultas() 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @param index
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias[] getOcorrencias() 

    /**
     * Method getOcorrenciasCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasCount()
    {
        return _ocorrenciasList.size();
    } //-- int getOcorrenciasCount() 

    /**
     * Returns the value of field 'sinalTotalApuracao'.
     * 
     * @return String
     * @return the value of field 'sinalTotalApuracao'.
     */
    public java.lang.String getSinalTotalApuracao()
    {
        return this._sinalTotalApuracao;
    } //-- java.lang.String getSinalTotalApuracao() 

    /**
     * Returns the value of field 'sinalTotalContabil'.
     * 
     * @return String
     * @return the value of field 'sinalTotalContabil'.
     */
    public java.lang.String getSinalTotalContabil()
    {
        return this._sinalTotalContabil;
    } //-- java.lang.String getSinalTotalContabil() 

    /**
     * Returns the value of field 'valorTotalApuracao'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalApuracao'.
     */
    public java.math.BigDecimal getValorTotalApuracao()
    {
        return this._valorTotalApuracao;
    } //-- java.math.BigDecimal getValorTotalApuracao() 

    /**
     * Returns the value of field 'valorTotalContabil'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalContabil'.
     */
    public java.math.BigDecimal getValorTotalContabil()
    {
        return this._valorTotalContabil;
    } //-- java.math.BigDecimal getValorTotalContabil() 

    /**
     * Method hasNumeroConsultas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroConsultas()
    {
        return this._has_numeroConsultas;
    } //-- boolean hasNumeroConsultas() 

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
     * Method removeAllOcorrencias
     * 
     */
    public void removeAllOcorrencias()
    {
        _ocorrenciasList.removeAllElements();
    } //-- void removeAllOcorrencias() 

    /**
     * Method removeOcorrencias
     * 
     * 
     * 
     * @param index
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias removeOcorrencias(int) 

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
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field 'numeroConsultas'.
     * 
     * @param numeroConsultas the value of field 'numeroConsultas'.
     */
    public void setNumeroConsultas(int numeroConsultas)
    {
        this._numeroConsultas = numeroConsultas;
        this._has_numeroConsultas = true;
    } //-- void setNumeroConsultas(int) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.Ocorrencias) 

    /**
     * Sets the value of field 'sinalTotalApuracao'.
     * 
     * @param sinalTotalApuracao the value of field
     * 'sinalTotalApuracao'.
     */
    public void setSinalTotalApuracao(java.lang.String sinalTotalApuracao)
    {
        this._sinalTotalApuracao = sinalTotalApuracao;
    } //-- void setSinalTotalApuracao(java.lang.String) 

    /**
     * Sets the value of field 'sinalTotalContabil'.
     * 
     * @param sinalTotalContabil the value of field
     * 'sinalTotalContabil'.
     */
    public void setSinalTotalContabil(java.lang.String sinalTotalContabil)
    {
        this._sinalTotalContabil = sinalTotalContabil;
    } //-- void setSinalTotalContabil(java.lang.String) 

    /**
     * Sets the value of field 'valorTotalApuracao'.
     * 
     * @param valorTotalApuracao the value of field
     * 'valorTotalApuracao'.
     */
    public void setValorTotalApuracao(java.math.BigDecimal valorTotalApuracao)
    {
        this._valorTotalApuracao = valorTotalApuracao;
    } //-- void setValorTotalApuracao(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalContabil'.
     * 
     * @param valorTotalContabil the value of field
     * 'valorTotalContabil'.
     */
    public void setValorTotalContabil(java.math.BigDecimal valorTotalContabil)
    {
        this._valorTotalContabil = valorTotalContabil;
    } //-- void setValorTotalContabil(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarDependenciasSaldoDivergenteResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.ListarDependenciasSaldoDivergenteResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.ListarDependenciasSaldoDivergenteResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.ListarDependenciasSaldoDivergenteResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.response.ListarDependenciasSaldoDivergenteResponse unmarshal(java.io.Reader) 

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
