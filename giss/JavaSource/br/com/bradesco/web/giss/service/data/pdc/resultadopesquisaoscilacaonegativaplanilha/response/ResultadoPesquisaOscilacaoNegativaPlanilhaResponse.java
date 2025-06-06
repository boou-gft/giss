/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ResultadoPesquisaOscilacaoNegativaPlanilhaResponse.java,v 1.2 2018/04/30 23:31:20 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response;

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
 * Class ResultadoPesquisaOscilacaoNegativaPlanilhaResponse.
 * 
 * @version $Revision: 1.2 $ $Date: 2018/04/30 23:31:20 $
 */
public class ResultadoPesquisaOscilacaoNegativaPlanilhaResponse implements java.io.Serializable {


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
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _codigoUf
     */
    private java.lang.String _codigoUf;

    /**
     * Field _descUf
     */
    private java.lang.String _descUf;

    /**
     * Field _anteriorTotalSinal
     */
    private java.lang.String _anteriorTotalSinal;

    /**
     * Field _anteriorTotalValor
     */
    private java.math.BigDecimal _anteriorTotalValor = new java.math.BigDecimal("0");

    /**
     * Field _atualTotalSinal
     */
    private java.lang.String _atualTotalSinal;

    /**
     * Field _atualTotalValor
     */
    private java.math.BigDecimal _atualTotalValor = new java.math.BigDecimal("0");

    /**
     * Field _oscilacaoTotalSinal
     */
    private java.lang.String _oscilacaoTotalSinal;

    /**
     * Field _oscilacaoTotalValor
     */
    private java.math.BigDecimal _oscilacaoTotalValor = new java.math.BigDecimal("0");

    /**
     * Field _nroConsultas
     */
    private int _nroConsultas = 0;

    /**
     * keeps track of state for field: _nroConsultas
     */
    private boolean _has_nroConsultas;

    /**
     * Field _ocorrenciasList
     */
    private java.util.Vector _ocorrenciasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResultadoPesquisaOscilacaoNegativaPlanilhaResponse() 
     {
        super();
        setAnteriorTotalValor(new java.math.BigDecimal("0"));
        setAtualTotalValor(new java.math.BigDecimal("0"));
        setOscilacaoTotalValor(new java.math.BigDecimal("0"));
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.ResultadoPesquisaOscilacaoNegativaPlanilhaResponse()


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
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias) 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteNroConsultas
     * 
     */
    public void deleteNroConsultas()
    {
        this._has_nroConsultas= false;
    } //-- void deleteNroConsultas() 

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
     * Returns the value of field 'anteriorTotalSinal'.
     * 
     * @return String
     * @return the value of field 'anteriorTotalSinal'.
     */
    public java.lang.String getAnteriorTotalSinal()
    {
        return this._anteriorTotalSinal;
    } //-- java.lang.String getAnteriorTotalSinal() 

    /**
     * Returns the value of field 'anteriorTotalValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'anteriorTotalValor'.
     */
    public java.math.BigDecimal getAnteriorTotalValor()
    {
        return this._anteriorTotalValor;
    } //-- java.math.BigDecimal getAnteriorTotalValor() 

    /**
     * Returns the value of field 'atualTotalSinal'.
     * 
     * @return String
     * @return the value of field 'atualTotalSinal'.
     */
    public java.lang.String getAtualTotalSinal()
    {
        return this._atualTotalSinal;
    } //-- java.lang.String getAtualTotalSinal() 

    /**
     * Returns the value of field 'atualTotalValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'atualTotalValor'.
     */
    public java.math.BigDecimal getAtualTotalValor()
    {
        return this._atualTotalValor;
    } //-- java.math.BigDecimal getAtualTotalValor() 

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
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

    /**
     * Returns the value of field 'codigoUf'.
     * 
     * @return String
     * @return the value of field 'codigoUf'.
     */
    public java.lang.String getCodigoUf()
    {
        return this._codigoUf;
    } //-- java.lang.String getCodigoUf() 

    /**
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'descUf'.
     * 
     * @return String
     * @return the value of field 'descUf'.
     */
    public java.lang.String getDescUf()
    {
        return this._descUf;
    } //-- java.lang.String getDescUf() 

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
     * Returns the value of field 'nroConsultas'.
     * 
     * @return int
     * @return the value of field 'nroConsultas'.
     */
    public int getNroConsultas()
    {
        return this._nroConsultas;
    } //-- int getNroConsultas() 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @param index
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias[] getOcorrencias() 

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
     * Returns the value of field 'oscilacaoTotalSinal'.
     * 
     * @return String
     * @return the value of field 'oscilacaoTotalSinal'.
     */
    public java.lang.String getOscilacaoTotalSinal()
    {
        return this._oscilacaoTotalSinal;
    } //-- java.lang.String getOscilacaoTotalSinal() 

