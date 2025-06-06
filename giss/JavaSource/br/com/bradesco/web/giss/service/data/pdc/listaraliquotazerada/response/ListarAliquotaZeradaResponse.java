/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarAliquotaZeradaResponse.java,v 1.3 2017/07/28 19:14:40 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response;

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
 * Class ListarAliquotaZeradaResponse.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/07/28 19:14:40 $
 */
public class ListarAliquotaZeradaResponse implements java.io.Serializable {


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
     * Field _receitaApuracaoTotalSinal
     */
    private java.lang.String _receitaApuracaoTotalSinal;

    /**
     * Field _receitaApuracaoTotalValor
     */
    private java.math.BigDecimal _receitaApuracaoTotalValor = new java.math.BigDecimal("0");

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

    public ListarAliquotaZeradaResponse() 
     {
        super();
        setReceitaApuracaoTotalValor(new java.math.BigDecimal("0"));
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.ListarAliquotaZeradaResponse()


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
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 250)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 250");
        }
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 250)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 250");
        }
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias) 

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
    public br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias[] getOcorrencias() 

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
     * Returns the value of field 'receitaApuracaoTotalSinal'.
     * 
     * @return String
     * @return the value of field 'receitaApuracaoTotalSinal'.
     */
    public java.lang.String getReceitaApuracaoTotalSinal()
    {
        return this._receitaApuracaoTotalSinal;
    } //-- java.lang.String getReceitaApuracaoTotalSinal() 

    /**
     * Returns the value of field 'receitaApuracaoTotalValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'receitaApuracaoTotalValor'.
     */
    public java.math.BigDecimal getReceitaApuracaoTotalValor()
    {
        return this._receitaApuracaoTotalValor;
    } //-- java.math.BigDecimal getReceitaApuracaoTotalValor() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias removeOcorrencias(int) 

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
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        if (!(index < 250)) {
            throw new IndexOutOfBoundsException("setOcorrencias has a maximum of 250");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias) 

    /**
     * Sets the value of field 'receitaApuracaoTotalSinal'.
     * 
     * @param receitaApuracaoTotalSinal the value of field
     * 'receitaApuracaoTotalSinal'.
     */
    public void setReceitaApuracaoTotalSinal(java.lang.String receitaApuracaoTotalSinal)
    {
        this._receitaApuracaoTotalSinal = receitaApuracaoTotalSinal;
    } //-- void setReceitaApuracaoTotalSinal(java.lang.String) 

    /**
     * Sets the value of field 'receitaApuracaoTotalValor'.
     * 
     * @param receitaApuracaoTotalValor the value of field
     * 'receitaApuracaoTotalValor'.
     */
    public void setReceitaApuracaoTotalValor(java.math.BigDecimal receitaApuracaoTotalValor)
    {
        this._receitaApuracaoTotalValor = receitaApuracaoTotalValor;
    } //-- void setReceitaApuracaoTotalValor(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarAliquotaZeradaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.ListarAliquotaZeradaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.ListarAliquotaZeradaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.ListarAliquotaZeradaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.ListarAliquotaZeradaResponse unmarshal(java.io.Reader) 

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
