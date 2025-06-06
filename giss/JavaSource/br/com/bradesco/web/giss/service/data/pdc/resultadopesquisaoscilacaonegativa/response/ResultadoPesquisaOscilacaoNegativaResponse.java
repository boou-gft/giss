/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ResultadoPesquisaOscilacaoNegativaResponse.java,v 1.3 2018/04/24 02:26:59 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response;

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
 * Class ResultadoPesquisaOscilacaoNegativaResponse.
 * 
 * @version $Revision: 1.3 $ $Date: 2018/04/24 02:26:59 $
 */
public class ResultadoPesquisaOscilacaoNegativaResponse implements java.io.Serializable {


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
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _codUF
     */
    private java.lang.String _codUF;

    /**
     * Field _descUF
     */
    private java.lang.String _descUF;

    /**
     * Field _sinalAnteriorTotal
     */
    private java.lang.String _sinalAnteriorTotal;

    /**
     * Field _valorAnteriorTotal
     */
    private java.math.BigDecimal _valorAnteriorTotal = new java.math.BigDecimal("0");

    /**
     * Field _sinalAtualTotal
     */
    private java.lang.String _sinalAtualTotal;

    /**
     * Field _valorAtualTotal
     */
    private java.math.BigDecimal _valorAtualTotal = new java.math.BigDecimal("0");

    /**
     * Field _sinalOscilacaoTotal
     */
    private java.lang.String _sinalOscilacaoTotal;

    /**
     * Field _valorOscilacaoTotal
     */
    private java.math.BigDecimal _valorOscilacaoTotal = new java.math.BigDecimal("0");

    /**
     * Field _sinalTotalAgencia
     */
    private java.lang.String _sinalTotalAgencia;

    /**
     * Field _valorTotalAgencia
     */
    private java.math.BigDecimal _valorTotalAgencia = new java.math.BigDecimal("0");

    /**
     * Field _sinalTotalPa
     */
    private java.lang.String _sinalTotalPa;

    /**
     * Field _valorTotalPa
     */
    private java.math.BigDecimal _valorTotalPa = new java.math.BigDecimal("0");

    /**
     * Field _qtdeRegistro
     */
    private int _qtdeRegistro = 0;

    /**
     * keeps track of state for field: _qtdeRegistro
     */
    private boolean _has_qtdeRegistro;

    /**
     * Field _ocorrenciasOscilacaoNegList
     */
    private java.util.Vector _ocorrenciasOscilacaoNegList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResultadoPesquisaOscilacaoNegativaResponse() 
     {
        super();
        setValorAnteriorTotal(new java.math.BigDecimal("0"));
        setValorAtualTotal(new java.math.BigDecimal("0"));
        setValorOscilacaoTotal(new java.math.BigDecimal("0"));
        setValorTotalAgencia(new java.math.BigDecimal("0"));
        setValorTotalPa(new java.math.BigDecimal("0"));
        _ocorrenciasOscilacaoNegList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.ResultadoPesquisaOscilacaoNegativaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasOscilacaoNeg
     * 
     * 
     * 
     * @param vOcorrenciasOscilacaoNeg
     */
    public void addOcorrenciasOscilacaoNeg(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg vOcorrenciasOscilacaoNeg)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasOscilacaoNegList.addElement(vOcorrenciasOscilacaoNeg);
    } //-- void addOcorrenciasOscilacaoNeg(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg) 

