/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarValoresMesTotalResponse.java,v 1.6 2018/03/12 11:23:57 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response;

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
 * Class ListarValoresMesTotalResponse.
 * 
 * @version $Revision: 1.6 $ $Date: 2018/03/12 11:23:57 $
 */
public class ListarValoresMesTotalResponse implements java.io.Serializable {


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
     * Field _nroConsultas
     */
    private int _nroConsultas = 0;

    /**
     * keeps track of state for field: _nroConsultas
     */
    private boolean _has_nroConsultas;

    /**
     * Field _receitaTotalSinal
     */
    private java.lang.String _receitaTotalSinal;

    /**
     * Field _receitaTotalValor
     */
    private java.math.BigDecimal _receitaTotalValor = new java.math.BigDecimal("0");

    /**
     * Field _issTotalSinal
     */
    private java.lang.String _issTotalSinal;

    /**
     * Field _issTotalValor
     */
    private java.math.BigDecimal _issTotalValor = new java.math.BigDecimal("0");

    /**
     * Field _ocorrenciasList
     */
    private java.util.Vector _ocorrenciasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarValoresMesTotalResponse() 
     {
        super();
        setReceitaTotalValor(new java.math.BigDecimal("0"));
        setIssTotalValor(new java.math.BigDecimal("0"));
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.ListarValoresMesTotalResponse()


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
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias) 

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
     * Returns the value of field 'issTotalSinal'.
     * 
     * @return String
     * @return the value of field 'issTotalSinal'.
     */
    public java.lang.String getIssTotalSinal()
    {
        return this._issTotalSinal;
    } //-- java.lang.String getIssTotalSinal() 

    /**
     * Returns the value of field 'issTotalValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'issTotalValor'.
     */
    public java.math.BigDecimal getIssTotalValor()
    {
        return this._issTotalValor;
    } //-- java.math.BigDecimal getIssTotalValor() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias[] getOcorrencias() 

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
     * Returns the value of field 'receitaTotalSinal'.
     * 
     * @return String
     * @return the value of field 'receitaTotalSinal'.
     */
    public java.lang.String getReceitaTotalSinal()
    {
        return this._receitaTotalSinal;
    } //-- java.lang.String getReceitaTotalSinal() 

    /**
     * Returns the value of field 'receitaTotalValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'receitaTotalValor'.
     */
    public java.math.BigDecimal getReceitaTotalValor()
    {
        return this._receitaTotalValor;
    } //-- java.math.BigDecimal getReceitaTotalValor() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias removeOcorrencias(int) 

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
     * Sets the value of field 'issTotalSinal'.
     * 
     * @param issTotalSinal the value of field 'issTotalSinal'.
     */
    public void setIssTotalSinal(java.lang.String issTotalSinal)
    {
        this._issTotalSinal = issTotalSinal;
    } //-- void setIssTotalSinal(java.lang.String) 

    /**
     * Sets the value of field 'issTotalValor'.
     * 
     * @param issTotalValor the value of field 'issTotalValor'.
     */
    public void setIssTotalValor(java.math.BigDecimal issTotalValor)
    {
        this._issTotalValor = issTotalValor;
    } //-- void setIssTotalValor(java.math.BigDecimal) 

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
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Ocorrencias) 

    /**
     * Sets the value of field 'receitaTotalSinal'.
     * 
     * @param receitaTotalSinal the value of field
     * 'receitaTotalSinal'.
     */
    public void setReceitaTotalSinal(java.lang.String receitaTotalSinal)
    {
        this._receitaTotalSinal = receitaTotalSinal;
    } //-- void setReceitaTotalSinal(java.lang.String) 

    /**
     * Sets the value of field 'receitaTotalValor'.
     * 
     * @param receitaTotalValor the value of field
     * 'receitaTotalValor'.
     */
    public void setReceitaTotalValor(java.math.BigDecimal receitaTotalValor)
    {
        this._receitaTotalValor = receitaTotalValor;
    } //-- void setReceitaTotalValor(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarValoresMesTotalResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.ListarValoresMesTotalResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.ListarValoresMesTotalResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.ListarValoresMesTotalResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.ListarValoresMesTotalResponse unmarshal(java.io.Reader) 

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