    /**
     * Returns the value of field 'oscilacaoTotalValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'oscilacaoTotalValor'.
     */
    public java.math.BigDecimal getOscilacaoTotalValor()
    {
        return this._oscilacaoTotalValor;
    } //-- java.math.BigDecimal getOscilacaoTotalValor() 

    /**
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

    /**
     * Method hasNroConsultas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNroConsultas()
    {
        return this._has_nroConsultas;
    } //-- boolean hasNroConsultas() 

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
    public br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias removeOcorrencias(int) 

    /**
     * Sets the value of field 'anteriorTotalSinal'.
     * 
     * @param anteriorTotalSinal the value of field
     * 'anteriorTotalSinal'.
     */
    public void setAnteriorTotalSinal(java.lang.String anteriorTotalSinal)
    {
        this._anteriorTotalSinal = anteriorTotalSinal;
    } //-- void setAnteriorTotalSinal(java.lang.String) 

    /**
     * Sets the value of field 'anteriorTotalValor'.
     * 
     * @param anteriorTotalValor the value of field
     * 'anteriorTotalValor'.
     */
    public void setAnteriorTotalValor(java.math.BigDecimal anteriorTotalValor)
    {
        this._anteriorTotalValor = anteriorTotalValor;
    } //-- void setAnteriorTotalValor(java.math.BigDecimal) 

    /**
     * Sets the value of field 'atualTotalSinal'.
     * 
     * @param atualTotalSinal the value of field 'atualTotalSinal'.
     */
    public void setAtualTotalSinal(java.lang.String atualTotalSinal)
    {
        this._atualTotalSinal = atualTotalSinal;
    } //-- void setAtualTotalSinal(java.lang.String) 

    /**
     * Sets the value of field 'atualTotalValor'.
     * 
     * @param atualTotalValor the value of field 'atualTotalValor'.
     */
    public void setAtualTotalValor(java.math.BigDecimal atualTotalValor)
    {
        this._atualTotalValor = atualTotalValor;
    } //-- void setAtualTotalValor(java.math.BigDecimal) 

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
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

    /**
     * Sets the value of field 'codigoUf'.
     * 
     * @param codigoUf the value of field 'codigoUf'.
     */
    public void setCodigoUf(java.lang.String codigoUf)
    {
        this._codigoUf = codigoUf;
    } //-- void setCodigoUf(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'descUf'.
     * 
     * @param descUf the value of field 'descUf'.
     */
    public void setDescUf(java.lang.String descUf)
    {
        this._descUf = descUf;
    } //-- void setDescUf(java.lang.String) 

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
     * Sets the value of field 'nroConsultas'.
     * 
     * @param nroConsultas the value of field 'nroConsultas'.
     */
    public void setNroConsultas(int nroConsultas)
    {
        this._nroConsultas = nroConsultas;
        this._has_nroConsultas = true;
    } //-- void setNroConsultas(int) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.Ocorrencias) 

    /**
     * Sets the value of field 'oscilacaoTotalSinal'.
     * 
     * @param oscilacaoTotalSinal the value of field
     * 'oscilacaoTotalSinal'.
     */
    public void setOscilacaoTotalSinal(java.lang.String oscilacaoTotalSinal)
    {
        this._oscilacaoTotalSinal = oscilacaoTotalSinal;
    } //-- void setOscilacaoTotalSinal(java.lang.String) 

    /**
     * Sets the value of field 'oscilacaoTotalValor'.
     * 
     * @param oscilacaoTotalValor the value of field
     * 'oscilacaoTotalValor'.
     */
    public void setOscilacaoTotalValor(java.math.BigDecimal oscilacaoTotalValor)
    {
        this._oscilacaoTotalValor = oscilacaoTotalValor;
    } //-- void setOscilacaoTotalValor(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ResultadoPesquisaOscilacaoNegativaPlanilhaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.ResultadoPesquisaOscilacaoNegativaPlanilhaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.ResultadoPesquisaOscilacaoNegativaPlanilhaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.ResultadoPesquisaOscilacaoNegativaPlanilhaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.response.ResultadoPesquisaOscilacaoNegativaPlanilhaResponse unmarshal(java.io.Reader) 

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
