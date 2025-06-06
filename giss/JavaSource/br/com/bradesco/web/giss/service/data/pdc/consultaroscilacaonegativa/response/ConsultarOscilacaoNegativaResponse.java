/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response;

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
 * Class ConsultarOscilacaoNegativaResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarOscilacaoNegativaResponse implements java.io.Serializable {


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
     * Field _totalAnteriorSinal
     */
    private java.lang.String _totalAnteriorSinal;

    /**
     * Field _totalAnteriorValor
     */
    private double _totalAnteriorValor = 0;

    /**
     * keeps track of state for field: _totalAnteriorValor
     */
    private boolean _has_totalAnteriorValor;

    /**
     * Field _totalAtualSinal
     */
    private java.lang.String _totalAtualSinal;

    /**
     * Field _totalAtualValor
     */
    private double _totalAtualValor = 0;

    /**
     * keeps track of state for field: _totalAtualValor
     */
    private boolean _has_totalAtualValor;

    /**
     * Field _totalOscilacaoSinal
     */
    private java.lang.String _totalOscilacaoSinal;

    /**
     * Field _totalOscilacaoValor
     */
    private double _totalOscilacaoValor = 0;

    /**
     * keeps track of state for field: _totalOscilacaoValor
     */
    private boolean _has_totalOscilacaoValor;

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

    public ConsultarOscilacaoNegativaResponse() 
     {
        super();
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.ConsultarOscilacaoNegativaResponse()


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
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 150)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 150");
        }
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 150)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 150");
        }
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias) 

    /**
     * Method deleteNroConsultas
     * 
     */
    public void deleteNroConsultas()
    {
        this._has_nroConsultas= false;
    } //-- void deleteNroConsultas() 

    /**
     * Method deleteTotalAnteriorValor
     * 
     */
    public void deleteTotalAnteriorValor()
    {
        this._has_totalAnteriorValor= false;
    } //-- void deleteTotalAnteriorValor() 

    /**
     * Method deleteTotalAtualValor
     * 
     */
    public void deleteTotalAtualValor()
    {
        this._has_totalAtualValor= false;
    } //-- void deleteTotalAtualValor() 

    /**
     * Method deleteTotalOscilacaoValor
     * 
     */
    public void deleteTotalOscilacaoValor()
    {
        this._has_totalOscilacaoValor= false;
    } //-- void deleteTotalOscilacaoValor() 

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
    public br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias[] getOcorrencias() 

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
     * Returns the value of field 'totalAnteriorSinal'.
     * 
     * @return String
     * @return the value of field 'totalAnteriorSinal'.
     */
    public java.lang.String getTotalAnteriorSinal()
    {
        return this._totalAnteriorSinal;
    } //-- java.lang.String getTotalAnteriorSinal() 

    /**
     * Returns the value of field 'totalAnteriorValor'.
     * 
     * @return double
     * @return the value of field 'totalAnteriorValor'.
     */
    public double getTotalAnteriorValor()
    {
        return this._totalAnteriorValor;
    } //-- double getTotalAnteriorValor() 

    /**
     * Returns the value of field 'totalAtualSinal'.
     * 
     * @return String
     * @return the value of field 'totalAtualSinal'.
     */
    public java.lang.String getTotalAtualSinal()
    {
        return this._totalAtualSinal;
    } //-- java.lang.String getTotalAtualSinal() 

    /**
     * Returns the value of field 'totalAtualValor'.
     * 
     * @return double
     * @return the value of field 'totalAtualValor'.
     */
    public double getTotalAtualValor()
    {
        return this._totalAtualValor;
    } //-- double getTotalAtualValor() 

    /**
     * Returns the value of field 'totalOscilacaoSinal'.
     * 
     * @return String
     * @return the value of field 'totalOscilacaoSinal'.
     */
    public java.lang.String getTotalOscilacaoSinal()
    {
        return this._totalOscilacaoSinal;
    } //-- java.lang.String getTotalOscilacaoSinal() 

    /**
     * Returns the value of field 'totalOscilacaoValor'.
     * 
     * @return double
     * @return the value of field 'totalOscilacaoValor'.
     */
    public double getTotalOscilacaoValor()
    {
        return this._totalOscilacaoValor;
    } //-- double getTotalOscilacaoValor() 

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
     * Method hasTotalAnteriorValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalAnteriorValor()
    {
        return this._has_totalAnteriorValor;
    } //-- boolean hasTotalAnteriorValor() 

    /**
     * Method hasTotalAtualValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalAtualValor()
    {
        return this._has_totalAtualValor;
    } //-- boolean hasTotalAtualValor() 

    /**
     * Method hasTotalOscilacaoValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalOscilacaoValor()
    {
        return this._has_totalOscilacaoValor;
    } //-- boolean hasTotalOscilacaoValor() 

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
    public br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias removeOcorrencias(int) 

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
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        if (!(index < 150)) {
            throw new IndexOutOfBoundsException("setOcorrencias has a maximum of 150");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias) 

    /**
     * Sets the value of field 'totalAnteriorSinal'.
     * 
     * @param totalAnteriorSinal the value of field
     * 'totalAnteriorSinal'.
     */
    public void setTotalAnteriorSinal(java.lang.String totalAnteriorSinal)
    {
        this._totalAnteriorSinal = totalAnteriorSinal;
    } //-- void setTotalAnteriorSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalAnteriorValor'.
     * 
     * @param totalAnteriorValor the value of field
     * 'totalAnteriorValor'.
     */
    public void setTotalAnteriorValor(double totalAnteriorValor)
    {
        this._totalAnteriorValor = totalAnteriorValor;
        this._has_totalAnteriorValor = true;
    } //-- void setTotalAnteriorValor(double) 

    /**
     * Sets the value of field 'totalAtualSinal'.
     * 
     * @param totalAtualSinal the value of field 'totalAtualSinal'.
     */
    public void setTotalAtualSinal(java.lang.String totalAtualSinal)
    {
        this._totalAtualSinal = totalAtualSinal;
    } //-- void setTotalAtualSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalAtualValor'.
     * 
     * @param totalAtualValor the value of field 'totalAtualValor'.
     */
    public void setTotalAtualValor(double totalAtualValor)
    {
        this._totalAtualValor = totalAtualValor;
        this._has_totalAtualValor = true;
    } //-- void setTotalAtualValor(double) 

    /**
     * Sets the value of field 'totalOscilacaoSinal'.
     * 
     * @param totalOscilacaoSinal the value of field
     * 'totalOscilacaoSinal'.
     */
    public void setTotalOscilacaoSinal(java.lang.String totalOscilacaoSinal)
    {
        this._totalOscilacaoSinal = totalOscilacaoSinal;
    } //-- void setTotalOscilacaoSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalOscilacaoValor'.
     * 
     * @param totalOscilacaoValor the value of field
     * 'totalOscilacaoValor'.
     */
    public void setTotalOscilacaoValor(double totalOscilacaoValor)
    {
        this._totalOscilacaoValor = totalOscilacaoValor;
        this._has_totalOscilacaoValor = true;
    } //-- void setTotalOscilacaoValor(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarOscilacaoNegativaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.ConsultarOscilacaoNegativaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.ConsultarOscilacaoNegativaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.ConsultarOscilacaoNegativaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.ConsultarOscilacaoNegativaResponse unmarshal(java.io.Reader) 

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