    /**
     * Method addOcorrenciasOscilacaoNeg
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasOscilacaoNeg
     */
    public void addOcorrenciasOscilacaoNeg(int index, br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg vOcorrenciasOscilacaoNeg)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasOscilacaoNegList.insertElementAt(vOcorrenciasOscilacaoNeg, index);
    } //-- void addOcorrenciasOscilacaoNeg(int, br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg) 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteQtdeRegistro
     * 
     */
    public void deleteQtdeRegistro()
    {
        this._has_qtdeRegistro= false;
    } //-- void deleteQtdeRegistro() 

    /**
     * Method enumerateOcorrenciasOscilacaoNeg
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrenciasOscilacaoNeg()
    {
        return _ocorrenciasOscilacaoNegList.elements();
    } //-- java.util.Enumeration enumerateOcorrenciasOscilacaoNeg() 

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
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codUF'.
     * 
     * @return String
     * @return the value of field 'codUF'.
     */
    public java.lang.String getCodUF()
    {
        return this._codUF;
    } //-- java.lang.String getCodUF() 

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
     * Returns the value of field 'descUF'.
     * 
     * @return String
     * @return the value of field 'descUF'.
     */
    public java.lang.String getDescUF()
    {
        return this._descUF;
    } //-- java.lang.String getDescUF() 

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
     * Method getOcorrenciasOscilacaoNeg
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasOscilacaoNeg
     */
    public br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg getOcorrenciasOscilacaoNeg(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasOscilacaoNegList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasOscilacaoNeg: Index value '"+index+"' not in range [0.."+(_ocorrenciasOscilacaoNegList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg) _ocorrenciasOscilacaoNegList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg getOcorrenciasOscilacaoNeg(int) 

    /**
     * Method getOcorrenciasOscilacaoNeg
     * 
     * 
     * 
     * @return OcorrenciasOscilacaoNeg
     */
    public br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg[] getOcorrenciasOscilacaoNeg()
    {
        int size = _ocorrenciasOscilacaoNegList.size();
        br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg[] mArray = new br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg) _ocorrenciasOscilacaoNegList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg[] getOcorrenciasOscilacaoNeg() 

    /**
     * Method getOcorrenciasOscilacaoNegCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasOscilacaoNegCount()
    {
        return _ocorrenciasOscilacaoNegList.size();
    } //-- int getOcorrenciasOscilacaoNegCount() 

    /**
     * Returns the value of field 'qtdeRegistro'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistro'.
     */
    public int getQtdeRegistro()
    {
        return this._qtdeRegistro;
    } //-- int getQtdeRegistro() 

    /**
     * Returns the value of field 'sinalAnteriorTotal'.
     * 
     * @return String
     * @return the value of field 'sinalAnteriorTotal'.
     */
    public java.lang.String getSinalAnteriorTotal()
    {
        return this._sinalAnteriorTotal;
    } //-- java.lang.String getSinalAnteriorTotal() 

    /**
     * Returns the value of field 'sinalAtualTotal'.
     * 
     * @return String
     * @return the value of field 'sinalAtualTotal'.
     */
    public java.lang.String getSinalAtualTotal()
    {
        return this._sinalAtualTotal;
    } //-- java.lang.String getSinalAtualTotal() 

    /**
     * Returns the value of field 'sinalOscilacaoTotal'.
     * 
     * @return String
     * @return the value of field 'sinalOscilacaoTotal'.
     */
    public java.lang.String getSinalOscilacaoTotal()
    {
        return this._sinalOscilacaoTotal;
    } //-- java.lang.String getSinalOscilacaoTotal() 

    /**
     * Returns the value of field 'sinalTotalAgencia'.
     * 
     * @return String
     * @return the value of field 'sinalTotalAgencia'.
     */
    public java.lang.String getSinalTotalAgencia()
    {
        return this._sinalTotalAgencia;
    } //-- java.lang.String getSinalTotalAgencia() 

    /**
     * Returns the value of field 'sinalTotalPa'.
     * 
     * @return String
     * @return the value of field 'sinalTotalPa'.
     */
    public java.lang.String getSinalTotalPa()
    {
        return this._sinalTotalPa;
    } //-- java.lang.String getSinalTotalPa() 

    /**
     * Returns the value of field 'valorAnteriorTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorAnteriorTotal'.
     */
    public java.math.BigDecimal getValorAnteriorTotal()
    {
        return this._valorAnteriorTotal;
    } //-- java.math.BigDecimal getValorAnteriorTotal() 

    /**
     * Returns the value of field 'valorAtualTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorAtualTotal'.
     */
    public java.math.BigDecimal getValorAtualTotal()
    {
        return this._valorAtualTotal;
    } //-- java.math.BigDecimal getValorAtualTotal() 

    /**
     * Returns the value of field 'valorOscilacaoTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorOscilacaoTotal'.
     */
    public java.math.BigDecimal getValorOscilacaoTotal()
    {
        return this._valorOscilacaoTotal;
    } //-- java.math.BigDecimal getValorOscilacaoTotal() 

    /**
     * Returns the value of field 'valorTotalAgencia'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalAgencia'.
     */
    public java.math.BigDecimal getValorTotalAgencia()
    {
        return this._valorTotalAgencia;
    } //-- java.math.BigDecimal getValorTotalAgencia() 

    /**
     * Returns the value of field 'valorTotalPa'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalPa'.
     */
    public java.math.BigDecimal getValorTotalPa()
    {
        return this._valorTotalPa;
    } //-- java.math.BigDecimal getValorTotalPa() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasQtdeRegistro
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistro()
    {
        return this._has_qtdeRegistro;
    } //-- boolean hasQtdeRegistro() 

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
     * Method removeAllOcorrenciasOscilacaoNeg
     * 
     */
    public void removeAllOcorrenciasOscilacaoNeg()
    {
        _ocorrenciasOscilacaoNegList.removeAllElements();
    } //-- void removeAllOcorrenciasOscilacaoNeg() 

    /**
     * Method removeOcorrenciasOscilacaoNeg
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasOscilacaoNeg
     */
    public br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg removeOcorrenciasOscilacaoNeg(int index)
    {
        java.lang.Object obj = _ocorrenciasOscilacaoNegList.elementAt(index);
        _ocorrenciasOscilacaoNegList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg removeOcorrenciasOscilacaoNeg(int) 

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
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codUF'.
     * 
     * @param codUF the value of field 'codUF'.
     */
    public void setCodUF(java.lang.String codUF)
    {
        this._codUF = codUF;
    } //-- void setCodUF(java.lang.String) 

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
     * Sets the value of field 'descUF'.
     * 
     * @param descUF the value of field 'descUF'.
     */
    public void setDescUF(java.lang.String descUF)
    {
        this._descUF = descUF;
    } //-- void setDescUF(java.lang.String) 

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
     * Method setOcorrenciasOscilacaoNeg
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasOscilacaoNeg
     */
    public void setOcorrenciasOscilacaoNeg(int index, br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg vOcorrenciasOscilacaoNeg)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasOscilacaoNegList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasOscilacaoNeg: Index value '"+index+"' not in range [0.." + (_ocorrenciasOscilacaoNegList.size() - 1) + "]");
        }
        _ocorrenciasOscilacaoNegList.setElementAt(vOcorrenciasOscilacaoNeg, index);
    } //-- void setOcorrenciasOscilacaoNeg(int, br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg) 

    /**
     * Method setOcorrenciasOscilacaoNeg
     * 
     * 
     * 
     * @param ocorrenciasOscilacaoNegArray
     */
    public void setOcorrenciasOscilacaoNeg(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg[] ocorrenciasOscilacaoNegArray)
    {
        //-- copy array
        _ocorrenciasOscilacaoNegList.removeAllElements();
        for (int i = 0; i < ocorrenciasOscilacaoNegArray.length; i++) {
            _ocorrenciasOscilacaoNegList.addElement(ocorrenciasOscilacaoNegArray[i]);
        }
    } //-- void setOcorrenciasOscilacaoNeg(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.OcorrenciasOscilacaoNeg) 

    /**
     * Sets the value of field 'qtdeRegistro'.
     * 
     * @param qtdeRegistro the value of field 'qtdeRegistro'.
     */
    public void setQtdeRegistro(int qtdeRegistro)
    {
        this._qtdeRegistro = qtdeRegistro;
        this._has_qtdeRegistro = true;
    } //-- void setQtdeRegistro(int) 

    /**
     * Sets the value of field 'sinalAnteriorTotal'.
     * 
     * @param sinalAnteriorTotal the value of field
     * 'sinalAnteriorTotal'.
     */
    public void setSinalAnteriorTotal(java.lang.String sinalAnteriorTotal)
    {
        this._sinalAnteriorTotal = sinalAnteriorTotal;
    } //-- void setSinalAnteriorTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalAtualTotal'.
     * 
     * @param sinalAtualTotal the value of field 'sinalAtualTotal'.
     */
    public void setSinalAtualTotal(java.lang.String sinalAtualTotal)
    {
        this._sinalAtualTotal = sinalAtualTotal;
    } //-- void setSinalAtualTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalOscilacaoTotal'.
     * 
     * @param sinalOscilacaoTotal the value of field
     * 'sinalOscilacaoTotal'.
     */
    public void setSinalOscilacaoTotal(java.lang.String sinalOscilacaoTotal)
    {
        this._sinalOscilacaoTotal = sinalOscilacaoTotal;
    } //-- void setSinalOscilacaoTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalTotalAgencia'.
     * 
     * @param sinalTotalAgencia the value of field
     * 'sinalTotalAgencia'.
     */
    public void setSinalTotalAgencia(java.lang.String sinalTotalAgencia)
    {
        this._sinalTotalAgencia = sinalTotalAgencia;
    } //-- void setSinalTotalAgencia(java.lang.String) 

    /**
     * Sets the value of field 'sinalTotalPa'.
     * 
     * @param sinalTotalPa the value of field 'sinalTotalPa'.
     */
    public void setSinalTotalPa(java.lang.String sinalTotalPa)
    {
        this._sinalTotalPa = sinalTotalPa;
    } //-- void setSinalTotalPa(java.lang.String) 

    /**
     * Sets the value of field 'valorAnteriorTotal'.
     * 
     * @param valorAnteriorTotal the value of field
     * 'valorAnteriorTotal'.
     */
    public void setValorAnteriorTotal(java.math.BigDecimal valorAnteriorTotal)
    {
        this._valorAnteriorTotal = valorAnteriorTotal;
    } //-- void setValorAnteriorTotal(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorAtualTotal'.
     * 
     * @param valorAtualTotal the value of field 'valorAtualTotal'.
     */
    public void setValorAtualTotal(java.math.BigDecimal valorAtualTotal)
    {
        this._valorAtualTotal = valorAtualTotal;
    } //-- void setValorAtualTotal(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorOscilacaoTotal'.
     * 
     * @param valorOscilacaoTotal the value of field
     * 'valorOscilacaoTotal'.
     */
    public void setValorOscilacaoTotal(java.math.BigDecimal valorOscilacaoTotal)
    {
        this._valorOscilacaoTotal = valorOscilacaoTotal;
    } //-- void setValorOscilacaoTotal(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalAgencia'.
     * 
     * @param valorTotalAgencia the value of field
     * 'valorTotalAgencia'.
     */
    public void setValorTotalAgencia(java.math.BigDecimal valorTotalAgencia)
    {
        this._valorTotalAgencia = valorTotalAgencia;
    } //-- void setValorTotalAgencia(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalPa'.
     * 
     * @param valorTotalPa the value of field 'valorTotalPa'.
     */
    public void setValorTotalPa(java.math.BigDecimal valorTotalPa)
    {
        this._valorTotalPa = valorTotalPa;
    } //-- void setValorTotalPa(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ResultadoPesquisaOscilacaoNegativaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.ResultadoPesquisaOscilacaoNegativaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.ResultadoPesquisaOscilacaoNegativaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.ResultadoPesquisaOscilacaoNegativaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.response.ResultadoPesquisaOscilacaoNegativaResponse unmarshal(java.io.Reader) 

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
