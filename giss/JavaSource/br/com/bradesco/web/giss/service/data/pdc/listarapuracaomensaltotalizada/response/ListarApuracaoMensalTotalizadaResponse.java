/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response;

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
 * Class ListarApuracaoMensalTotalizadaResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarApuracaoMensalTotalizadaResponse implements java.io.Serializable {


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
     * Field _baseCalculo
     */
    private double _baseCalculo = 0;

    /**
     * keeps track of state for field: _baseCalculo
     */
    private boolean _has_baseCalculo;

    /**
     * Field _percAliquotaPadrao
     */
    private double _percAliquotaPadrao = 0;

    /**
     * keeps track of state for field: _percAliquotaPadrao
     */
    private boolean _has_percAliquotaPadrao;

    /**
     * Field _nomeTipoIncidencia
     */
    private java.lang.String _nomeTipoIncidencia;

    /**
     * Field _nroConsultas
     */
    private int _nroConsultas = 0;

    /**
     * keeps track of state for field: _nroConsultas
     */
    private boolean _has_nroConsultas;

    /**
     * Field _movtoReceitaApuracaoTotalSinal
     */
    private java.lang.String _movtoReceitaApuracaoTotalSinal;

    /**
     * Field _movtoReceitaApuracaoTotalValor
     */
    private double _movtoReceitaApuracaoTotalValor = 0;

    /**
     * keeps track of state for field:
     * _movtoReceitaApuracaoTotalValor
     */
    private boolean _has_movtoReceitaApuracaoTotalValor;

    /**
     * Field _movtoReceitaTributavelTotalSinal
     */
    private java.lang.String _movtoReceitaTributavelTotalSinal;

    /**
     * Field _movtoReceitaTributavelTotalValor
     */
    private double _movtoReceitaTributavelTotalValor = 0;

    /**
     * keeps track of state for field:
     * _movtoReceitaTributavelTotalValor
     */
    private boolean _has_movtoReceitaTributavelTotalValor;

    /**
     * Field _tributoApurcaoTotalSinal
     */
    private java.lang.String _tributoApurcaoTotalSinal;

    /**
     * Field _tributoApurcaoTotalValor
     */
    private double _tributoApurcaoTotalValor = 0;

    /**
     * keeps track of state for field: _tributoApurcaoTotalValor
     */
    private boolean _has_tributoApurcaoTotalValor;

    /**
     * Field _ocorrenciasList
     */
    private java.util.Vector _ocorrenciasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoMensalTotalizadaResponse() 
     {
        super();
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.ListarApuracaoMensalTotalizadaResponse()


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
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 250)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 250");
        }
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 250)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 250");
        }
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias) 

    /**
     * Method deleteBaseCalculo
     * 
     */
    public void deleteBaseCalculo()
    {
        this._has_baseCalculo= false;
    } //-- void deleteBaseCalculo() 

    /**
     * Method deleteMovtoReceitaApuracaoTotalValor
     * 
     */
    public void deleteMovtoReceitaApuracaoTotalValor()
    {
        this._has_movtoReceitaApuracaoTotalValor= false;
    } //-- void deleteMovtoReceitaApuracaoTotalValor() 

    /**
     * Method deleteMovtoReceitaTributavelTotalValor
     * 
     */
    public void deleteMovtoReceitaTributavelTotalValor()
    {
        this._has_movtoReceitaTributavelTotalValor= false;
    } //-- void deleteMovtoReceitaTributavelTotalValor() 

    /**
     * Method deleteNroConsultas
     * 
     */
    public void deleteNroConsultas()
    {
        this._has_nroConsultas= false;
    } //-- void deleteNroConsultas() 

    /**
     * Method deletePercAliquotaPadrao
     * 
     */
    public void deletePercAliquotaPadrao()
    {
        this._has_percAliquotaPadrao= false;
    } //-- void deletePercAliquotaPadrao() 

    /**
     * Method deleteTributoApurcaoTotalValor
     * 
     */
    public void deleteTributoApurcaoTotalValor()
    {
        this._has_tributoApurcaoTotalValor= false;
    } //-- void deleteTributoApurcaoTotalValor() 

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
     * Returns the value of field 'movtoReceitaApuracaoTotalSinal'.
     * 
     * @return String
     * @return the value of field 'movtoReceitaApuracaoTotalSinal'.
     */
    public java.lang.String getMovtoReceitaApuracaoTotalSinal()
    {
        return this._movtoReceitaApuracaoTotalSinal;
    } //-- java.lang.String getMovtoReceitaApuracaoTotalSinal() 

    /**
     * Returns the value of field 'movtoReceitaApuracaoTotalValor'.
     * 
     * @return double
     * @return the value of field 'movtoReceitaApuracaoTotalValor'.
     */
    public double getMovtoReceitaApuracaoTotalValor()
    {
        return this._movtoReceitaApuracaoTotalValor;
    } //-- double getMovtoReceitaApuracaoTotalValor() 

    /**
     * Returns the value of field
     * 'movtoReceitaTributavelTotalSinal'.
     * 
     * @return String
     * @return the value of field 'movtoReceitaTributavelTotalSinal'
     */
    public java.lang.String getMovtoReceitaTributavelTotalSinal()
    {
        return this._movtoReceitaTributavelTotalSinal;
    } //-- java.lang.String getMovtoReceitaTributavelTotalSinal() 

    /**
     * Returns the value of field
     * 'movtoReceitaTributavelTotalValor'.
     * 
     * @return double
     * @return the value of field 'movtoReceitaTributavelTotalValor'
     */
    public double getMovtoReceitaTributavelTotalValor()
    {
        return this._movtoReceitaTributavelTotalValor;
    } //-- double getMovtoReceitaTributavelTotalValor() 

    /**
     * Returns the value of field 'nomeTipoIncidencia'.
     * 
     * @return String
     * @return the value of field 'nomeTipoIncidencia'.
     */
    public java.lang.String getNomeTipoIncidencia()
    {
        return this._nomeTipoIncidencia;
    } //-- java.lang.String getNomeTipoIncidencia() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias[] getOcorrencias() 

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
     * Returns the value of field 'percAliquotaPadrao'.
     * 
     * @return double
     * @return the value of field 'percAliquotaPadrao'.
     */
    public double getPercAliquotaPadrao()
    {
        return this._percAliquotaPadrao;
    } //-- double getPercAliquotaPadrao() 

    /**
     * Returns the value of field 'tributoApurcaoTotalSinal'.
     * 
     * @return String
     * @return the value of field 'tributoApurcaoTotalSinal'.
     */
    public java.lang.String getTributoApurcaoTotalSinal()
    {
        return this._tributoApurcaoTotalSinal;
    } //-- java.lang.String getTributoApurcaoTotalSinal() 

    /**
     * Returns the value of field 'tributoApurcaoTotalValor'.
     * 
     * @return double
     * @return the value of field 'tributoApurcaoTotalValor'.
     */
    public double getTributoApurcaoTotalValor()
    {
        return this._tributoApurcaoTotalValor;
    } //-- double getTributoApurcaoTotalValor() 

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
     * Method hasMovtoReceitaApuracaoTotalValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMovtoReceitaApuracaoTotalValor()
    {
        return this._has_movtoReceitaApuracaoTotalValor;
    } //-- boolean hasMovtoReceitaApuracaoTotalValor() 

    /**
     * Method hasMovtoReceitaTributavelTotalValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMovtoReceitaTributavelTotalValor()
    {
        return this._has_movtoReceitaTributavelTotalValor;
    } //-- boolean hasMovtoReceitaTributavelTotalValor() 

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
     * Method hasPercAliquotaPadrao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPercAliquotaPadrao()
    {
        return this._has_percAliquotaPadrao;
    } //-- boolean hasPercAliquotaPadrao() 

    /**
     * Method hasTributoApurcaoTotalValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTributoApurcaoTotalValor()
    {
        return this._has_tributoApurcaoTotalValor;
    } //-- boolean hasTributoApurcaoTotalValor() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias removeOcorrencias(int) 

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
     * Sets the value of field 'movtoReceitaApuracaoTotalSinal'.
     * 
     * @param movtoReceitaApuracaoTotalSinal the value of field
     * 'movtoReceitaApuracaoTotalSinal'.
     */
    public void setMovtoReceitaApuracaoTotalSinal(java.lang.String movtoReceitaApuracaoTotalSinal)
    {
        this._movtoReceitaApuracaoTotalSinal = movtoReceitaApuracaoTotalSinal;
    } //-- void setMovtoReceitaApuracaoTotalSinal(java.lang.String) 

    /**
     * Sets the value of field 'movtoReceitaApuracaoTotalValor'.
     * 
     * @param movtoReceitaApuracaoTotalValor the value of field
     * 'movtoReceitaApuracaoTotalValor'.
     */
    public void setMovtoReceitaApuracaoTotalValor(double movtoReceitaApuracaoTotalValor)
    {
        this._movtoReceitaApuracaoTotalValor = movtoReceitaApuracaoTotalValor;
        this._has_movtoReceitaApuracaoTotalValor = true;
    } //-- void setMovtoReceitaApuracaoTotalValor(double) 

    /**
     * Sets the value of field 'movtoReceitaTributavelTotalSinal'.
     * 
     * @param movtoReceitaTributavelTotalSinal the value of field
     * 'movtoReceitaTributavelTotalSinal'.
     */
    public void setMovtoReceitaTributavelTotalSinal(java.lang.String movtoReceitaTributavelTotalSinal)
    {
        this._movtoReceitaTributavelTotalSinal = movtoReceitaTributavelTotalSinal;
    } //-- void setMovtoReceitaTributavelTotalSinal(java.lang.String) 

    /**
     * Sets the value of field 'movtoReceitaTributavelTotalValor'.
     * 
     * @param movtoReceitaTributavelTotalValor the value of field
     * 'movtoReceitaTributavelTotalValor'.
     */
    public void setMovtoReceitaTributavelTotalValor(double movtoReceitaTributavelTotalValor)
    {
        this._movtoReceitaTributavelTotalValor = movtoReceitaTributavelTotalValor;
        this._has_movtoReceitaTributavelTotalValor = true;
    } //-- void setMovtoReceitaTributavelTotalValor(double) 

    /**
     * Sets the value of field 'nomeTipoIncidencia'.
     * 
     * @param nomeTipoIncidencia the value of field
     * 'nomeTipoIncidencia'.
     */
    public void setNomeTipoIncidencia(java.lang.String nomeTipoIncidencia)
    {
        this._nomeTipoIncidencia = nomeTipoIncidencia;
    } //-- void setNomeTipoIncidencia(java.lang.String) 

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
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias vOcorrencias)
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
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias) 

    /**
     * Sets the value of field 'percAliquotaPadrao'.
     * 
     * @param percAliquotaPadrao the value of field
     * 'percAliquotaPadrao'.
     */
    public void setPercAliquotaPadrao(double percAliquotaPadrao)
    {
        this._percAliquotaPadrao = percAliquotaPadrao;
        this._has_percAliquotaPadrao = true;
    } //-- void setPercAliquotaPadrao(double) 

    /**
     * Sets the value of field 'tributoApurcaoTotalSinal'.
     * 
     * @param tributoApurcaoTotalSinal the value of field
     * 'tributoApurcaoTotalSinal'.
     */
    public void setTributoApurcaoTotalSinal(java.lang.String tributoApurcaoTotalSinal)
    {
        this._tributoApurcaoTotalSinal = tributoApurcaoTotalSinal;
    } //-- void setTributoApurcaoTotalSinal(java.lang.String) 

    /**
     * Sets the value of field 'tributoApurcaoTotalValor'.
     * 
     * @param tributoApurcaoTotalValor the value of field
     * 'tributoApurcaoTotalValor'.
     */
    public void setTributoApurcaoTotalValor(double tributoApurcaoTotalValor)
    {
        this._tributoApurcaoTotalValor = tributoApurcaoTotalValor;
        this._has_tributoApurcaoTotalValor = true;
    } //-- void setTributoApurcaoTotalValor(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarApuracaoMensalTotalizadaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.ListarApuracaoMensalTotalizadaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.ListarApuracaoMensalTotalizadaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.ListarApuracaoMensalTotalizadaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.ListarApuracaoMensalTotalizadaResponse unmarshal(java.io.Reader) 

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
