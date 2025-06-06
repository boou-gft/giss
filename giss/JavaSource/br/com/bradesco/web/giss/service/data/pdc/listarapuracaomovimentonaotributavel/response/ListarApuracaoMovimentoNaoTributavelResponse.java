/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response;

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
 * Class ListarApuracaoMovimentoNaoTributavelResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarApuracaoMovimentoNaoTributavelResponse implements java.io.Serializable {


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
     * Field _baseCalculo
     */
    private double _baseCalculo = 0;

    /**
     * keeps track of state for field: _baseCalculo
     */
    private boolean _has_baseCalculo;

    /**
     * Field _aliquotaPadrao
     */
    private double _aliquotaPadrao = 0;

    /**
     * keeps track of state for field: _aliquotaPadrao
     */
    private boolean _has_aliquotaPadrao;

    /**
     * Field _tipoIncidencia
     */
    private java.lang.String _tipoIncidencia;

    /**
     * Field _sinalTotalMovimento
     */
    private java.lang.String _sinalTotalMovimento;

    /**
     * Field _valorTotalMovimento
     */
    private double _valorTotalMovimento = 0;

    /**
     * keeps track of state for field: _valorTotalMovimento
     */
    private boolean _has_valorTotalMovimento;

    /**
     * Field _sinalTotalReceita
     */
    private java.lang.String _sinalTotalReceita;

    /**
     * Field _valorTotalReceita
     */
    private double _valorTotalReceita = 0;

    /**
     * keeps track of state for field: _valorTotalReceita
     */
    private boolean _has_valorTotalReceita;

    /**
     * Field _ocorrenciasList
     */
    private java.util.Vector _ocorrenciasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoMovimentoNaoTributavelResponse() 
     {
        super();
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.ListarApuracaoMovimentoNaoTributavelResponse()


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
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 100)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 100");
        }
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 100)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 100");
        }
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias) 

    /**
     * Method deleteAliquotaPadrao
     * 
     */
    public void deleteAliquotaPadrao()
    {
        this._has_aliquotaPadrao= false;
    } //-- void deleteAliquotaPadrao() 

    /**
     * Method deleteBaseCalculo
     * 
     */
    public void deleteBaseCalculo()
    {
        this._has_baseCalculo= false;
    } //-- void deleteBaseCalculo() 

    /**
     * Method deleteNumeroConsultas
     * 
     */
    public void deleteNumeroConsultas()
    {
        this._has_numeroConsultas= false;
    } //-- void deleteNumeroConsultas() 

    /**
     * Method deleteValorTotalMovimento
     * 
     */
    public void deleteValorTotalMovimento()
    {
        this._has_valorTotalMovimento= false;
    } //-- void deleteValorTotalMovimento() 

    /**
     * Method deleteValorTotalReceita
     * 
     */
    public void deleteValorTotalReceita()
    {
        this._has_valorTotalReceita= false;
    } //-- void deleteValorTotalReceita() 

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
     * Returns the value of field 'aliquotaPadrao'.
     * 
     * @return double
     * @return the value of field 'aliquotaPadrao'.
     */
    public double getAliquotaPadrao()
    {
        return this._aliquotaPadrao;
    } //-- double getAliquotaPadrao() 

    /**
     * Returns the value of field 'baseCalculo'.
     * 
     * @return double
     * @return the value of field 'baseCalculo'.
     */
    public double getBaseCalculo()
    {
        return this._baseCalculo;
    } //-- double getBaseCalculo() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias[] getOcorrencias() 

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
     * Returns the value of field 'sinalTotalMovimento'.
     * 
     * @return String
     * @return the value of field 'sinalTotalMovimento'.
     */
    public java.lang.String getSinalTotalMovimento()
    {
        return this._sinalTotalMovimento;
    } //-- java.lang.String getSinalTotalMovimento() 

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
     * Returns the value of field 'tipoIncidencia'.
     * 
     * @return String
     * @return the value of field 'tipoIncidencia'.
     */
    public java.lang.String getTipoIncidencia()
    {
        return this._tipoIncidencia;
    } //-- java.lang.String getTipoIncidencia() 

    /**
     * Returns the value of field 'valorTotalMovimento'.
     * 
     * @return double
     * @return the value of field 'valorTotalMovimento'.
     */
    public double getValorTotalMovimento()
    {
        return this._valorTotalMovimento;
    } //-- double getValorTotalMovimento() 

    /**
     * Returns the value of field 'valorTotalReceita'.
     * 
     * @return double
     * @return the value of field 'valorTotalReceita'.
     */
    public double getValorTotalReceita()
    {
        return this._valorTotalReceita;
    } //-- double getValorTotalReceita() 

    /**
     * Method hasAliquotaPadrao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAliquotaPadrao()
    {
        return this._has_aliquotaPadrao;
    } //-- boolean hasAliquotaPadrao() 

    /**
     * Method hasBaseCalculo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasBaseCalculo()
    {
        return this._has_baseCalculo;
    } //-- boolean hasBaseCalculo() 

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
     * Method hasValorTotalMovimento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTotalMovimento()
    {
        return this._has_valorTotalMovimento;
    } //-- boolean hasValorTotalMovimento() 

    /**
     * Method hasValorTotalReceita
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTotalReceita()
    {
        return this._has_valorTotalReceita;
    } //-- boolean hasValorTotalReceita() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias removeOcorrencias(int) 

    /**
     * Sets the value of field 'aliquotaPadrao'.
     * 
     * @param aliquotaPadrao the value of field 'aliquotaPadrao'.
     */
    public void setAliquotaPadrao(double aliquotaPadrao)
    {
        this._aliquotaPadrao = aliquotaPadrao;
        this._has_aliquotaPadrao = true;
    } //-- void setAliquotaPadrao(double) 

    /**
     * Sets the value of field 'baseCalculo'.
     * 
     * @param baseCalculo the value of field 'baseCalculo'.
     */
    public void setBaseCalculo(double baseCalculo)
    {
        this._baseCalculo = baseCalculo;
        this._has_baseCalculo = true;
    } //-- void setBaseCalculo(double) 

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
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setOcorrencias has a maximum of 100");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias) 

    /**
     * Sets the value of field 'sinalTotalMovimento'.
     * 
     * @param sinalTotalMovimento the value of field
     * 'sinalTotalMovimento'.
     */
    public void setSinalTotalMovimento(java.lang.String sinalTotalMovimento)
    {
        this._sinalTotalMovimento = sinalTotalMovimento;
    } //-- void setSinalTotalMovimento(java.lang.String) 

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
     * Sets the value of field 'tipoIncidencia'.
     * 
     * @param tipoIncidencia the value of field 'tipoIncidencia'.
     */
    public void setTipoIncidencia(java.lang.String tipoIncidencia)
    {
        this._tipoIncidencia = tipoIncidencia;
    } //-- void setTipoIncidencia(java.lang.String) 

    /**
     * Sets the value of field 'valorTotalMovimento'.
     * 
     * @param valorTotalMovimento the value of field
     * 'valorTotalMovimento'.
     */
    public void setValorTotalMovimento(double valorTotalMovimento)
    {
        this._valorTotalMovimento = valorTotalMovimento;
        this._has_valorTotalMovimento = true;
    } //-- void setValorTotalMovimento(double) 

    /**
     * Sets the value of field 'valorTotalReceita'.
     * 
     * @param valorTotalReceita the value of field
     * 'valorTotalReceita'.
     */
    public void setValorTotalReceita(double valorTotalReceita)
    {
        this._valorTotalReceita = valorTotalReceita;
        this._has_valorTotalReceita = true;
    } //-- void setValorTotalReceita(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarApuracaoMovimentoNaoTributavelResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.ListarApuracaoMovimentoNaoTributavelResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.ListarApuracaoMovimentoNaoTributavelResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.ListarApuracaoMovimentoNaoTributavelResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.ListarApuracaoMovimentoNaoTributavelResponse unmarshal(java.io.Reader) 

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
