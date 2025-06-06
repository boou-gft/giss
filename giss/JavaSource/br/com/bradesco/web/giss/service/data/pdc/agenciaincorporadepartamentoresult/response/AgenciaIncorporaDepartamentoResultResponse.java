/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: AgenciaIncorporaDepartamentoResultResponse.java,v 1.1 2017/04/11 14:10:06 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response;

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
 * Class AgenciaIncorporaDepartamentoResultResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:06 $
 */
public class AgenciaIncorporaDepartamentoResultResponse implements java.io.Serializable {


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
     * Field _sinalTotalReceita
     */
    private java.lang.String _sinalTotalReceita;

    /**
     * Field _valorTotalReceita
     */
    private java.math.BigDecimal _valorTotalReceita = new java.math.BigDecimal("0");

    /**
     * Field _sinalTotalIss
     */
    private java.lang.String _sinalTotalIss;

    /**
     * Field _valorTotalIss
     */
    private java.math.BigDecimal _valorTotalIss = new java.math.BigDecimal("0");

    /**
     * Field _ocorrenciaList
     */
    private java.util.Vector _ocorrenciaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AgenciaIncorporaDepartamentoResultResponse() 
     {
        super();
        setValorTotalReceita(new java.math.BigDecimal("0"));
        setValorTotalIss(new java.math.BigDecimal("0"));
        _ocorrenciaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.AgenciaIncorporaDepartamentoResultResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrencia
     * 
     * 
     * 
     * @param vOcorrencia
     */
    public void addOcorrencia(br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia vOcorrencia)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciaList.addElement(vOcorrencia);
    } //-- void addOcorrencia(br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia) 

    /**
     * Method addOcorrencia
     * 
     * 
     * 
     * @param index
     * @param vOcorrencia
     */
    public void addOcorrencia(int index, br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia vOcorrencia)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciaList.insertElementAt(vOcorrencia, index);
    } //-- void addOcorrencia(int, br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia) 

    /**
     * Method deleteNumeroConsultas
     * 
     */
    public void deleteNumeroConsultas()
    {
        this._has_numeroConsultas= false;
    } //-- void deleteNumeroConsultas() 

    /**
     * Method enumerateOcorrencia
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrencia()
    {
        return _ocorrenciaList.elements();
    } //-- java.util.Enumeration enumerateOcorrencia() 

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
     * Method getOcorrencia
     * 
     * 
     * 
     * @param index
     * @return Ocorrencia
     */
    public br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia getOcorrencia(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciaList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencia: Index value '"+index+"' not in range [0.."+(_ocorrenciaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia) _ocorrenciaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia getOcorrencia(int) 

    /**
     * Method getOcorrencia
     * 
     * 
     * 
     * @return Ocorrencia
     */
    public br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia[] getOcorrencia()
    {
        int size = _ocorrenciaList.size();
        br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia[] mArray = new br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia) _ocorrenciaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia[] getOcorrencia() 

    /**
     * Method getOcorrenciaCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciaCount()
    {
        return _ocorrenciaList.size();
    } //-- int getOcorrenciaCount() 

    /**
     * Returns the value of field 'sinalTotalIss'.
     * 
     * @return String
     * @return the value of field 'sinalTotalIss'.
     */
    public java.lang.String getSinalTotalIss()
    {
        return this._sinalTotalIss;
    } //-- java.lang.String getSinalTotalIss() 

    /**
     * Returns the value of field 'sinalTotalReceita'.
     * 
     * @return String
     * @return the value of field 'sinalTotalReceita'.
     */
    public java.lang.String getSinalTotalReceita()
    {
        return this._sinalTotalReceita;
    } //-- java.lang.String getSinalTotalReceita() 

    /**
     * Returns the value of field 'valorTotalIss'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalIss'.
     */
    public java.math.BigDecimal getValorTotalIss()
    {
        return this._valorTotalIss;
    } //-- java.math.BigDecimal getValorTotalIss() 

    /**
     * Returns the value of field 'valorTotalReceita'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalReceita'.
     */
    public java.math.BigDecimal getValorTotalReceita()
    {
        return this._valorTotalReceita;
    } //-- java.math.BigDecimal getValorTotalReceita() 

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
     * Method removeAllOcorrencia
     * 
     */
    public void removeAllOcorrencia()
    {
        _ocorrenciaList.removeAllElements();
    } //-- void removeAllOcorrencia() 

    /**
     * Method removeOcorrencia
     * 
     * 
     * 
     * @param index
     * @return Ocorrencia
     */
    public br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia removeOcorrencia(int index)
    {
        java.lang.Object obj = _ocorrenciaList.elementAt(index);
        _ocorrenciaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia removeOcorrencia(int) 

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
     * Method setOcorrencia
     * 
     * 
     * 
     * @param index
     * @param vOcorrencia
     */
    public void setOcorrencia(int index, br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia vOcorrencia)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciaList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencia: Index value '"+index+"' not in range [0.." + (_ocorrenciaList.size() - 1) + "]");
        }
        _ocorrenciaList.setElementAt(vOcorrencia, index);
    } //-- void setOcorrencia(int, br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia) 

    /**
     * Method setOcorrencia
     * 
     * 
     * 
     * @param ocorrenciaArray
     */
    public void setOcorrencia(br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia[] ocorrenciaArray)
    {
        //-- copy array
        _ocorrenciaList.removeAllElements();
        for (int i = 0; i < ocorrenciaArray.length; i++) {
            _ocorrenciaList.addElement(ocorrenciaArray[i]);
        }
    } //-- void setOcorrencia(br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia) 

    /**
     * Sets the value of field 'sinalTotalIss'.
     * 
     * @param sinalTotalIss the value of field 'sinalTotalIss'.
     */
    public void setSinalTotalIss(java.lang.String sinalTotalIss)
    {
        this._sinalTotalIss = sinalTotalIss;
    } //-- void setSinalTotalIss(java.lang.String) 

    /**
     * Sets the value of field 'sinalTotalReceita'.
     * 
     * @param sinalTotalReceita the value of field
     * 'sinalTotalReceita'.
     */
    public void setSinalTotalReceita(java.lang.String sinalTotalReceita)
    {
        this._sinalTotalReceita = sinalTotalReceita;
    } //-- void setSinalTotalReceita(java.lang.String) 

    /**
     * Sets the value of field 'valorTotalIss'.
     * 
     * @param valorTotalIss the value of field 'valorTotalIss'.
     */
    public void setValorTotalIss(java.math.BigDecimal valorTotalIss)
    {
        this._valorTotalIss = valorTotalIss;
    } //-- void setValorTotalIss(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalReceita'.
     * 
     * @param valorTotalReceita the value of field
     * 'valorTotalReceita'.
     */
    public void setValorTotalReceita(java.math.BigDecimal valorTotalReceita)
    {
        this._valorTotalReceita = valorTotalReceita;
    } //-- void setValorTotalReceita(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AgenciaIncorporaDepartamentoResultResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.AgenciaIncorporaDepartamentoResultResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.AgenciaIncorporaDepartamentoResultResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.AgenciaIncorporaDepartamentoResultResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.AgenciaIncorporaDepartamentoResultResponse unmarshal(java.io.Reader) 

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
